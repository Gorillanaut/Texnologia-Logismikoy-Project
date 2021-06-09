/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

import java.util.Date;

import java.util.*;

class Psifoforia


{
    private int kodikos;
    
    private Date imerominia_enarksis;
    
    private Date imerominia_liksis;
    
    private String titlos;
    
    private String erotima;
    
    private ArrayList<String> epiloges = new ArrayList<String>();
    
    private String apotelesmata;
    
    private ArrayList<String> apantiseis = new ArrayList<String>();
    
    
    public void add_apantisi(String s)
            
    {
     apantiseis.add(s);
    }
    
    
    public Psifoforia(int kodikos, Date imerominia_enarksis,Date imerominia_liksis, String titlos, String erotima, ArrayList<String> epiloges, String apotelesmata)
    
    {
        this.kodikos=kodikos;
        
        this.imerominia_enarksis = imerominia_enarksis;
        
        this.imerominia_liksis = imerominia_liksis;
        
        this.titlos = titlos;
        
        this.erotima = erotima;
        
        this.apotelesmata = apotelesmata;
        
        this.epiloges = epiloges;
        
    }
    
    
    public void set_kodikos(int k)
    
    {
        kodikos =k;
    }
    
    public int get_kodiko()
    
    {
     return kodikos;   
    }
    
    public void set_imerominia_enarksis(Date ie)
    
    {
         imerominia_enarksis=ie;
    }
    
    public Date get_imerominia_enarksis()
    
    {
     return imerominia_enarksis;   
    }
    
    
    public void set_imerominia_liksis(Date il)
    
    {
        imerominia_liksis =il;
    }
    
    public Date get_imerominia_liksis()
    
    {
     return imerominia_liksis;   
    }
    
    public void set_titlos(String t)
    
    {
        titlos =t;
    }
    
    public String get_titlo()
    
    {
     return titlos;   
    }
    
    public void set_erotima(String e)
    
    {
        erotima =e;
    }
    
    public String get_erotima()
    
    {
     return erotima;   
    }
    
    public void set_apotelesmata(String a)
    
    {
        apotelesmata =a;
    }
    
    public String get_apotelesmata()
    
    {
     return apotelesmata;   
    }
   
    
    public ArrayList<String> get_epiloges()
            
    {
        
        return epiloges;
    }
    
    public void set_epiloges(ArrayList<String> epiloges)
            
    {
        
        this.epiloges=epiloges;
    }
}
