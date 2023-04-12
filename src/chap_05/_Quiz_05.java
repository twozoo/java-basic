package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오.
        // 신발사이즈는 250 부터 295 까지 5단위로 증가
        // 신발 사이즈 수는 총 10

        // 실행결과
        /* 사이즈 250 (재고 있음)
        * 사이즈 255 (재고 있음)
        * 사이즈 260 (재고 있음)
        * 사이즈 265 (재고 있음)
        * 사이즈 270 (재고 있음)
        * 사이즈 275 (재고 있음)
        * 사이즈 280 (재고 있음)
        * 사이즈 285 (재고 있음)
        * 사이즈 290 (재고 있음)
        * 사이즈 295 (재고 있음)
        * */

        int increaseSize = 5;
        int[] shoesSize = new int[10];
        int defaultSize = 250;
        for (int i = 0; i < shoesSize.length; i++) {
            shoesSize[i] = defaultSize;
            defaultSize+=5;
            System.out.println("사이즈 " + shoesSize[i] + " (재고있음) #1");
        }
        System.out.println("-------------------------");
        defaultSize = 250;
        for (int i = 0; i < shoesSize.length; i++) {
            shoesSize[i] = defaultSize +(5*i);

        }
        //해답은 요렇게9
        for (int size : shoesSize) {
            System.out.println("사이즈 " + size + " (재고있음) #2");
        }



    }
}
