package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP: Object-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성

        String[] items = {"CPU","RAM","HDD"};

        // 차량용, 블랙박스
        // 모델명, 해상도, 가격, 색상

        // 우리가 만든 첫번째 제품
        String modelName = "까망이";
        String resoulation = "FHD";
        int price = 200000;
        String color = "블랙";

        // 새로운 제품 개발
        String modelName2 ="하양이";
        String resoulation2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 또 다른 제품이 나오면??

        BlackBox bbox = new BlackBox();
        //BlackBox 클래스로부터  bbox 객체 생성
        //bbox 객체는 BlackBox클래스의 인스턴스

        BlackBox bbox2 = new BlackBox();



    }
}
