package java.lambda;

public interface MyFunction {               // max()라는 메서드가 정의된 MyFunction 인터페이스가 정의되어 있다고 가정하자.
    abstract int max(int a, int b);

    MyFunction f = new MyFunction() {       // 이 인터페이스를 구현한 익명 클래스의 객체를 생성하자
        public int max(int a, int b) {
            return a > b ? a: b;
        }
    };
    /* MyFunction 인터페이스에 정의된 메서드 max()는 람다식 '(int a, int b) -> a > b ? a : b'과 메서드의 선언부가 일치한다.
    *  그래서 위 코드의 익명객체를 람다식으로 아래와 같이 대체할 수 있다.
    *  */
    MyFunction f2 = (int a, int b) -> a > b ? a : b;     // 익명 객체를 람다식으로 대체
    int big = f2.max(5, 3);                        // 익명 객체의 메서드를 호출

    /* 이처럼 MyFunction 인터페이스를 구현한 익명 객체를 람다식으로 대체가 가능한 이유
    *  > 람다식도 실제로는 익명 객체이고, MyFunction 인터페이스를 구현한 익명 객체의 메서드 max()와 람다식의 매개변수의 타입과 개수 그리고 반환값이 일치하기 때문
    *
    * 람다식을 다루기 위한 인터페이스를 '함수형 인터페이스(functional interface)'라고 부르기로 했다.
    * */
}

