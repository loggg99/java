package himedia.java.AccountBook2;

import java.nio.file.Path;

public class AccountImpl implements AccountBook{

    private String desktopPath;
    private String folderPath;
    private Path myFolder;
    private String today;
    private Path todayFile;




    @Override
    public int printMenu() {
        return 0;
    }

    @Override
    public String addAB() {
        return "";
    }

    @Override
    public String searchAB() {
        return "";
    }


    @Override
    public String deleteFileAB() {
        return "";
    }
}
