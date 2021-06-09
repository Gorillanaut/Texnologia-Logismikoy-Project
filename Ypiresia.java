/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

import java.util.Date;

import java.util.*;

class Ypiresia


{
    
 private int kodikos;
 
 private String titlos;
 
 private ArrayList<Date> from  = new ArrayList<Date>();
 
 private ArrayList<Date> to  = new ArrayList<Date>();
 
 private Ipallilos ipefthinos_ypallilos;
 
 public Ypiresia(int kodikos, String titlos, ArrayList<Date> from, ArrayList<Date> to, Ipallilos ipefthinos_ypallilos)
 
 {
     this.kodikos = kodikos;
     
     this.titlos = titlos;
     
     this.from = from;
     
     this.to = to;
     
     this.ipefthinos_ypallilos = ipefthinos_ypallilos;
     
    }
 
    public int get_kodikos()
  
  {
     return kodikos; 
    }
 
 public void set_kodikos(int k)
 
 {
     kodikos = k;
    }
    
    public String get_titlos()
 
 {
     return titlos;
    }
 
 public void set_titlos(String a)
 
 {
     titlos= a;
    }
    
    public ArrayList<Date> get_from()
    
    {
     return from;   
    }
    
    public ArrayList<Date> get_to()
            
    {
        
        return to;
    }
    
    public void set_from(ArrayList<Date> from)
    
    {
     this.from=from;
    }
    
     public void set_to(ArrayList<Date> to)
    
    {
     this.to=to;
    }
    
    
    
   public Ipallilos get_ipefthinos_ypallilos()
    
    {
     return ipefthinos_ypallilos;   
    }
    
    public void set_ipefthinos_ypallilos(Ipallilos j)
    
    {
     ipefthinos_ypallilos=j;   
    } 
    
}
