package bnb;

public class CustomerTypeClass {

    public CustomerType GetCustomerType(String input) {

        String inputToLower = input.toLowerCase();

        if ("rewards".equals(inputToLower)) {
            return CustomerType.REWARD;
        }
        return CustomerType.REGULAR;


    }
}
