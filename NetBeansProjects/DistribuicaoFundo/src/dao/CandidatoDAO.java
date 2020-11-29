/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import distribuicaofundo.model.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class CandidatoDAO {
    
    
    
    public void create(Candidato c){
        
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO candidato (nome, municipio, candidatura, cnpj, cpf, telefone, email, whatsapp, genero, cor, dt_nascimento, orientacao_sexual, endereco, banco, agencia, conta)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getMunicipio());
            stmt.setString(3, c.getCandidatura());
            stmt.setString(4, c.getCnpj());
            stmt.setString(5, c.getCpf());
            stmt.setString(6, c.getTelefone());
            stmt.setString(7, c.getEmail());
            stmt.setString(8, c.getWhatsapp());
            stmt.setString(9, c.getGenero());
            stmt.setString(10, c.getCor());
            stmt.setString(11, c.getDatanascimento());
            stmt.setString(12,c.getOrientacaosexual());
            stmt.setString(13,c.getEndereco());
            stmt.setString(14,c.getBanco());
            stmt.setString(15,c.getAgencia());
            stmt.setString(16,c.getConta());
            
            
            stmt.executeUpdate();
            
            
        
            JOptionPane.showMessageDialog(null, "Candidato salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar candidato: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
     
        
    }

    public Candidato getPrefeito(String municipio) {

        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Candidato candi = null;
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM candidato WHERE municipio = ? AND candidatura = 'Prefeito'");
            stmt.setString(1, municipio);
            
            
             rs = stmt.executeQuery();
              
              
              
              while(rs.next()){
               
             Candidato candidato = new Candidato(
             rs.getString("nome"),
             rs.getString("municipio"),
             rs.getString("candidatura"),
             rs.getString("cnpj"),
             rs.getString("cpf"),
             rs.getString("telefone"),        
             rs.getString("email"),
             rs.getString("whatsapp"),
             rs.getString("genero"),
             rs.getString("cor"),
             rs.getString("dt_nascimento"),
             rs.getString("orientacao_sexual"),
             rs.getString("endereco"),
             rs.getString("banco"),
             rs.getString("agencia"),
             rs.getString("conta")                                
             );
             
             candi = candidato;
             
             
          }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar candidato: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
                return candi;
    }

    public Candidato getVice(String municipio) {
        
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Candidato candi = null;
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM candidato WHERE municipio = ? AND candidatura = 'Vice Prefeito'");
            stmt.setString(1, municipio);
            
            
             rs = stmt.executeQuery();
              
              
              
              while(rs.next()){
               
             Candidato candidato = new Candidato(
             rs.getString("nome"),
             rs.getString("municipio"),
             rs.getString("candidatura"),
             rs.getString("cnpj"),
             rs.getString("cpf"),
             rs.getString("telefone"),        
             rs.getString("email"),
             rs.getString("whatsapp"),
             rs.getString("genero"),
             rs.getString("cor"),
             rs.getString("dt_nascimento"),
             rs.getString("orientacao_sexual"),
             rs.getString("endereco"),
             rs.getString("banco"),
             rs.getString("agencia"),
             rs.getString("conta")                                
             );
             
             candi = candidato;
             
             
          }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar candidato: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
                return candi;
        
        
    }

    public String qtdVereadores(String municipio) {
        
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String qtdVereadores = "Erro";
        
        
        try {
            stmt = con.prepareStatement("SELECT count(*) FROM candidato WHERE municipio = ? AND candidatura = 'Vereador'");
            stmt.setString(1, municipio);
            
            
            rs = stmt.executeQuery();
                 
             while(rs.next()){
             
                 qtdVereadores = rs.getString("count(*)");

          }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar candidato: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
                return qtdVereadores;
 
    }

    public String qtdPretosPardos(String municipio) {
       
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String PretosPardos = "Erro";
        
        
        try {
            stmt = con.prepareStatement("SELECT count(*) FROM candidato WHERE municipio = ? AND candidatura = 'Vereador' and (cor = 'preta' or cor = 'parda')");
            stmt.setString(1, municipio);
            
            
            rs = stmt.executeQuery();
                 
             while(rs.next()){
             
                 PretosPardos = rs.getString("count(*)");

          }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar candidato: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
                return PretosPardos;
        
    }

    public String qtdMulheres(String municipio) {
        
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String mulheres = "Erro";
        
        
        try {
            stmt = con.prepareStatement("SELECT count(*) FROM candidato WHERE municipio = ? AND candidatura = 'Vereador' and genero = 'Feminino'");
            stmt.setString(1, municipio);
            
            
            rs = stmt.executeQuery();
                 
             while(rs.next()){
             
                 mulheres = rs.getString("count(*)");

          }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar candidato: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
                return mulheres;
        
    }
    
    
    public Candidato getCandidato(String nome, String municipio){
       
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Candidato candi = null;
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM candidato WHERE nome = ? AND municipio = ? ");
            stmt.setString(1, nome);
            stmt.setString(2, municipio);
            
            
             rs = stmt.executeQuery();
              
              
              
              while(rs.next()){
               
             Candidato candidato = new Candidato(
             rs.getString("nome"),
             rs.getString("municipio"),
             rs.getString("candidatura"),
             rs.getString("cnpj"),
             rs.getString("cpf"),
             rs.getString("telefone"),        
             rs.getString("email"),
             rs.getString("whatsapp"),
             rs.getString("genero"),
             rs.getString("cor"),
             rs.getString("dt_nascimento"),
             rs.getString("orientacao_sexual"),
             rs.getString("endereco"),
             rs.getString("banco"),
             rs.getString("agencia"),
             rs.getString("conta")                                
             );
             
             candi = candidato;
             
             
          }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar candidato: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
                return candi;
    }
    
    
    public String[] getCandidatosPorMunicipio(String municipio){
        
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        
         
        String[] candidatos = null;
        
        try {
            stmt = con.prepareStatement("SELECT nome FROM candidato WHERE municipio = ? ");
            stmt.setString(1, municipio);
              
            stmt2 = con.prepareStatement("SELECT count(nome) FROM candidato WHERE municipio = ? ");
            stmt2.setString(1, municipio);
            
            
             rs = stmt.executeQuery();
             rs2 = stmt2.executeQuery();
             
             
             
             
              while(rs2.next()){
                int index = Integer.parseInt(rs2.getString("count(nome)"));
                candidatos = new String[index+1];  
              }
             
              
             candidatos[0]="ESCOLHA UM CANDIDATO";
              int i = 1;
              
              while(rs.next()){
             
                  
            candidatos[i] = rs.getString("nome");
             
             i++;
             
          }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar candidato: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
            ConnectionFactory.closeConnection(con, stmt2,rs2);
        }
        
            
        return candidatos;
    }
    
    
}
