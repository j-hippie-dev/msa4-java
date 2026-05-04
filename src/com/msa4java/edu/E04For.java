package com.msa4java.edu;

public class E04For {
    public static void main(String[] args) {
        int dan = 2;

        for(int i = dan; i <= 9; i++) {
            String strDan = String.format("** %d단 **", i);
            System.out.println(strDan);
//            System.out.printf("** %d단 **\n", i);
            for(int j = 1; j <= 9; j++) {
                String strMulti = String.format("%d X %d = %d", i, j, i * j);
                System.out.println(strMulti);
//                System.out.printf("%d X %d = %d \n", i, j, i * j);
            }
        }
    }
}
