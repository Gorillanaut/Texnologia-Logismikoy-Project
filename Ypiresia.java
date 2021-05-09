import java.util.Date;

class Ypiresia


{
    
 private int kodikos;
 
 private String titlos;
 
 private Date orario_leitourgias;
 
 private Ipallilos ipefthinos_ypallilos;
 
 public Ypiresia(int kodikos, String titlos, Date orario_leitourgias, Ipallilos ipefthinos_ypallilos)
 
 {
     this.kodikos = kodikos;
     
     this.titlos = titlos;
     
     this.orario_leitourgias = orario_leitourgias;
     
     this.ipefthinos_ypallilos = ipefthinos_ypallilos;
     
    }
 
    public int get_kodikos()
  
  {
     return kodikos; 
    }
 
 public void set_kodikos(int k)
 
 {
     kodikos = k;
    }
    
    public String get_titlos()
 
 {
     return titlos;
    }
 
 public void set_titlos(String a)
 
 {
     titlos= a;
    }
    
    public Date get_orario_leitourgias()
    
    {
     return orario_leitourgias;   
    }
    
    public void set_orario_leitourgias(Date i)
    
    {
     orario_leitourgias=i;   
    }
    
   public Ipallilos get_ipefthinos_ypallilos()
    
    {
     return ipefthinos_ypallilos;   
    }
    
    public void set_ipefthinos_ypallilos(Ipallilos j)
    
    {
     ipefthinos_ypallilos=j;   
    } 
    
}