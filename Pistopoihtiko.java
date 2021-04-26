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
    
}