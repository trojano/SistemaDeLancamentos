/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import distribuicaofundo.model.Municipio;
import distribuicaofundo.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class MunicipioDAO {
    
    
    public void create(Municipio m){
        
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO municipio (nome, cnpj, nro_eleitores, responsavel_financeiro, email, telefone, whatsapp, banco, agencia, conta, banco_mulheres, agencia_mulheres, conta_mulheres, banco_doacoes, agencia_doacoes, conta_doacoes)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getCnpj());
            stmt.setString(3, m.getNro_eleitores());
            stmt.setString(4, m.getResponsavel());
            stmt.setString(5, m.getEmail());
            stmt.setString(6, m.getTelefone());
            stmt.setString(7, m.getWhatsapp());
            stmt.setString(8, m.getBanco());
            stmt.setString(9, m.getAgencia());
            stmt.setString(10, m.getConta());
            stmt.setString(11,m.getBancoMulheres());
            stmt.setString(12,m.getAgenciaMulheres());
            stmt.setString(13,m.getContaMulheres());
            stmt.setString(14,m.getBancoDoacoes());
            stmt.setString(15,m.getAgenciaDoacoes());
            stmt.setString(16,m.getContaDoacoes());
            
            
            stmt.executeUpdate();
            
            
        
            JOptionPane.showMessageDialog(null, "Município salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar município: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
     
        
    }
    
    
    public List<Municipio> read(){
        
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        List<Municipio> lmunicipios = new ArrayList<Municipio>();
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM municipio");
            rs = stmt.executeQuery();
            
         while(rs.next()){
             
             Municipio municipio = new Municipio(
             rs.getString("nome"),
             rs.getString("cnpj"),
             rs.getString("nro_eleitores"),
             rs.getString("responsavel_financeiro"),
             rs.getString("email"),
             rs.getString("telefone"),        
             rs.getString("whatsapp"),
             rs.getString("banco"),
             rs.getString("agencia"),
             rs.getString("conta"),
             rs.getString("banco_mulheres"),
             rs.getString("agencia_mulheres"),
             rs.getString("conta_mulheres"),
             rs.getString("banco_doacoes"),
             rs.getString("agencia_doacoes"),
             rs.getString("conta_doacoes")                                
             );
             
             lmunicipios.add(municipio);
             
             
         }   
            
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao listar municípios: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
        //System.out.println(lmunicipios.toString());
        return lmunicipios;
    }
    
    
        public static boolean checkMunicipio(String nome){
        
        
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM municipio WHERE nome = ?");
            stmt.setString(1, nome);
            
            
            rs = stmt.executeQuery();
            
            if (rs.next()){    
                check = true;
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar municipio: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
                
        return check;
    }
    
    
}
