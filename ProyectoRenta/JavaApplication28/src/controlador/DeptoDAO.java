package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Departamento;
import modelo.Vivienda;

public class DeptoDAO {
    public boolean ingresarDepto(Departamento depto){
        boolean resultado = false;
        try {
            Connection con = Conexion.getConexion();
            String query = "insert into departamento(id_vivienda,metros_cuadrados,comuna,habitaciones,valor_renta,gasto_comun,terraza) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, depto.getId_vivienda());
            ps.setDouble(2, depto.getMetros_cuadrados());
            ps.setString(3, depto.getComuna());
            ps.setInt(4, depto.getHabitaciones());
            ps.setInt(5, depto.getValor_renta());
            ps.setInt(6, depto.getGasto_comun());
            ps.setString(7, depto.getTerraza());
            resultado = ps.executeUpdate()==1;
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    
    public Departamento buscarDepto(String id_vivienda){
        Departamento depto= null;
        
        try {
            Connection con= Conexion.getConexion();
            String query= "select * from departamento where id_vivienda=?";
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, id_vivienda);
            ResultSet rs= ps.executeQuery(); //Funciona como una lista que recoje los resultados de la consulta
            while(rs.next()){
                depto=new Departamento(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getInt(6),rs.getString(7));
            }
            ps.close();
             
        } catch (SQLException ex) {
             Logger.getLogger(DeptoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
             Logger.getLogger(DeptoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return depto;
    }
    
    public ArrayList<Departamento> obtenerTodoDepto()
    {
        ArrayList<Departamento> deptos=new ArrayList<Departamento>();
        Departamento depto;
        try {
            Connection con=Conexion.getConexion();
            String query="select * from departamento";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                depto=new Departamento(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getInt(6),rs.getString(7));
                deptos.add(depto);
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DeptoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeptoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return deptos;
    }
    
    public boolean eliminarDepto(String id_vivienda)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="delete from departamento where id_vivienda=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, id_vivienda);
            resultado=ps.executeUpdate()==1;
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DeptoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeptoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    
    public boolean modificarDepto(Departamento dep)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="update departamento set metros_cuadrados=?,comuna=?,habitaciones=?,valor_renta=?,gasto_comun=?,terraza=? where id_vivienda=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setDouble(1, dep.getMetros_cuadrados());
            ps.setString(2, dep.getComuna());
            ps.setInt(3, dep.getHabitaciones());
            ps.setInt(4, dep.getValor_renta());
            ps.setInt(5, dep.getGasto_comun());
            ps.setString(6, dep.getTerraza());
            ps.setString(7, dep.getId_vivienda());
            resultado=ps.executeUpdate()==1;
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DeptoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeptoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public int avgRenta() {
    int promedio = 0;
    try {
        Connection con = Conexion.getConexion();
        String query = "select avg(valor_renta) from departamento";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            promedio = rs.getInt(1);
        }
        ps.close();
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(DeptoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return promedio;
}
    
    public int avgGastoComun() {
    int promedioGC = 0;
    try {
        Connection con = Conexion.getConexion();
        String query = "select avg(gasto_comun) from departamento";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            promedioGC = rs.getInt(1);
        }
        ps.close();
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(DeptoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return promedioGC;
}

    
    
}
