/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

class Eisitirio


{
    
 private int kodikos;
 
 private String typos;
 
 private double timi;
 
 // edo tha mpei antikeimeno anaforas 
 private int kodikos_antikeimenou;
 
 private int kodikos_ekptosis;
 
 private Politis katoxos;
 
 public int get_kodikos()
 
 {return kodikos;
     
    }
    
 public void set_kodikos(int k)
 
 {
     kodikos = k;
    }
 
 public String get_typos()
 
 {
     return typos;
    }
 
 public void set_typos(String t)
 
 {
     typos = t;
    }
 
 public double get_timi()
 
 {
     return timi;    
    }
 
 public void set_timi(float t)
 
 {
     timi = t;
    }
 
 public int get_antikeimeno()
 
 { 
     return kodikos_antikeimenou;
     
    }
 
 public void set_antikeimeno(int ant)
 
 {
     kodikos_antikeimenou = ant;
     
    }
    
 public int get_kodikos_ekptosis()
 
 {
     return kodikos_ekptosis;
    }
 
    
 public void set_kodikos_ekptosis(int k)
 
 {
     kodikos_ekptosis = k;
    }
    
 public Politis get_katoxos()
 
 {
     return katoxos;
    }
    
 public void set_stoixeia_katoxou(Politis p)
 
 {
      katoxos = p;
    }
 public Eisitirio(int kodikos, String typos, double timi, int antikeimeno, int kodikos_ekptosis, Politis p)
 
 {
     this.kodikos = kodikos;
     
     this.typos = typos;
     
     this.timi = timi;
     
     this.kodikos_antikeimenou = antikeimeno;
     
     this.kodikos_ekptosis = kodikos_ekptosis;
     
     this.katoxos = p;
     
     
     if(typos.equals("parking"))
         
     {
         //psaxnoume mesa stis theseis parking
         for(Thesi_Parking t: Main.parkings)
         
         {
             
             //an vroume thesi me kodiko pou na taytizetai me to kodiko tou antikeimenou tou eisitiriou
             if (t.get_kodikos()==kodikos_antikeimenou)
                 
             {
                 //allazoume tin katastasi tis thesi kai tin kanoume reserved
                 t.set_katastasi("reserved");
                 
             }
         }
         
         
     }
     
     else
         
     {
         for(Parastasi par: Main.parastaseis)
             
         {
             if(par.get_kodikos()==kodikos_antikeimenou)
                 
             {
                 
                 par.set_eisitiria(par.get_eisitiria()-1);
                 
                 par.set_theseis(par.get_theseis()-1);
                 
             }
             
             
         }
         
    
     }
     
     
     
     
    }
    
    
    
}
