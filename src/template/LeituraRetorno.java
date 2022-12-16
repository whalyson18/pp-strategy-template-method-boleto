package template;

import strategy.Boleto;

import java.util.List;

public interface LeituraRetorno {
    Boleto processarLinhaArquivo(String[] vetor);
}
