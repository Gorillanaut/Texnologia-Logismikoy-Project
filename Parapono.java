/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

import java.util.Date;

class Parapono

{
 
    private int kodikos;
    
    private String titlos;
    
    private String perigrafi;
    
    private String username_politi;
    
    private Date imerominia_kataxorisis;
    
    private String path_eikonas;
    
    private String Sxolia;
    
    private boolean status;
    
    
    
    public int get_kodikos()
    
    {
     return kodikos;   
    }
    
    public void set_kodikos(int k)
    
    {
        kodikos =k;
    }
    
    public String get_titlos()
    
    {
     return titlos;   
    }
    
    public void set_titlos(String t)
    
    {
     titlos = t;   
    }
    
    public String get_perigrafi()
    
    {
     return perigrafi;   
    }
    
    public void set_perigrafi(String p)
    
    {
     perigrafi = p;   
    }
    
    public String get_username_politi()
    
    {
     return username_politi;   
    }
    
    public void set_username_politi(String u)
    {
     username_politi = u;   
    }
    
    public Date get_imerominia_kataxorisis()
    
    {
     return imerominia_kataxorisis;
    }
    
    public void set_imerominia_kataxorisis(Date i)
    
    {
     imerominia_kataxorisis = i;   
    }
    
    public String get_path_eikonas()
    
    {
     return path_eikonas;   
    }
    
    public void set_email(String pa)
    
    {
     path_eikonas = pa;   
    }
    
    public String get_Sxolia()
    
    {
     return Sxolia;   
    }
    
    public void set_Sxolia(String s)
    
    {
     Sxolia = s;   
    }
    
    public boolean get_status()
            
    {
        return status;
    }
    
    public void set_status(boolean s)
            
    {
        status = s;
        
    }
    
    public Parapono(int kodikos, String titlos, String perigrafi, String username_politi, Date imerominia_kataxorisis, String path_eikonas, String sxolia)
    
    {
        this.kodikos = kodikos;
        
        this.titlos = titlos;
        
        this.perigrafi = perigrafi;
        
        this.username_politi = username_politi;
        
        this.imerominia_kataxorisis = imerominia_kataxorisis;
        
        this.path_eikonas = path_eikonas;
        
        this.Sxolia = sxolia;
        
        this.status=false;
        
    }
}