// 증감연산자
class Operator2_1 {
    public static void main(String[] args) {
        int i = 5, j = 0; // 변수 선언
        j = i++; // i값 1증가, j 그대로 (다음번에 증가)
        System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);

        i = 5; // 변수 초기화
        j = 0;
        j = ++i; // i값 1증가, j값 1증가
        System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j);
    }
}

// 증감연산자_메서드호출에 사용
class Operator2_2 {
    public static void main(String[] args) {
        int i = 5, j = 5; // 변수 선언

        System.out.println(i++); // i 출력, 후 증가
        System.out.println(++j); // j 1증가

        System.out.println("i = " + i + ", j = " + j);
    }
}

// 부호연산자
class Operator2_3 {
    public static void main(String[] args) {
        int i = -10;
        i = +i; // 부호연산자 + -> 하는 역할 없음
        System.out.println("+i = " + i);

        i = -10;
        i = -i; // 부호연산자 - -> 피연산자 부호 반대로 반환
        System.out.println("-i = " + i);
    }
}