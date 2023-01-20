import java.util.Scanner; // 7_2 클래스
// 논리연산자_1
class Operator7_1 {
    public static void main(String[] args) {
        boolean result1, result2, result3, result4, reusult5, result6;

        char ch1 = 'a', ch2 = 'B';  // 'a' : 97 , 'A' : 65, 'B' : 66, 'C' : 67

        result1 = ch1 > 'A' && ch2 < 'C';
        result2 = ch1 == 'A' && ch2 < 'C';

        result3 = ch1 > 'A' || ch2 < 'C';
        result4 = ch1 < 'A' || ch2 > 'C';

        System.out.println("&& 연산자에 의한 결과 result1 = " + result1); // true
        System.out.println("&& 연산자에 의한 결과 result2 = " + result2); // false

        System.out.println("|| 연산자에 의한 결과 result3 = " + result3); // true
        System.out.println("|| 연산자에 의한 결과 result4 = " + result4); // false

        System.out.println("! 연산자에 의한 결과 result4 = " + !result4); // true

        System.out.println();

        int num = 10;
        // num 은 2의 배수 그리고 3의 배수이다.
        reusult5 = num % 2 == 0 && num % 3 == 0;
        System.out.println("num 은 2의 배수 그리고 3의 배수 = " + reusult5); // false

        // num 은 2의 배수 또는 3의 배수이다.
        result6 = num % 2 == 0 || num % 3 == 0;
        System.out.println("num 은 2의 배수 또는 3의 배수 = " + result6); // true
    }
}

// 논리연산자_2
class Operator7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 객체생성
        char ch = ' ';

        System.out.printf("문자를 하나 입력하시오 : ");

        String input = scanner.nextLine();
        ch = input.charAt(0); // 문자열 -> 문자

        if ('0' <= ch && ch <= '9') {
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }
    }
}