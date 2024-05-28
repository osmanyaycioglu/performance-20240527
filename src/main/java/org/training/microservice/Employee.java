package org.training.microservice;


public class Employee {
    private String name;
    private String surname;
    private int age;
    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(final String nameParam) {
        name = nameParam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surnameParam) {
        surname = surnameParam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int ageParam) {
        age = ageParam;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(final Integer weightParam) {
        weight = weightParam;
    }
}
