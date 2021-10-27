package com.dp.builder.Builder;
/*
    https://medium.com/@mohithmarisetti_58912/the-mighty-builder-pattern-in-object-oriented-programming-cbd480675487
*/
public class NonBuilderDemo {

    public static void main(String[] args) {
        Person person = new Person("Tom", "Holland", "Stark Industries", 80000, 25);
        System.out.println("Person details: " + person);
    }

}
