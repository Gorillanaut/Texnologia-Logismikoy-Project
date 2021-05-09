import java.util.Date;
class Aitisi_Eggrafis

{
 private String onoma;
 
 private String eponimo;
 
 private String at;
 
 private String username;
 
 private String password;
 
 private String email;
    
 private String address;
 
 private String path;
    
 private int kodikos_aitisis;
 
 private Date imerominia_kataxorisis;
 
 private String katastasi;

 public String get_onoma()
 
 {
     return onoma;
    }
    
 public void set_onoma(String o)
 
 {
     onoma = o;
    }
 public String get_at()
 
 {
     return at;
    }
    
 public void set_at(String a)
 {
     at = a;
    }
 public String get_eponimo()
 
 {
     return eponimo;
    }
 
 public void set_eponimo(String e)
 
 {
     eponimo = e;
    }
 
 public String get_username()
 
 {
     return username;
    }
 
 public void set_username(String u)
 {
     username= u;
    }
    
 public String get_password()
 
 {
     return password;
    }
    
 public void set_password(String p)
 
 {
     password = p;
     
    }
    
 public String get_email()
 
 {
     return email;
    }
    
 public void set_email(String e)  
 
 {
     email = e;
     
    }
    
 public String get_address()
 
 {
     return address;
    }
    
 public void set_address(String a)
 
 {
     address = a;
     
    }
 
 public String get_path()
 
 {
     return path;
    }
 
 public void set_path(String p)
 
 {
     path=p;
     
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
    
 public void set_katastasi(String k)
 
 {
     katastasi = k;
    }
    
 public Aitisi_Eggrafis(String onoma, String eponimo, String at, String username, String password, String email, String address, String path, Date imerominia_kataxorisis, String katastasi)
 
 {
     this.onoma = onoma;
     
     this.eponimo = eponimo;
     
     this.at = at;
     
     this.username = username;
     
     this.password = password;
     
     this.email = email;
     
     this.address=address;
     
     this.path = path;
     
     this.imerominia_kataxorisis =imerominia_kataxorisis;
     
     this.katastasi = katastasi;
     
    }
 
}