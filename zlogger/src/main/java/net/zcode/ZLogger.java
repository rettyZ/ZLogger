package net.zcode;
import net.zcode.enums.Types.Code;

public class ZLogger {
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
                System.out.println("~ ZLogger | INFO: " + text);
                break;
            case ERROR:
                System.out.println("~ ZLogger | ERROR: " + text);
                break;
            case SUCCESS:
                System.out.println("~ ZLogger | SUCCESS: " + text);
                break;
        }
    }
}