/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

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
    
    public void view_profile_details()
    {
        
    }
    
    public void update_profile_details()
    {
      
    }
    
    public void login()
    {
        if(!username.equals(get_username()) && !password.equals(get_password()))
        {
            System.out.println("Please try again!!!");
        }
        
        else
        {
            System.out.println("You are the right user!!!");
        }
    }
    
    public void ekdosi_eisitirioy(Eisitirio e)
    {
        String temp = " ";
        
        for(Eisitirio n: Main.eisitiria)
        {
         if(n.get_kodikos()==e.get_kodikos())
          {
             temp = temp + n.get_kodikos();
             
             temp = temp + " ";
             
             temp = temp +n.get_typos();
             
             temp = temp + " ";
             
             temp = temp + n.get_timi();
             
             temp = temp + " ";

             
             temp = temp + n.get_antikeimeno();
             
             
             temp = temp + " ";

             
             temp = temp + n.get_kodikos_ekptosis();
             
             temp = temp + " ";

             
             temp = temp + n.get_katoxos();
          }
      }
    }
   
    public void ektipwsi_eisitirioy(Eisitirio e)
    {

    }    
    public void ekdosi_thesis_parking(Thesi_Parking t)
    {
       String temp = " ";
        
        for(Thesi_Parking n: Main.theseis_parking)
        {
         if(n.get_kodikos()==t.get_kodikos())
          {
             temp = temp + n.get_kodikos();
             
             temp = temp + " ";
             
             temp = temp +n.get_address();
             
             temp = temp + " ";
             
             temp = temp + n.get_katastasi();
             
             temp = temp + " ";

             
             temp = temp + n.get_diarkeia();
             

          }
      }
    }
            
    public  Eisitirio get_eisitirio(Eisitirio e) 
    {
    return e;
    }
    
    public Thesi_Parking get_thesi_parking(Thesi_Parking t) 
    {
    return t;
    }
    
    public void enimerosi()
    {
    
    }
    
    public void ektypwsi_pistopoihtikoy(Pistopoihtiko p)
    {
  
    }
    
    public void request_pistopoihtiko(Pistopoihtiko p)
    {
     
    }
    
    
    public void provoli_pistopoihtiko(Pistopoihtiko p)
    {
      String temp= "";
      
      for(Pistopoihtiko s: Main.pistopoihtika)
      {
          if(s.get_kodikos()==p.get_kodikos())
          {
             temp = temp + s.get_kodikos();
             
             temp = temp + " ";
             
             temp = temp +s.get_imerominia_ekdosis();
             
             temp = temp + " ";
             
             temp = temp + s.get_stoixeia_pistopoihtikou();
             
             temp = temp + " ";

             
             temp = temp + s.get_username_politi();
             
             
             temp = temp + " ";

             
             temp = temp + s.get_username_ypallilou();
             
             temp = temp + " ";

             
             temp = temp + s.get_path();
          }
      }
    }
    
    public ArrayList<Rantevou> get_rantevou()
    {
    
    }
    
   public void ypovoli_paraponou(Parapono p)
    {
      for(Parapono m: Main.parapona)
      {
          if(m.get_kodikos()!=p.get_kodikos() && m.get_titlos()!=p.get_titlos())
          {
              Main.parapona.add(m);
          }
      }
    } 
    
   public ArrayList <Parapono> get_parapona()
    {
    
    }
   
   public void kleisimo_rantevou(Rantevou r)
   {
      for(Rantevou v: Main.rantevous)
      {
          if(v.get_kodiko()!=r.get_kodiko() && v.get_kodiko_ypiresias()!=r.get_kodiko_ypiresias())
          {
              Main.rantevous.add(v);
          }
      }
   } 
   
   public void akyrwsi_rantevou(Rantevou r)
   {
     for(Rantevou v: Main.rantevous)
      {
          if(v.get_kodiko()==r.get_kodiko() && v.get_kodiko_ypiresias()==r.get_kodiko_ypiresias())
          {
              Main.rantevous.remove(v);
          }
      }
   } 
   
   public void prosthiki_aitisi_eggrafis(Aitisi_Eggrafis a)
   {
    for(Aitisi_Eggrafis l: Main.aitiseis)
    {
        if(l.get_kwdiko()!=a.get_kwdiko())
        {
            Main.aitiseis.add(l);
        }
    }
   } 
   
   public ArrayList <Psifoforia> get_psifofories()
   {
    
   }
   
   public void simmetoxi_psifoforia(Psifoforia p)
   {
   
   } 
   
   public ArrayList <Psifoforia> get_trexouses_psifofories()
   {
    
   }
   
   public ArrayList <Psifoforia> get_palies_psifofories()
   {
    
   }
    
}