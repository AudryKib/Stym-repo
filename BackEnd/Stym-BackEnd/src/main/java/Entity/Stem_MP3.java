package Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "Stem_MP3")
public class Stem_MP3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Stem_MP3Id")
    private long stemMp3Id;

    @Column(name = "mp3Id")
    private long mp3Id;

    @Column(name = "StemId")
    private long stymId;

    @Column(name = "libraryId")
    private long libraryId;

    @ManyToOne
    @JoinColumn(name = "LibraryId", nullable = false, insertable = false, updatable = false)
    private long library;

    @OneToOne
    @JoinColumn(name = "mp3Id", referencedColumnName = "mp3Id")
    private MP3_Demo mp3Demo;

    @OneToOne
    @JoinColumn(name = "StemId", referencedColumnName = "StemId")
    private Stem_Folder stemFolder;
}
