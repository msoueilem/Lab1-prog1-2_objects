package lesson1.basics.typicalprogram;
/**
 * Stores data for an address. In this application,
 * an Employee may have a home address and also a work Address.
 * @author Soueilem Mohamed Lemine
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;
    public Customer(String fN, String lN, String sS){
        firstName = fN;
        lastName = lN;
        socSecurityNum = sS;
    }
    public String getFirstName() { return firstName;}
    public void setFirstName(String fn) { this.firstName = fn;}
    public String getLastName() { return lastName;}
    public void setLastName(String ln) { this.lastName = ln;}
    public String getSocSecurityNum(){return socSecurityNum;}
    public void setSocSecurityNum(String sc){ this.socSecurityNum = sc;}
    public Address getBillingAddress(){return billingAddress;}
    public void setBillingAddress(Address ba){ this.billingAddress = ba;}
    public Address getShippingAddress(){return shippingAddress;}
    public void setShippingAddress(Address sa){ this.shippingAddress = sa;}

    /**
     * Provides a string representation of an address.
     * @return a string representation of an addresss
     */
    public String toString() {
        return "Customer Info\nFirst Name: "+ firstName + "\nLast Name: " + lastName + "\nSSN: " + socSecurityNum + "\nAddress\nShipping Address: "+ shippingAddress + "\nBilling Address: " + billingAddress;
    }

}
