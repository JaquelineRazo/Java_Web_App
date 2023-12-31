package com.javamaster.model;

import java.util.Objects;

public class UsersModel {
    private Integer id;
    private String name;
    private int age;
    private String sex;
    private String height;
    private String email;
    private String password;

    public UsersModel() {

    }

    public UsersModel(String name, int age, String sex, String height, String email, String password) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 15) {
            throw new IllegalArgumentException("Age must be 15 or older.");
        }
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        double heightInMeters = Double.parseDouble(height);
        if (heightInMeters < 1.0 || heightInMeters > 2.5) {
            throw new IllegalArgumentException("Height must be between 1m and 2.5m.");
        }
        this.height = height;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.age;
        hash = 41 * hash + Objects.hashCode(this.sex);
        hash = 41 * hash + Objects.hashCode(this.height);
        hash = 41 * hash + Objects.hashCode(this.email);
        hash = 41 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsersModel other = (UsersModel) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.sex, other.sex)) {
            return false;
        }
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "UsersModel{" + "id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", height=" + height + ", email=" + email + '}';
    }
}
