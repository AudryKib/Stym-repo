package Entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Data
@Entity
@Table(name="Library")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LibraryId")
    private long libraryId;

    @Column(name = "Name")
    private String name;

    @Column(name = "CreationDate")
    @CreationTimestamp
    private Date creationDate;

    @Column(name = "LastAccessdate")
    @UpdateTimestamp
    private Date lastAccessDate;

    @Column(name = "Accountid")
    private long accountId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "library")
    private Set<Stem_MP3> Stems;

    @ManyToMany
    @JoinColumn(name = "Accountid", nullable = false, insertable = false, updatable = false)
    private Account account;
}
