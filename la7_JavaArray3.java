/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;

/**
 *
 * @author sandy
 */
public class la7_JavaArray3 {
    public static void main( String[] args ){
        // Elemen 512 x 128 dari integer array
        int[][] twoD = new int[512][128];
        // karakter array 8 x 16 x 24
        char[][][] threeD = new char[8][16][24];
        // String array 4 baris x 2 kolom
        String[][] dogs = {
            { "terry", "brown" },
            {"Kristin", "white" },
            {"toby", "gray"},
            {"fido", "black"}
        };
        System.out.print( dogs[0][0] );
    }
}
