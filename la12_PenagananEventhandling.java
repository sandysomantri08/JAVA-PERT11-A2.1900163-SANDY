/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;

/**
 *
 * @author sandy
 */
public class la12_PenagananEventhandling {
    public static void main( String[] args ){
        try{
            System.out.println( args[1] );
        }catch( ArrayIndexOutOfBoundsException exp ){
            System.out.println("Exception caught!");
        } 
    }
}
