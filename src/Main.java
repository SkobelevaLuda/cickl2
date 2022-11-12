public class Main {
    public static void main(String[] args) {

        // задание 2-1
        System.out.println( " Задание 2-1 ");

        int amount = 15000;
        int percent = 0;
        int month = 0;
        while (percent <= 12_000_000) {
            month += 1;
            percent = percent + percent * 7 / 100 / 12;
            percent = percent + amount;
            System.out.println(" Месяц " + month + ", сумма накоплений равна " + percent + " рублей");
        }
        // задание 2-2
        System.out.println( " Задание 2-2 ");

        amount = 15000;
        percent = 0;
        month = 0;
        while (percent <= 12_000_000) {
            month += 1;
            percent = percent + percent * 7 / 100 / 12;
            percent = percent + amount;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + ", сумма накоплений равна " + percent + " рублей");
            }
        }
        // задание 2-3
        System.out.println( " Задание 2-3 ");
        int accumulation = 15000;
        int total = 0;
        for (month =1; month<=108; month++) {
            total = total + total * 7 / 100 / 12;
            total = total + accumulation;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
        // задание 2-4
        System.out.println( " Задание 2-4 ");

        for (int friday=3; friday<=31;friday=friday+7) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет. ");
        }
        // задание 3-1
        System.out.println( " Задание 3-1 ");
        int time1 = 2022-200;
        int time2=2022+100;
        for (int timeComet=0;timeComet<=2122; timeComet=timeComet+79) {
            if (timeComet >= time1 && timeComet <= time2) {
                System.out.println(timeComet);
            }
        }
        // задание 3-2
        System.out.println( " Задание 3-2 ");
        for (int figure=1;figure<=10; figure ++){
            int q=2*figure;
            System.out.println("2*"+figure+"="+q);
        }

    }
}