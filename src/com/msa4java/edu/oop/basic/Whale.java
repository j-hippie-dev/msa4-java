package com.msa4java.edu.oop.basic;

public class Whale {
    // 필드 = 프로퍼티 = 속성 = 클래스 내에 멤버 영역에 선언된 변수
    // 객체 내부에 정의된 속성 = 필드 // 객체 내부에 정의된 함수 = 메소드
    // Class는 Field와 Method로 구성되어 있다.
    public String name = "고래"; // Field = 인스턴스 변수(클래스 내부에 정의된 변수)
    public static int age = 20; // class 변수

    // Method
    public void swimming() {
        System.out.println("고래가 헤엄칩니다.");
    }

    // 전달받은 값을 저장하는 공간 = 파라미터
    public static void breath(String str) {
        System.out.println(str + "고래가 폐호흡합니다.");
    }
}
