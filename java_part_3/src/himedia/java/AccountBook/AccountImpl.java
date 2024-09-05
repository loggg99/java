package himedia.java.AccountBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountImpl implements AccountBook {

    private List<String> stuffs;
    private List<Integer> price;
    private Scanner getNowDateTime;


    public AccountImpl() {
        stuffs = new ArrayList<>();
        price = new ArrayList<>();
    }


    @Override
    public int printMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 메뉴를 선택하시오");
        System.out.println("[1]내역 추가 [2]내역조회 [3]전체삭제 [4]내역 삭제 [5]프로그램 종료");
        return sc.nextInt();

    }

    @Override
    public String addAB() {

        Scanner sc = new Scanner(System.in);
        System.out.println("물건 내역을 입력하시오");
        String name = sc.nextLine() + "-" + getNowDateTime.nextLine();
        System.out.println("가격을 입력하시오");
        String cost = sc.nextLine();

        manageStuffs(name,price);


        return "내역 입력 완료";
    }

    public void manageStuffs(String name,String price) {
        stuffs.add(name);
    }




    @Override
    public String searchAB() {
        System.out.println("내역 조회");
        Scanner sc = new Scanner(System.in);
        System.out.println("물건의 이름을 입력하시오");
        String name = sc.nextLine();
        if (stuffs.isEmpty()) {
            System.out.println("내역이 없다.");
        } else {
            for (String _ : stuffs) {

                System.out.println(name);
            }


            return "";
        }


        return "";
    }

    @Override
    public String TotalDeleteAB() {
        return "";
    }

    @Override
    public String deleteAB() {
        return "";
    }
}
