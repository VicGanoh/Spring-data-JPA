package com.vicgan.spring.data.jpa.service;

import com.vicgan.spring.data.jpa.model.Team;
import com.vicgan.spring.data.jpa.respository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getListOfTeams(){
        return new ArrayList<>(teamRepository.findAll());
    }

    public Optional<Team> getATeamById(Long teamId){
        return teamRepository.findById(teamId);
    }

    public List<Team> getTeamByName(String name){
        return new ArrayList<>(teamRepository.findByTeamName(name));
    }

    public Team addTeam(Team team){
        return teamRepository.save(team);
    }

    public Team updateTeam(Team team, Long id){
        return teamRepository.save(team);
    }

    public void deleteTeamById(Long id){
        teamRepository.deleteById(id);
    }
}


