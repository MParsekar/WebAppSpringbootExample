
package mes.bca.firstapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mes.bca.firstapp.Entity.Student;
import mes.bca.firstapp.Repository.Studentrepo;

@Service
public class StudentService {
    
    @Autowired
    Studentrepo syStudentrepo;

    public List<Student> getStudentDetails() {
        return syStudentrepo.findAll();
    }

    public void saveStudent(mes.bca.firstapp.DTO.Student student){
        Student student2 = new Student();
        // s.name = s1.name ;


        student2.setRollno(student.getRollno());
        student2.setStudentname( student.getName());

        syStudentrepo.save(student2);


    }
}
