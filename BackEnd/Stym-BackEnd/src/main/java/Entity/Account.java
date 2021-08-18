package Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name ="Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userid")
    private long userId;

    @Column(name="Username")
    private String userName;

    @Column(name="Password")
    private String password;

    @Column(name="email")
    private String email;

    @Column(name="Category")
    private String category;

    @ManyToOne
    @JoinColumn(name = "UserId", nullable = false, updatable = false, insertable = false )
    private Account AccountId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
    private Set<Library> libraries;
}
