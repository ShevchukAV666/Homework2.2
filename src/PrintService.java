public class PrintService {

    public void printStudentGryffindor(Gryffindor student) {
        System.out.println("Студент Гриффендора - " + student.getFullName() +
                "; сила колдовстава - " + student.getWitchcraft() +
                "; расстояние трансгресии - " + student.getTransgress() +
                "; благородство - " + student.getNobility() +
                "; честь - " + student.getHonor() +
                "; храбрость - " + student.getBravery());
    }

    public void printStudentSlytherin(Slytherin student) {
        System.out.println("Студент  Слизарена - " + student.getFullName() +
                "; сила колдовстава - " + student.getWitchcraft() +
                "; расстояние трансгресии - " + student.getTransgress() +
                "; хитрость - " + student.getCunning() +
                "; решительность - " + student.getDetermination() +
                "; амбициозность - " + student.getAmbition() +
                "; находчивость - " + student.getResourcefulness() +
                "; жажда власти - " + student.getLustForPower());
    }

    public void printStudentRavenclaw(Ravenclaw student) {
        System.out.println("Студент  Когтеврана - " + student.getFullName() +
                "; сила колдовстава - " + student.getWitchcraft() +
                "; расстояние трансгресии - " + student.getTransgress() +
                "; мудрость - " + student.getWisdom() +
                "; остроумие - " + student.getWit() +
                "; творчество - " + student.getCreation());
    }

    public void printStudentHufflepuff(Hufflepuff student) {
        System.out.println("Студент  Пуффендуя - " + student.getFullName() +
                "; сила колдовстава - " + student.getWitchcraft() +
                "; расстояние трансгресии - " + student.getTransgress() +
                "; трудолюбие - " + student.getIndustriousness() +
                "; верность - " + student.getLoyalty() +
                "; честность - " + student.getHonesty());

    }
}

