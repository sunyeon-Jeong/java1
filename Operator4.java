// 사칙연산자
class Operator4_1 {
    public static void main(String[] args) {
        int a = 10, b = 4;

        // 덧셈
        System.out.println(a + b); // 14
        // 뺄셈
        System.out.println(a - b); // 6
        // 곱셈
        System.out.println(a * b); // 40
        // 나눗셈
        System.out.println(a / b); // 2 -> 정수형 ; 소수점아래 버림
        // 형변환
        System.out.println(a / (float)b); // 2.5 자동형변환 -> 실수형
    }
}

// 산술변환
class Operator4_2 {
    public static void main(String[] args) {
        System.out.println(5 / 2); // 2
        System.out.println(5 / (float)2); // 2.5
    }
}