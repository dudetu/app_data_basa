package org.app;

import java.util.HashMap;
import java.util.Map;

import static java.lang.reflect.Array.get;

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


        AgeRestriction restriction = get(organization);
        if (restriction == null) {
            return false;
        }
        return age >= restriction.getMinAge() && age <= restriction.getMaxAge();
    }

    private AgeRestriction get(String organization) {
        //логка поиска ораганизации по ее имени из map

        return organizations.get(organization);
    }

    public boolean canVisit(int i, int i1, int age) {
        if (age < i1 && age > i) {
            return true;
        } else return false;

    }

}
