package ru.job4j.tracker;

public class Engineer extends Profession{
    private Client client;
    private String experience;
    private String skills;

    public Client getClient() {
        return client;
    }

    public String getSkills() {
        return skills;
    }

    public String getExperience() {
        return experience;
    }
}
