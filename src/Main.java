import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int ticketPrice = 3000; //стоимость билета
        int mile = 20; //количество рублей 1 бонусной мили

        int bonusMiles = ticketPrice / mile; //расчет начисления бонусных миль

        System.out.println("Вам начислено " + bonusMiles + " бонусных миль");
    }
}
