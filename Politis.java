/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

class Politis 


{
 
    private String onoma;
    
    private String eponimo;
    
    private String at;
    
    private String username;
    
    private String password;
    
    private String email;
    
    private String address;
    
    public String get_onoma()
    
    {
     return onoma;   
    }
    
    public void set_onoma(String o)
    
    {
        onoma =o;
    }
    
    public String get_eponimo()
    
    {
     return eponimo;   
    }
    
    public void set_eponimo(String e)
    
    {
     eponimo = e;   
    }
    
    public String get_at()
    
    {
     return at;   
    }
    
    public void set_at(String a)
    
    {
     at = a;   
    }
    
    public String get_username()
    
    {
     return username;   
    }
    
    public void set_username(String u)
    {
     username = u;   
    }
    
    public String get_password()
    
    {
        return password;
    }
    
    public void set_password(String p)
    
    {
     password = p;   
    }
    
    public String get_email()
    
    {
     return email;   
    }
    
    public void set_email(String e)
    
    {
     email = e;   
    }
    
    public String get_address()
    
    {
     return address;   
    }
    
    public void set_address(String a)
    
    {
     address = a;   
    }
    
    public Politis(String onoma, String eponimo, String at, String username, String password, String email, String address)
    
    {
     this.onoma = onoma;
     
     this.eponimo = eponimo;
     
     this.at=at;
     
     this.username = username;
     
     this.password = password;
     
     this.email = email;
     
     this.address = address;
        
    }
    
}