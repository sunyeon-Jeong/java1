// Math 클래스_1
class Operator5_1 {
    public static void main(String[] args) {
        long result = Math.round(3.645678);
        System.out.println("result = " + result);

        // 소수점 4째자리에서 반올림
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        // 3141.5 -> round 반올림 -> 3142/1000.0 -> 3.142
        System.out.println(shortPi); // 3.142

        double pi2 = 3.141592;
        System.out.println("(int)(pi2 * 1000) = " + (int) (pi2 * 1000));
        // 3141
        System.out.println("(int)(pic2 * 1000) / 1000.0 = " + (int) (pi2 * 1000) / 1000.0);
        // 3141 / 1000.0 -> 3.141
    }
}

// Math 클래스_2
class Operator5_2 {
    public static void main(String[] args) {
        double num = 3.14; // 실수형 선언

        System.out.println("반올림 : " + Math.round(num)); // 반올림 : 3
        System.out.println("올림 : " + Math.ceil(num)); // 올림 : 4.0
        System.out.println("내림 : " + Math.floor(num)); // 내림 : 3.0
        System.out.println("절대값 : " + Math.abs(num*-1)); // 절대값 : 3.14
    }
}

// 나머지연산자
class Operator5_3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;

        System.out.print("x를 y로 나눈 몫 = "); // int 타입이기때문에 몫 정수로 출력
        System.out.println(x / y);

        System.out.print("x를 y로 나눈 나머지 = ");
        System.out.println(x % y);

        // 부호 무시
        int n = 3;
        int z = -3;
        System.out.println("x % n = " + x % n);
        System.out.println("x % z = " + x % z);
    }
}