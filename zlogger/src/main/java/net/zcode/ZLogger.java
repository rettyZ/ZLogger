package net.zcode;
import net.zcode.enums.Types.Code;

public class ZLogger {

    public static final String ANSI_RESET = "\u001B[0m"; 
    public static final String ANSI_GREEN_BG = "\u001B[42m";
    public static final String ANSI_RED_BG = "\u001B[41m";
    public static final String ANSI_BLUE_BG = "\u001B[44m";

    public static void main(String[] args) {
        System.out.println("[ ZLogger | Build: 1.0.1 | Cosmic ]");

        // !! ZROBIĆ SPRAWDZANIE AKTUALIZACJI !!

        Code INFO = Code.INFO;
        Code ERROR = Code.ERROR;
        Code SUCCESS = Code.SUCCESS;
    }

    public static void LOG(Code type, String text){
        switch (type){
            case INFO:
                System.out.println(ANSI_BLUE_BG + "~ ZLogger | INFO: " + text + ANSI_RESET);
                break;
            case ERROR:
                System.out.println(ANSI_RED_BG + "~ ZLogger | ERROR: " + text + ANSI_RESET);
                break;
            case SUCCESS:
                System.out.println(ANSI_GREEN_BG + "~ ZLogger | SUCCESS: " + text + ANSI_RESET);
                break;
        }
    }
}