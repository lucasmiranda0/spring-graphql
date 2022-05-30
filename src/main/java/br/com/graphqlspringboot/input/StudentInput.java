package br.com.graphqlspringboot.input;

import br.com.graphqlspringboot.model.University;
import graphql.schema.GraphQLInputType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentInput implements GraphQLInputType {
    @Override
    public String getName() {
        return name;
    }

    private String name;
    private Integer age;
    private University university;
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public University getUniversity() {
        return university;
    }
    
    public void setUniversity(University university) {
        this.university = university;
    }
}
