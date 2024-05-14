package org.manuel.entities;

import java.util.List;

public class Application {

    private final String name;
    private final List<Project> projects;

    public Application(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public List<Project> getProjects() {
        return projects;
    }
}
