package com.dp.builder.FacetedBuilder;
/*
    https://medium.com/@mohithmarisetti_58912/a-mysterious-yet-powerful-variation-of-a-well-known-design-pattern-9a33a7625681
*/
public class Person {

    // Name Information
    private String firstName, lastName;

    private Integer age;

    // Address Information
    private String streetAddress, state, zipCode;

    // Employment Information
    private String employer;
    private Integer salary;

    // Builder
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
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

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

}

class PersonBuilder {
    protected Person person = new Person();

    protected PersonBuilder aged(Integer age) {
        person.setAge(age);
        return this;
    }

    protected Person build() {
        return person;
    }

    PersonEmploymentBuilder employmentDetails() {
        return new PersonEmploymentBuilder(person);
    }

    PersonNameBuilder named() {
        return new PersonNameBuilder(person);
    }

    PersonAddressBuilder address() {
        return new PersonAddressBuilder(person);
    }

}

class PersonNameBuilder extends PersonBuilder {

    public PersonNameBuilder(Person person) {
        this.person = person;
    }

    protected PersonNameBuilder givenName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    protected PersonNameBuilder familyName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

}

class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    protected PersonAddressBuilder livesAt(String streetAddress) {
        person.setStreetAddress(streetAddress);
        return this;
    }

    protected PersonAddressBuilder inTheStateOf(String state) {
        person.setState(state);
        return this;
    }

    protected PersonAddressBuilder zipCode(String zipCode) {
        person.setZipCode(zipCode);
        return this;
    }

}

class PersonEmploymentBuilder extends PersonBuilder {

    public PersonEmploymentBuilder(Person person) {
        this.person = person;
    }

    protected PersonEmploymentBuilder employedBy(String employer) {
        person.setEmployer(employer);
        return this;
    }

    protected PersonEmploymentBuilder getsPaid(Integer salary) {
        person.setSalary(salary);
        return this;
    }

}
