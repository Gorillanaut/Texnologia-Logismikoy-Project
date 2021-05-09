import java.util.Date;

class Pistopoihtiko

{
 private int kodikos;
    
 private Date imerominia_ekdosis;   
    
 private String stoixeia_pistopoihtikou;
 
 private String username_politi;
 
 private String username_ypallilou;
 
 private String path;
 
 
 public Pistopoihtiko(int kodikos, Date imerominia_ekdosis, String stoixeia_pistopoihtikou, String username_politi, String username_ypallilou, String path)
 
 {
     this.kodikos = kodikos;
     
     this.imerominia_ekdosis = imerominia_ekdosis;
     
     this.stoixeia_pistopoihtikou = stoixeia_pistopoihtikou;
     
     this.username_politi = username_politi;
     
     this.username_ypallilou=username_ypallilou;
     
     this.path = path;
     
    }
    public int get_kodikos()
    {
        return kodikos;
    }
    public void set_kodikos(int kodikos)
    {
        this.kodikos = kodikos;
    }
            
    public Date get_imerominia_ekdosis()
    {
        return imerominia_ekdosis;
    }
    public void set_imerominia_ekdosis(Date imerominia_ekdosis)
    {
        this.imerominia_ekdosis = imerominia_ekdosis;
    }
        
    public String get_stoixeia_pistopoihtikou()
    {
        return stoixeia_pistopoihtikou;
    }
    public void set_stoixeia_pistopoihtikou(String stoixeia_pistopoihtikou)
    {
        this.stoixeia_pistopoihtikou = stoixeia_pistopoihtikou;
    }
            
    public String get_username_politi()
    {
        return username_politi;
    }
    public void set_username_politi(String username_politi)
    {
        this.username_politi = username_politi;
    }
            
    public String get_username_ypallilou()
    {
        return username_ypallilou;
    }
    public void set_username_ypallilou(String username_ypallilou)
    {
        this.username_ypallilou = username_ypallilou;
    }
            
    public String get_path()
    {
        return path;
    }
    public void set_path (String path)
    {
        this.path = path;
    }
    
    
    
    
    
    
    
    
    
    
}