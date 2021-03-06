package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private String skills;

    public Builder(String firstName, String secondName, String education, int experience, String skills) {
        super(firstName, secondName, education, experience);
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }

    public String communication(Building building) {
        return building.getCommunication();
    }
}
