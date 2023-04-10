package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); //문자열이 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); //문자열이 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); //문자열이 내용이 같으면 true, 다르면 false

        // 대소분자 구분 없이 문자열이 내용이 같으면 true, 다르면 false
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보(s1,s2는 "1234"값을 참조)
        s2 = "1234";

        System.out.println(s1.equals(s2)); // true

        System.out.println(s1 == s2); // true

        s1 = new String("1234"); // s1, s2는 각각 다른 종이에 저장 한걸로 간주 값이 아니라 s1, s2를 비교하기때문에 s1 == s2 는  false가 나옴
        s2 = new String("1234");

        //문자열 비교는 equals를 사용해야한다
        System.out.println(s1.equals(s2)); // true

        System.out.println(s1 == s2); // false


    }
}
