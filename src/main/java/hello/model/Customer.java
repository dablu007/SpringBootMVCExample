package hello.model;
import java.util.Date;

public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private Date dateOfBirth;

    public Customer(long id, String firstName, String lastName, String email, String mobile) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.dateOfBirth = new Date();
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setId(Long id) {
        this.id = id;
    }
}