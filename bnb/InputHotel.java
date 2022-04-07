package bnb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;



public class InputHotel {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input B&B Name");
        String hotelname = sc.nextLine();
        System.out.println("Input B&B Rating");
        int rat = sc.nextInt();
        System.out.println("Input Regular Weekday Price:");
        int wp = sc.nextInt();
        System.out.println("Input Regular Weekend Price:");
        int wndp = sc.nextInt();
        System.out.println("Input Rewards Weekday Price:");
        int wr = sc.nextInt();
        System.out.println("Input Rewards Weekend Price:");
        int wndpr = sc.nextInt(); 
        
        
        HotelList c1= new HotelList(hotelname, rat, wp, wndp, wr, wndpr);
        HotelList[] hotelArray= new HotelList[1];
        hotelArray[0]=c1;

        for(int i=0; i<hotelArray.length; i++)
        {
            String outputHotel=hotelArray[i].getName()+":"+hotelArray[i].getRating()+":"+hotelArray[i].getWeekNormal()+":"+hotelArray[i].getWeekEndnormal()+":"+hotelArray[i].getWeekRewards()+":"+hotelArray[i].getWeekendRewards();
            saveTofile("Hotellist.txt",outputHotel,true);
        }
        System.out.println("Successfully inserted new B&B:"+hotelname);
       
        sc.close();
    }

    public static ArrayList<HotelList> loadFromFile() throws IOException {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get("Hotellist.txt")));
        String[] classArray = data.split("\n");
       ArrayList<HotelList> hotelArray = new ArrayList<HotelList>();
        for(String hotelString: classArray){
           HotelList hotel = convertStringToClass(hotelString);
           hotelArray.add(hotel);
        }
        return hotelArray;
    }

    private static HotelList convertStringToClass(String hotelString){

        String[] hotelStringToArray = hotelString.split(":");

        return new HotelList(hotelStringToArray[0].trim(),
                Integer.parseInt(hotelStringToArray[1]),
                Integer.parseInt(hotelStringToArray[2].trim()),
                Integer.parseInt(hotelStringToArray[3].trim()),
                Integer.parseInt(hotelStringToArray[4].trim()),
                Integer.parseInt(hotelStringToArray[5].trim()));
    }

    public static void saveTofile(String fileName, String text, boolean append) throws IOException {

        File file1=new File(fileName);

        FileWriter fw=new FileWriter(file1,append);

        PrintWriter pw=new PrintWriter(fw);

        pw.println(text);
        pw.close();
      
    }
}
   
