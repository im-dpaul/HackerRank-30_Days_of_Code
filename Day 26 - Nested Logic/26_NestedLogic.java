import java.io.*;
import java.util.*;

public class Solution {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
     
        int fine=0;
         int[] returnDate=new int[3];
         int[] expDate=new int[3];
       returnDate=dateInput().clone();
        expDate=dateInput().clone();
           
         
  
        if(returnDate[2]<=expDate[2]){
            if(returnDate[1]<=expDate[1]){
                if(returnDate[0]<=expDate[0]){
                    fine=0;
                  
                }else{
                 fine=(returnDate[0]-expDate[0])*15;
               
                }
                
            }else if(expDate[2]<=returnDate[2]){
                   fine=((returnDate[1]-expDate[1])*500);
                
                }
            }else{
                   fine=10000;
               
                }
                System.out.println(fine);
        }
        
     

     static int[] dateInput(){ 
          int [] out=new int[3];
        
 //System.out.println("Please input date as -> dd/mm/yyyy");
        
         int day=sc.nextInt();
         int month=sc.nextInt();
         int year=sc.nextInt();
         
       // System.out.println(day+" "+month+" " +year);
            if(day>31 || day<1){
            System.out.println("Wrong input please try again");
            
            }
           
          
            if(month>12 || month<1){
            System.out.println("Wrong input please try again");
           
              }
               
          
            if(year>3000 || year<1){
            System.out.println("Wrong input please try again");
           
             }
              
        out[0]=day;
        out[1]=month;
        out[2]=year;
     //   sc.close();
        return  out;
        
    }  
    
    
}