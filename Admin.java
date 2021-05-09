class Admin

{
    
 private String password;
 
 private String username;
 
 public Admin(String password, String username)
 
 {
     this.password = password;
     
     this.username = username;
     
    }
    
    public String get_password()
    
    {
     return password;   
    }
    
    public void set_password(String p)
    
    {
        password =p;
    }
    
    public String get_username()
    
    {
     return username;   
    }
    
    public void set_username(String u)
    
    {
     username = u;   
    }
    
    
}