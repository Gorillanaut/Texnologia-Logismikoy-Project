/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

import java.util.Date;

class Rantevou

{
 
    private int kodikos;
    
    private Date imerominia_ora;
    
    private String username_politi;
    
    private int kodikos_ypiresias;
    
    public Rantevou(int kodikos, Date imerominia_ora, String username_politi, int kodikos_ypiresias)
    
    {
       this.kodikos = kodikos;
       
       this.imerominia_ora = imerominia_ora;
       
       this.username_politi = username_politi;
       
       this.kodikos_ypiresias = kodikos_ypiresias;
        
    }
    
     public void set_kodikos(int k)
    
    {
        kodikos =k;
    }
    
    public int get_kodiko()
    
    {
     return kodikos;   
    }
    
     public void set_kodikos_ypiresias(int k)
    
    {
        kodikos_ypiresias =k;
    }
    
    public int get_kodiko_ypiresias()
    
    {
     return kodikos_ypiresias;   
    }
    
    
    public void set_imerominia_ora(Date ie)
    
    {
         imerominia_ora=ie;
    }
    
    public Date get_imerominia_ora()
    
    {
     return imerominia_ora;   
    }
    
     public void set_username_politi(String o)
    
    {
        username_politi =o;
    }
    
    public String get_username_politi()
    
    {
     return username_politi;   
    }
}