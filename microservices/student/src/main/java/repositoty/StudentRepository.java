package repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import pojo.StudentPojo;


public interface StudentRepository extends JpaRepository<StudentPojo, Integer> {
	
}
