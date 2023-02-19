package com.fokinamn.oop.home;

/**
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте
 * (должны присутствовать все поля объекта!).
 * <p>
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * <p>
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
 * и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */
public class HomeRunner {
    public static void main(String[] args) {
        printAllInformation(getHome());
    }

    public static Home getHome() {
        Room[] rooms1 = {new Room(true), new Room(true), new Room(false)};
        Room[] rooms2 = {new Room(false), new Room(false)};
        Room[] rooms3 = {new Room(true), new Room(false)};
        Apartment[] apartments1 = {new Apartment(3, rooms1), new Apartment(5, rooms2)};
        Apartment[] apartments2 = {new Apartment(2, rooms2), new Apartment(9, rooms3)};
        Floor[] floors = {new Floor(9, apartments1), new Floor(7, apartments2)};
        return new Home(12, floors);
    }

    public static void printAllInformation(Home home) {
        home.print();
        for (Floor floor : home.getFloors()) {
            floor.print();
            for (Apartment apartment : floor.getApartments()) {
                apartment.print();
                for (Room room : apartment.getRooms()) {
                    room.print();
                }
            }
        }
    }
}

