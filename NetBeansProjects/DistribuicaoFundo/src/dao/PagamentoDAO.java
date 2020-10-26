/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import distribuicaofundo.model.Pagamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class PagamentoDAO {
    
     public void create(Pagamento p){
        
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO pagamento (municipio, candidatura, tp_conta, banco, agencia, conta, cor, nm_candidato, valor)VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, p.getMunicipio());
            stmt.setString(2, p.getCandidatura());
            stmt.setString(3, p.getTpconta());
            stmt.setString(4, p.getBanco());
            stmt.setString(5, p.getAgencia());
            stmt.setString(6, p.getConta());
            stmt.setString(7, p.getCor());
            stmt.setString(8, p.getNm_candidato());
            stmt.setString(9, p.getValorRepasse().toString());
            
            
            stmt.executeUpdate();
            
            
        
            JOptionPane.showMessageDialog(null, "Pagamento salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar pagamento: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
     
        
    }
     
     
    
    public Double repasseTotal(String municipio) { 
     
     
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Double ValorTotal = 0.0;
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM pagamento WHERE municipio = ?");
            stmt.setString(1, municipio);
            
            
            rs = stmt.executeQuery();    
            
            
             while(rs.next()){
             
                 
                    ValorTotal = ValorTotal + Double.parseDouble(rs.getString("valor"));
                    

          }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar pagamento: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
                return ValorTotal;
 
    }

    public Double repassePretosPardos(String municipio) {
        
        Connection con = ConnectionFactory.getConnection();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Double vpp = 0.0;
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM pagamento WHERE municipio = ? and (cor = 'preta' or cor = 'parda')");
            stmt.setString(1, municipio);
            
            
            rs = stmt.executeQuery();    
            
            
             while(rs.next()){
             
                 
                    vpp = vpp + Double.parseDouble(rs.getString("valor"));
                    

          }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar pagamento: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt,rs);
        }
        
                return vpp;
        
        
    }
   
    
}
