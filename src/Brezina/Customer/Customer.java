package Brezina.Customer;

/**
 * Created by blainebrezina on 1/29/16.
 */
public class Customer {

    private String name;

    private String address;

    private String city;

    private String state;

    private int postalCode;

    public Customer (String name, String address, String city, String state, int postalCode){
        this.name = name;

        this.address = address;

        this.city = city;

        this.state = state;

        this.postalCode = postalCode;
    }

    public String getNameAndAddress (){
        String message =
                name + "\n" +
                address + "\n" +
                city + ", " +
                state + " " +
                postalCode;

        return message;

    }

}
