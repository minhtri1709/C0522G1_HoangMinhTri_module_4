package com.excersice.model;

import java.util.Objects;

public class Person {

    private int idNumber;

    private String name;

    private String yearOfBirth;

    private String gender;

    private String nationality;

    private String id;

    private String vehicle;

    private String vehicleNumber;

    private int seatOfVehicle;

    private String dayOfBegin;

    private String monthOfBegin;

    private String yearOfBegin;

    private String dayOfEnd;

    private String monthOfEnd;

    private String yearOfEnd;

    private String city;

    public Person() {
    }

    public Person(int idNumber, String name, String yearOfBirth, String gender, String nationality, String id, String vehicle, String vehicleNumber, int seatOfVehicle, String dayOfBegin, String monthOfBegin, String yearOfBegin, String dayOfEnd, String monthOfEnd, String yearOfEnd, String city) {
        this.idNumber = idNumber;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.id = id;
        this.vehicle = vehicle;
        this.vehicleNumber = vehicleNumber;
        this.seatOfVehicle = seatOfVehicle;
        this.dayOfBegin = dayOfBegin;
        this.monthOfBegin = monthOfBegin;
        this.yearOfBegin = yearOfBegin;
        this.dayOfEnd = dayOfEnd;
        this.monthOfEnd = monthOfEnd;
        this.yearOfEnd = yearOfEnd;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getSeatOfVehicle() {
        return seatOfVehicle;
    }

    public void setSeatOfVehicle(int seatOfVehicle) {
        this.seatOfVehicle = seatOfVehicle;
    }

    public String getDayOfBegin() {
        return dayOfBegin;
    }

    public void setDayOfBegin(String dayOfBegin) {
        this.dayOfBegin = dayOfBegin;
    }

    public String getMonthOfBegin() {
        return monthOfBegin;
    }

    public void setMonthOfBegin(String monthOfBegin) {
        this.monthOfBegin = monthOfBegin;
    }

    public String getYearOfBegin() {
        return yearOfBegin;
    }

    public void setYearOfBegin(String yearOfBegin) {
        this.yearOfBegin = yearOfBegin;
    }

    public String getDayOfEnd() {
        return dayOfEnd;
    }

    public void setDayOfEnd(String dayOfEnd) {
        this.dayOfEnd = dayOfEnd;
    }

    public String getMonthOfEnd() {
        return monthOfEnd;
    }

    public void setMonthOfEnd(String monthOfEnd) {
        this.monthOfEnd = monthOfEnd;
    }

    public String getYearOfEnd() {
        return yearOfEnd;
    }

    public void setYearOfEnd(String yearOfEnd) {
        this.yearOfEnd = yearOfEnd;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return idNumber == person.idNumber && seatOfVehicle == person.seatOfVehicle && Objects.equals(name, person.name) && Objects.equals(yearOfBirth, person.yearOfBirth) && Objects.equals(gender, person.gender) && Objects.equals(nationality, person.nationality) && Objects.equals(id, person.id) && Objects.equals(vehicle, person.vehicle) && Objects.equals(vehicleNumber, person.vehicleNumber) && Objects.equals(dayOfBegin, person.dayOfBegin) && Objects.equals(monthOfBegin, person.monthOfBegin) && Objects.equals(yearOfBegin, person.yearOfBegin) && Objects.equals(dayOfEnd, person.dayOfEnd) && Objects.equals(monthOfEnd, person.monthOfEnd) && Objects.equals(yearOfEnd, person.yearOfEnd) && Objects.equals(city, person.city);
    }

}
