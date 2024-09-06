package Practice.AB;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountImpl implements AccountBook {

    private List<String> dates;  // 날짜 목록
    private List<String> stuffs; // 항목 이름 목록
    private List<Integer> prices; // 항목 가격 목록

    public AccountImpl() {
        dates = new ArrayList<>();
        stuffs = new ArrayList<>();
        prices = new ArrayList<>();
    }

    @Override
    public int printMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 메뉴를 선택하시오");
        System.out.println("[1] 내역 추가 [2] 내역 조회 [3] 전체 삭제 [4] 내역 삭제 [5] 프로그램 종료");
        return sc.nextInt();
    }

    @Override
    public String addAB() {
        Scanner sc = new Scanner(System.in);

        // 현재 날짜를 "yyyy-MM-dd" 형식으로 자동으로 저장
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("물건 내역을 입력하시오:");
        String name = sc.nextLine();
        System.out.println("가격을 입력하시오:");
        int price = sc.nextInt();

        // 날짜, 항목, 가격을 각각의 리스트에 추가
        dates.add(currentDate);  // 날짜를 자동으로 추가
        stuffs.add(name);
        prices.add(price);

        System.out.println("내역 입력 완료: " + currentDate + " - " + name + " : " + price + "원");
        return "내역 입력 완료";
    }

    @Override
    public String searchAB() {
        if (stuffs.isEmpty()) {
            System.out.println("내역이 없습니다.");
            return "내역이 없습니다.";
        }

        System.out.println("전체 내역 조회:");
        int total = 0;
        String currentDisplayDate = ""; // 현재 출력 중인 날짜

        // 날짜, 항목, 가격을 출력 (날짜에 따라 그룹화)
        for (int i = 0; i < stuffs.size(); i++) {
            String date = dates.get(i);
            String stuff = stuffs.get(i);
            int price = prices.get(i);

            // 새로운 날짜가 나타날 때마다 날짜를 출력
            if (!date.equals(currentDisplayDate)) {
                currentDisplayDate = date;
                System.out.println("\n날짜: " + currentDisplayDate); // 날짜 출력
            }

            // 항목과 가격을 출력
            System.out.println(stuff + " : " + price + "원");
            total += price;
        }
        System.out.println("합계: " + total + "원");

        return "조회 완료";
    }

    @Override
    public String TotalDeleteAB() {
        // 전체 항목과 가격 리스트를 초기화
        dates.clear();
        stuffs.clear();
        prices.clear();
        System.out.println("전체 내역이 삭제되었습니다.");
        return "전체 삭제 완료";
    }

    @Override
    public String deleteAB() {
        if (stuffs.isEmpty()) {
            System.out.println("삭제할 내역이 없습니다.");
            return "삭제할 내역이 없습니다.";
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 항목의 이름을 입력하시오:");
        String name = sc.nextLine();

        // 이름이 같은 첫 번째 항목을 삭제
        for (int i = 0; i < stuffs.size(); i++) {
            if (stuffs.get(i).equals(name)) {
                dates.remove(i);
                stuffs.remove(i);
                prices.remove(i);
                System.out.println(name + " 항목이 삭제되었습니다.");
                return "항목 삭제 완료";
            }
        }

        System.out.println("해당 항목이 존재하지 않습니다.");
        return "해당 항목 없음";
    }
}

