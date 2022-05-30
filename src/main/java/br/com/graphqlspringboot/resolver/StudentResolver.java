package br.com.graphqlspringboot.resolver;

import br.com.graphqlspringboot.input.StudentInput;
import br.com.graphqlspringboot.model.Student;
import br.com.graphqlspringboot.repository.StudentRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class StudentResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private StudentRepository repository;

    public Collection<Student> findAllStudents(){
        return repository.findAll();
    }

    public Student findStudentById(Long id){
        return repository.findById(id).get();
    }

    public Student saveStudent(StudentInput input){
        return repository.save(new Student(input.getName(), input.getAge(), input.getUniversity()));
    }

    public Student updateAge(Long studentId, Integer age){
        Student student = repository.findById(studentId).get();
        student.setAge(age);
        return repository.save(student);
    }
}
