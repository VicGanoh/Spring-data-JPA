package com.vicgan.spring.data.jpa.controller;

import com.vicgan.spring.data.jpa.model.Team;
import com.vicgan.spring.data.jpa.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    public List<Team> getAllTeams(){ return teamService.getListOfTeams();}

    @GetMapping("/{teamName}")
    public List<Team> getTeamByName(@PathVariable("teamName") String teamName){
        return teamService.getTeamByName(teamName);
    }

    @GetMapping("/{teamId}")
    public Optional<Team> getTeamById(@PathVariable("teamId") Long teamId){
        return teamService.getATeamById(teamId);
    }

    @PostMapping
    public Team addTeam(@RequestBody Team team){
        return teamService.addTeam(team);
    }

    @PutMapping("/{teamId}")
    public Team updateTeam(@RequestBody Team team, @PathVariable("teamId") Long teamId){
        return teamService.updateTeam(team, teamId);
    }

    @DeleteMapping("/{teamId}")
    public void deleteTeamById(@PathVariable("teamId") Long teamId){
        teamService.deleteTeamById(teamId);
    }
}
