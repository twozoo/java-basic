package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매(1인당 1마리만 구매 가능)
        // 손님 50명

        // For 문
        int max = 20;
        for (int i = 0; i  < 50;  i++) {
            System.out.println(i+"번 손님, 주문하신 치킨이 나왔습니다.");
            if(i==max) {
                System.out.println("금일 재료가 소진되었습니다");
                break; //반복문 탈출
            }
        }
        System.out.println("재료 소진으로 영업을 종료합니다 #1");

        System.out.println("----------------------");

        // while 문
        int index=1; // 손님 대기번호
        while(index<=50){
            System.out.println(index+"번 손님, 주문하신 치킨이 나왔습니다.");
            if (index==max){
                System.out.println("금일 재료가 소진되었습니다");
                break;
            }
            index++;
        }

        System.out.println("재료 소진으로 영업을 종료합니다 #2");
    }
}
