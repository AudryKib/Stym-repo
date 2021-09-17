package org.ItSolutions.StymBackEnd.Entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Stem")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Stem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="stemId")
    private Long stemId;

    @Column(name="name")
    private String name;

    @Column(name="creationDate")
    @CreationTimestamp
    private Date creationDate;

    @Column(name="numberOfTracks")
    private String numberOfTracks;

    @Column(name="stym")
    private String stym;

    @Column(name="artWork")
    private String artWork;

    @Column(name="description")
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_stem_mapping",
            joinColumns = @JoinColumn(
                    name ="stem_id",
                    referencedColumnName = "stemId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "user_id",
                    referencedColumnName = "userId"
            )
    )
    private List<User> users;

    public void addUsers(User user){
        if (users == null)  users = new ArrayList<>();
            users.add(user);
    }

}
