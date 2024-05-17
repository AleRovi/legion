package org.generation.italy.legion.model.repositories.abstractions;

import org.generation.italy.legion.model.Address;
import org.generation.italy.legion.model.CoverLetter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoverLetterRepository extends JpaRepository<CoverLetter, Long> {
}
