package com.vicgan.spring.data.jpa.controller;

import com.vicgan.spring.data.jpa.model.Project;
import com.vicgan.spring.data.jpa.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAllProjects(){return projectService.getAllProjects();}

    @GetMapping("/{id}")
    public Optional<Project> getProjectById(@PathVariable("id") Long id){
        return projectService.getProjectById(id);
    }

    @PostMapping
    public Project addProject(@RequestBody Project project){ return projectService.addProject(project);}

    @PutMapping("/{id}")
    public Project updateProject(@RequestBody Project project, @PathVariable("id") Long id){
        return projectService.updateProject(project, id);
    }

    @DeleteMapping("/{id}")
    public void deleteProjectById(@PathVariable("id") Long id){ projectService.deleteProjectById(id);}
}
