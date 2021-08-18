package Entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "Stem_Folder")
@Data
public class Stem_Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StemId")
    private long stemId;

    @Column(name = "Name")
    private String name;

    @Column(name = "CreationDate")
    @CreationTimestamp
    private Date creationDate;

    @Column(name = "NumberofTracks")
    private int numberOfTracks;

    @Column(name = "Stem")
    private String stym;

    @Column(name = "ArtWork")
    private String artWork;

    @Column(name = "Description")
    private String description;

    @OneToOne(mappedBy = "stemFolder")
    private Stem_MP3 stemmp3;
}
