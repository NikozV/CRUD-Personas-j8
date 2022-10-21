
package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author vassa
 */
public class ConexionLogin {
    Connection conectar=null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "");
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
        return conectar;
    }
    
}
