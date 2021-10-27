package com.dp.builder.Builder;

public class Demo {

    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("Tom")
                .lastName("Holland")
                .age(25)
                .employer("Stark Industries")
                .salary(80000)
                .build();

        System.out.println("Person details: " + person);
    }

}
