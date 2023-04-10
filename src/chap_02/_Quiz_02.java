package chap_02;

public class _Quiz_02 {

    /*
    * 어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오
    *
    * 조건
    * 키 120 cm  이상인 경우
    * 삼항연산자 이용
    *
    * 결과
    * 키가 115cm 이므로 탑승이 불가능 합니다.
    * 키가 121cm 이므로 탑승이 가능 합니다.
    * */
    public static void main(String[] args) {
        int child1 = 115;
        int child2 = 121;
        int limitTall = 120;

        String result = (limitTall <= child1) ? "cm 므로 탑승이 가능 합니다." : "cm 므로 탑승이 불가능 합니다.";
        System.out.println("키가 " + child1+ result);

        result = (limitTall <= child2) ? "cm 므로 탑승이 가능 합니다." : "cm 므로 탑승이 불가능 합니다.";

        System.out.println("키가 " + child2+result);



    }
}
