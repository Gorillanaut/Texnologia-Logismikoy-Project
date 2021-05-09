import java.util.Date;

class Statistika


{
    
 private int kodikos;
 
 private String username_politi;
 
 private Date teleftaia_eisodos;
 
 private int plithos_ekkremwn_aitisewn;
 
 private int plithos_ekkremwn_paraponwn;
 
 
 
 public Statistika(int kodikos, String username_politi, Date teleftaia_eisodos, int plithos_ekkremwn_aitisewn, int plithos_ekkremwn_paraponwn)
 
 {
     this.kodikos = kodikos;
     
     this.username_politi = username_politi;
     
     this.teleftaia_eisodos = teleftaia_eisodos;
     
     this.plithos_ekkremwn_aitisewn = plithos_ekkremwn_aitisewn;
     
     this.plithos_ekkremwn_paraponwn=plithos_ekkremwn_paraponwn;
     
    }
 
  public void set_username_politi(String o)
    
    {
        username_politi =o;
    }
    
    public String get_username_politi()
    
    {
     return username_politi;   
    }
  
  public void set_teleftaia_eisodos(Date il)
    
    {
        teleftaia_eisodos =il;
    }
    
    public Date get_teleftaia_eisodos()
    
    {
     return teleftaia_eisodos;   
    }
    
    public void set_kodikos(int k)
    
    {
        kodikos =k;
    }
    
    public int get_kodiko()
    
    {
     return kodikos;   
    }
    
    
    public void set_plithos_ekkremwn_aitisewn(int k)
    
    {
        plithos_ekkremwn_aitisewn =k;
    }
    
    public int get_plithos_ekkremwn_aitisewn()
    
    {
     return plithos_ekkremwn_aitisewn;   
    }
    
    
    public void set_plithos_ekkremwn_paraponwn(int k)
    
    {
        plithos_ekkremwn_paraponwn =k;
    }
    
    public int get_plithos_ekkremwn_paraponwn()
    
    {
     return plithos_ekkremwn_paraponwn;   
    }
}