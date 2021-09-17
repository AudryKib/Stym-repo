package org.ItSolutions.StymBackEnd.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="User")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userId")
    private Long userId;

    @Column(name="firstName")
    private String firstName;

    @Column(name="image")
    private String image;

    @Column(name="lastName")
    private String lastName;

    @Column(name="phoneNo")
    private String phoneNo;

    @Column(name="address")
    private String address;

    @Column(name="email")
    private String email;

    @Column(name="userName")
    private String userName;

    @Column(name="password")
    private String password;

    @ManyToMany(mappedBy = "users")
    private List<Stem> stems;



}
