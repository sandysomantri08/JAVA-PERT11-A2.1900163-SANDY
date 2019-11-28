/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;

/**
 *
 * @author sandy
 */
public class la10_membuatClassSendiri1 {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    /**
    * Menghasilkan nama dari Siswa
    */
    public String getName(){
        return name;
    }
    /**
    * Mengubah nama siswa
    */
    public void setName( String temp ){
        name = temp;
    }
    // area penulisan kode lain\
    /**
    * Menghitung rata – rata nilai Matematik, Bahasa Inggris, * * Ilmu
    Pasti
    */
    public double getAverage(){
        double result = 0;
        result = ( mathGrade+englishGrade+scienceGrade )/3;
        return result;
    }
    /**
    * Menghasilkan jumlah instance StudentRecord
    */
    public static int getStudentCount(){
        return studentCount;
    }
}