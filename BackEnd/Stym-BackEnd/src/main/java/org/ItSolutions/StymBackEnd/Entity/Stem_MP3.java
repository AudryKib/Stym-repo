package org.ItSolutions.StymBackEnd.Entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "Stem_MP3")
public class Stem_MP3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Stem_MP3Id")
    private Integer stemMp3Id;

    @Column(name = "mp3Id", insertable = false, updatable = false)
    private Integer mp3Id;

    @Column(name = "StemId", insertable = false, updatable = false, nullable = false)
    private Integer stemId;

    @Column(name = "libraryId")
    private Integer libraryId;

    @ManyToOne
    @JoinColumn(name = "LibraryId", nullable = false, insertable = false, updatable = false)
    private Library library;

    @OneToOne
    @JoinColumn(name = "mp3Id", referencedColumnName = "mp3Id")
    private MP3_Demo mp3Demo;

    @OneToOne
    @JoinColumn(name = "StemId", referencedColumnName = "StemId")
    private Stem_Folder stemFolder;
}
