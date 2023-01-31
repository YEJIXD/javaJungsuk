package java.lambda;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ListToLambda {
    // 기존의 인터페이스 메서드 구현
    /*List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");

    Collections.sort(list, new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s2.compareTo(s1);
        }
    });*/

    // 람다식을 통한 인터페이스 메서드 구현
    /*List<String> list2 = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
    Collections.sort(list, (s1, s2) -> s2.compareTo(s1));*/
}
