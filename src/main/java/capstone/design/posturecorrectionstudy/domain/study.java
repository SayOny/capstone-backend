package capstone.design.posturecorrectionstudy.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Getter
@Setter
public class study {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long studyid;

    private String studyname;

    @OneToOne
    private member leader;

    @OneToMany(fetch = FetchType.LAZY)
    private List<member> members = new ArrayList<member>();

    @OneToMany(fetch = FetchType.LAZY)
    private List<news> newss = new ArrayList<news>();

    private String event;

    private category hashtag;
    private Long ranking;
    private LocalDateTime schedule;
    private boolean weather;
    private LocalDateTime openeddate;
    private String post;
    private LocalDateTime deadline;
}