package com.yunbin.schoolManagement.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Courses extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int courseId;

    private String name;

    private String fees;

    @ManyToMany(mappedBy = "courses", fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private Set<Person> persons = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "personId") // Foreign key to represent the teacher
    private Person teacher;
}
