package org.generation.italy.legion.model.services.implementations;

import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.repositories.abstractions.StudentRepository;
import org.generation.italy.legion.model.services.abastractions.DidacticService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//segnala che è componente candidata per essere iniettata
@Profile("dev")
public class JpaDidacticService implements DidacticService {
    private StudentRepository studentRepo;

    public JpaDidacticService(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public List<Student> findStudentsByNameLike(String part) {
        return studentRepo.findByFirstnameOrLastnameContaining(part,part);
    }


}
