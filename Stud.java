package com.example.kif.kyrsu_2;

/**
 * Created by Kif on 19.12.2016.
 */

public class Stud {
    /**
     * Created by Kif on 19.12.2016.
     */


        public String FirstName;
        public String LastName;
        public int Age;

        public Stud() {
        }

        public Stud(String firstName, String lastName, int age) {
            FirstName = firstName;
            LastName = lastName;
            Age = age;
        }

    @Override
    public String toString() {
        return String.format("%s %s, age: %s", FirstName, LastName, String.valueOf(Age));
    }
}
