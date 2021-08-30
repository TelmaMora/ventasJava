package conexion;

import java.sql.*;
import javax.swing.*;

public class ConexionBD {

    Connection conect = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/botanasplebes?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234"); 
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        }
        return conect;
    }   
//    
//     public Connection Desconectar() {
//        try {
//            conect.close();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error en la conexiÃ³n" + e);
//        }
//        return conect;
//    }   
}
