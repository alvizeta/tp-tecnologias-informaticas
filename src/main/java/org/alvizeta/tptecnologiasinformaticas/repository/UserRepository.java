package org.alvizeta.tptecnologiasinformaticas.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.alvizeta.tptecnologiasinformaticas.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
