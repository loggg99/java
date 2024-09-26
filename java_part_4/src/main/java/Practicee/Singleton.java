package Practicee;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("싱글톤 인스턴스입니다.");
    }
}

    // 사용 예
    class Main {
        public static void main(String[] args) {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
            Singleton singleton2 = Singleton.getInstance();
            System.out.println(singleton2);

        }
    }
