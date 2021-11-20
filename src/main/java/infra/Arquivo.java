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
    	String listaNomes;
    	Class<?> classeObjeto = objeto.getClass();
    	Field[] listaFields = classeObjeto.getDeclaredFields();
    	for(Field field : listaFields) {
    		listaNomes.concat("|  ").concat(field.getName().concat("  |"));
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
    	    		listaAtributos.concat(st.nextToken());
    	    	}
    	    	System.out.println(listaAtributos);			
    		}
    	}
    	
    	br.close();
    }
}
