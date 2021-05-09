class Thesi_Ergasias

{
 private int kodikos;
 
 private String perigrafi_thesis;
    
 private String prosonta;
 
 private String username_ipallilou;
 
 public Thesi_Ergasias(int kodikos, String perigrafi_thesis, String prosonta, String username_ipallilou)   
    
    
   {
       
     this.kodikos = kodikos;
     
     this.perigrafi_thesis = perigrafi_thesis;
     
     this.prosonta = prosonta;
     
     this.username_ipallilou=username_ipallilou;
       
    }
    
    public int get_kodikos()
  
  {
     return kodikos; 
    }
 
 public void set_kodikos(int k)
 
 {
     kodikos = k;
    }
    
    public String get_perigrafi_thesis()
 
 {
     return perigrafi_thesis;
    }
 
 public void set_perigrafi_thesis(String a)
 
 {
     perigrafi_thesis=a;
    }
    
     public String get_prosonta()
 
 {
     return prosonta;
    }
 
 public void set_prosonta(String a)
 
 {
     prosonta=a;
    }
    
     public String get_username_ipallilou()
 
 {
     return username_ipallilou;
    }
 
 public void set_username_ipallilou(String a)
 
 {
     username_ipallilou=a;
    }
    
}