package himedia.java;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;
public class A_reviewImpl implements A_review {

    public int totalthumbsUp = 0;
    private final Map<String, Integer> map = new HashMap<>();


    public void addReview() {


        Scanner sc = new Scanner(System.in);
        System.out.println("ID를 입력하시오");
        int id = sc.nextInt();
        System.out.println("리뷰를 작성하시오");
        String review = sc.nextLine();

        map.put("Id1", id);
        map.put("review1", Integer.valueOf(review));

        boolean Result = map.containsKey("Id1");

    }
    public void thumbsUp(){

        System.out.println("사용자 ID :" + map.get("Id1"));
        System.out.println("내용1 :" + map.get("review1"));

        Scanner sc = new Scanner(System.in);
        System.out.println("ID를 입력하면 좋아요!!");
        int getThumbsUp = sc.nextInt();




    }public int getThumbsUp() {
        return totalthumbsUp++;
    }

    public void TotalReview(){

        for(Integer value : map.values()) {
            System.out.println("사용자 ID :" + value);
            System.out.println("내용1 :" + map.get("review1"));
        }






    }
    public void DeleteReview(){
        Map<String, Integer> map = new HashMap<>();


    }






}
