package com.nishant.cis.demo.submission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubmissionRepository extends JpaRepository<SubmissionDTO,String> {
    @Query
    Optional<SubmissionDTO> findSubmissionByEmail(String email);
}
