package Practice.AB;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        AccountBook AB = new AccountImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int choice = AB.printMenu(); // 메뉴 출력 및 선택
            switch (choice) {
                case 1:
                    AB.addAB(); // 내역 추가
                    break;
                case 2:
                    AB.searchAB(); // 내역 조회
                    break;
                case 3:
                    AB.TotalDeleteAB(); // 전체 삭제
                    break;
                case 4:
                    AB.deleteAB(); // 내역 삭제
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return; // 프로그램 종료
                default:
                    System.out.println("올바른 메뉴 번호를 선택하세요.");
            }
        }
    }
}

