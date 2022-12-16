package template;

import strategy.Boleto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ProcessarBoleto {
    private LeituraRetorno leituraRetorno;

    ProcessarBoleto(LeituraRetorno leituraRetorno){
        this.leituraRetorno = leituraRetorno;
    }
    public final void process(String nomeArquivo){
        System.out.println("Lendo arquivo " + nomeArquivo);
        try(var reader = Files.newBufferedReader(Paths.get(nomeArquivo))) {
            String linha;
            var listaBoleto = new ArrayList<Boleto>();
            while((linha = reader.readLine()) != null) {
                var vetor = linha.split(";");
                Boleto boleto = leituraRetorno.processarLinhaArquivo(vetor);
                listaBoleto.add(boleto);
            }
            System.out.println(listaBoleto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
