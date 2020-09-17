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
public class Municipio {
    
   private String nome,
                  cnpj,
                  nro_eleitores,
                  responsavel,
                  email,
                  telefone,
                  whatsapp,
                  banco,
                  agencia,
                  conta,
                  bancoMulheres,        
                  agenciaMulheres,
                  contaMulheres,
                  bancoDoacoes,
                  agenciaDoacoes,
                  contaDoacoes;

    public Municipio(String nome, String cnpj, String nro_eleitores, String responsavel, String email, String telefone, String whatsapp, String banco, String agencia, String conta, String bancoMulheres, String agenciaMulheres, String contaMulheres, String bancoDoacoes, String agenciaDoacoes, String contaDoacoes) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.nro_eleitores = nro_eleitores;
        this.responsavel = responsavel;
        this.email = email;
        this.telefone = telefone;
        this.whatsapp = whatsapp;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.bancoMulheres = bancoMulheres;
        this.agenciaMulheres = agenciaMulheres;
        this.contaMulheres = contaMulheres;
        this.bancoDoacoes = bancoDoacoes;
        this.agenciaDoacoes = agenciaDoacoes;
        this.contaDoacoes = contaDoacoes;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNro_eleitores() {
        return nro_eleitores;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public String getBanco() {
        return banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public String getBancoMulheres() {
        return bancoMulheres;
    }

    public String getAgenciaMulheres() {
        return agenciaMulheres;
    }

    public String getContaMulheres() {
        return contaMulheres;
    }

    public String getBancoDoacoes() {
        return bancoDoacoes;
    }

    public String getAgenciaDoacoes() {
        return agenciaDoacoes;
    }

    public String getContaDoacoes() {
        return contaDoacoes;
    }
    
    
    

    @Override
    public String toString() {
        return "Municipio{" + "nome=" + nome + ", cnpj=" + cnpj + ", nro_eleitores=" + nro_eleitores + ", responsavel=" + responsavel + ", email=" + email + ", telefone=" + telefone + ", whatsapp=" + whatsapp + ", banco=" + banco + ", agencia=" + agencia + ", conta=" + conta + ", bancoMulheres=" + bancoMulheres + ", agenciaMulheres=" + agenciaMulheres + ", contaMulheres=" + contaMulheres + ", bancoDoacoes=" + bancoDoacoes + ", agenciaDoacoes=" + agenciaDoacoes + ", contaDoacoes=" + contaDoacoes + '}';
    }
    
    
    
    
}

