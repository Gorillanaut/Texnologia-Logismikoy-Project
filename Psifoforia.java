import java.util.Date;

class Psifoforia


{
    private int kodikos;
    
    private Date imerominia_enarksis;
    
    private Date imerominia_liksis;
    
    private String titlos;
    
    private String erotima;
    
    private String epiloges;
    
    private String apotelesmata;
    
    
    public Psifoforia(int kodikos, Date imerominia_enarksis,Date imerominia_liksis, String titlos, String erotima, String epiloges, String apotelesmata)
    
    {
        this.kodikos=kodikos;
        
        this.imerominia_enarksis = imerominia_enarksis;
        
        this.imerominia_liksis = imerominia_liksis;
        
        this.titlos = titlos;
        
        this.erotima = erotima;
        
        this.apotelesmata = apotelesmata;
        
    }
    
    
    public void set_kodikos(int k)
    
    {
        kodikos =k;
    }
    
    public int get_kodiko()
    
    {
     return kodikos;   
    }
    
    public void set_imerominia_enarksis(Date ie)
    
    {
         imerominia_enarksis=ie;
    }
    
    public Date get_imerominia_enarksis()
    
    {
     return imerominia_enarksis;   
    }
    
    
    public void set_imerominia_liksis(Date il)
    
    {
        imerominia_liksis =il;
    }
    
    public Date get_imerominia_liksis()
    
    {
     return imerominia_liksis;   
    }
    
    public void set_titlos(String t)
    
    {
        titlos =t;
    }
    
    public String get_titlo()
    
    {
     return titlos;   
    }
    
    public void set_erotima(String e)
    
    {
        erotima =e;
    }
    
    public String get_erotima()
    
    {
     return erotima;   
    }
    
    public void set_apotelesmata(String a)
    
    {
        apotelesmata =a;
    }
    
    public String get_apotelesmata()
    
    {
     return apotelesmata;   
    }
   
}