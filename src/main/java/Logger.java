import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    protected int num = 1;

    private static Logger logger;


    private Logger() {
    }

    public void log(String msg) {
        String date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("[ "+ date + " " + num++ + "] " + msg);
    }
    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
