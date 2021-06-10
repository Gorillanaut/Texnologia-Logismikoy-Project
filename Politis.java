/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

import java.util.*;

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
    
    public String get_profile_details()
    {
        String temp="";
        
        
        for(Politis p:Main.polites)
            
        {
            if((this.get_username()).equals(p.get_username()))
                
            {
                temp = temp + p.get_username();
                
                temp = temp + " ";
                
                temp = temp + p.get_email();
                
                temp = temp + " ";
                
                temp = temp + p.get_eponimo();
                
                temp = temp + " ";
                temp = temp + p.get_onoma();
                
                temp = temp + " ";
                
                temp = temp + p.get_at();
                
                temp = temp + " ";
                
                temp = temp + p.get_address();
            }
        }
       
        return temp;
    }
    
     public void update_profile_details(String onoma, String eponimo, String at, String email, String address, String username, String password)
    {
        
        for(Politis p: Main.polites)
            
        {
            
            if((this.get_username()).equals(p.get_username()))
                
            {
                p.set_onoma(onoma);
                p.set_eponimo(eponimo);
                p.set_username(username);
                p.set_at(at);
                p.set_password(password);
                p.set_email(email);
                p.set_address(address);
            }
        }
      
    }
    
     public boolean login(String username, String password)
             
     {
         boolean found = false;
         
         for(Politis p:Main.polites)
             
         {
             if(username.equals(p.get_username())&& password.equals(p.get_password()))
                 
             {
                 found = true;
                 
                 break;
             }
         }
         return found;
     }
     
     void ekdosi_eisitirioy(Eisitirio e)
             
     {
         e.set_stoixeia_katoxou(this);
         
         Main.eisitiria.add(e);
     }
     
     String get_info_eisitirio(Eisitirio e)
             
     {
         String temp = "";
         
         for(Eisitirio k: Main.eisitiria)
             
         {
             if(k.get_kodikos()==e.get_kodikos() && k.get_katoxos()==this)
                 
             {
                 temp = temp +  k.get_typos();
                 
                 temp = temp + " ";
                 
                 temp = temp + k.get_katoxos().get_eponimo();
                 
                 temp = temp + " ";
                 
                 temp = temp + k.get_katoxos().get_onoma();
                 
                 temp = temp + k.get_timi();
                 
                 temp = temp + " ";
                 
                 temp = temp + k.get_kodikos_ekptosis();
             }
         }
         
         return temp;
     }
     
     void ekdosi_thesis_parking(Thesi_Parking t)
             
     {
               
       t.set_katoxos(this);
       
       Main.parkings.add(t);
     }
     
     String get_info_thesi_parking(Thesi_Parking t)
     
     {
         String temp  = "";
         
         
        for(Thesi_Parking k:Main.parkings)
            
        {
            if(t.get_kodikos()==k.get_kodikos() && k.get_katoxos()==this)
                
            {
                temp = temp + k.get_katoxos().get_eponimo();
                
                temp = temp + " ";
                
                temp = temp + k.get_katoxos().get_onoma();
                
                temp = temp + " ";
                
                temp = temp + k.get_address();
                
                
            }
        }
         
         return temp;
     }
     
     ArrayList<String> get_info_ypiresies()
             
     {
         ArrayList<String> temp = new ArrayList<String>();
         
         
         for(Ypiresia y: Main.ypiresies)
             
         {
             String temp_string = y.get_titlos() + ":"+y.get_from().toString() + "-" +y.get_to().toString();
             
             temp.add(temp_string);
             
         }
         
         return temp;
     }
     
     ArrayList<String> get_info_theseis()
             
     {
         ArrayList<String> temp = new ArrayList<String>();
         
         for(Thesi_Ergasias t:Main.theseis_ergasias)
             
         {
             String temp_string = t.get_perigrafi_thesis() + " " + t.get_prosonta();
             
             temp.add(temp_string);
         }
         
         return temp;
     }
     
     ArrayList<String> get_info_parastaseis()
             
     {
         ArrayList<String> temp = new ArrayList<String>();
         
         for(Parastasi p: Main.parastaseis)
             
         {
             String temp_string = p.get_titlos() + " "+ p.get_perigrafi() + " " + p.get_imerominia_ora().toString();
             
             temp.add(temp_string);
         }
         
         
         return temp;
     }
   
     
     public String get_info_pistopoihtiko(Pistopoihtiko p)
             
     {
         String temp = "";
         
         for(Pistopoihtiko k:Main.pistopoihtika)
             
         {
             if(k.get_kodikos()==p.get_kodikos()&& (k.get_username_politi()).equals(this.username))
                 
             {
                 temp = temp + k.get_stoixeia_pistopoihtikou();
                 
                 temp = temp + " ";
                 
                 temp = temp + k.get_imerominia_ekdosis();
                 
                 temp = temp + " ";
                 
                 temp = temp + k.get_username_politi();
                 
                 temp = temp + " ";
                 
                 temp = temp + k.get_username_ypallilou();
                 
                 
             }
         }
         
         
         return temp;
     }
     
     void ektypwsi_pistopoihtikou(Pistopoihtiko p)
             
     {
      System.out.println(get_info_pistopoihtiko(p));   
     }
     
     void ektypwsi_eisitiriou(Eisitirio e)
             
     {
      System.out.println(get_info_eisitirio(e));
         
     }
     
     void ektypwsi_thesis_parking(Thesi_Parking t)
             
     {
         System.out.println(get_info_thesi_parking(t));
         
     }
     
     public void request_pistopoihtiko(Pistopoihtiko p)
             
    {
        
        Aitisi_Pistopoihtikou ait1 = new Aitisi_Pistopoihtikou();
        
        Date d1 = new Date();
        ait1.set_imerominia_kataxorisis(d1);
        
        ait1.set_katastasi("pending");
        
        ait1.set_username_politi(this.username);
        
        ait1.set_kodikos(p.get_kodikos());
        
        Main.aitiseis_pist.add(ait1);
     
    }
     
     
     public ArrayList<Rantevou> get_rantevou()
    {
       ArrayList<Rantevou> temp = new ArrayList<Rantevou>();
       
       
       for(Rantevou r: Main.rantevous)
           
       {
           if(r.get_username_politi()==this.username)
           {
               temp.add(r);
           }
           
       }
       
       return temp;
    }
     
     public void ypovoli_paraponou(Parapono p)
             
     {
         boolean found = false;
         
         for(Parapono k: Main.parapona)
             
         {
             if((k.get_titlos()).equals(p.get_titlos()) && (k.get_username_politi()).equals(this.username))
                 
             {
                 found = true;
                 
                 break;
             }
         }
         
         if(found ==false)
             
         {
             p.set_username_politi(this.username);
             
             Main.parapona.add(p);
         }
         
     }
     
     public ArrayList <Parapono> get_parapona()
    {
        
        ArrayList<Parapono> temp = new ArrayList<Parapono>();
        
        for(Parapono k: Main.parapona)
            
        {
            if(k.get_username_politi().equals(this.username))
                
            {
                temp.add(k);
            }
        }
        
        
       return temp;
    }
     
           public void kleisimo_rantevou(Rantevou r)
                   
           {
               boolean found = false;
               
               for(Rantevou k: Main.rantevous)
                   
               {
                   if(k.get_username_politi().equals(this.username) && k.get_imerominia_ora()==r.get_imerominia_ora())
                       
                   {
                       found = true;
                   }
                   
               }
               
               if(found==false)
               {
               r.set_username_politi(this.username);
               Main.rantevous.add(r);
               }
               
           }

 public void akyrwsi_rantevou(Rantevou r)
   {
     for(Rantevou v: Main.rantevous)
      {
          if(v.get_kodiko()==r.get_kodiko())
          {
              Main.rantevous.remove(v);
          }
      }
   } 
 
 
    public void prosthiki_aitisi_eggrafis(Aitisi_Eggrafis a)

    {
        boolean found = false;
        
        for(Aitisi_Eggrafis k: Main.aitiseis)
            
        {
            if(k.get_username().equals(a.get_username()))
                
            {
                found = true;
            }
            
        }
        
        if(found==false)
        {
            Main.aitiseis.add(a);
            
        }
        
    }      
      
    public ArrayList <Psifoforia> get_psifofories()
   {
    ArrayList<Psifoforia> temp = new ArrayList<Psifoforia>();
        
        for(Psifoforia k: Main.psifofories)
            
        {
                temp.add(k);
        }
        
        
       return temp;
   }
    
    
    public void simmetoxi_psifoforia(Psifoforia p, String apantisi)
            
    {
        for(Psifoforia k: Main.psifofories)
            
        {
            if(k.get_kodiko()==p.get_kodiko())
                
            {
                k.add_apantisi(apantisi);
            }
            
        }
        
    }
    
       public ArrayList <Psifoforia> get_trexouses_psifofories()
               
       {
           
           ArrayList<Psifoforia> temp = new ArrayList<Psifoforia>();
           
           Date d1 = new Date();
           
           
           for(Psifoforia k: Main.psifofories)
               
           {
               
               if(k.get_imerominia_liksis().after(d1))
                   
               {
                   temp.add(k);
                   
               }
           }
           
           
           return temp;
           
       }

       
         public ArrayList <Psifoforia> get_palies_psifofories()
               
       {
           
           ArrayList<Psifoforia> temp = new ArrayList<Psifoforia>();
           
           Date d1 = new Date();
           
           
           for(Psifoforia k: Main.psifofories)
               
           {
               
               if(k.get_imerominia_liksis().before(d1))
                   
               {
                   temp.add(k);
                   
               }
           }
           
           
           return temp;
           
       }

         
         
     
}