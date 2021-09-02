package org.ItSolutions.StymBackEnd.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="User")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="UserId")
    private Integer userId;

    @Column(name="FirstName")
    private String firstName;

    @Column(name="LastName")
    private String lastName;

    @Column(name = "picture")
    private String picture;

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

    @OneToMany( mappedBy = "userid", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Account> accounts;
}
