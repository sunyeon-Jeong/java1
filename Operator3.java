// 형변환
class Operator3_1 {
    public static void main(String[] args) {
        int i = 65, num = 10; // 정수 선언
        char ch = 'A'; // 문자 선언
        float f = 1.6f; // 실수 선언

        System.out.println("(char)i = " + (char)i); // 정수 -> 문자
        System.out.println("(int)ch = " + (int)ch); // 문자 -> 정수
        System.out.println("(int)f = " + (int)f); // 실수 -> 정수
        System.out.println("(float)num = " + (float)num); // 정수 -> 실수
    }
}

// 자동형변환
class Operator3_2 {
    public static void main(String[] args) {
        int i = (int)3.14f; // 수동 정수 형변환
        System.out.println("i = " + i);

        float f = 1234; // float > int -> 자동 형변환
        System.out.println("f = " + f);
    }
}