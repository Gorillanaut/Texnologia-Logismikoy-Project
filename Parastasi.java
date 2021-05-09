import java.util.Date;

class Parastasi


{
   private int kodikos;
   
   private String titlos;
   
   private String perigrafi;
   
   private int theseis;
   
   private int eisitiria;
   
   private Date imerominia_ora;
   
   public Parastasi(int kodikos, String titlos, String perigrafi, int theseis, int eisitiria, Date imerominia_ora)
   
   {
     this.kodikos = kodikos;
     
     this.titlos = titlos;
     
     this.perigrafi = perigrafi;
     
     this.theseis = theseis;
     
     this.eisitiria = eisitiria;
     
     this.imerominia_ora = imerominia_ora;
       
    }
    public int get_kodikos()
    {
        return kodikos;
    }
    public void set_kodikos(int kodikos)
    {
        this.kodikos = kodikos;
    }
    
    public String get_titlos()
    {
        return titlos;
    }
    public void set_titlos(String titlos)
    {
        this.titlos = titlos;
    }
    
    public String get_perigrafi()
    {
        return perigrafi;
    }
    public void set_perigrafi(String perigrafi)
    {
        this.perigrafi = perigrafi;
    }
    
    public int get_theseis()
    {
        return theseis;
    }
    public void set_theseis(int theseis)
    {
        this.theseis = theseis;
    }
    
    public int get_eisitiria()
    {
        return eisitiria;
    }
    public void set_eisitiria(int eisitiria)
    {
        this.eisitiria = eisitiria;
    }
        
    public Date get_imerominia_ora()
    {
        return imerominia_ora;
    }
    public void set_imerominia_ora(Date imerominia_ora)
    {
        this.imerominia_ora = imerominia_ora;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}