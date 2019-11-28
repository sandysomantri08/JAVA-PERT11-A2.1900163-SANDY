/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;

/**
 *
 * @author sandy
 */
public class la10_membuatClassSendiri2 {
    public static void main( String[] args ){
    //membuat 3 object StudentRecord
    la10_membuatClassSendiri1 annaRecord = new la10_membuatClassSendiri1();
    la10_membuatClassSendiri1 beahRecord = new la10_membuatClassSendiri1();
    la10_membuatClassSendiri1 crisRecord = new la10_membuatClassSendiri1();
    //Memberi nama siswa
    annaRecord.setName("Anna");
    beahRecord.setName("Beah");
    crisRecord.setName("Cris");
    //Menampilkan nama siswa “Anna”
    System.out.println( annaRecord.getName() );
    //Menampilkan jumlah siswa
    System.out.println("Count="+la10_membuatClassSendiri1.getStudentCount()
    );
    }
}
