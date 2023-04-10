package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance =25; // 전체 거리 25m
        int move =0; // 현재 이동 거리 0m
        int height = 2; // 키 2m
        while (move + height<distance){
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동 거리 : " + move);
            move +=3;
        }
        System.out.println("도착했습니다.");
        System.out.println("----반복문 #1-----");
        //키가 엄청나게 큰 사람?
        move =0;
        height=25; //키가 25m인 사람
        while (move + height<distance){
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동 거리 : " + move);
            move +=3;
        }
        System.out.println("도착했습니다.");
        System.out.println("----반복문 #2-----");

        // Do While 반복문
        // 한번은 무조건 실행된다는 점이 while가 가장 큰 차이
        do {
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 : "+ move);
        }while (move +height<distance);
        System.out.println("도착했습니다.");
        System.out.println("----반복문 #3-----");
    }
}
