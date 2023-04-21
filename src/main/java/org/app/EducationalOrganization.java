package org.app;

import java.util.HashMap;

public class EducationalOrganization {
// класс EducationalOrganization для хранения информации об
// образовательных организациях и их возрастных ограничениях.
// Мы будем использовать HashMap для хранения организаций и их ограничений.
// Также мы будем использовать метод isAgeEligible для проверки,
// является ли пользователь достаточно старым для посещения организации.




    private HashMap<String, AgeRestriction> organizations;

    public EducationalOrganization() {
        organizations = new HashMap<>();
    }

    public EducationalOrganization(String example_school, int i, int i1) {

    }

    public void addOrganization(String name, AgeRestriction restriction) {
        organizations.put(name, restriction);
    }

    public boolean isAgeEligible(Person person, String organization) {
        int age = person.getAge();
        AgeRestriction restriction = organizations.get(organization);
        if (restriction == null) {
            return false;
        }
        return age >= restriction.getMinAge() && age <= restriction.getMaxAge();
    }

    public boolean canVisit(int i) {
        return true;
    }
}

