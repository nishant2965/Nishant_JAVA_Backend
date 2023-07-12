package com.nishant.cis.demo.user;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubmissionUserRepository extends JpaRepository<SubmissionUser,String> {
    @Query
    Optional<SubmissionUserDTO> findSubmissionByEmail(String email);
}
