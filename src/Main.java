
public class Main {
    public static void main(String[] args) {
    //Задача 1
       var dog = 8.0;
       var cat = 3.6;
       var paper = 763789;
       System.out.println("Результат задачи 1 = " + dog);
       System.out.println("Результат задачи 1 = " + cat);
       System.out.println("Результат задачи 1 = " + paper);

       System.out.println();

    //Задача 2
        dog = dog + 2;
        System.out.println("Результат задачи 2 = " + dog);
        cat = cat + 2;
        System.out.println("Результат задачи 2 = " + cat);
        paper = paper + 2;
        System.out.println("Результат задачи 2 = " + paper);

        System.out.println();

    //Задача 3
        dog = dog - 3.5;
        System.out.println("Результат задачи 3 = " + dog);
        cat = cat - 1.6;
        System.out.println("Результат задачи 3 = " + cat);
        paper = paper - 7639;
        System.out.println("Результат задачи 3 = " + paper);

        System.out.println();

    //Задача 4
        var friend = 19;
        System.out.println("Результат задачи 4 = " + friend);
        friend = friend + 2;
        System.out.println("Результат задачи 4 = " + friend);
        friend = friend / 7;
        System.out.println("Результат задачи 4 = " + friend);
        //System.out.println((friend + 2) / 7 );

        System.out.println();

    //Задача 5
        var frog = 3.5;
        System.out.println("Результат задачи 5 = " + frog);
        frog = frog * 10;
        System.out.println("Результат задачи 5 = " + frog);
        frog = frog / 3.5;
        System.out.println("Результат задачи 5 = " + frog);
        frog = frog + 4;
        System.out.println("Результат задачи 5 = " + frog);

        System.out.println();

    //Задача 6
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var totalWeight = oneBoxer + twoBoxer;
        System.out.println("Общая масса двух боксеров = " + totalWeight);

        if (oneBoxer > twoBoxer) {
            var differenceWeight = oneBoxer - twoBoxer;
            System.out.println("Первый боксер весит на " + differenceWeight + " кг больше, чем второй");
        }
        else {
            var differenceWeight = twoBoxer - oneBoxer;
            System.out.println("Второй боксер весит на " + differenceWeight + "кг больше, чем первый");
        }

        System.out.println();

    //Задача 7
        var differenceWeight = oneBoxer - twoBoxer;
        System.out.println("Результат задачи 7 = " + differenceWeight);
        differenceWeight = twoBoxer % oneBoxer;
        System.out.println("Результат задачи 7 = " + differenceWeight);

        System.out.println();

    //Задача 8
        var totalHours = 640;
        var peopleHours = 8;
        var totalPeople = totalHours / peopleHours;
        System.out.println("Всего работников в компании — " + totalPeople +  " человек.");

        //System.out.println("Всего работников в компании — " + (640 / 8) +  " человек».");
        //System.out.println(640 / 8 + 94);

        totalPeople = totalPeople + 94;
        totalHours = totalHours / totalPeople;

        System.out.println("Если в компании работает " + totalPeople + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками.");
    }
}
