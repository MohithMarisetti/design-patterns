package com.dp.builder.Builder;
/*
    https://medium.com/@mohithmarisetti_58912/the-mighty-builder-pattern-in-object-oriented-programming-cbd480675487
*/
public class Person {

    private String firstName, lastName, employer;
    private Integer age, salary;

    public Person(String firstName, String lastName, String employer, Integer salary, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employer = employer;
        this.salary = salary;
        this.age = age;
    }

    // Builder
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", employer='" + employer + '\'' +
                ", salary=" + salary +
                '}';
    }

    /* Getters & Setters */
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    // Constructor
    public Person() {}


    /* Person Builder class */
    public static class PersonBuilder {
        private Person person = new Person();

        public PersonBuilder firstName(String firstName) {
            person.setFirstName(firstName);
            return this;
        }
        public PersonBuilder lastName(String lastName) {
            person.setLastName(lastName);
            return this;
        }
        public PersonBuilder employer(String employer) {
            person.setEmployer(employer);
            return this;
        }
        public PersonBuilder salary(Integer salary) {
            person.setSalary(salary);
            return this;
        }
        public PersonBuilder age(Integer age) {
            person.setAge(age);
            return this;
        }
        public Person build() {
            return person;
        }
    }
}

