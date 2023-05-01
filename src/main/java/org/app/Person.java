package org.app;
import java.time.LocalDate;

//проект проекта под названием "EducationSystem".
//
//Далее, создадим класс Лицо для хранения информации о пользователе,
// включая имя и имя рождения.
// Мы будем использовать класс LocalDate из пакета java.time для работы с

public class Person {
    private final String name;
    private final LocalDate dateOfBirth;

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {

        return name;
    }

    public LocalDate getDateOfBirth() {

        return dateOfBirth;
    }

    public int getAge() {

        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }
}

