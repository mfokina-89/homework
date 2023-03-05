package com.fokinamn.oop.collections.hw2;

public class Users {
    private final int id;
    private final String userName;
    private final int yearsOld;

    public Users(int id, String userName, int yearsOld) {
        this.id = id;
        this.userName = userName;
        this.yearsOld = yearsOld;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", yearsOld=" + yearsOld +
                '}';
    }
}
