package infra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo<T> {

    T objeto = null;

    public Arquivo(T objeto) {
        this.objeto = objeto;
    }

    public void salvar(T objeto) throws IOException {
    	Class<?> classeObjeto = objeto.getClass();
    	String nomeArquivo = classeObjeto.getName().concat(".txt");
    	
    	BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo));
    	bw.write(objeto.toString());
    	bw.flush();
    	bw.newLine();
    	bw.close();
    }
}
