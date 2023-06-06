public class Hogwarts {

    private String fullName; //полное имя студента
    private int witchcraft; //сила колдовства
    private int transgress; //расстояние трансгресии


    public Hogwarts (String fullName, int witchcraft, int transgress) {
    this.fullName = fullName;
    this.witchcraft = witchcraft;
    this.transgress = transgress;
}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public void comparisonStudentsHogwarts (Hogwarts student) {
        int thisStudent = this.witchcraft + this.transgress;
        int secondStudent = student.witchcraft + student.transgress;

        if (thisStudent > secondStudent) {
            System.out.println(this.getFullName() + " сильнее, чем " + student.getFullName());
        } else if (thisStudent == secondStudent) {
            System.out.println("Силы студентов равны");
        } else {
            System.out.println(student.getFullName() + " сильнее, чем " + this.getFullName());

        }
    }
}


