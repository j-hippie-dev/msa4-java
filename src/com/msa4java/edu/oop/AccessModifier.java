package com.msa4java.edu.oop;

public class AccessModifier {
    // 접근 제어 지시자 : 외부에서의 접근을 통제하기 위해 필드 or 메소드 앞에 작성
    public int numPublic = 1; // 내/외부 어디에서나 접근 가능
    protected int numProtected = 2; // 같은 패키지 & class 내부 & 자식 클래스에서 접근 가능
    private int numPrivate = 3; // 클래스 내부에서만 접근 가능 // 아무도 접근 X // 나만 접근 O
    int numDefault = 4; // 같은 패키지에 소속된 클래스에서 접근 가능
}
