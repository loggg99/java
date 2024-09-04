package himedia.java.account;

public interface A_account {


    void printCreateAccountMenu();

    String createAccountNum();

    boolean checkDuplicateNum(int[] accountNums, int tmp, int idx);

    int printMenu();

    void addMoney();

    void manageHistory(String history);

    void printHistory();
    void subMoney();


    String getNowDateTime();
}
