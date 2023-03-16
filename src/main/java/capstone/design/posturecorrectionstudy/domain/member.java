package capstone.design.posturecorrectionstudy.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
public class member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nickname;
    private Long age;
    private Long sex; //남자는 0,여자는 1
    private LocalDate birth;
    private List<category> interest;
    private String email;

    //    private Image profile // 프로필 사진
    @OneToMany(fetch = FetchType.LAZY)
    private List<study> studyList=new ArrayList<study>();

    @OneToMany(fetch = FetchType.LAZY)
    private List<study> myStudyList= new ArrayList<study>();

}

