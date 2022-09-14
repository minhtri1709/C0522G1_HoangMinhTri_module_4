package com.excersice.repository.impl;

import com.excersice.model.Person;
import com.excersice.repository.IPersonRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository implements IPersonRepository {

    private static List<Person> personList = new ArrayList<>();

    static {
        personList.add(new Person(1, "Hoàng Minh Trí", "1998", "Nam", "Việt Nam", "123456789", "Ô tô", "43A-12345", 4, "10", "10", "2020", "12", "10", "2020", "Đà Nẵng"));
        personList.add(new Person(2, "Hoàng Minh Trí", "1998", "Nam", "Việt Nam", "123456789", "Ô tô", "43A-12345", 4, "10", "10", "2020", "12", "10", "2020", "Đà Nẵng"));
        personList.add(new Person(3, "Hoàng Minh Trí", "1998", "Nam", "Việt Nam", "123456789", "Ô tô", "43A-12345", 4, "10", "10", "2020", "12", "10", "2020", "Đà Nẵng"));
    }

    @Override
    public List<Person> findAll() {
        return personList;
    }

    @Override
    public List<String> genderList() {
        List<String> genderList = new ArrayList<>();

        genderList.add("Nam");
        genderList.add("Nữ");

        return genderList;
    }

    @Override
    public List<String> getDayList() {
        List<String> dayOfBeginList = new ArrayList<>();
        dayOfBeginList.add("1");
        dayOfBeginList.add("2");
        dayOfBeginList.add("3");
        dayOfBeginList.add("4");
        dayOfBeginList.add("5");
        dayOfBeginList.add("6");
        dayOfBeginList.add("7");
        dayOfBeginList.add("8");
        dayOfBeginList.add("9");
        dayOfBeginList.add("10");
        dayOfBeginList.add("11");
        dayOfBeginList.add("12");
        dayOfBeginList.add("13");
        dayOfBeginList.add("14");
        dayOfBeginList.add("15");
        dayOfBeginList.add("16");
        dayOfBeginList.add("17");
        dayOfBeginList.add("18");
        dayOfBeginList.add("19");
        dayOfBeginList.add("20");
        dayOfBeginList.add("21");
        dayOfBeginList.add("22");
        dayOfBeginList.add("23");
        dayOfBeginList.add("24");
        dayOfBeginList.add("25");
        dayOfBeginList.add("26");
        dayOfBeginList.add("27");
        dayOfBeginList.add("28");
        dayOfBeginList.add("29");
        dayOfBeginList.add("30");
        dayOfBeginList.add("31");
        return dayOfBeginList;
    }

    @Override
    public List<String> getMonthList() {
        List<String> monthOfBeginList = new ArrayList<>();
        monthOfBeginList.add("1");
        monthOfBeginList.add("2");
        monthOfBeginList.add("3");
        monthOfBeginList.add("4");
        monthOfBeginList.add("5");
        monthOfBeginList.add("6");
        monthOfBeginList.add("7");
        monthOfBeginList.add("8");
        monthOfBeginList.add("9");
        monthOfBeginList.add("10");
        monthOfBeginList.add("11");
        monthOfBeginList.add("12");
        return monthOfBeginList;
    }


    @Override
    public List<String> getYearList() {
        List<String> yearOfBirthList = new ArrayList<>();
        yearOfBirthList.add("1990");
        yearOfBirthList.add("1991");
        yearOfBirthList.add("1992");
        yearOfBirthList.add("1993");
        yearOfBirthList.add("1994");
        yearOfBirthList.add("1995");
        yearOfBirthList.add("1996");
        yearOfBirthList.add("1997");
        yearOfBirthList.add("1998");
        yearOfBirthList.add("1999");
        return yearOfBirthList;
    }

    @Override
    public List<String> nationalityList() {
        List<String> nationalityList = new ArrayList<>();
        nationalityList.add("Việt Nam");
        nationalityList.add("Trung Quốc");
        nationalityList.add("Lào");
        nationalityList.add("Quốc gia khác");
        return nationalityList;
    }

    @Override
    public List<String> vehicleList() {
        List<String> vehicleList = new ArrayList<>();
        vehicleList.add("Xe máy");
        vehicleList.add("Ô tô");
        vehicleList.add("Tàu lửa");
        vehicleList.add("Máy bay");

        return vehicleList;
    }

    @Override
    public Person findById(int id) {
        Person person = null;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.indexOf(i) != -1) {
                person = new Person(personList.get(i).getIdNumber(), personList.get(i).getName(),
                        personList.get(i).getYearOfBirth(), personList.get(i).getGender(), personList.get(i).getNationality()
                        , personList.get(i).getId(), personList.get(i).getVehicle(), personList.get(i).getVehicleNumber(),
                        personList.get(i).getSeatOfVehicle(), personList.get(i).getDayOfBegin(),
                        personList.get(i).getMonthOfBegin(), personList.get(i).getYearOfBegin(),
                        personList.get(i).getDayOfEnd(), personList.get(i).getMonthOfEnd(), personList.get(i).getYearOfEnd()
                        , personList.get(i).getCity());
            }
        }
        return person;
    }

    @Override
    public void update(int id, Person person) {
        for (Person temp : personList) {
            if (person.getIdNumber() == id) {
                temp.setName(person.getName());
                temp.setYearOfBirth(person.getYearOfBirth());
                temp.setGender(person.getGender());
                temp.setNationality(person.getNationality());
                temp.setId(person.getId());
                temp.setVehicle(person.getVehicle());
                temp.setVehicleNumber(person.getVehicleNumber());
                temp.setSeatOfVehicle(person.getSeatOfVehicle());
                temp.setDayOfBegin(person.getDayOfBegin());
                temp.setMonthOfBegin(person.getMonthOfBegin());
                temp.setYearOfBegin(person.getYearOfBegin());
                temp.setDayOfEnd(person.getDayOfEnd());
                temp.setMonthOfEnd(person.getMonthOfEnd());
                temp.setYearOfEnd(person.getYearOfEnd());
                temp.setCity(person.getCity());
            }
        }
    }
}
