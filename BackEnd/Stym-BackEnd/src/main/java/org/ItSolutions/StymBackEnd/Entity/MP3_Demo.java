package org.ItSolutions.StymBackEnd.Entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "MP3_Demo")
public class MP3_Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mp3Id")
    private Integer mp3Id;

    @Column(name = "name")
    private String name;

    @Column(name = "Creationdate")
    @CreationTimestamp
    private Date creationDate;

    @Column(name = "mp3")
    private String mp3;

    @Column(name = "AccountId")
    private Integer accountId;


    @OneToOne  (mappedBy = "mp3Demo")
    private Stem_MP3 stymp3;
}
