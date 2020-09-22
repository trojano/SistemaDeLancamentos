/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import distribuicaofundo.model.Candidato;
import distribuicaofundo.model.Municipio;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
}
