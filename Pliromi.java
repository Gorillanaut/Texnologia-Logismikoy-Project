/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

import java.util.Date;

class Pliromi


{
 private int kodikos;
 
 private String arithmos_kartas;
 
 private String onomateponimo;
 
 private float poso_pliromis;
 
 private String username_politi;
 
 private int kodikos_eisitiriou;
    
 private Date imerominia_pliromis;
 
 public Pliromi(int kodikos, String arithmos_kartas, String onomateponimo, float poso_pliromis, String username_politi, int kodikos_eisitiriou, Date imerominia_pliromis)
 
 {
     this.kodikos = kodikos;
     
     this.arithmos_kartas = arithmos_kartas;
     
     this.onomateponimo = onomateponimo;
     
     this.poso_pliromis = poso_pliromis;
     
     this.username_politi = username_politi;
     
     this.kodikos_eisitiriou = kodikos_eisitiriou;
     
     this.imerominia_pliromis = imerominia_pliromis;
    }
 
    public int get_kodikos()
    {
        return kodikos;
    }
    public void set_kodikos (int kodikos)
    {
        this.kodikos = kodikos;
    }

    public String get_arithmos_kartas()
    {
        return arithmos_kartas;
    }
    public void set_arithmos_kartas (String arithmos_kartas)
    {
        this.arithmos_kartas = arithmos_kartas;
    }

    public String get_onomateponimo()
    {
        return onomateponimo;
    }
    public void set_onomateponimo (String onomateponimo)
    {
        this.onomateponimo = onomateponimo;
    }
 
    public float get_poso_pliromis()
    {
        return poso_pliromis;
    }
    public void set_poso_pliromis (float poso_pliromis)
    {
        this.poso_pliromis = poso_pliromis;
    }
    
    public String get_username_politi()
    {
        return username_politi;
    }
    public void set_username_politi (String username_politi)
    {
        this.username_politi = username_politi;
    }
    
    public int kodikos_eisitiriou()
    {
        return kodikos_eisitiriou;
    }
    public void set_kodikos_eisitiriou (int kodikos_eisitiriou)
    {
        this.kodikos_eisitiriou = kodikos_eisitiriou;
    }
     
    public Date get_imerominia_pliromis()
    {
        return imerominia_pliromis;
    }
    public void set_imerominia_pliromis(Date imerominia_pliromis)
    {
        this.imerominia_pliromis = imerominia_pliromis;
    }
        
    
}