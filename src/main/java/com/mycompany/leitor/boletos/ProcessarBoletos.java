package com.mycompany.leitor.boletos;

import java.util.List;

/**
 *
 * @author wellikson
 */
public class ProcessarBoletos {
    private LeituraRetorno leituraRetorno;

    public ProcessarBoletos(LeituraRetorno leituraRetorno){
        this.leituraRetorno = leituraRetorno;
    }

    public final void processar(String nomeArquivo){
        System.out.println("Boletos");
        System.out.println("----------------------------------------------------------------------------------");
        List<Boleto> boletos = leituraRetorno.lerArquivo(nomeArquivo);
        for (Boleto boleto : boletos) {
            System.out.println(boleto);
        }
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
