package cahp_01;

public class _Quiz_01 {

    // 버스 도착 정보를 출력하는 프로그램을 작성하시오.
    // 각 정보는 적절한 자료형의 변수에 정의합니다.

    // 정보
    // 버스 번호는 "1234", "상업08" 과 같은 형태
    // 남은 시간은 분 단위 (예: 3분, 5분)
    // 남은 거리는 km 단위 (예: 1.5km, 0.8km)

    // 실행결과
    // 상암08번 버스
    // 약 3분 후 도착
    // 남은 거리 1.2km

    public static void main(String[] args) {
        String busNumber = "상암08";
        final String BUS = "버스";

        System.out.println(busNumber+ "번 "+BUS);

        int busArrivedMinutes = 3;
        final String MINUTES_NAME ="분";

        System.out.println("약 " + busArrivedMinutes +MINUTES_NAME + " 후 도착");

        float busKm = 1.2F;
        final String km ="km";
        System.out.println("남은 거리 "+busKm+km);


    }

}
