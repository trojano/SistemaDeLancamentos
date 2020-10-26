/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaofundo.model;


/**
 *
 * @author marcos
 */
public class Pagamento {
    
    private String municipio,
                  candidatura,
                  tpconta,
                  banco,
                  agencia,
                  conta,
                  cor,
                  nm_candidato;         
    private Double valorRepasse;

    public Pagamento(String municipio, String candidatura, String tpconta, String banco, String agencia, String conta, String cor, String nm_candidato, Double valorRepasse) {
        this.municipio = municipio;
        this.candidatura = candidatura;
        this.tpconta = tpconta;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.cor = cor;
        this.nm_candidato = nm_candidato;
        this.valorRepasse = valorRepasse;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCandidatura() {
        return candidatura;
    }

    public void setCandidatura(String candidatura) {
        this.candidatura = candidatura;
    }

    public String getTpconta() {
        return tpconta;
    }

    public void setTpconta(String tpconta) {
        this.tpconta = tpconta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNm_candidato() {
        return nm_candidato;
    }

    public void setNm_candidato(String nm_candidato) {
        this.nm_candidato = nm_candidato;
    }

    public Double getValorRepasse() {
        return valorRepasse;
    }

    public void setValorRepasse(Double valorRepasse) {
        this.valorRepasse = valorRepasse;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "municipio=" + municipio + ", candidatura=" + candidatura + ", tpconta=" + tpconta + ", banco=" + banco + ", agencia=" + agencia + ", conta=" + conta + ", cor=" + cor + ", nm_candidato=" + nm_candidato + ", valorRepasse=" + valorRepasse + '}';
    }
         
    
    
}