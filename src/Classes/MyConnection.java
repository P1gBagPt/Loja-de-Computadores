package Classes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyConnection {
    Connection con;
    public MyConnection(){
        try{
            con = DriverManager.getConnection("jdbc:ucanaccess://TugaComponentes\\TugaComponentes.accdb; memory = true");
        }catch(SQLException ex){
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    public Connection returnConnection(){
        return con;
    }
}
