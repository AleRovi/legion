package org.generation.italy.legion.model.services.implementations;

import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.services.abastractions.DidacticService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Profile("test")
public class TestDidacticService implements DidacticService {
    @Override
    public List<Student> findAllStudent() {
        return null;
    }
}
