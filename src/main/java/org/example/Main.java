package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Healthplan h1 = new Healthplan(1, "GAYE ", Plan.BASIC);
        Healthplan h2 = new Healthplan(2, "BUSE ", Plan.OPSIYONEL);

        System.out.println(h1);
        System.out.println(h2);
    }
    }
