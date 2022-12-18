package com.vicgan.spring.data.jpa.service;

import com.vicgan.spring.data.jpa.model.Project;
import com.vicgan.spring.data.jpa.respository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects(){
        return new ArrayList<>(projectRepository.findAll());
    }

    public Optional<Project> getProjectById(Long id){
        return projectRepository.findById(id);
    }

    public Project addProject(Project project){
        return projectRepository.save(project);
    }

    public Project updateProject(Project project, Long id){
        return projectRepository.save(project);
    }

    public void deleteProjectById(Long id){
        projectRepository.deleteById(id);
    }
}
