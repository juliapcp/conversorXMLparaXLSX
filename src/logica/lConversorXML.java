package logica;

import java.io.File;
import java.io.FileReader;
import java.util.concurrent.ForkJoinPool;

public class lConversorXML {

    public static void leArquivo(File arquivoXML) throws Exception{
        FileReader oFileReader = new FileReader(arquivoXML);
        oFileReader.read();
    }

}
