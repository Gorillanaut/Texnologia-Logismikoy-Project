/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

import java.util.*;

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
 
 public ArrayList<Rantevou> get_rantevou()
         
 {
     ArrayList<Rantevou> temp = new ArrayList<Rantevou>();
     
     for(Rantevou r: Main.rantevous)
         
     {
         temp.add(r);
     }
     
     
     return temp;
     
 }
 
 
 void akyrwsi_rantevou(Rantevou r)
         
 {
     
     for(Rantevou k: Main.rantevous)
         
     {
         if(k.get_kodiko()==r.get_kodiko())
             
         {
             Main.rantevous.remove(k);
             
             break;
         }
         
     }
     
     
     
 }
 
 void apostoli_logou_aporripsis(Rantevou r, Politis p, String titlos, String periexomeno)
 
 {
     
     for(Rantevou k: Main.rantevous)
         
     {
         if(k.get_kodiko()==r.get_kodiko() && (k.get_username_politi()).equals(p.get_username()))
             
         {
             Date cur_date = new Date();
             
             Minima m1 = new Minima(username, p.get_username(),titlos, periexomeno,cur_date);
             
             Main.minimata.add(m1);
             
         }
     }
     
 }
 
 ArrayList<Ypiresia> get_ipiresies()
         
 {
     ArrayList<Ypiresia> temp = new ArrayList<Ypiresia>();
     
     
     for(Ypiresia e: Main.ypiresies)
         
     {
         temp.add(e);
     }
     
     return temp;
 }
 
 
 public void epeksergasia_programmatos_ypiresias(Ypiresia y, ArrayList<Date> from, ArrayList<Date> to)
         
 {
     for(Ypiresia k: Main.ypiresies)
         
     {
         if(k.get_kodikos()==y.get_kodikos())
             
         {
             k.set_from(from);
             
             k.set_to(to);
             
             break;
             
         }
     }
     
     
 }
 
 public void prosthiki_ypiresias(Ypiresia y)
         
 {
     boolean found = false;
     
     for(Ypiresia k:Main.ypiresies)
         
     {
         if((k.get_titlos()).equals(y.get_titlos()))
             
         {
             found = true;
             
             break;
         }
     }
     
     if(found==false)
         
     {
         Main.ypiresies.add(y);
     }
 }
 
 void prosthiki_parastasis(Parastasi p)
         
 {
     boolean found = false;
     for(Parastasi k: Main.parastaseis)
         
     {
         if((k.get_titlos()).equals(p.get_titlos()) && (k.get_imerominia_ora()).equals(p.get_imerominia_ora()))
             
         {
             found = true;
         }
     }
     
     if(found==false)
         
     {
         Main.parastaseis.add(p);
     }
 }
 
 String get_info_parastasis(Parastasi p)
         
 {
     
     String temp = "";
     
     
     for(Parastasi k: Main.parastaseis)
     
     {
         if(k.get_kodikos()==p.get_kodikos())
             
         {
             temp = temp + k.get_titlos();
             
             temp = temp + " ";
             
             temp = temp +k.get_perigrafi();
             
             temp = temp + " ";
             
             temp = temp + k.get_imerominia_ora();
             
             temp = temp + " ";

             
             temp = temp + k.get_eisitiria();
             
             
             temp = temp + " ";

             
             temp = temp + k.get_theseis();
         }
     }
     
     return temp;
 }
 
 
}



