public class Ravenclaw extends Hogwarts {

    public int wisdom; //мудрость
    public int wit; //остроумие
    public int creation; //творчество

    public Ravenclaw(String fullName, int witchcraft, int transgress, int wisdom, int wit, int creation) {
        super(fullName, witchcraft, transgress);

        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public void compareStudentRavenclaw(Ravenclaw student) {

        int thisStudent = this.wisdom + this.wit + this.creation;
        int secondStudent = student.wisdom + student.wit + student.creation;;

        if (thisStudent > secondStudent) {
            System.out.println(this.getFullName() + " является более сильным студентом Когтеврана, чем " + student.getFullName());
        } else if (thisStudent == secondStudent) {
            System.out.println("силы стедентов равны");
        } else {
            System.out.println(student.getFullName() + " является более сильным студентом Когтеврана, чем  " + this.getFullName());

        }
    }
}
