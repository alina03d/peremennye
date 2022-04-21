public class Main {
    public static void main(String[] args) {
        var box = 3;
        System.out.println (box );
        byte a = 5;
        System.out.println (a);
        short b = 30_000;
        System.out.println(b);
        int c = 1_000_000_000;
        System.out.println(c);
        long d = 10100200300L;
        System.out.println(d);
        float M = 91.03f;
        System.out.println(M);
        double D = 9.0000009;
        System.out.println(D);
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var boxers = boxerFirst+boxerSecond;
        System.out.println("Общий вес двух бойцов " + boxers + "кг");
        var Boxers = boxerSecond - boxerFirst;
        System.out.println("Разница в весе бойцов " + Boxers + "кг");

        var bananas = 80;
        var milk = 105;
        var iceCream = 100;
        var egg = 70;
        var mix = bananas*5+milk*2+iceCream*2+egg*4;
        System.out.println("Вес Спорт-Завтрака " + mix + "г");
        float Mix = mix/1000f;
        System.out.println(" Вес Спорт-Завтрака "+ Mix + "кг!");

        var planFirst = 7*1000/250;
        System.out.println("Количество дней, если сбрасывать по 250г = " + planFirst + "дней");
        var planSecond = 7*1000/500;
        System.out.println("Количество дней, если сбрасывать по 500г = " + planSecond + "дней");
        var average = (planFirst+planSecond)/2;
        System.out.println("Среднее количество необходимых дней = " + average + "день");

        var Masha = 67_760;
        var Denis = 83_690;
        var Kristina = 76_230;
        var MashaNew = Masha+((Masha*10)/100);
        System.out.println("Маша теперь получает  "+MashaNew+ "руб");
        MashaNew = MashaNew*12-Masha*12;
        System.out.println("Годовой доход Маши вырос на " + MashaNew+ "руб");
        var DenisNew = Denis+((Denis*10)/100);
        System.out.println("Денис теперь получает  "+DenisNew+"руб");
        DenisNew = DenisNew*12-Denis*12;
        System.out.println("Годовой доход Дениса вырос на "+ DenisNew+"руб");
        var KristinaNew = Kristina+((Kristina*10)/100);
        System.out.println("Кристина теперь получает "+KristinaNew+"руб");
        KristinaNew = KristinaNew*12-Kristina*12;
        System.out.println("Годовой доход Кристины вырос на "+KristinaNew+"руб");

    }
}



