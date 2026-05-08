package com.msa4java.edu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EduArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList</* Integer 생략가능 */>(10);

        list.add(1); // index 0번에 들어감. 순차적으로.
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println(list.get(3));

        // 정렬
        Collections.sort(list);
        System.out.println(list.get(3));
        System.out.println(list.size());

        // 향상된 for문
        for(int i : list) {
            System.out.println(i);
        }

        // 람다식
        list.forEach((i) -> {
            System.out.println(i);
        });
    }
}
