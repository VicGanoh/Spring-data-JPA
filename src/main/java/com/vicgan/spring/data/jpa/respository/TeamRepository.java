package com.vicgan.spring.data.jpa.respository;

import com.vicgan.spring.data.jpa.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("SELECT t FROM Team t WHERE t.teamName = ?1")
    public List<Team> findByTeamName(String name);
}
