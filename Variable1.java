// 변수의 선언
class Variable1_1 {
    boolean flag;
    char grade;
    byte val;
    short sval;
    int num;
    long price;
    float tax;
    double score;
}

// 변수 초기화
class Variable1_2 {
    public static void main(String[] args) {
        boolean flag = false;
        char grade = 'A';
        byte val = 127;
        short sval = 128;
        int num = 32768;
        long price = 2_147_483_648L;
        float tax = 3.14f;
        double score = 3.14159265358979;

        System.out.println("boolean = " + flag);
        System.out.println("char = " + grade);
        System.out.println("byte = " + val);
        System.out.println("short = " + sval);
        System.out.println("int = " + num);
        System.out.println("long = " + price);
        System.out.println("float = " + tax);
        System.out.println("double = " + score);
    }
}

// 변수 값 읽기
class Variable1_3 {
    public static void main(String[] args) {
        int year, age = 23; // 변수 선언

        year = age + 2000; // 변수 선언
        System.out.println("year = " + year); // 2023

        age = age + 1;
        System.out.println("age = " + age); // 24
        System.out.println("year = " + year); // 2023

        // 변수의 값을 읽어오는 과정
        // age = age + 1;
        // age = 23 + 1;
        // age = 24;
        // 프로그램은 순차적으로 코드가 실행되기 때문에
        // 여기서 age의 값이 바뀌었다고 year에 영향을 주지 않는다.
    }
}

// 변수의 종류 (클래스, 인스턴스, 지역변수)
class Variable1_4 {
    static int classVal = 100; // 클래스 변수
    int instanceVal = 200; // 인스턴스 변수

    public static void main(String[] args) {
        int num; // 지역 변수
//        System.out.println("int = " + num); // Error 발생
        num = 300;
        System.out.println("int = " + num); // 100

        // 인스턴스 변수
//        System.out.println("instanceVal = " + instanceVal); // Error 발생
        Variable1_4 instance = new Variable1_4 (); // 인스턴스 변수 사용을 위해 객체 생성
        System.out.println("instanceVal = " + instance.instanceVal); // 100

        // 클래스 변수
        System.out.println("classVal = " + classVal);
        // 같은 크래스 내부는 바로 접근 가능
        System.out.println("Main.classVal = " + Variable1_4.classVal);
        // 클래스 변수 : 클래스명.클래스변수명 으로 접근 or
    }
}