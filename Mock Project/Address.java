
/**
 * Write a description of class Address here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Address
{
    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String city;
    private String country;
    private String postcode;

   public Address(String firstName, String lastName, String address1, String address2, String city, String country, String postcode) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.address1 = address1;
       this.address2 = address2;
       this.city = city;
       this.country = country;
       this.postcode = postcode;
    }
}
