/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;

/**
 *
 * @author sandy
 */
public abstract class la11_PewarisanpolyNInter3 {
    public void breath(){
        System.out.println("Living Thing breathing..."); 
    }
    public void eat(){
        System.out.println("Living Thing eating...");
    }
/**
* abstract method walk
* Kita ingin method ini di-overridden oleh subclasses
*/
public abstract void walk();
}

public class Human extends la11_PewarisanpolyNInter3{
    @Override
    public void walk(){
        System.out.println("Human walks...");
    }
}
