import java.util.Scanner;  // Scanner 클래스 추가

// 상수
class Variable2_1 {
    public static void main(String[] args) {
        int score = 100; // 변수 선언
        System.out.println("score = " + score);

        score = 90; // 변수 재선언
        System.out.println("score = " + score);

        final int FINAL_SCORE = 100; // 상수 선언
        System.out.println("FINAL_SCORE = " + FINAL_SCORE);
    }
}

// 리터럴
class Variable2_2 {
    public static void main(String[] args) {
        int score = 100; // score ; 변수
        final int FINAL_SCORE = 1000; // FINAL_SCORE ; 상수
        // 100, 1000 ; 리터럴
    }
}

// 리터럴 접두사 접미사
class Variable2_3 {
    public static void main(String[] args) {
        // boolean flag1 = 22; // Error 발생 (형 일치 필요)
        boolean flag2 = false; // true, false 만 가능!

        // char grade1 = 'AA'; // Error 발생
        // char grade2 = "A"; // Error 발생
        char grade3 = 'A'; // char 타입은 이렇게 하나의 문자만 가능!
        char ch = '\n'; // 개행문자(\n, \t 등) 가능!

        // String name1 = 'C'; // Error 발생
        // String name2 = 'Choi'; // Error 발생
        String str = "C"; // 한 문자 가능! 문자가 하나여도 문자열로 인식!
        String name3 = "choi"; // 여러 문자 가능!

        // byte val1 = 128; // Error 발생
        byte val2 = 127; // int 와 같은 리터럴로 저장하지만 범위가 지정되어 있음! -128 ~ 127

        short sval = 128;

        // 리터럴 접두사 예제
        // int의 진수 표현
        int ob = 0b0101; // 2진수, 접두사 0b
        int i = 100; // 10진수
        int oct = 0100; // 8진수, 접두사 0
        int hex = 0x100; // 16진수, 접두사 0x

        long price = 2_147_483_648L; // _ 를 사용하여 숫자 표현 가능!
        // long l1 = 2_147_483_648; // Error 발생, int 범위를 넘었으니 L 접미사 필수!
        long l2 = 100; // int의 범위를 넘지 않으면 L 생략 가능!

        // float tax1 = 3.14;
        float tax2 = 3.14f;

        double score1 = 3.14159265358979; // d 생략 가능!
        double score2 = 3.14159265358979d;

        float f1 = 10f; // 10.0f
        double d1 = 10.; // 10.0
        double d2 = .10; // 0.10
        double d3 = 1e3; // 1000.0 , e3 = 10의 3제곱
        double d4 = -1e3; // -1000.0
    }
}

// 입출력
// (1) printf()를 이용한 출력
class Variable2_4 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        float f1 = .10f;
        float f2 = 1e1f; // e=10 -> f2 = 10.0
        float f3 = 3.14e3f; // f3 = 3140
        double d = 1.23456789;

        System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1); // %e=지수표현, %g=간략표현
        System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);

        System.out.printf("d = %f%n", d);
        System.out.printf("d = %14.10f%n", d); // 전체 14자리, 소수점아래 10자리 -> 공백 0으로 채움

        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url); // 20글자 출력공간, 우측정렬_좌측공백
        System.out.printf("[%-20s]%n", url); // 좌측정렬_우측공백
        System.out.printf("[%.8s]%n", url); // 왼족부터 8글자 출력
    }
}

// (2) 입력받기
class Variable2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 객체 생성

        System.out.print("두 자리 정수를 입력하세요 : ");
        String input = scanner.nextLine(); // nextLine() 대신 nextInt() 가능
        int num = Integer.parseInt(input); // 입력받은 문자열 -> 숫자형으로 변환

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d%n", num);
    }
}