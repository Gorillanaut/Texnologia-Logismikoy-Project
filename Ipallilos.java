class Ipallilos

{
 private String password;
 
 private String username;
 
 private String onomateponimo;
 
 public Ipallilos(String password, String username, String onomateponimo)
 
 {
     this.password = password;
     
     this.username = username;
     
     this.onomateponimo = onomateponimo;
     
     
    }
    
 public String get_password()
 
 {
     return password;
     
    }
 
 public void set_password(String password)
 
 {
     this.password = password;
     
    }
    
 public String get_username()
 
 {
     return username;
    }
    
 public void set_username(String username)
 
 {
     this.username = username;
    }
 
 public String get_onomateponimo()
 
 {
     return onomateponimo;
    }
 
    
 public void set_onomateponimo(String onomateponimo)
 
 {
     this.onomateponimo = onomateponimo;
    }
}