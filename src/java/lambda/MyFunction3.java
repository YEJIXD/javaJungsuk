package java.lambda;

// 함수형 인터페이스 타입의 매개변수와 반환타입

@FunctionalInterface
public interface MyFunction3 {
    void myMethod();            // 추상 메서드
}

/* 위와 같이 함수형 인터페이스가 정의되어 있을 때, 메서드의 매개변수가 MyFunction타입이면, 
 이 메서드를 호출할 때 람다식을 참조하는 참조변수를 매개변수로 지정해야한다는 뜻이다.
 */

class A {
    void aMethod(MyFunction3 f3) {     // 매개변수의 타입이 함수형 인터페이스
        f3.myMethod();                 // MyFunction3에 정의된 메서드 호출
    }

    /* *** */
   /* MyFunction3 f3 = () -> System.out.println("myMethod()");
    aMethod(f3);

    또는 참조변수 없이 아래와 같이 직접 [람다식을 매개변수로 지정]하는 것도 가능하다.
    aMethod(() -> System.out.println("myMethod()"));

    그리고 메서드의 반환타입이 함수형 인터페이스타입이라면, 이 함수형 인터페이스의 추상메서드와 동등한 람다식을
    가리키는 참조변수를 반환하거나 람다식을 직접 반환할 수 있다.

    MyFunction myMethod(){
        MyFunction f = f -> {};
        return f;                   // 이 줄과 윗 줄을 한 줄로 줄이면, return () -> {};
    }

    람다식을 참조변수로 다룰 수 있다는 것은 메서드를 통해 람다식을 주고받을 수 있다는 것을 의미한다.
    즉, 변수처럼 메서드를 주고받는 것이 가능해진 것이다.
    */

}

