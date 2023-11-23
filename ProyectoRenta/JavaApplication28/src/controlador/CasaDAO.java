package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Casa;
import modelo.Vivienda;

public class CasaDAO {
    public boolean ingresarCasa(Casa ca){
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "insert into casa(id_vivienda,metros_cuadrados,comuna,habitaciones,valor_renta,anio_antiguedad,cant_pisos) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, ca.getId_vivienda());
            ps.setDouble(2, ca.getMetros_cuadrados());
            ps.setString(3, ca.getComuna());
            ps.setInt(4, ca.getHabitaciones());
            ps.setInt(5, ca.getValor_renta());
            ps.setInt(6, ca.getAnio_antiguedad());
            ps.setInt(7, ca.getCant_pisos());
            resultado = ps.executeUpdate()==1;
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    
    public Casa buscarCasa(String id_vivienda){
        Casa casa= null;
        
        try {
             Connection con= Conexion.getConexion();
             String query= "select * from casa where id_vivienda=?";
             PreparedStatement ps= con.prepareStatement(query);
             ps.setString(1, id_vivienda);
             ResultSet rs= ps.executeQuery(); //Funciona como una lista que recoje los resultados de la consulta
             while(rs.next()){
                casa=new Casa(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getInt(6),rs.getInt(7));
             }
             ps.close();
             
        } catch (SQLException ex) {
             Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
             Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return casa;
    }
    
    
    public ArrayList<Casa> obtenerTodoCasa()
    {
        ArrayList<Casa> casas=new ArrayList<Casa>();
        Casa casa;
        try {
            Connection con=Conexion.getConexion();
            String query="select * from casa";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                casa=new Casa(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getInt(6),rs.getInt(7));
                casas.add(casa);
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return casas;
    }
    
    public boolean eliminarCasa(String id_vivienda)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="delete from casa where id_vivienda=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, id_vivienda);
            resultado=ps.executeUpdate()==1;
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
  
    public boolean modificarCasa(Casa ca)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="update casa set metros_cuadrados=?,comuna=?,habitaciones=?,valor_renta=?,anio_antiguedad=?,cant_pisos=? where id_vivienda=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setDouble(1, ca.getMetros_cuadrados());
            ps.setString(2, ca.getComuna());
            ps.setInt(3, ca.getHabitaciones());
            ps.setInt(4, ca.getValor_renta());
            ps.setInt(5, ca.getAnio_antiguedad());
            ps.setInt(6, ca.getCant_pisos());
            ps.setString(7, ca.getId_vivienda());
            resultado=ps.executeUpdate()==1;
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public int avgRenta() {
    int promedio = 0;
    try {
        Connection con = Conexion.getConexion();
        String query = "select avg(valor_renta) from casa";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            promedio = rs.getInt(1);
        }
        ps.close();
    } catch (SQLException | ClassNotFoundException ex) {
          Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return promedio;
    }
    
    public int cantCasas2p(){
    int contador = 0;    
    try {
        Connection con = Conexion.getConexion();
        String query = "select count(cant_pisos) from casa where cant_pisos=2";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            contador = rs.getInt(1);
        }
        ps.close();
    } catch (SQLException | ClassNotFoundException ex) {
          Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
      return contador;
    }
    
    
    
 
    
    
}
