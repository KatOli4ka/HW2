public class Main {
    public static void main(String[] args) {
        byte ball=5;
        System.out.println("Значение переменной ball с типом byte равно " + ball);
        int temperature=-28;
        System.out.println("Значение переменной temperature с типом int равно " + temperature);
        short money=10000;
        System.out.println("Значение переменной money с типом short равно " + money);
        long distanceToMoon=384467L;
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

        int banana=80;
        int banana5=banana*5;
        int milk=105;
        int milk2=milk*2;
        int iceCream=100;
        int iceCream2=iceCream*2;
        int egg=70;
        int eggs4=egg*4;
        double totalWeight=banana5+milk2+iceCream2+eggs4;
        double Kg=1000;
        double totalWeightKg=totalWeight/Kg;
        System.out.println("Вес спорт-завтрака составляет "+totalWeight+" г или "+totalWeightKg+" кг");


        byte g=1;
        int kg=1000*g;
        int kg7=kg*7;
        int lossWeight1=250;
        int lossWeight2=500;
        int days250=kg7/lossWeight1;
        int days500=kg7/lossWeight2;
        int lossWeightMiddle=(lossWeight1+lossWeight2)/2;
        int middleDays=kg7/lossWeightMiddle;
        System.out.println("Если спортсмен будет терять каждый день по 250 г, то он похудет на 7 кг за "+days250+" дней. Если он будет терять по 500 г, то похудеет за "+days500+" дней. В среднем ему понадобится "+middleDays+" дней на похудение");


        int M=67760;
        int D=83690;
        int K=76230;
        int M10percents=M/10;
        int D10percents=D/10;
        int K10percents=K/10;
        int newM=M+M10percents;
        int newD=D+D10percents;
        int newK=K+K10percents;
        int year=12;
        int yearM=M*year;
        int yearD=D*year;
        int yearK=K*year;
        int yearNewM=newM*year;
        int yearNewD=newD*year;
        int yearNewK=newK*year;
        int incomeRaiseM=yearNewM-yearM;
        int incomeRaiseD=yearNewD-yearD;
        int incomeRaiseK=yearNewK-yearK;
        System.out.println("Маша теперь получает "+newM+" рублей. Годовой доход вырос на "+incomeRaiseM+" рублей. Денис теперь получает " +newD+" рублей. Годовой доход вырос на "+incomeRaiseD+" рублей. Кристина теперь получает "+newK+" рублей. Годовой доход вырос на "+incomeRaiseK+" рублей"
        );




    }
}