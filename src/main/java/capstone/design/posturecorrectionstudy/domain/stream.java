package capstone.design.posturecorrectionstudy.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class stream {

    @Id @GeneratedValue
    private Long streamid;

    private Long studyid;

    @OneToMany
    private List<member> users = new ArrayList<member>();

    private LocalDateTime date;

    private LocalDateTime start;
    private LocalDateTime end;

    private Long posturewarning;
    private Long sleepingwarning;

}
