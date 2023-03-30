package OOP_LAB_ACTIVITIES;

   public class Vaccine {
      String vaccineeName;
      String vaccineeAddress;
      String vaxBrand;
      String vaxDate;
      String vaxSite;

   public Vaccine(String vaccineeName, String vaccineeAddress, String  vaxBrand, String vaxDate, String vaxSite) {
           this.vaccineeName = vaccineeName;
           this.vaccineeAddress = vaccineeAddress; 
           this.vaxBrand = vaxBrand;
           this.vaxDate = vaxDate ;       
           this.vaxSite = vaxSite ;
   }

      void showVaxDetails(){
      System.out.println("Vaccinee Name: " + vaccineeName);
      System.out.println("Vaccinee Address: " + vaccineeAddress);
      System.out.println("Vax Brand: " + vaxBrand);
      System.out.println("Vax Date: " + vaxDate);
      System.out.println("Vax Site: " + vaxSite);
   }
      
     void showVaxBrand(){
     System.out.println("Vax Brand: " + vaxBrand);
}
     
     public static void main(String[] args){
         Vaccine v = new Vaccine("JUAN DELA CRUZ", "MANILA", "SINOVAC", "12/01/2021", "SAMPALOC MANILA");
         v.showVaxDetails();
         v.showVaxBrand();
     }
}