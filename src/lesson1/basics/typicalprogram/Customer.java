package lesson1.basics.typicalprogram;
/**
 * Stores data for an address. In this application,
 * an Employee may have a home address and also a work Address.
 * @author Soueilem Mohamed Lemine
 */
public class Customer {
    private String name;
    private String email;
    private int orderNumber;
    private int price;
    public Customer(String na, String em, int ordNu, int pr){
        name = na;
        email = em;
        orderNumber = ordNu;
        price = pr;
    }
    public String getName(){ return name;}
    public String getEmail(){ return email;}
    public int getOrderNumber(){ return orderNumber;}
    public int getPrice(){ return price;}

    /**
     * Provides a string representation of an address.
     * @return a string representation of an addresss
     */
    public String toString() {
        return "Customer Info\nName: "+ name + "\nEmail: " + email + "\nOrder Details\nNumber: "+ orderNumber + "\nPrice: $" + price;
    }

}
