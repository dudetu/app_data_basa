package org.app;

public class AgeRestriction {
    // для каждой организации mы будем использовать два поля: minAge и maxAge.
    private int minAge;
    private int maxAge;

    public AgeRestriction(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }
}

