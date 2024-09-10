package org.example.systemdesign.repository;

import org.example.systemdesign.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

    @Query(value = "SELECT * FROM users WHERE email = ?1 OR phone_number = ?2", nativeQuery = true)
    User findByEmailOrPhone(String email, String phone);

}
