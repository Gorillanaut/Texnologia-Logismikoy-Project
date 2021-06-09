/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

import java.util.*;

/**
 *
 * @author 30697
 */
class Administrator

{
    
 private String password;
 
 private String username;
 
 public Administrator(String password, String username)
 
 {
     this.password = password;
     
     this.username = username;
     
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
    
    public ArrayList<Aitisi_Eggrafis> get_ekkremeis_aitiseis()
            
    {
        
        ArrayList<Aitisi_Eggrafis> temp = new ArrayList<Aitisi_Eggrafis>();
        
        for(Aitisi_Eggrafis e: Main.aitiseis)
        {
            if(e.get_status()==false)
        
            {
               temp.add(e);
            }
        
        }
        
        return temp;
             }
    
    
    void apodoxi_aitisis(Aitisi_Eggrafis a)
    
    {
        for(Aitisi_Eggrafis e: Main.aitiseis)
        
        {
            if(e.get_kwdiko()==a.get_kwdiko())
                
            {
                e.set_status(true);
            }
        }
        
    }
            
    
    void aporripsi_aitisis(Aitisi_Eggrafis a)
    
    {
        for(Aitisi_Eggrafis e: Main.aitiseis)
        
        {
            if(e.get_kwdiko()==a.get_kwdiko())
                
            {
                e.set_status(false);
            }
        }
        
    }
    
    void dimiourgia_psifoforias(Psifoforia p)
            
    {
        boolean found = false;
        
        for(Psifoforia k: Main.psifofories)
            
        {
            if((k.get_titlo()).equals(p.get_titlo()) && (k.get_erotima()).equals(p.get_erotima()))
                
            {
                found = true;
                
                break;
            }
        }
        
        if(found==false)
            
        {
            Main.psifofories.add(p);
        }
    }
    
    void diagrafi_politi(Politis p)
            
    {
        for(Politis k: Main.polites)
            
        {
            if((k.get_at()).equals(p.get_at()))
                
            {
                Main.polites.remove(k);
            }
        }
    }
    
    void diagrafi_ypallilou(Ipallilos i)
    {
        for(Ipallilos k: Main.ipalliloi)
        {
            if((k.get_username()).equals(i.get_username()))
            {
                Main.ipalliloi.remove(k);
            }
            
        }
    }
    
    String get_profile_politi(Politis p)
            
    {
        String temp="";
        
        for(Politis k: Main.polites)
            
        {
            if((k.get_at()).equals(p.get_at()))
                
            {
                temp = temp + k.get_at();
                
                temp = temp + " ";
                
                temp = temp + k.get_eponimo();
                
                temp = temp +  " ";
                
                temp = temp + k.get_onoma();
                
                temp =temp + " ";
                
                temp = temp + k.get_email();
                
                temp = temp + k.get_username();
                
            }
        }
        
        return temp;
    }
    
    
    ArrayList<String> get_users_info()
            
    {
        
        ArrayList<String> temp = new ArrayList<String>();
        
        for(Politis p: Main.polites)
            
        {
            temp.add(get_profile_politi(p));
        }
        
            return temp;

    }
    
    
     String get_profile_ipallilou(Ipallilos i)
            
    {
        String temp="";
        
        for(Ipallilos k: Main.ipalliloi)
            
        {
            if((k.get_username()).equals(i.get_username()))
                
            {
                temp = temp + k.get_username();
                
                temp = temp + " ";
                
                temp = temp + k.get_onomateponimo();
                
                
                
            }
        }
        
        return temp;
    }
    
    
    ArrayList<String> get_ipalliloi_info()
            
    {
        
        ArrayList<String> temp = new ArrayList<String>();
        
        for(Ipallilos i: Main.ipalliloi)
            
        {
            temp.add(get_profile_ipallilou(i));
        }
        
            return temp;

    }
    
    
    
    ArrayList<Aitisi_Eggrafis> get_ekkremmeis_aitiseis_politis(Politis p)
            
    {
        ArrayList<Aitisi_Eggrafis> temp = new ArrayList<Aitisi_Eggrafis>();
        
        
        for(Aitisi_Eggrafis e: Main.aitiseis)
        
        {
            
            if((e.get_At()).equals(p.get_at()) && e.get_status()==false)
                
            {
                temp.add(e);
            }
        }
        
        
        return temp;
    }
    
    
    ArrayList<Parapono> get_ekkremi_parapona_politis(Politis p)
            
    {
        ArrayList<Parapono> temp = new ArrayList<Parapono>();
        
        
        for(Parapono k: Main.parapona)
            
        {
            if((k.get_username_politi()).equals(p.get_username()) && k.get_status()==false)
                
            {
                temp.add(k);
            }
        }
        
        
        return temp;
        
    }
    
}