/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

import java.util.Date;
class Minima

{
    
 private int kodikos;
 
 private String username_apostolea;
 
 private String username_paralipti;
 
 private String titlos;
 
 private String periexomeno;
 
 private Date imerominia_ora;
 
 private static int counter=0;

  public int get_kodikos()
  
  {
     return kodikos; 
    }
 
 public void set_kodikos(int k)
 
 {
     kodikos = k;
    }
 
 public String get_username_apostolea()
 
 {
     return username_apostolea;
    }
 
 public void set_username_apostolea(String a)
 
 {
     username_apostolea=a;
    }
 
    public String get_username_paralipti()
    
    {
     return username_paralipti;   
    }
    
   public void set_username_paralipti(String a)
   {
     username_paralipti=a;  
    }
    
   public String get_titlos()
   
   {
     return titlos;    
    }
   
   public void set_titlos(String t)
   {
     titlos = t;  
    }
   
    public String get_periexomeno()
    
    {
     return periexomeno;   
    }
    
    public void set_periexomeno(String p)
    
    {
     periexomeno = p;   
    }
    
    public Date get_imerominia_ora()
    
    {
     return imerominia_ora;   
    }
    
    public void set_imerominia_ora(Date i)
    
    {
     imerominia_ora=i;   
    }
 public Minima(String username_apostolea, String username_paralipti, String titlos, String periexomeno, Date imerominia_ora)
 
 {
     counter++;
     this.kodikos = counter;
     
     this.username_apostolea  = username_apostolea;
     
     this.username_paralipti = username_paralipti;
     
     this.titlos = titlos;
     
     this.periexomeno = periexomeno;
     
     
     
    }
    
    
    
    
    
}
