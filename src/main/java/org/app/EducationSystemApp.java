package org.app;

public class EducationSystemApp {
    public static void main(String[] args) {
        EducationalOrganization organizations = new EducationalOrganization();
        organizations.addOrganization("School", new AgeRestriction(6, 18));
        organizations.addOrganization("University", new AgeRestriction(18,65));
    }}