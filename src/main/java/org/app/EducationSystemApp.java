package org.app;

import java.time.LocalDate;
import java.util.Scanner;

public class EducationSystemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст - год,месяц,дата рождения (цифрами)");

        String year = scanner.nextLine();
        String month = scanner.nextLine();
        String day = scanner.nextLine();

        String dateOfBirth = String.format("%s-%s-%s", year, month, day);

        LocalDate date = LocalDate.parse(dateOfBirth );
        System.out.println(date);

        Person person = new Person("Anna",date);
        EducationalOrganization organizations = new EducationalOrganization();

        organizations.addOrganization("School", new AgeRestriction(6, 18));
        organizations.addOrganization("University", new AgeRestriction(18,65));

        boolean isAgeEligible = organizations.isAgeEligible(person,"School");


        boolean isAgeEligibles = organizations.isAgeEligible(person,"University");


        System.out.println(isAgeEligible );

        System.out.println(isAgeEligibles);


    }

}