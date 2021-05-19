// Trinh To, CS141, Fall 2019, Section A
// Programming Assignment #9, 10/24/19

// Write a method called daysInMonth() that takes in a month
 // (as an integer) and an integer year as parameters 
 // and returns the number of days in that month as an integer. 

public class HW9{
// open class

   public static void main(String[] args){
   //open main
      System.out.print("This program compares two applicants to \n determine which one seems like the stronger\napplicant. For each candidate I will need\neither SAT or ACT scores plus a weighted GPA.");
    
 
       
      System.out.println(daysInMonth(2,2000));
      System.out.println(daysInMonth(7,2000));
      System.out.println(daysInMonth(4,2019));
      System.out.println(daysInMonth(8,2013));
      System.out.println(daysInMonth(17,2019));
      System.out.println(daysInMonth(7,1690));

      //print with 6 different examples
      
   }//end main
   
   public static int daysInMonth(int m,int y){
   //open static method
   
    int nod=0;// 
    
    if (y < 1700){
      nod = (-1);
    }//* if to evaluate year
    
    else if (m<1 || m>12){
      nod=-1;  
    }//*if to evaluate month
    
    else if (m==2){
      if (LeapYear(y)){
         nod=29;
         //**LeapYear(y) is true then February have 29 days.
      }
      else{
         nod=28;
         //**LeapYear(y) is false then February have 28 days.
      }
    }//* if to evaluate February of leap year
     
    else if (m<=7){
      if (m%2==0){
         nod=30;
         //** even month from 1-7 except for 2 have 30 days.
         }
         else {
         nod=31;
         //** odd month from 1-7 except for 2 have 31 days.
         }
    }//* if to evaluate month from 1-7 except for 2 
      //because they have the same pattern. 
    
    else {
      if (m%2==0){
         nod=31;
         //** even month from 8-12  have 31 days.
         }
         else {
         nod=30;
         //** odd month from 8-12  have 30 days.
         }
   }//* if to evaluate month from 8-12  
     //because they have the same pattern.

     return nod;
     
   }//end static method
   
   public static boolean LeapYear(int year){
   //open static method
      if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                  return true;
                  //*** if year%400==0 
                   //then year is  still a leap year.
                   //(because year%400==0 --> year%4==0)
                } 
                else {
                  return false;
                  //*** if year%400!=0 
                   //then year is not a leap year.
                   //(because year%400!=0 --> year%4!=0)
                }
            } 
            else {                
             return true;
                 //** if year%4==0 but year%100!=0 
                  //then year is  still a leap year. 
            }
        } 
        else {
            
            return false;
            //* if year%4!=0 then year is not a leap year.

        }        
   }//end static method
   
}//end class