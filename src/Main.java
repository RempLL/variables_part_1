public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog+" "+cat+" "+paper);
        System.out.println();

        System.out.println("Задача 2:");
        dog+=4;
        cat+=4;
        paper+=4;
        System.out.println(dog+" "+cat+" "+paper);
        System.out.println();

        System.out.println("Задача 3:");
        dog-=3.5;
        cat-=1.6;
        paper-=7639;
        System.out.println(dog+" "+cat+" "+paper);
        System.out.println();

        System.out.println("Задача 4:");
        var friend = 19;
        System.out.print(friend+" ");
        friend+=2;
        System.out.print(friend+" ");
        friend/=7;
        System.out.println(friend);
        System.out.println();

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.print(frog+" ");
        frog*=10;
        System.out.print(frog+" ");
        frog/=3.5;
        System.out.print(frog+" ");
        frog+=4;
        System.out.println(frog);
        System.out.println();

        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println("Общий вес двух бойцов: "+(firstBoxer+secondBoxer));
        System.out.println("Разница между весами бойцов: "+(Math.abs(firstBoxer-secondBoxer)));
        System.out.println();

        System.out.println("Задача 7");
        System.out.println("Вычитание из большего веса меньшего: "+(secondBoxer-firstBoxer));
        System.out.println("С помощь функции остаток от деления: "+(secondBoxer%firstBoxer));
        System.out.println();

        System.out.println("Задача 8");
        var time = 640;
        var timePerson = 8;
        System.out.println("Всего работников в компании: "+(time/timePerson));
        var morePersons = 94;
        System.out.println("Если в компании работает "+((time/timePerson)+morePersons)+" человека, то всего "+
                (((time/timePerson)+morePersons)*8)+" часов работы может быть поделено между сотрудниками.");
    }
}