class Eisitirio


{
    
 private int kodikos;
 
 private String typos;
 
 private float timi;
 
 // edo tha mpei antikeimeno anaforas 
 private String antikeimeno;
 
 private int kodikos_ekptosis;
 
 private String stoixeia_katoxou;
 
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
 
 public float get_timi()
 
 {
     return timi;    
    }
 
 public void set_timi(float t)
 
 {
     timi = t;
    }
 
 public String get_antikeimeno()
 
 { 
     return antikeimeno;
     
    }
 
 public void set_antikeimeno(String ant)
 
 {
     antikeimeno = ant;
     
    }
    
 public int get_kodikos_ekptosis()
 
 {
     return kodikos_ekptosis;
    }
 
    
 public void set_kodikos_ekptosis(int k)
 
 {
     kodikos_ekptosis = k;
    }
    
 public String get_stoixeia_katoxou()
 
 {
     return stoixeia_katoxou;
    }
    
 public void set_stoixeia_katoxou(String s)
 
 {
     stoixeia_katoxou=s;
    }
 public Eisitirio(int kodikos, String typos, float timi, String antikeimeno, int kodikos_ekptosis, String stoixeia_katoxou)
 
 {
     this.kodikos = kodikos;
     
     this.typos = typos;
     
     this.timi = timi;
     
     this.antikeimeno = antikeimeno;
     
     this.kodikos_ekptosis = kodikos_ekptosis;
     
     this.stoixeia_katoxou = stoixeia_katoxou;
     
     
     
     
    }
    
    
    
}