package ru.netology.gradle.dz1;

import ru.netology.gradle.dz1.MyEntity;
import ru.netology.gradle.dz1.MyService;

public class Main {

    public static void main(String[] args) {
        MyService myService = new MyService();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("second")));
        System.out.println(myService.getMyEntity());
    }
}