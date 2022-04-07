package bnb;

import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.MAX_VALUE;

public class PriceCalculate {
    public static String findHotelName(CustomerType cType, TDays totalDays) throws IOException {
        //TODO load data from the file
        int lowPrice =  MAX_VALUE;
        String lowPriceHotelName ="";
        int rating  =0;
      ArrayList<HotelList> hotelList = InputHotel.loadFromFile();

      for(HotelList hotel : hotelList){
          int price = getHotelPrice(hotel,cType,totalDays);
          if(price < lowPrice){
            lowPrice = price;
            lowPriceHotelName = hotel.getName();
            rating = hotel.getRating();
          }else if(price == lowPrice){
              if(rating < hotel.getRating()){
                  rating = hotel.getRating();
                  lowPriceHotelName = hotel.getName();
              }
          }
      }

      return lowPriceHotelName;


    }

    private static int getHotelPrice(HotelList hotel, CustomerType cType, TDays totalDays){
        if(cType == CustomerType.REGULAR){
            return hotel.getWeekEndnormal()*totalDays.weekend + hotel.getWeekNormal()*totalDays.weekday;
        }else{
            return hotel.getWeekendRewards()*totalDays.weekend + hotel.getWeekRewards()*totalDays.weekday;
        }
    }
}
