package bnb;

import java.util.Scanner;

 class MainExecutable {


   public static void main(String args[]) {
     try {
        Scanner sc= new Scanner(System.in);

        System.out.print("Press:\n 1 for Searching \n 2 for adding hotel \n : ");
    
        int number= sc.nextInt(); 
    
        switch(number){
            case 1: SearchHotel.main(args);
            break;  
            case 2: InputHotel.main(args) ;
            break;
            default:System.out.println("Wrong Option");
             }

        sc.close();
        }
     catch (Exception e) {
       e.getStackTrace();
     }
  }
  
}