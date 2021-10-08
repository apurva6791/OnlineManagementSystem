package OnlineManagementSystem;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    
    public conn() {
    	
    	 try{  
             Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///apurvdb","root","root");    
             s= c.createStatement();
            
         }catch(Exception e){ 
           
         }  
    }
    
    public Connection getCon(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
             return DriverManager.getConnection("jdbc:mysql:///apurvdb","root","root");    
            
           
        }catch(Exception e){ 
            System.out.println(e);
            return null;
        }  
    }  
    
    public static void main(String... args) {
    	System.out.print("AAA: "+ new conn().getCon());
    	
    }
}  