package com.backendtestapi.repositories;

import com.backendtestapi.entities.T_user;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface T_userRepository extends JpaRepository<T_user, Long> {
    Optional<T_user> findById(Long id);
    Page<T_user> findAll(Pageable pageable);
}
