package himedia.java;

// enum 열거형
// 자바에서 특정한 상수 집합을 정의하는데 사용되는 특졀한 데이터 타입이다.
// 예를 들어 요일, 색상, 방향 등과 같은 고정된 개수의 상수들을 나타낼떄 유용하다
// enum은 클래스처럼 보이지만 실제로는 고정된 상수들의 집합을 정의하는것이며
// 모든 enum은 java.lang.Enum 클래스를 상속받는다.

// enum 사용의 장접
// 코드의 명확학 : 코드에서 상수 값을 빅접 사용하지 않고 enum을 사용하여 의미를 명확하게 전달할 수 있다.
// 타입의 안정성 : 잘못된 값이 사용되는것을 방지
// 유지보수 용이성 : 새로운 상수를 추가하거나 기존 산수를 변겅할때 코드 전첼를

public class B_enum {

    public static void exam1(){
        B_day today = B_day.SATURDAY;
        System.out.println(B_day.SATURDAY.ordinal());
        switch (today) {
            case MONDAY:
                System.out.println("today is MONDAY");
                break;
            case TUESDAY:
                System.out.println("today is TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("today is WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("today is THURSDAY");
                break;
            case FRIDAY:
                System.out.println("today is FRIDAY");
                break;
            case SATURDAY:
                System.out.println("today is SATURDAY");
                break;
            case SUNDAY:
                System.out.println("today is SUNDAY");
                break;



        }

    }

    public static void exam2() {
        // 모든 값을 순회
        for ( B_day_2 day : B_day_2.values()) {
            System.out.println(day.ordinal() + " : " + day.name() + " : " + day.getDescription());
        }
    }

    public static void main(String[] args) {
        exam1();
    }

}