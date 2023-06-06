public class Gryffindor extends Hogwarts {

    int nobility; //благородство
    int honor; //честь
    int bravery; //храбрость

    public Gryffindor(String fullName, int witchcraft, int transgress, int nobility, int honor, int bravery) {
        super(fullName, witchcraft, transgress);

        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compareStudentGryffindor(Gryffindor student) {

        int thisStudent = this.nobility + this.honor + this.bravery;
        int secondStudent = student.nobility + student.honor + student.bravery;

        if (thisStudent > secondStudent) {
            System.out.println(this.getFullName() + " является более сильным студентом Гриффиндора, чем " + student.getFullName());
        } else if (thisStudent == secondStudent) {
            System.out.println("силы стедентов равны");
        } else {
            System.out.println(student.getFullName() + " является более сильным студентом Гриффиндора, чем  " + this.getFullName());

        }
    }

}

