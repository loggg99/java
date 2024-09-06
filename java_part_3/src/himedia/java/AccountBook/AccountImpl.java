package himedia.java.AccountBook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountImpl implements AccountBook {

    private List<String> stuffs;
    private List<Integer> prices;
    private List<String> dates;



    public AccountImpl() {
        stuffs = new ArrayList<>();
        prices = new ArrayList<>();
        dates = new ArrayList<>();
    }


    @Override
    public int printMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 메뉴를 선택하시오");
        System.out.println("[1]내역 추가 [2]내역 조회 [3]전체 삭제 [4]내역 삭제 [5]프로그램 종료");
        return sc.nextInt();

    }

    @Override
    public String addAB() {
        Scanner sc = new Scanner(System.in);

        String currentDate = LocalDate.now().toString();
        System.out.println("물건 내역을 입력하시오");
        String name = sc.nextLine();
        System.out.println("가격을 입력하시오");
        String cost = sc.nextLine();

        stuffs.add(name);
        prices.add(Integer.parseInt(cost));
        dates.add(currentDate);

        System.out.println("내역 입력 완료 : " + currentDate+ " - " +name+ " - " +cost+ "원");

        return "";
    }



    @Override
    public String searchAB() {
        System.out.println("내역 조회");
        int totalPrice = 0;

        if (stuffs.isEmpty()) {
            System.out.println("내역이 없다.");
        } else {
            for (int i = 0; i < stuffs.size(); i++) {
                String stuff = stuffs.get(i);
                int price = prices.get(i);
                String date = dates.get(i);



                totalPrice += price;

                System.out.println("날짜 : " + date + " - 내역 : " +stuff + " - 가격 : " +price+ "원");


            }
            System.out.println("합계 : " +totalPrice+ "원");

            return "";
        }


        return "";
    }

    @Override
    public String TotalDeleteAB() {
        dates.clear();
        stuffs.clear();
        prices.clear();
        System.out.println("전체 내역 삭제 완료");


        return "";
    }

    @Override
    public String deleteAB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제 내역 입력");
        String name = sc.nextLine();
        for(int i = 0; i < stuffs.size(); i++) {
            if(stuffs.get(i).equals(name)) {
                stuffs.remove(i);
                prices.remove(i);
                dates.remove(i);

            }

        }

        System.out.println("삭제 완료");
        return "";

    }
}
