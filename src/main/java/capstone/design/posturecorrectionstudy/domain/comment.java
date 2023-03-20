package capstone.design.posturecorrectionstudy.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class comment {
    @Id
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private posting post;
    private String content;
    private Long memberId;
}
