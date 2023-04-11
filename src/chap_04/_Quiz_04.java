package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오.

        // 조건
        // 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인 .... 장애인 차량 : 직접 운전 또는 탑승 모두 포함

        // 결과
        // 일반차량 5시간 20000원
        // 경차 5시간 10000원
        // 장애인 차량 10시간 15000원

        // 주차 요금은 ?????원 입니다.
        int hour = 5;
        int pay = 4000;

        int discount = 2;
        int maxPay = 30000;

        int resultPay = hour * pay >=maxPay? 30000 : hour* pay;
        String type ="일반";
        String type2 ="경차";
        String type3 ="장애인";
        if(type.equals("경차") || type.equals("장애인")){
            resultPay = resultPay/2;
        }
        System.out.println(type+"은/는 주차 요금은 "+resultPay+"원 입니다. #1");

        hour = 5;
        resultPay = hour * pay >=maxPay? 30000 : hour* pay;
        switch (type2){
            case "일반":
                resultPay = resultPay;
                break;
            case "경차":
            case "장애인":
                //resultPay = resultPay/2;
                resultPay = (int)(resultPay * 0.5f);
                break;
        }
        System.out.println(type+"은/는 주차 요금은 "+resultPay+"원 입니다. #2");

        hour = 10;
        resultPay = hour * pay >=maxPay? 30000 : hour* pay;
        switch (type3){
            case "일반":
                resultPay = resultPay;
                break;
            case "경차":
            case "장애인":
                //resultPay = resultPay/2;
                resultPay *= 0.5f;
                break;
        }
        System.out.println(type+"은/는 주차 요금은 "+resultPay+"원 입니다. #3");

        //------------풀이-----------
        hour = 10;
        boolean isSmallCar = false; // 경차
        boolean withDisabledPerson = true; //장애인

        int fee = hour * 4000;
        //3000원 초과시 일일 최대 요금으로 수정
        if (fee >= 30000){
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if(isSmallCar || withDisabledPerson){
            fee /= 2;
//            fee = (int)(fee * 0.5f);
//            fee = (int)(fee * 0.5f);
//            fee *= 0.5f;
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
