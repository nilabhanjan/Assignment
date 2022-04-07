package bnb;

import java.util.Scanner;

public class SearchHotel {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input in format <customer_type>: <date1>, <date2>, <date3>, ...");
        String input = sc.nextLine();

        String hotelName = GetHotelName.getHotelName(input);
        System.out.println(hotelName);
    }

}

enum CustomerType {
    REGULAR, REWARD
}

enum DayType {
    WEEKDAY, WEEKEND
}