package org.generation.italy.legion.model.services.implementations;

import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.services.abstractions.DidacticService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Profile("test")
public class TestDidacticService implements DidacticService {
    @Override
    public Optional<Student> findStudentById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Student> findAllStudent() {
        return null;
    }

    @Override
    public List<Student> findStudentsByNameLike(String part) {
        return null;
    }


}
