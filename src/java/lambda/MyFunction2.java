package java.lambda;

@FunctionalInterface                    // 컴파일러가 함수형 인터페이스를 올바르게 정의했는지 확인해주므로, 꼭 붙이도록 하자
public interface MyFunction2 {          // 함수형 인터페이스 MyFunction2를 정의
    abstract int max(int a, int b);
}

/*
* 단, 함수형 인터페이스에는 오직 하나의 추상 메서드만 정의되어 있어야 한다는 제약이 있다.
* 그래야 람다식과 인터페이스의 메서드가 1:1로 연결될 수 있기 때문이다.
* 반면에 static 메서드와 default 메서드의 개수에는 제약이 없다.
* */
