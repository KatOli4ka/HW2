public class Main {
    public static void main(String[] args) {
        byte ball=5;
        System.out.println("Значение переменной ball с типом byte равно " + ball);
        int temperature=-28;
        System.out.println("Значение переменной temperature с типом int равно " + temperature);
        short money=10000;
        System.out.println("Значение переменной money с типом short равно " + money);
        long distanceToMoon=384467;
        System.out.println("Значение переменной distanceToMoon с типом long равно " + distanceToMoon+ " км");
        double distanceToMars=55.76;
        System.out.println("Значение переменной distanceToMars с типом double равно " + distanceToMars + " млн. км");
        float mosquitoWeight=3.2F;
        System.out.println("Значение переменной mosquitoWeight с типом float равно " + mosquitoWeight + " г");


        float butterflyWeight=27.12f;
        System.out.println("Вес средней бабочки равен " + butterflyWeight + " г");
        long lotteryWinner=987678965549L;
        System.out.println("Победитель лоттереи получил " + lotteryWinner +" рублей");
        byte pen=2;
        System.out.println("У Пети " + pen +" ручки");
        short bearWeight=786;
        System.out.println("Примерный вес медведя равен " + bearWeight + " кг");
        int lakeAssal=-159;
        System.out.println("Озеро Ассал находится на " + lakeAssal + " м ниже уровня моря");
        short lenghtJinpingDam=569;
        System.out.println("Длина арочной плотины Цзиньпинь равна " + lenghtJinpingDam +" м");
        int averageSalary=27897;
        System.out.println("Средняя зарплата в России составляет " + averageSalary +" рублей");
        short lenghtTolmachevskayaHPP=67;
        System.out.println("Длина Толмачевской ГЭС " + lenghtTolmachevskayaHPP + " м");
        boolean whichIsLonger=lenghtTolmachevskayaHPP>lenghtJinpingDam;
        System.out.println("Утверждение, что длина Толмачевской ГЭС больше длины плотины Цзиньпинь " + whichIsLonger);


        short LP=23;
        short AS=27;
        short EA=30;
        int totalStudents=LP+AS+EA;
        short papers=480;
        int paper1Student=papers/totalStudents;
        System.out.println("На каждого ученика рассчитано по " +paper1Student+ " листов бумаги");

        int time=2;
        int bottle=16;
        int time1MinuteBottle=bottle/time;
        int time20minute=20;
        int bottle20=time1MinuteBottle*time20minute;
        int time1Hour=60;
        int bottle1Hour=time1MinuteBottle*time1Hour;
        int time1Day=24;
        int bottle1Day=bottle1Hour*time1Day;
        int time3Days=time1Day*3;
        int bottle3Days=time3Days*bottle1Hour;
        int time1Month=time1Day*30;
        int bottle1Month=time1Month*bottle1Hour;
        System.out.println("За 20 минут машина произвела " +bottle20 +" бутылок. За сутки машина произвела " +bottle1Day+" бутылок. За 3 дня машина произвела "+bottle3Days+" бутылок. За 1 месяц машина произвела " +bottle1Month+" бутылок");


        byte totalCans=120;
        byte whiteCans1Class=2;
        byte brownCans1Class=4;
        int totalCans1Class=whiteCans1Class+brownCans1Class;
        int totalClasses=totalCans/totalCans1Class;
        int totalWhiteCans=whiteCans1Class*totalClasses;
        int totalBrownCans=brownCans1Class*totalClasses;
        System.out.println("В школе, где "+totalClasses+ " классов, нужно "+totalWhiteCans+" банок белой краски и "+totalBrownCans+" банок коричневой краски");

    }
}