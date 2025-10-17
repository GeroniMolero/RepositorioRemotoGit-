package com.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import com.conexion.Conexion;
import com.model.Nomina;
 
public class NominasDAO {
 private Connection connection;
 private PreparedStatement statement;
 private boolean estadoOperacion;
 

 
 // obtener conexion pool
 private Connection obtenerConexion() throws SQLException {
  return Conexion.getConnection();
 }
 
}

