package strategy;


public class ProcessarBoleto {
    private LeituraRetorno leituraRetorno;

    public ProcessarBoleto(LeituraRetorno leituraRetorno) {

        this.leituraRetorno = leituraRetorno;
    }

    public void processar(String nomeArquivo){
        var lista = leituraRetorno.lerArquivo(nomeArquivo);
        System.out.println(lista);
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {

        this.leituraRetorno = leituraRetorno;
    }
}
