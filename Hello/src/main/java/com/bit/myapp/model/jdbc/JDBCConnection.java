package com.bit.myapp.model.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
   private static Connection  conn;
   private static JDBCConnection  instance;
   
   private JDBCConnection() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
         conn = DriverManager.getConnection(URL, "kim02", "1234");
         System.out.println("load ok ");
      
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }catch (Exception e) {
         e.printStackTrace();
      }
      
   }
   
   
   public static Connection getConnection() {
      instanceCheck();
       return conn;
   }
   
   public static JDBCConnection getInstance() {
      instanceCheck();
      return instance;
   }
   
   private static void instanceCheck() {
      if(instance == null )   {
         instance= new JDBCConnection();
       }

   }
   
   public void close() {
      try {
         if (conn != null && !conn.isClosed()) {
            conn.close();
            System.out.println("정상적인 close");
         } else {
            System.out.println("이미 close됬음");
         }
      }catch (Exception e) {
         e.printStackTrace();
      }
   }
   
   
}