package Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="User")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="UserId")
    private long userId;

    @Column(name="FirstName")
    private String firstName;

    @Column(name="LastName")
    private String lastName;

    @Column(name="Company")
    private String company;

    @Column(name="Address")
    private String address;

    @Column(name="State")
    private String state;

    @Column(name="City")
    private String city;

    @Column(name="ZipCode")
    private String zipCode;

    @Column(name="PhoneNo")
    private String phoneNo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "AccountId")
    private Set<Account> accounts;
}
