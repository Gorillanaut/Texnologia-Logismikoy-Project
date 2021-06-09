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
 
 String elegxos_profil_dimoti(Politis p)
 {
     String temp = "";
     
     for(Politis k: Main.polites)
     {
         if(k.get_at().equals(p.get_at()) && k.get_username().equals(p.get_username()))
         {
             temp = temp + k.get_onoma();
             
             temp = temp + " ";
             
             temp = temp + k.get_eponimo();
             
             temp = temp + " ";
             
             temp = temp + k.get_at();
             
             temp = temp + " ";
             
             temp = temp + k.get_username();
             
             temp = temp + " ";
             
             temp = temp + k.get_email();
             
             temp = temp + " ";
             
             temp = temp + k.get_address();
             
         }
     }
     
     return temp;
 }
 
 ArrayList<Aitisi_Pistopoihtikou> get_aitiseis_pistopoihtikwn()
 {
     ArrayList<Aitisi_Pistopoihtikou> temp = new ArrayList<Aitisi_Pistopoihtikou>();
     
     for(Aitisi_Pistopoihtikou e: Main.aitiseis_pist)
     {
         temp.add(e);
     }
     
     return temp;
 }
 
 void apodoxi_aitisis(Aitisi_Pistopoihtikou p)
 {
     for(Aitisi_Pistopoihtikou e: Main.aitiseis_pist)
     {
         if(e.get_kodikos_aitisis()==p.get_kodikos_aitisis())
         {
            e.set_katastasi("egkrinetai");
         }
     }
 }
 
 void aporripsi_aitisis(Aitisi_Pistopoihtikou p)
         
 {
      for(Aitisi_Pistopoihtikou e: Main.aitiseis_pist)
     {
         if(e.get_kodikos_aitisis()==p.get_kodikos_aitisis())
         {
            e.set_katastasi("aporriptetai");
         }
     }
 }
 
 public ArrayList<Parapono> get_parapona()
 {
     ArrayList<Parapono> temp = new ArrayList<Parapono>();
     
     for(Parapono i: Main.parapona)
     {
         temp.add(i);
     }
     
    return temp;
 }
 
 void apantisi_se_parapono(Parapono p)
 {
 
 }
 
 void diagrafi_thesis_ergasias(Thesi_Ergasias t)
 {
     for(Thesi_Ergasias i: Main.theseis_ergasias)
     {
         if(i.get_kodikos()==t.get_kodikos())
         {
             Main.theseis_ergasias.remove(i);
         }
     }
 }
 
 void prosthiki_thesis_ergasias(Thesi_Ergasias t)
 {
      for(Thesi_Ergasias i: Main.theseis_ergasias)
     {
         if(i.get_kodikos()!=t.get_kodikos())
         {
             Main.theseis_ergasias.add(i);
         }
     }
 }
 
}



