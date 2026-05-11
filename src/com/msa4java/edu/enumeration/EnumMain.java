package com.msa4java.edu.enumeration;

public class EnumMain {
    public static void main(String[] args) {
        Week day = Week.MONDAY;
        System.out.println(day); // println 자체적으로 toString() 자동 실행
        System.out.println(day.name()); // name 자동으로 부여
        System.out.println(day.getKrDay());
    }
}
