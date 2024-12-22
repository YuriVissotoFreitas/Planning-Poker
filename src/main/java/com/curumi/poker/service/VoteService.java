package com.curumi.poker.service;

import com.curumi.poker.model.Vote;
import com.curumi.poker.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public Vote save(Vote vote) {
        return voteRepository.save(vote);
    }
}