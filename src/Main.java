public class Main {
    public static void main(String[] args) {

        System.out.println("\n Первое задание:");
       task1();
        System.out.println("\n Второе задание:");
       task2();
        System.out.println("\n Третье задание:");
       task3();
        System.out.println("\n Четвертое задание:");
       task4();
        System.out.println("\n Пятое задание:");
       task5();
        System.out.println("\n Шестое задание:");
       task6();
        System.out.println("\n Седьмое задание:");
       task7();
        System.out.println("\n Восьмое задание:");
       task8();

    }
    public static void task1() {

        byte b=1;
        short s= 1;
        int i= 1;
        long l= 1L;
        float f= 1f;
        double d= 1;
        char ch= 'c';
        boolean boo= true;
        System.out.println("Переменные объявлены");
    }
    public static void task2() {

        float weightBoxer1= 78.2f;
        float weightBoxer2= 82.7f;
        float sumWeight= weightBoxer1+weightBoxer2;
        float deltaWeight= Math.abs(weightBoxer1-weightBoxer2);
        System.out.println("Общий вес боксёров: "+sumWeight+" кг");
        System.out.println("Разница веса боксёров: "+deltaWeight+" кг");

    }
    public static void task3() {
        byte bananas=5;
        byte oneBananaWeight=80;
        short milk=200;
        short milkPakage= (short) (milk/100);
        byte milk100Weight=105;
        byte iceCream=2;
        byte oneIceCreamWeight=100;
        byte egg=4;
        byte oneEggWeight=70;

        float cocktail= (bananas*oneBananaWeight+milkPakage*milk100Weight+iceCream*oneIceCreamWeight+egg*oneEggWeight)/1000f;

        System.out.println("Вес спорт завтрака: "+cocktail+" кг");

    }
    public static void task4() {

        byte targetWeight=7;
        short targetWeightGrams= (short) (targetWeight*1000);
        short deltaDay1=250;
        short deltaDay2=500;
        short deltaMiddle= (short) ((deltaDay1+deltaDay2)/2);
        short way1= (short) (targetWeightGrams/deltaDay1);
        short way2= (short) (targetWeightGrams/deltaDay2);
        float way3= targetWeightGrams*1.0f/deltaMiddle;
        short way4= (short) ((way1+way2)/2);
        System.out.println("Первый способ "+way1+" д.");
        System.out.println("Второй способ "+way2+" д.");
        System.out.println("Третий способ "+way3+" д.");// не могу точно понять условие задачи и какой из способов взять как среднее
        System.out.println("Четвертый способ "+way4+" д.");// не могу точно понять условие задачи и какой из способов взять как среднее
    }
    public static void task5() {

        int mashaDefault= 67760;
        int denisDefault= 83690;
        int krisDefault= 76230;

        float mashaUp=mashaDefault*0.1f+mashaDefault;
        float denisUp=denisDefault*0.1f+denisDefault;
        float krisUp=krisDefault*0.1f+krisDefault;

        System.out.println("Маша теперь получает "+mashaUp+" руб."+" Годовой доход вырос на "+mashaDefault*0.1f*12+" руб.");
        System.out.println("Денис теперь получает "+denisUp+" руб."+" Годовой доход вырос на "+denisDefault*0.1f*12+" руб.");
        System.out.println("Кристина теперь получает "+krisUp+" руб."+" Годовой доход вырос на "+krisDefault*0.1f*12+" руб.");
    }
    public static void task6() {

       byte a= 12, b= 27, c= 44, d= 15, e= 9;
       short result= (short) (a*(b+(c-d*e)));
       result= (short) Math.negateExact(result);
       System.out.println(result);
    }
    public static void task7() {

        byte a= 5, b= 7;
        a= (byte) (a+b);
        b= (byte) (a-b);
        a= (byte) (a-b);
        System.out.println("a= "+a+" b= "+b);
    }
    public static void task8(){

        short a= 666;
        short b= (short) ((a-(a/100)*100)/10);
        System.out.println("число: "+a+" вторая цифра числа: "+b);
    }
}