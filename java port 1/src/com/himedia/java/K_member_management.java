package com.himedia.java;

import javax.lang.model.element.Name;
import java.sql.SQLOutput;
import java.util.Scanner;

public class K_member_management {
    static int totalCnt = 0;
    static int totalMemberCnt = 0;

    // 요금제
    public static int printPricePlan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[요금제를 선택하시오]");
        System.out.println("[1]Lite : 10, [2]Basic : 20, [3]Premium : 30");
        return sc.nextInt();

    }
    public static int printMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[수행할 업무를 선택하시오 - 현재 회원수 " + totalMemberCnt + " / " + totalCnt + "]");
        System.out.println("[1]회원추가 [2]회원조회(메일) [3]회원이름조회(이름)");
        System.out.println("[4]전체조회 [5]회원수정 [6]회원탈퇴");
        System.out.println("[7]프로그램 종료");
        return sc.nextInt();
    }

    public static void  addMember(String[][] members) {
        //사용자로부터 이름, 이메일, 연락처
        //인원수 예외처리 1
        //인원이 초과되면 "회원이 꽉찼음"출력
        //addMember함수를 종료시키시오
        //return;
        if (totalMemberCnt >= totalCnt) {
            System.out.println("회원이 꽉찼음");
            return;
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String Name = sc.nextLine();
        System.out.println("이메일을 입력해주세요");
        String email = sc.nextLine();
        System.out.println("연락처 입력해주세요");
        String phone = sc.nextLine();

        //예외처리2
        //이메일
        if(checkEmail(members, email)) {
            System.out.println("이미존재");
            return;
        }



        //member에 넣어주세요
        members[totalMemberCnt][0] = Name;
        //email
        members[totalMemberCnt][1] = email;
        //phone
        members[totalMemberCnt][2] = phone;

        totalMemberCnt++;

    }
    public static boolean checkEmail(String[][] members, String email) {
        //회원이 존재하면 true 부존재 false
        for (int i = 0; i < members.length; i++ ) {
            if (email.equals(members[i][1])) {
                return true;

            }

        }

        return false;
    }
    public static void selectEmail(String[][] members) {
        Scanner sc = new Scanner(System.in);
        System.out.println("조회 이메일을 입력");
        String email = sc.nextLine();

        //사용자를 찾았을 경우
        //출력 : [이름] 길동, [이메일]abc@네이버 [연락처]0909-09-909
        //로직
        for (int i = 0; i < members.length; i++ ) {
            if (email.equals(members[i][1])) {
                System.out.println("[이름] " +members[i][0]+ ", [이메일]" +members[i][1]+ " ,[연락처]" +members[i][2]);
                return;

            }
        }

        System.out.println("찾는 정보가 없다.");
    }//사용자를 못 찾은경우
    public static void selectName(String[][] members) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < members.length; i++ ) {
            if (Name.equals(members[i][0])) {
                System.out.println("[이름] " +members[i][0]+ ", [이메일]" +members[i][1]+ " ,[연락처]" +members[i][2]);
                flag = true;

            }
        }
        if(!flag) {
            System.out.println("찾는 이름없다.");
        }
        //이름 중복 허용
        //다출력해야
        //1번이라도 찾았다는 것을 인지할 수 있는 flag 값이 필요
    }

    public static void selectall(String[][] members) {
        for (int i = 0; i < totalMemberCnt; i++ ) {
            System.out.println((i + 1) + ", [이름] " +members[i][0]+ ", [이메일]" +members[i][1]+ " ,[연락처]" +members[i][2]);

        }
    }
    public static void updateMember(String[][] members) {
        //이메일 조회 -> 사용자로부터 이메일을 받아 온다.
        //조회
        //찾았으면 해당 인덱스값을 가지고 있는다.
        //찾지 못했으면 "찾으시는 회원이 없습니다." 출력후 updateMember함수 종료
        //새로운 이름 이메일 연락처 입력
        //찾은 인덱스에 값을 갱신시킨다.
        Scanner sc = new Scanner(System.in);
        System.out.println("수정 이메일을 입력하시오");
        String email = sc.nextLine();
        int idx = -1;
        for (int i = 0; i < members.length; i++ ) {
            if (email.equals(members[i][1])) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            System.out.println("찾는 회원없음");
            return;
        }

        //해당 행에 속한 회원정보 갱신
        System.out.println("변경할 이메일입력");
        String newName = sc.nextLine();
        System.out.println("변경할 이메일 입력");
        String newEmail = sc.nextLine();
        System.out.println(("변경할 연락처 입력"));
        String newPhone = sc.nextLine();

        members[idx][0] = newName;
        members[idx][1] = newEmail;
        members[idx][2] = newPhone;

        System.out.println("수정되었음");
    }

    public static void deleteMember(String[][] members) {
        //이메일로 삭제랑 회원을 찾는다.
        //찾았다면 찾은 행정보(인덱스)값을 별도로 가지고있는다.
        //찾지 못했으면 안내 문구 출력후 종료
        //찾은 행 뒤의 행들을 모두 땡긴 후, 마지막 행을 null 처리
        //전체 회원수도 차감시킨다.
        Scanner sc = new Scanner(System.in);

    }




    public static void main(String[] args) {
        int pricePlanNum = printPricePlan();
        String[][] members = new String[pricePlanNum * 10][3];
        totalCnt = pricePlanNum * 10;

        while (true) {
            int menuNum = printMenu();
            switch (menuNum) {
                case 1:
                    addMember(members);
                    break;
                case 2:
                    selectEmail(members);
                    break;
                case 3:
                    selectName(members);
                    break;
                case 4:
                    selectall(members);
                    break;
                case 5:
                    updateMember(members);
                    break;
                case 6:
                    deleteMember(members);
                    break;
                case 7:
                    System.out.printf("이용해주셔서 감사합니다.");
                    return;
                default:
                    System.out.println("잘못선택하셨습니다.");
                    break;
            }
        }
        //사용자로부터 요금제 선택을 받아서
        //해당 크기에 맞는 2차원배열을 생성해주세요
        //단, 열은 3열로 고정한다.
        //배열명 : members

    }
}
