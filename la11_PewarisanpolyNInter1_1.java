/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;

/**
 *
 * @author sandy
 */
public class la11_PewarisanpolyNInter1_1 {
    protected String name;
    protected String address;
    /**
    * Default constructor
    */
    public la11_PewarisanpolyNInter1_1(){
        System.out.println("Inside Person:Constructor");
        name = "";
        address = "";
    }
    /**
    * Constructor dengan dua parameter
    */
    public la11_PewarisanpolyNInter1_1( String name, String address) {
        this.name = name;
        this.address = address;
    }
    /**
    * Method accessor
    */
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String add) {
        this.address = add;
    }
}
