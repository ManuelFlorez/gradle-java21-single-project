package org.manuel.entities;

public class Project {

    private final ProjectType type;
    private final String repo;

    public Project(ProjectType type, String repo) {
        this.type = type;
        this.repo = repo;
    }

    public Project(String projectType, String repo) {
        this.type = ProjectType.valueOf(projectType);
        this.repo = repo;
    }

    public ProjectType getProjectType() {
        return type;
    }

    public String getRepo() {
        return repo;
    }

    @Override
    public String toString() {
        return "Project{" +
                "type=" + type +
                ", repo='" + repo + '\'' +
                '}';
    }
}