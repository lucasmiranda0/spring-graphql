package br.com.graphqlspringboot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;

    @Enumerated(EnumType.STRING)
    private University university;

    public Student(String name, Integer age, University university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public Student() {
        
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
