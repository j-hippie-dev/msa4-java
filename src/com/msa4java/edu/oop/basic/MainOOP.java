package com.msa4java.edu.oop.basic;
// 같은 위치에 있기 때문에 import가 생략됨.

public class MainOOP {
    public static void main(String[] args) {
        // 클래스를 사용할 준비가 된 상태 : 인스턴스
        // Whale 클래스를 인스턴스 생성
        // 메모리에 인스턴스화 -> 사용하려면 변수에 담아야 함.
        // 변수에 담을 때 데이터 타입은 따로 X 클래스 자체로 데이터 타입이 됨.
        Whale whale = new Whale();
        System.out.println(whale.name);
        whale.swimming();

        // 인스턴스 생성하지 않아도 접근 가능한 필드, 메소드 -> static
        // -> 시스템 시작할 때 미리 메모리에 등록. 종료될 때 사라짐.
        // static 멤버들에게 접근
        System.out.println(Whale.age);
        // 함수에 전달하는 값 = 아규먼트
        Whale.breath("테스트");

        // 접근 제어 지시자 확인용
        AccessModifier accessModifier = new AccessModifier();

        // 오버로딩 테스트
        Overloading overloading = new Overloading();
        overloading.print(1, 2);

        // 생성자
        ConJava conJava = new ConJava(20);
        ConJava conJava1 = new ConJava(30);

        System.out.println(conJava.age);
        System.out.println(conJava1.age);

        Marine marine = new Marine(40, 6, 0);
        System.out.println(marine.getHp());
        marine.setHp(1000);
        System.out.println(marine.getHp());

        Marine marine2 = new Marine();
        System.out.println(marine2.getHp());

    }
}
