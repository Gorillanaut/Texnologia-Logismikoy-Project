

package com.mycompany.epatras;

import java.util.*;


public class Main {
  
    public static ArrayList<Politis> polites = new ArrayList<Politis>();
    
    public static ArrayList<Administrator> admins = new ArrayList<Administrator>();
    
    public static ArrayList<Ipallilos> ipalliloi = new ArrayList<Ipallilos>();
    
    public static ArrayList<Eisitirio> eisitiria = new ArrayList<Eisitirio>();
    
    public static ArrayList<Parastasi> parastaseis = new ArrayList<Parastasi>();
    
    public static ArrayList<Thesi_Parking> parkings = new ArrayList<Thesi_Parking>();
    
    public static ArrayList<Ypiresia> ypiresies = new ArrayList<Ypiresia>();
    
    public static ArrayList<Rantevou> rantevous = new ArrayList<Rantevou>();
    
    public static ArrayList<Psifoforia> psifofories = new ArrayList<Psifoforia>();
    
    public static ArrayList<Parapono> parapona = new ArrayList<Parapono>();
    
    public static ArrayList<Aitisi_Eggrafis> aitiseis = new ArrayList<Aitisi_Eggrafis>();
    
    public static ArrayList<Minima> minimata = new ArrayList<Minima>();
    
    public static void main(String[] args)
    {  
    
    Administrator adm = new Administrator("1234","admin");
    
    Politis p1 = new Politis("Nikos","Papadopoulos","AK123456","nikos","1234","nikos@gmail.com","Korinthou 100, Patra");
    
    Politis p2 = new Politis("Maria","Papageorgiou","TT154789","maria","1234","maria@gmail.com","Ermou 50, Patra");
    
    Politis p3 = new Politis("Tasos","Kostopoulos","RR876543","tasos","1234","tasos@gmail.com","Riga Feraiou 80, Patra");

    Main.polites.add(p1);
    
    Main.polites.add(p2);
    
    Main.polites.add(p3);
    
    Main.admins.add(adm);
    
    
    Ipallilos i1 = new Ipallilos("1234","kostas","Kostas Petropoulos");
    
    Ipallilos i2 = new Ipallilos("1234","eleni","Eleni Ioannou");
    
    Ipallilos i3 = new Ipallilos("1234","petros","Petros Petrou");
    
    
    Main.ipalliloi.add(i1);
    
    Main.ipalliloi.add(i2);
    
    Main.ipalliloi.add(i3);
    
    
    
     Date d1 = new Date(2020,11,28,15,00);
   
   Date d2 = new Date(2021,12,14,07,00);
   
   Parastasi par1 = new Parastasi(1, "O karagiozis sto Ceid", "Nea parastasi gia to Ceid", 120, 120, d1);
   
   Parastasi par2 = new Parastasi(3,"Patras Carnival act","I kalyteri parastasi",150,150,d2);
   
   
   Main.parastaseis.add(par1);
   
   Main.parastaseis.add(par2);
   
   
   Thesi_Parking t1 = new Thesi_Parking(2,"Korinthou 48", "free", 120);
   
   Thesi_Parking t2 = new Thesi_Parking(4,"Gerokostopoulou 110","free",100);
   
   
   Main.parkings.add(t1);
   
   Main.parkings.add(t2);

    
    
    Eisitirio e1 = new Eisitirio(1, "parastasi", 3.5, 1, 20, p1);
    
    Eisitirio e2 = new Eisitirio(2,"parking",1.8,2,10,p2);
    
    Eisitirio e3 = new Eisitirio(3,"parastasi",10,3,5,p3);
    
    Eisitirio e4 = new Eisitirio(4,"parking",2.5,4,0,p1);
    
    
    Main.eisitiria.add(e1);
    
    Main.eisitiria.add(e2);
    
    Main.eisitiria.add(e3);
    
    Main.eisitiria.add(e4);
    
    
  
  Date mydate1 = new Date(2021,1,1,8,0);
  
  Date mydate2 = new Date(2021,1,2,8,0);
  
  Date mydate3 = new Date(2021,1,3,8,0);
  
  
  Date mydate4 = new Date(2021,1,1,15,0);
  
  Date mydate5 = new Date(2021,1,2,15,0);
  
  Date mydate6 = new Date(2021,1,3,15,0);
  
  

 ArrayList<Date> from  = new ArrayList<Date>();
 
 ArrayList<Date> to = new ArrayList<Date>();
 
 from.add(mydate1);
 
 from.add(mydate2);
 
 from.add(mydate3);
 
 to.add(mydate4);
 
 to.add(mydate5);
 
 to.add(mydate6);
 
 Ypiresia yp1 = new Ypiresia(1,"Liksiarxeio",from,to,i1);
 
 Ypiresia yp2 = new Ypiresia(2,"Dimotologio",from,to,i2);
 
 Ypiresia yp3 = new Ypiresia(3,"Koinwnikes Ypiresies",from,to,i3);
 
 
 Main.ypiresies.add(yp1);
 
 Main.ypiresies.add(yp2);
 
 Main.ypiresies.add(yp3);
 
 Date mydate_r1 = new Date(2021,8,14,10,0);
 
 Date mydate_r2 = new Date(2021,07,15,18,0);
 
 Date mydate_r3 = new Date(2021,10,10,10,0);
 
 
 Rantevou r1 = new Rantevou(1, mydate_r1,"nikos",1);
 
 Rantevou r2 = new Rantevou(2,mydate_r2,"maria",2);
 
 Rantevou r3 = new Rantevou(3,mydate_r3,"tasos",3);
 
 
 Main.rantevous.add(r1);
 
 Main.rantevous.add(r2);
 
 Main.rantevous.add(r3);
 
 
 String epil1 ="Nai";
 
 String epil2 = "Oxi";
 
 ArrayList<String> epiloges = new ArrayList<String>();
 
 epiloges.add(epil1);
 
 epiloges.add(epil2);
 
 Date mydate_psif1_start = new Date(2021,01,01,10,0);
 
 Date mydate_psif1_end = new Date(2021,05,30,10,0);
 
 Date mydate_psif2_start = new Date(2021,02,02,11,0);
 
 Date mydate_psif2_end = new Date(2021,12,12,8,0);
 
 Psifoforia psif1 = new Psifoforia(1, mydate_psif1_start, mydate_psif1_end,"Psifoforia 1", "Simfoneite me to ergo tou Dimou?",epiloges,null);
 
 Psifoforia psif2 = new Psifoforia(2,mydate_psif2_start, mydate_psif2_end,"Psifoforia 2", "Simfoneite me ton proypologismo?",epiloges,null);
 
 
 Main.psifofories.add(psif1);
 
 Main.psifofories.add(psif2);
 
 Date date_parapono1 = new Date(2021, 4,5,15,25);
 
 Date date_parapono2 = new Date(2021,3,3,3,17);
 
 
 Parapono parapono1 = new Parapono(1,"Provlima me lakouva", "I lakouva einai epikindini", "nikos", date_parapono1, null, null);
 
 Parapono parapono2 = new Parapono(2, "Provlima me fotismo","Den mporoume na doume tin nykta","maria",date_parapono2,"C:/users/maria/photos",null);
 
 
 Main.parapona.add(parapono1);
 
 Main.parapona.add(parapono2);
 
 
    
}
    
    
    
}
