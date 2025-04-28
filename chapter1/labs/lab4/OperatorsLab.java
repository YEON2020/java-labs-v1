package chapter1.labs.lab4;

/**
 * Lab 4: 자바 연산자 실습
 * 
 * 이 실습은 자바의 다양한 연산자를 이해하고 활용하는 것을 목표로 합니다.
 */
public class OperatorsLab {
    public static void main(String[] args) {
        // TODO: 1. 산술 연산자 사용하기
        // 두 개의 정수형 변수를 선언하고 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산을 수행하세요.
        int a = 30;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        
        // TODO: 2. 증감 연산자 사용하기
        // 변수를 선언하고 전위 증가, 후위 증가, 전위 감소, 후위 감소 연산을 수행하세요.
        // 각 단계별로 변수의 값을 출력하여 변화를 확인하세요.
        int c = 55;
        System.out.println("c++= " + (c++));
        System.out.println("c++= " + (++c));
        System.out.println("c--= " + (c--));
        System.out.println("--c= " + (--c));

        // TODO: 3. 비교 연산자 사용하기
        // 두 변수를 비교하여 결과를 출력하세요 (==, !=, >, <, >=, <=).
        int d = 44;
        int e = 78;
        System.out.println("d == e: " + (d == e));
        System.out.println("d != e: " + (d != e));
        System.out.println("d > e: " + (d > e));
        System.out.println("d < e: " + (d < e));
        System.out.println("d >= e: " + (d >= e));
        System.out.println("d <= e: " + (d <= e));
        
        // TODO: 4. 논리 연산자 사용하기
        // boolean 변수를 사용하여 AND(&&), OR(||), NOT(!) 연산을 수행하세요.
        boolean f = true;
        boolean g = false;
        System.out.println("f&&g: " + (f&&g));
        System.out.println("f||g: " + (f||g));
        System.out.println("!f: " + (!f));
        
        // TODO: 5. 대입 연산자 사용하기
        // 변수를 선언하고 복합 대입 연산자(+=, -=, *=, /=, %=)를 사용하여 값을 변경하세요.
        int h = 30;
        h += 10;
        h -= 3;
        h *= 4;
        h /= 2;
        h %= 5;
        System.out.println("h: " + h);
        
        // TODO: 6. 삼항 연산자 사용하기
        // 조건에 따라 다른 값을 할당하는 예제를 작성하세요.
        int a1 = 50, b1 = 100;
        int c1 = 0;

        if(a1 > b1){
            c1 = a1 - b1;
        }else{
            c1 = b1 - a1;
        }System.out.println(c1);

        int d1 = (a1 > b1) ? a1 - b1 : b1 - a1;
        System.out.println(d1);
        
    }
} 