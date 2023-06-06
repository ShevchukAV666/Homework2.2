public class Hufflepuff extends Hogwarts {

    int industriousness;  //трудолюбие
    int loyalty; //верность
    int honesty; //честность

    public Hufflepuff(String fullName, int witchcraft, int transgress, int industriousness, int loyalty, int honesty) {
        super(fullName, witchcraft, transgress);

        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void compareStudentHufflepuff(Hufflepuff student) {

        int thisStudent = this.industriousness + this.loyalty + this.honesty;
        int secondStudent = student.industriousness + student.loyalty + student.honesty;;

        if (thisStudent > secondStudent) {
            System.out.println(this.getFullName() + " является более сильным студентом Пуффендуя, чем " + student.getFullName());
        } else if (thisStudent == secondStudent) {
            System.out.println("силы стедентов равны");
        } else {
            System.out.println(student.getFullName() + " является более сильным студентом Пуффендуя, чем  " + this.getFullName());

        }
    }
}
