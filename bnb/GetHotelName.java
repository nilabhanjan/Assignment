package bnb;

public class GetHotelName {
  public static String getHotelName(String input){
    try {
      String[] inputArray = input.split(":");
      if (inputArray.length != 2) {
        throw new Error("Invalid input type");
      }
      CustomerTypeClass customerType = new CustomerTypeClass();
      DateClass dateClass = new DateClass();
      CustomerType cType = customerType.GetCustomerType(inputArray[0]);
      String[] dateArray = inputArray[1].split(",");
      TDays totalDays = dateClass.getTotalDays(dateArray);
      return PriceCalculate.findHotelName(cType, totalDays);

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  }
}
