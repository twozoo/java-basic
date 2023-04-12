package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드(ANSI 안시) : 미국 표준 코드
        // 위키 참고
        // 7글자로 되어있으면 7비트 문자 하나가 7비트로 사용
         // char c = 'A';  // 알파뱃 대문자(A)는 65 부터 소문자(a)는 97부터, 숫자(0)은 48부터 시작
         // char c = 'a';
         char c = '0';
        System.out.println(c);
        System.out.println((int)c);

        // c = 'B';
        // c = 'b';
        c = '1';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);


        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch)+(j+1);
            }
            ch++;
        }
        for (int i = 0; i < seats3.length; i++) { // 세로

            for (int j = 0; j < seats3[i].length; j++) { // 가로
                System.out.print(seats3[i][j] +" ");
            }
            System.out.println();
        }
    }
}
