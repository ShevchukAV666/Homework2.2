public class Slytherin extends Hogwarts {

    public int cunning; ///Хитрость
    public int determination; //Решительность
    public int ambition; // Амбициозность
    public int resourcefulness; // Находчивость
    public int lustForPower; // жажда власти

    public Slytherin(String fullName, int witchcraft, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, witchcraft, transgress);

        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public void compareStudentSlytherin(Slytherin student) {

        int thisStudent = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int secondStudent = student.cunning + student.determination + student.ambition + student.resourcefulness + student.lustForPower;;

        if (thisStudent > secondStudent) {
            System.out.println(this.getFullName() + " является более сильным студентом Слизарена, чем " + student.getFullName());
        } else if (thisStudent == secondStudent) {
            System.out.println("силы стедентов равны");
        } else {
            System.out.println(student.getFullName() + " является более сильным студентом Слизарена, чем  " + this.getFullName());

        }
    }
}

