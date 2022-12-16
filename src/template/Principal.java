package template;

public class Principal{
    public static void main(String[] args) {
        //LeituraRetorno leituraRetorno = new LeituraRetornoBancoDoBrasil();
        LeituraRetorno leituraRetorno = new LeituraRetornoBancoBradesco();
        ProcessarBoleto processar = new ProcessarBoleto(leituraRetorno);
        processar.process("bradesco-1.csv");
    }
}
