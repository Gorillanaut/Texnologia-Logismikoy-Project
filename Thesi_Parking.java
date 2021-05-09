class Thesi_Parking

{
    
 private int kodikos;
 
 private String address;
 
 private String katastasi;
 
 private int diarkeia;
 
 
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