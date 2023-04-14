package chap_07;

public class _02_InstanceVariable {
    public static void main(String[] args) {
        // 처음 만든 블랙막스
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolutaion="FHD";
        b1.price=200000;
        b1.color="black";

        System.out.println(b1.modelName);
        System.out.println(b1.resolutaion);
        System.out.println(b1.price);
        System.out.println(b1.color);

        System.out.println("-----------------------");
        // 새로운 블랙박스
        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        b2.resolutaion="UHD";
        b2.price=300000;
        b2.color="withe";
        System.out.println(b2.modelName);
        System.out.println(b2.resolutaion);
        System.out.println(b2.price);
        System.out.println(b2.color);
    }
}
