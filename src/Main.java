public class Main {
    public static void main(String[] args) {

               Gryffindor harry = new Gryffindor("Гарри Поттер", 10, 90, 100, 65, 55);
               Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 50, 70, 100, 70, 60);
               Gryffindor ron = new Gryffindor("Рон Уизли", 30, 60, 70, 50, 40);

               Slytherin draco = new Slytherin("Драко Малфой", 16, 17, 18, 19, 20, 21, 22);
               Slytherin grehem = new Slytherin("Грэхэм Монтегю", 14, 15, 16, 17, 18, 19, 20);
               Slytherin gregori = new Slytherin("Грегори Гойл", 15, 16, 17, 18, 19, 20, 21);

               Ravenclaw chjou = new Ravenclaw("Чжоу Чанг", 17, 18, 19, 20, 21);
               Ravenclaw padme = new Ravenclaw("Падма Патил", 18, 19, 20, 21, 22);
               Ravenclaw marcus = new Ravenclaw("Маркус Белби", 19, 20, 21, 22, 23);

               Hufflepuff zacharid = new Hufflepuff("Захария Смит", 20, 21, 22, 23, 24);
               Hufflepuff sedric = new Hufflepuff("Седрик Диггори", 21, 22, 23, 24, 25);
               Hufflepuff djastin = new Hufflepuff("Джастин Финч-Флетчли", 22, 23, 24, 25, 26);


        System.out.println();
        PrintService printStudent = new PrintService();

        printStudent.printStudentGryffindor(harry);
        System.out.println();
        printStudent.printStudentSlytherin(grehem);
        System.out.println();
        printStudent.printStudentRavenclaw(padme);
        System.out.println();
        printStudent.printStudentHufflepuff(djastin);
        System.out.println();

        harry.compareStudentGryffindor(germiona); //сравнение учеников гриффиндора
        System.out.println();
        draco.compareStudentSlytherin(gregori); //сравнение учеников слизерина
        System.out.println();
        padme.compareStudentRavenclaw(marcus); // сравнение учеников когтеврана
        System.out.println();
        zacharid.compareStudentHufflepuff(sedric); // сравнение учеников пуффендуя
        System.out.println();
        harry.comparisonStudentsHogwarts(draco); // сравнение учеников разных факультетов

    }
}