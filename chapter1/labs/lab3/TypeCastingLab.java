package chapter1.labs.lab3;

/**
 * Lab 3: 자바 타입 변환(Type Casting) 실습
 * 
 * 이 실습은 자바의 타입 변환에 대해 이해하고 실습하는 것을 목표로 합니다.
 */
public class TypeCastingLab {
    public static void main(String[] args) {
        // TODO: 1. 자동 형변환(Implicit Casting) 예제
        // byte -> int, int -> long, long -> float, float -> double 순으로 
        // 변수를 선언하고 자동 형변환을 수행한 뒤 결과 출력하기
        byte b = 127;
        int i = b;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("Implicit Casting: ");
        System.out.println("byte -> int: " + i);
        System.out.println("int -> long: " + l);
        System.out.println("long -> float: " + f);
        System.out.println("float -> double: " + d);
        
        // TODO: 2. 명시적 형변환(Explicit Casting) 예제
        // double -> float -> long -> int -> char -> short -> byte 순으로
        // 변수를 선언하고 명시적 형변환을 수행한 뒤 결과 출력하기
        double d1 = 3.14;
        float f2 = (float) d1;
        long l1 = (long) f2;
        int i1 = (int) l1;
        char c1 = (char) i1;
        short s1 = (short) c1;
        byte b1 = (byte) s1;

        System.out.println("\nExplicit Casting: ");
        System.out.println("double -> float: " + f2);
        System.out.println("float -> long: " + l1);
        System.out.println("long -> int: " + i1);
        System.out.println("int -> char: " + c1);
        System.out.println("char -> short: " + s1);
        System.out.println("short -> byte: " + b1);
        
        // TODO: 3. 데이터 손실 확인하기
        // int 값을 byte로 변환하여 데이터 손실이 발생하는 예제 작성하기
        int bigNumber = 256;
        byte smallNumber = (byte) bigNumber;
        System.out.println("\nData Loss Example: ");
        System.out.println("Original int: " + bigNumber);
        System.out.println("Converted byte to int: " + smallNumber);
        
        // TODO: 4. 문자열과 숫자 간 변환하기
        // 문자열 "123"을 정수로, "3.14"를 실수로 변환하기
        String strInt = "123";
        int parsedInt = Integer.parseInt(strInt);

        String strFloat = "3.14";
        double parsedDouble = Double.parseDouble(strFloat);

        System.out.println("\nString to Number Conversion:");
        System.out.println("String \"123\" -> int: " + parsedInt);
        System.out.println("String \"3.14\" -> double: " + parsedDouble);


        // TODO: 5. 숫자를 문자열로 변환하기
        // 정수 456과 실수 7.89를 문자열로 변환하기
        int numInt = 456;
        double numDouble = 7.89;

        String strFromInt = String.valueOf(numInt);
        String strFromDouble = String.valueOf(numDouble);

        System.out.println("\nNumber to String Conversion:");
        System.out.println("int 456 -> String: " + strFromInt);
        System.out.println("double 7.89 -> String: " + strFromDouble);


    }
} 