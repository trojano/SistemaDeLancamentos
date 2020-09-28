/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaofundo.model;

import java.util.Date;

/**
 *
 * @author marcos
 */
public class Pagamento {
    
    private String municipio,
                   nomeCandidato,
                   genero,
                   banco,
                   agencia,
                   conta,
                   cnpj,
                   cor,
                   lgbtqi,
                   email,
                   telefone,
                   responsavel,
              //     documentos, 
    /*private Date*/ dataRepasse,
   /* private int*/ numEleitores,
   /* private double */ valorRepasse,
                   tetoGastos;

    public Pagamento(String municipio, String nomeCandidato, String responsavel, String genero, String banco, String agencia, String conta, String cnpj, String cor, String lgbtqi, String email, String telefone, String dataRepasse, String numEleitores, String valorRepasse, String tetoGastos) {
        this.municipio = municipio;
        this.nomeCandidato = nomeCandidato;
        this.responsavel = responsavel;
        this.genero = genero;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.cnpj = cnpj;
        this.cor = cor;
        this.lgbtqi = lgbtqi;
        this.email = email;
        this.telefone = telefone;
     //   this.documentos = documentos;
        this.dataRepasse = dataRepasse;
        this.numEleitores = numEleitores;
        this.valorRepasse = valorRepasse;
        this.tetoGastos = tetoGastos;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "municipio=" + municipio + ", nomeCandidato=" + nomeCandidato + ", genero=" + genero + ", banco=" + banco + ", agencia=" + agencia + ", conta=" + conta + ", cnpj=" + cnpj + ", cor=" + cor + ", lgbtqi=" + lgbtqi + ", email=" + email + ", telefone=" + telefone + ", responsavel=" + responsavel + /*", documentos=" + documentos +*/ ", dataRepasse=" + dataRepasse + ", numEleitores=" + numEleitores + ", valorRepasse=" + valorRepasse + ", tetoGastos=" + tetoGastos + '}';
    }
    
}
