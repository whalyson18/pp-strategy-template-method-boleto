package template;

import strategy.Boleto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeituraRetornoBancoDoBrasil implements LeituraRetorno{
    @Override
    public Boleto processarLinhaArquivo(String[] vetor) {
        var boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetor[0]));
        boleto.setCodBanco(vetor[1]);

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boleto.setDataVencimento(LocalDate.parse(vetor[2], formatter));
        boleto.setDataPagamento(
                LocalDate.parse(vetor[3], formatter).atTime(0,0));
        boleto.setCpfCliente(vetor[4]);
        boleto.setValor(Double.parseDouble(vetor[5]));
        boleto.setMulta(Double.parseDouble(vetor[6]));
        boleto.setJuros(Double.parseDouble(vetor[7]));

        return boleto;
    }
}
