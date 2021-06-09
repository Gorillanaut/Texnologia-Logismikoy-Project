/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.epatras;

class Thesi_Parking

{
    
 private int kodikos;
 
 private String address;
 
 private String katastasi;
 
 private int diarkeia;
 
 private Politis katoxos;
 
 
 public Thesi_Parking(int kodikos, String address, String katastasi, int diarkeia)
 
 {
     this.kodikos = kodikos;
     
     this.address = address;
     
     this.katastasi = katastasi;
     
     this.diarkeia = diarkeia;
    }
 
  public int get_kodikos()
  
  {
     return kodikos; 
    }
  
  public Politis get_katoxos()
          
  {
      return katoxos;
  }
  
  public void set_katoxos(Politis katoxos)
          
  {
      this.katoxos = katoxos;
  }
 
 public void set_kodikos(int k)
 
 {
     kodikos = k;
    }
    
    public String get_address()
 
 {
     return address;
    }
 
 public void set_address(String a)
 
 {
     address=a;
    }
    
      public String get_katastasi()
 
 {
     return katastasi;
    }
 
 public void set_katastasi(String a)
 
 {
     katastasi=a;
    }
    
   public int get_diarkeia()
  
  {
     return diarkeia; 
    }
 
 public void set_diarkeia(int d)
 
 {
     diarkeia = d;
    } 
    
}