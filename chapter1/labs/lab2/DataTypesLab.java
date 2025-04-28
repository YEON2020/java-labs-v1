package chapter1.labs.lab2;

/**
 * Lab 2: 자바 데이터 타입 실습
 * 
 * 이 실습은 자바의 기본 데이터 타입을 이해하고 사용하는 것을 목표로 합니다.
 */
public class DataTypesLab {
    public static void main(String[] args) {
        // TODO: 다음 기본 데이터 타입의 변수를 선언하고 값을 할당하세요.
        // 1. 정수형(byte, short, int, long) 변수 선언 및 할당
        byte b = 127;
        short s = 27;
        int i = 124;
        long l = 124L;
        System.out.println("b: " + b);
        System.out.println("s: " + s);
        System.out.println("i: " + i);
        System.out.println("l: " + l);
        
        // TODO: 2. 실수형(float, double) 변수 선언 및 할당
        float f = 123.456f;
        double d = 123.456d;
        System.out.println("f: " + f);
        System.out.println("d: " + d);

        // TODO: 3. 문자형(char) 변수 선언 및 할당
        char c = 'A';
        System.out.println("c: " + c);
        
        // TODO: 4. 논리형(boolean) 변수 선언 및 할당
        boolean bool = true;
        System.out.println("bool: " + bool);
        
        // TODO: 5. 모든 변수 값을 출력하세요.
        /*
        System.out.println("b: " + b);
        System.out.println("s: " + s);
        System.out.println("i: " + i);
        System.out.println("l: " + l);
        System.out.println("f: " + f);
        System.out.println("d: " + d);
        System.out.println("c: " + c);
        System.out.println("bool: " + bool);
         */

        // TODO: 6. 자신의 키(cm)와 몸무게(kg)를 저장하는 변수를 선언하고 
        // BMI 지수를 계산하여 출력하세요. (BMI = 몸무게(kg) / (키(m) * 키(m)))
        double weight = 70; //몸무게(kg)
        double heightCm = 166;
        System.out.println("height: " + heightCm);

        double heightM = heightCm / 100;

        //BMI 지수계산
        double BMI = weight / (heightM * heightM);

        System.out.println("weight: " + weight + " kg");
        System.out.println("weight: " + heightM + " m");
        System.out.println("BMI: " + (int) BMI);
    }
} 