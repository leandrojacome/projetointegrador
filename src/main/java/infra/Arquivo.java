package infra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo<T> {

    T objeto = null;

    public Arquivo(T objeto) {
        this.objeto = objeto;
    }

    public void salvar() {
    }
}
