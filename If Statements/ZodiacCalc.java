// Made junior year high school as practice for AP Comp Sci A
// demonstrates use of if statements (though not effectively)
import java.util.Scanner;
import java.lang.Math;
 
class ZodiacCalc{
    public static void main(String[] args) {
      
     Scanner scan = new Scanner(System.in);
     System.out.println("On what day of the month were you born? (number)");
     int day = scan.nextInt();
     System.out.println("In which month were you born? (number)");
     int month = scan.nextInt();
     if (day <= 0 || day >= 32 || month <= 0 || month > 12){
       System.out.println("error"); 
     }
     if(month == 1 && day >= 1 && day <=19) {
       System.out.println("Your sign is Capricorn");
     }
     if((month == 1 && day >= 20 && day <=31) || (month == 2 && day <= 18)) {
       System.out.println("Your sign is Aquarius");
     }
     if((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
       System.out.println("Your sign is Pisces");
     }
     if((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
       System.out.println("Your sign is Aries");
     }
     if((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
       System.out.println("Your sign is Taurus");
     }
     if((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
       System.out.println("Your sign is Gemini");
     }
     if((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
       System.out.println("Your sign is Cancer");
     }
     if((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
       System.out.println("Your sign is Leo");
     }
     if((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
       System.out.println("Your sign is Virgo");
     }
     if((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
       System.out.println("Your sign is Libra");
     }
     if((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
       System.out.println("Your sign is Scorpio");
     }
     if((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
       System.out.println("Your sign is Sagittarius");
     }
     if((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
       System.out.println("Your sign is Capricorn");
     }
     
     if(month ==1) {
       String bmonth = "January"; }
     if(month ==2) {
       String bmonth = "February"; }
     if(month ==3) {
       String bmonth = "March"; }
     if(month ==4) {
       String bmonth = "April"; }
     if(month ==5) {
       String bmonth = "May"; }
     if(month ==6) {
       String bmonth = "June"; }
     if(month ==7) {
       String bmonth = "July"; }
     if(month ==8) {
       String bmonth = "August"; }
     if(month ==9) {
       String bmonth = "September"; }
     if(month ==10) {
       String bmonth = "October"; }
     if(month ==11) {
       String bmonth = "November"; }
     if(month ==12) {
       String bmonth = "December"; }
     if(day ==1) {
       String bday = "first"; }
     if(day ==2) {
       String bday = "second"; }
     if(day ==3) {
       String bday = "third";}
     if(day ==4){
       String bday = "fourth";}
     if(day ==5){
       String bday = "fifth";}
     if(day ==6){
       String bday = "sixth";}
     if(day ==7){
       String bday = "seventh";}
     if(day ==8){
       String bday = "eighth";}
     if(day ==9){
       String bday = "ninth";}
     if(day ==10){
       String bday = "tenth";}
     if(day ==11){
       String bday = "eleventh";}
     if(day ==12){
       String bday = "twelfth";}
     if(day ==13){
       String bday = "thirteenth";}
     if(day ==14){
       String bday = "fourteenth";}
     if(day ==15){
       String bday = "fifteenth";}
     if(day ==16){
       String bday = "sixteenth";}
     if(day ==17){
       String bday = "seventeenth";}
     if(day ==18){
       String bday = "eighteenth";}
     if(day ==19){
       String bday = "nineteenth";}
     if(day ==20){
       String bday = "twentieth";}
     if(day ==21){
       String bday = "twenty-first";}
     if(day ==22){
       String bday = "twenty-second";}
     if(day ==23){
       String bday = "twenty-third";}
     if(day ==24){
       String bday = "twenty-fourth";}
     if(day ==25){
       String bday = "twenty-fifth";}
     if(day ==26){
       String bday = "twenty-sixth";}
     if(day ==27){
       String bday = "twenty-seventh";}
     if(day ==28){
       String bday = "twenty-eighth";}
     if(day ==29){
       String bday = "twenty-ninth";}
     if(day ==30){
       String bday = "thirtieth";}
     if(day ==31){
       String bday = "thirty-first";}
     System.out.println("Your birthday is: " + bmonth + " " + bday);
    }
}
 
