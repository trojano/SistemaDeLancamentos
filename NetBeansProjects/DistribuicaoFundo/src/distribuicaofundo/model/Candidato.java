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
public class Candidato {
    
    private String nome,
                   municipio,
                   candidatura,
                   cnpj,
                   cpf,
                   telefone,
                   email,
                   whatsapp,
                   genero,
                   cor,
                   datanascimento,
                   orientacaosexual,
                   endereco,
                   banco,
                   agencia,
                   conta;

    public Candidato(String nome, String municipio, String candidatura, String cnpj, String cpf, String telefone, String email, String whatsapp, String genero, String cor, String datanascimento, String orientacaosexual, String endereco, String banco, String agencia, String conta) {
        this.nome = nome;
        this.municipio = municipio;
        this.candidatura = candidatura;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.whatsapp = whatsapp;
        this.genero = genero;
        this.cor = cor;
        this.datanascimento = datanascimento;
        this.orientacaosexual = orientacaosexual;
        this.endereco = endereco;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getCandidatura() {
        return candidatura;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public String getGenero() {
        return genero;
    }

    public String getCor() {
        return cor;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public String getOrientacaosexual() {
        return orientacaosexual;
    }

    public String getEndereco() {
        return endereco;
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

    @Override
    public String toString() {
        return "Candidato{" + "nome=" + nome + ", municipio=" + municipio + ", candidatura=" + candidatura + ", cnpj=" + cnpj + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + ", whatsapp=" + whatsapp + ", genero=" + genero + ", cor=" + cor + ", datanascimento=" + datanascimento + ", orientacaosexual=" + orientacaosexual + ", endereco=" + endereco + ", banco=" + banco + ", agencia=" + agencia + ", conta=" + conta + '}';
    }


    
    
  
    
    
    
    
}
