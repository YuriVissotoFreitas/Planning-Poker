package com.curumi.poker.repository;

import com.curumi.poker.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {}
