package org.generation.italy.legion.model.repositories.abstractions;

import org.generation.italy.legion.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
