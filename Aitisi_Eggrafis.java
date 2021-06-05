/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;
import java.util.Date;
class Aitisi_Eggrafis

{
    
 private String password;
 
 private String username;
 
 private String onoma;
 
 private String eponumo;
 
 private String At;
 
 private String email;
 
 private String address;
 
 private String path;
 
 private int kwdikos;
 
 private boolean status;
 
 private Date hm_kataxwrisis;
 
 public Aitisi_Eggrafis(String password, String username,String onoma,String eponumo,String At,String email,String address,String path,int kwdikos,boolean status,Date hm_kataxwrisis)
 
 {
     this.password = password;
     
     this.username = username;
     
     this.onoma=onoma;
     this.eponumo=eponumo;
     this.At=At;
     this.email=email;
     this.address=address;
     this.path=path;
     this.kwdikos=kwdikos;
     this.status=status;
     this.hm_kataxwrisis=hm_kataxwrisis;
      
     
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
    
    public String get_onoma()
    
    {
     return onoma;   
    }
    
     public void set_onoma(String p)
    
    {
        onoma =p;
    }
     
    public String get_eponumo()
    
    {
     return eponumo;   
    } 
     
      public void set_eponumo(String p)
    
    {
        eponumo =p;
    }
      
      public String get_At()
    
    {
     return At;   
    } 
       
         public void set_At(String p)
    
    {
        At =p;
    }
       
       public String get_email()
    
    {
     return email;   
    }
       
      public void set_email(String p)
    
    {
        email=p;
    }
      
      public String get_address()
    
    {
     return address;   
    } 
      
      public void set_address(String p)
    
    {
        address=p;
    }
      
      public String get_path()
    
    {
     return path;   
    } 
      
      public void set_path(String p)
    
    {
        path=p;
    }
      
      public int get_kwdiko()
    
    {
     return kwdikos;   
    }
      
      
       public void set_kwdiko(int p)
    
    {
        kwdikos=p;
    }
       
       public boolean get_status()
    
    {
     return status;   
    }
        
         public void set_status(boolean p)
    
    {
        status=p;
    }
         
        public Date get_hm_kataxwrisis()
    
    {
     return hm_kataxwrisis;   
    }
        
        public void set_hm_kataxwrisis(Date p)
    
    {
        hm_kataxwrisis=p;
    }
      
      
       
}