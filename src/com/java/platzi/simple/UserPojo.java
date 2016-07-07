package com.java.platzi.simple;

public class UserPojo {
    private int country;
    private int city;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String borndate;

    public UserPojo(String name, String surname, String email, String password, int city, int country, String borndate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.borndate = borndate;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getBorndate() {
        return borndate;
    }

    public String getPassword() {
        return password;
    }

    public int getCity() {
        return city;
    }

    public int getCountry() {
        return country;
    }
}
