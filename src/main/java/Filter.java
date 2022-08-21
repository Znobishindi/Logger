import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int tresHold;

    public Filter(int treshold) {
        this.tresHold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        for (int x : source) {
            if (x <= tresHold){
                logger.log("Элемент " + x + " не проходит");
            }else {
                logger.log("Элемент " + x + " проходит");
                result.add(x);
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элементов из " + source.size());
        return result;
    }
}