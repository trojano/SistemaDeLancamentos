/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaofundo;

import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public class Armazenamento {
    
   
    
    
  static ArrayList<Municipio> listaMunicipios = new ArrayList<Municipio>();  
  static ArrayList<Lancamento> listaLancamentos = new ArrayList<Lancamento>();
  static ArrayList<Candidato> listaCandidatos = new ArrayList<Candidato>();
    

  
  
  
  
  
  
   public static boolean armazenaLancamento(Lancamento l){
       
       return listaLancamentos.add(l);
            
   }   
   
   public static boolean armazenaMunicipio(Municipio m){
       
       return listaMunicipios.add(m);
            
   } 
   
   public static boolean armazenaCandidato(Candidato c){
       
       return listaCandidatos.add(c);
            
   } 
   
   
   
   
   public static ArrayList<Lancamento> getLancamentos(){
       return listaLancamentos;
   }
   
    public static ArrayList<Municipio> getMunicipios(){
       return listaMunicipios;
   }

    
    
}
