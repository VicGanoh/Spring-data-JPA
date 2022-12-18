package com.vicgan.spring.data.jpa.respository;

import com.vicgan.spring.data.jpa.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
