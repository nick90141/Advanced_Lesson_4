package task_3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        int year = 2001;
        int month = 4;
        int day = 27;
        int hour = 12;
        int minute = 0;
        int second = 0;

        LocalDateTime birth  = LocalDateTime.of(year, month, day, hour, minute, second);
        System.out.println("Дата рождения: " + birth);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Время сейчас: " + currentDateTime);


        my_age(birth, currentDateTime);
    }

    public static void my_age(LocalDateTime birth, LocalDateTime currentDateTime) {

        Period period = Period.between(birth.toLocalDate(), currentDateTime.toLocalDate());
        Duration duration = Duration.between(birth, currentDateTime);

        int year = period.getYears();
        int month = period.getMonths();
        int day = period.getDays();
        long hour = duration.toHoursPart();
        long minute = duration.toMinutesPart();
        long second = duration.toSecondsPart();

        System.out.println("Мне исполнилось: " + year + " лет, " + month + " месяцев, " + day + " дней, " + hour + " часов, " + minute + " минут, " + second + " секунд");
    }
}
