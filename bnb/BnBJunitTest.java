package bnb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BnBJunitTest {
    @Test
    public void BnbTest(){
        String result1 = GetHotelName.getHotelName("Regular: 16Mar2009, 17Mar2009, 18Mar2009");
        assertEquals("CoconutValley", result1);
        String result2 = GetHotelName.getHotelName("Regular: 20Mar2009, 21Mar2009, 22Mar2009");
        assertEquals("AakulamLake", result2);
        String result3 = GetHotelName.getHotelName("Rewards: 26Mar2009, 27Mar2009, 28Mar2009");
        assertEquals("VeliBeach", result3);
    }
}
