package com.dp.builder.FacetedBuilder;

public class Demo {

    public static void main(String[] args) {
        Person person = Person.builder()
                .named()
                    .givenName("Peter")
                    .familyName("Parker")
                .aged(28)
                .address()
                    .livesAt("123 Main Street")
                    .inTheStateOf("New York")
                    .zipCode("10036")
                .employmentDetails()
                    .employedBy("Daily Bugle")
                    .getsPaid(65000)
                .build();

        System.out.println("Person details: " + person);
    }

}
