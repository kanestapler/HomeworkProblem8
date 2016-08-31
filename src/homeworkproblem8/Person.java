
package homeworkproblem8;

/**
 *
 * @author Kane
 */
public class Person {
    private String firstName;
    private String lastName;
    private int zipcode;
    
    public Person(String first, String last, int zip) {
        this.firstName = first;
        this.lastName = last;
        this.zipcode = zip;
    }
    
    public Person(String first, String last, String zip) {
        this.firstName = first;
        this.lastName = last;
        this.zipcode = Integer.parseInt(zip);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
