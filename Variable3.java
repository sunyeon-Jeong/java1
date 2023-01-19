// 정수형 오버플로우
class Variable3_1 {
    public static void main(String[] args) {
        // 부호있는 경우
        short sMin = -32768;
        short sMax = 32767;

        // short 타입에서 최솟값 범위를 넘었을 때
        // sMin - 1 = 32767
        System.out.println("sMin = " + sMin);
        System.out.print("sMin - 1 = ");
        System.out.println((short)(sMin - 1));

        // short 타입에서 최댓값 범위를 넘었을 때
        // sMax + 1 = -32768
        System.out.println("sMax = " + sMax);
        System.out.print("sMax + 1 = ");
        System.out.println((short)(sMax + 1));

        // 부호없는 경우
        char cMin = 0;
        char cMax = 65535;

        // short 타입에서 최솟값 범위를 넘었을 때
        // cMin - 1 = 65535
        System.out.println("cMin = " + (int)cMin);
        System.out.print("cMin - 1 = ");
        System.out.println((int)(--cMin));

        // short 타입에서 최댓값 범위를 넘었을 때
        // cMax + 1 = 0
        System.out.println("cMax = " + (int)cMax);
        System.out.print("cMax + 1 = ");
        System.out.println((int)(++cMax));
    }
}

// 타입간 변환방법_문자와 숫자
class Variable3_2 {
    public static void main(String[] args) {
        int num = 5; // 숫자형 변수
        char ch = '5'; // 문자형 변수

        // 숫자 -> 문자
        System.out.println("num = " + num); // 숫자형
        System.out.println("num + '0' = " + (char)(num + '0')); // char타입 변환

        // 문자 -> 숫자
        System.out.println("ch = " + ch);
        System.out.print("ch - '0' = ");
        System.out.println(ch - '0'); // 숫자형 변환

        System.out.print("ch - '0' + 1 =  ");
        System.out.println(ch - '0' + 1);
    }
}

// 타입간 변환방법_문자열로의 변환
class Variable3_3  {
    public static void main(String[] args) {
        int num = 5; // 숫자형
        char ch = '5'; // 문자형

        // 숫자 -> 문자열
        System.out.println("num + \"\" = " + num + "");
        // num 이 "5" 로 변환되었기 때문에 "5" + "5" 로  결과값은 "55"
        System.out.println("num + \"\" + \"5\" = " + num + "" + "5");

        // 문자 -> 문자열
        System.out.println("ch + \"\" = " + ch + "");
        // ch 이 '5' 에서 "5" 로 변환되었기 때문에 "5" + "8" 로  결과값은 "58"
        System.out.println("ch + \"\" + \"8\" = " + ch + "" + "8");

    }
}

// 타입간 변환방법_문자열을 숫자, 문자로 변환
class Variable3_4  {
    public static void main(String[] args) {
        String str1 = "100";
        String str2 = "3.14";
        String str3 = "8";

        // 문자열 -> 숫자
        System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str1));
        // Integer.parseInt() 은 int 타입만 가능
//         System.out.println("Integer.parseInt(str2) = " + Integer.parseInt(str2)); // Error 발생
        System.out.println("Double.parseDouble(str2) = " + Double.parseDouble(str2));

        // 문자열 -> 문자
        System.out.println("str.charAt(0) = " + str1.charAt(0) + str1.charAt(1) + str1.charAt(2));
        System.out.println("str2.charAt(0) = " + str3.charAt(0));
    }
}