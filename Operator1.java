// 연산자의 우선순위
class Operator1_1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // + 연산자는 피연산자가 2개인 이항 연산자 -> 단항 연산자인 -x 의 -가 먼저 실행된다.
        System.out.print("-x + 3 = ");
        System.out.println(-x + 3); // -10 + 3 = -7

        System.out.print("x + 3 * y = ");
        System.out.println(x + 3 * y); // 10 + (3 * 20) = 70

        System.out.print("x + 3 > y - 2 = ");
        System.out.println(x + 3 > y - 2); // false
        System.out.print("x + 3 < y - 2 = ");
        System.out.println(x + 3 < y - 2); // true

        System.out.print("x > 3 && y < 2 = ");
        System.out.println(x > 3 && y < 2); // false

        int result = x + y * 3;
        System.out.println("result = " + result); // 10 + (20 * 3), result = 70
    }
}

// 연산자의 결합규칙
class Operator1_2 {
    public static void main(String[] args) {
        int x, y; // x, y 정수 선언

        x = y = 3; // y에 3 저장 -> x에 y=3 저장 (대입연산자)

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}