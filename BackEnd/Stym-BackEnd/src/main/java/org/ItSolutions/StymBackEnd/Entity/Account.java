package org.ItSolutions.StymBackEnd.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name ="Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userid")
    private Integer userId;

    @Column(name="Username")
    private String userName;

    @Column(name="Password")
    private String password;

    @Column(name="email")
    private String email;

    @Column(name="Category")
    private String category;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false, updatable = false, insertable = false )
    private User userid;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
    private Set<Library> libraries;
}
