package mes.bca.firstapp.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import mes.bca.firstapp.Entity.Student;

public interface Studentrepo extends JpaRepository<Student, Long>  {
    
}
