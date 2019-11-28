/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;

/**
 *
 * @author sandy
 */
public class la10_membuatClassSendiri4 {
    public static void main(String[] args) {
        //membuat 3 object StudentRecord
        la10_membuatClassSendiri3 annaRecord = new la10_membuatClassSendiri3();
        la10_membuatClassSendiri3 beahRecord = new la10_membuatClassSendiri3();
        la10_membuatClassSendiri3 crisRecord = new la10_membuatClassSendiri3();
        //versi baru
        la10_membuatClassSendiri3 recordAnna = new la10_membuatClassSendiri3("Candra");
        la10_membuatClassSendiri3 recordBeah = new la10_membuatClassSendiri3("Bagus",
        "Malang");
        la10_membuatClassSendiri3 recordCris = new la10_membuatClassSendiri3(80,90,100);
        //memberi nama siswa
        annaRecord.setName("Anna");
        beahRecord.setName("Beah");
        crisRecord.setName("Cris");
        //menampilkan nama siswa "Anna"
        System.out.println(annaRecord.getName());
        //menampilkan jumlah siswa
        System.out.println("Count="+la10_membuatClassSendiri3.getStudentRecord());
        la10_membuatClassSendiri3 anna2Record = new la10_membuatClassSendiri3();
        anna2Record.setName("Anna");
        anna2Record.setAddress("Philipina");
        anna2Record.setAge(15);
        anna2Record.setMathGrade(80);
        anna2Record.setEnglishGrade(95.5);
        anna2Record.setScienceGrade(100);
        //overload method
        anna2Record.print(anna2Record.getName());
        anna2Record.print(anna2Record.getEnglishGrade(),
        anna2Record.getMathGrade(),
        anna2Record.getScienceGrade());
        recordAnna.print(recordAnna.getName());
    }
}