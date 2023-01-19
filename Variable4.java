// 문자와 문자열 차이
class Variable4_1 {
    public static void main(String[] args) {
        char ch1 = 'A'; // 문자
        // char ch2 = 'AB'; // Error 발생
        // char ch3 = ''; // Error 발생, 빈 문자 불가능

        String s1 = "ABC"; // 문자열
        String s2 = ""; // 빈 문자열 가능
        String s3 = "A"; // 문자 한 개도 문자열!

        // 아래 두 표현식 모두 사용 가능하지만 ss2 방식은 거의 사용하지 않음!
        String ss1 = "AB";
        String ss2 = new String("AB");

        System.out.println("ss1 = " + ss1);
        System.out.println("ss2 = " + ss2);
    }
}

// 문자열 결합
class Variable4_2 {
    public static void main(String[] args) {
        String s1 = "A" + "B"; // "AB"
        System.out.println("s1 = " + s1);

        // 문자열은 문자열하고만 결합할 수 있기 때문에
        // 숫자를 문자열로 바꾼 다음에 결합 합니다.
        String s2 = "" + 7;
        // "" + 7 => "" + "7" = "7"
        System.out.println("s2 = " + s2);

        // 문자열 결합 순서에 의한 차이 확인!
        String s3 = "" + 7 + 7;
        // "" + 7 + 7 => "7" + 7 => "7" + "7" = "77"
        System.out.println("s3 = " + s3);

        String s4 = 7 + 7 + "";
        // 7 + 7 + "" => 14 + "" = "14"
        System.out.println("s4 = " + s4);
    }
}

// 두 변수의 값 교환하기
class Variable4_3 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        // x 와 y 값을 교환해 보겠습니다.
        x = y; // x = 20;
        // 변수는 하나의 값 밖에 저장할 수 없기 때문에 기존의 x의 값 10은 사라지고 20이 됩니다.
        y= x; // y = 20;
        // y는 20 이된 x의 값을 받습니다.

        System.out.println("x = " + x); // 20
        System.out.println("y = " + y); // 20

        System.out.println();
        // 교환이 제대로 되지 않았습니다!

        int a = 10, b = 20;
        int tmp; // 교환에 중간다리 역할을 해 줄 변수 하나를 선언합니다.
        // a 와 b 값을 교환해 보겠습니다.
        tmp = a; // a = 10, tmp = 10
        a = b; // b = 20, a = 20
        b = tmp; // tmp = 10, b = 10

        // 결과로 a = 20, b = 10 이어야 됩니다.
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10
        System.out.println("tmp = " + tmp); // 10

        // 교환이 성공적으로 되었습니다!
    }
}