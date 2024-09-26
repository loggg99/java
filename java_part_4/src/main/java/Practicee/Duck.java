package Practicee;

public class Duck {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.showMessage();
    }
}
