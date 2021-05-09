import java.util.Date;


class Aitisi_Pistopoihtikou
{
  private int kodikos_aitisis;
  
  private int kodikos;
    
  private String username_politi;
  
  private Date imerominia_kataxorisis;
  
  private String katastasi;
  
  public Aitisi_Pistopoihtikou(int kodikos_aitisis, int kodikos, Date imerominia_kataxorisis, String katastasi)
  
  {
      this.kodikos_aitisis = kodikos_aitisis;
      
      this.kodikos = kodikos;
      
      this.imerominia_kataxorisis = imerominia_kataxorisis;
      
      this.katastasi = katastasi;
      
      
    }
    
    public int get_kodikos_aitisis()
    
    {
     return kodikos_aitisis;   
    }
    
    public void set_kodikos_aitisis(int k)
    
    {
        kodikos_aitisis =k;
    }
    
    public int get_kodikos()
    
    {
     return kodikos;   
    }
    
    public void set_kodikos(int kod)
    
    {
     kodikos = kod;   
    }
    
    public String get_username_politi()
    
    {
     return username_politi;   
    }
    
    public void set_username_politi(String u)
    
    {
        username_politi =u;
    }
    
    public Date get_imerominia_kataxorisis()
    
    {
     return imerominia_kataxorisis;   
    }
    
    public void set_imerominia_kataxorisis(Date i)
    
    {
     imerominia_kataxorisis = i;   
    }
    
    public String get_katastasi()
    
    {
     return katastasi;   
    }
    
    public void set_katastasi(String kat)
    
    {
     katastasi = kat;   
    }
  
}