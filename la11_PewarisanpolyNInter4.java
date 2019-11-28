/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;

/**
 *
 * @author sandy
 */
public class la11_PewarisanpolyNInter4 implements Relation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    public la11_PewarisanpolyNInter4(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double getLength(){
        double length = Math.sqrt((x2-x1)*(x2-x1) +
        (y2-y1)* (y2-y1));
        return length;
    }
    public boolean isGreater( Object a, Object b){
        double aLen = ((la11_PewarisanpolyNInter4)a).getLength();
        double bLen = ((la11_PewarisanpolyNInter4)b).getLength();
        return (aLen > bLen);
    }
    public boolean isLess( Object a, Object b){
        double aLen = ((la11_PewarisanpolyNInter4)a).getLength();
        double bLen = ((la11_PewarisanpolyNInter4)b).getLength();
        return (aLen < bLen);
    }
    public boolean isEqual( Object a, Object b){
        double aLen = ((la11_PewarisanpolyNInter4)a).getLength();
        double bLen = ((la11_PewarisanpolyNInter4)b).getLength();
        return (aLen == bLen);
    }
}
