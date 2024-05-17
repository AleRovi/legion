package org.generation.italy.legion.model.repositories.abstractions;

import org.generation.italy.legion.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByFirstnameOrLastnameContaining(String part1,String part2);
}
