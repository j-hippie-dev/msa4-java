package com.msa4java.edu.oop.inheritance;

// final -> 접근제어지시자 앞 or 뒤에 작성
// 클래스에 들어가면 상속 불가
// 메소드에 들어가면 오버라이드 불가
public class Mammal {
    protected String name;
    protected String residence;

    public Mammal(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    public void breath() {
        System.out.println(this.name + "이/가 폐호흡합니다.");
    }
}
