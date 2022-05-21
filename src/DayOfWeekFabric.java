import javax.rmi.CORBA.Tie;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DayOfWeekFabric {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input day of week:");
        System.out.println(Arrays.toString(DayOfWeek.values()));
        String day = reader.readLine().toUpperCase(Locale.ROOT);
        DayOfWeek dayOfWeek =DayOfWeek.valueOf(day);
        String task;
//        switch (dayOfWeek){
//            case MONDAY:
//                task="Сегодня моем окна";
//                break;
//            case TUESDAY:
//                task="Сегодня поливаем окна";
//                break;
//            case WEDNESDAY:
//                task="Сегодня моем парты";
//                break;
//            case THURSDAY:
//                task="Сегодня моем доску";
//                break;
//            case FRIDAY:
//                task="Сегодня слаживаем книжки";
//                break;
//            case SATURDAY:
//                task="Сегодня меняем шторы";
//                break;
//            case SUNDAY:
//                task="Сегодня полируем доску";
//                break;
//        }
        Map<DayOfWeek, String> map1 = new HashMap<>();
        map1.put(DayOfWeek.MONDAY, "1");
        map1.put(DayOfWeek.TUESDAY, "2");
        map1.put(DayOfWeek.WEDNESDAY, "3");
        map1.put(DayOfWeek.THURSDAY, "4");
        map1.put(DayOfWeek.FRIDAY, "5");
        map1.put(DayOfWeek.SATURDAY, "6");
        map1.put(DayOfWeek.SUNDAY, "7");
        System.out.println(map1.get(dayOfWeek));
    }
}
