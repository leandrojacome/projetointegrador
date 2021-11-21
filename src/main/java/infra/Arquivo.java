package infra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Arquivo<T> {

    T objeto = null;

    public Arquivo(T objeto) {
        this.objeto = objeto;
    }

    private String getNomeArquivo() {
    	Class<?> classeObjeto = objeto.getClass();
    	String nomeArquivo = classeObjeto.getName().concat(".txt");
    	return nomeArquivo;
    }
    
    private void printaNomeAtributos() {
    	String listaNomes = "|  ";
    	Class<?> classeObjeto = objeto.getClass();
    	Field[] listaFields = classeObjeto.getDeclaredFields();
    	for(Field field : listaFields) {
    		listaNomes.concat(field.getName().concat("  |"));
    	}
    	System.out.println(listaNomes);
    }
    
    public void salvar() throws IOException {	
    	BufferedWriter bw = new BufferedWriter(new FileWriter(getNomeArquivo()));
    	bw.write(objeto.toString());
    	bw.flush();
    	bw.newLine();
    	bw.close();
    }
    
    public void visualizarTodosRegistros() throws IOException {
    	BufferedReader br = new BufferedReader(new FileReader(getNomeArquivo()));
    	
    	String registro;
    	
    	printaNomeAtributos();
    	while((registro = br.readLine()) != null) {
    		System.out.println(registro);
    	}
    	
    	br.close();
    }
    
    public void deletar() throws IOException {
    	Scanner strInput = new Scanner(System.in);
    	String ID, registro;
    	
    	File tempDB = new File("temp_".concat(getNomeArquivo()));
    	File db = new File(getNomeArquivo());
    	
    	BufferedReader br = new BufferedReader(new FileReader(db));
    	BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
    	
    	System.out.println("\nDigite o ID a ser deletado: ");
    	ID = strInput.nextLine();
    	
    	while((registro = br.readLine()) != null) {
    		if(registro.contains(ID)) {
    			continue;
    		}
    		bw.write(registro);
    		bw.flush();
    		bw.newLine();
    	}
    	br.close();
    	bw.close();
    	
    	db.delete();
    	tempDB.renameTo(db);
    }
    
    public void vizualizar() throws IOException {
    	Scanner strInput = new Scanner(System.in);
    	String ID, registro;
    	
    	String listaAtributos;
    	Class<?> classeObjeto = objeto.getClass();
    	Field[] listaFields = classeObjeto.getDeclaredFields();
    	
    	BufferedReader br = new BufferedReader(new FileReader(getNomeArquivo()));
    	
    	System.out.println("\nDigite o ID a ser visualizado: ");
    	ID = strInput.nextLine();
    	printaNomeAtributos();
    	
    	while((registro = br.readLine()) != null) {
    		StringTokenizer st = new StringTokenizer(registro, ",");
    		if(registro.contains(ID)) {
    	    	for(Field field : listaFields) {
    	    		listaAtributos.concat(st.nextToken().concat(", "));
    	    	}
    	    	listaAtributos = listaAtributos.substring(0, listaAtributos.lastIndexOf(",")); //removendo "," do final da string
    	    	System.out.println(listaAtributos);	
    		}
    	}
    	br.close();
    }
    
    public void atualizar() throws IOException {
    	String ID, registro1, registro2;
    	
    	String atributosAntigos, atributosNovos;
    	Class<?> classeObjeto = objeto.getClass();
    	Field[] listaFields = classeObjeto.getDeclaredFields();
    	
    	File db = new File(getNomeArquivo());
    	File tempDB = new File("temp_".concat(getNomeArquivo()));
    	
    	BufferedReader br = new BufferedReader(new FileReader(db));
    	BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
    	
    	Scanner strInput = new Scanner(System.in);
    	
    	System.out.println("\nDigite o ID a ser alterado: ");
    	ID = strInput.nextLine();
    	
    	System.out.println("\nO conteúdo do registro ser alterado: ");
    	printaNomeAtributos();
    	while((registro1 = br.readLine()) != null) {
    		StringTokenizer st = new StringTokenizer(registro1, ",");
    		if(registro1.contains(ID)) {
    	    	for(Field field : listaFields) {
    	    		atributosAntigos.concat(st.nextToken());
    	    	}
    	    	atributosAntigos = atributosAntigos.substring(0, atributosAntigos.lastIndexOf(","));
    	    	System.out.println(atributosAntigos);
    		}
    	}
    	br.close();
    	
    	for(Field field : listaFields) {
    		String novoDado;
    		System.out.println("Digite o novo dado para ".concat(field.getName()));
    		novoDado = strInput.nextLine();
    		atributosNovos.concat(novoDado).concat(",");
    	}
    	atributosNovos = atributosNovos.substring(0, atributosNovos.lastIndexOf(","));   	
    	
    	BufferedReader br2 = new BufferedReader(new FileReader(db));
    	
    	while((registro2 = br2.readLine()) != null) {
    		if(registro2.contains(ID)) {
    			bw.write(atributosNovos);
    		}
    		else {
    			bw.write(registro2);
    		}
    		bw.flush();
    		bw.newLine();
    	}
    	
    	bw.close();
    	br2.close();
    	db.delete();
    	tempDB.renameTo(db);    	
    }
}
