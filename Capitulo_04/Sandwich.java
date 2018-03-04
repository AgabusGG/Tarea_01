
package Capitulo_04;
public class Sandwich {
    private Bread bread;
    private SandwichFilling  filling;
    
    public Sandwich(String b, Integer bc, String fill, Integer fcal){
        this.bread= new Bread(b,bc);
        this.filling=new SandwichFilling (fill,fcal);
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public SandwichFilling getFilling() {
        return filling;
    }

    public void setFilling(SandwichFilling filling) {
        this.filling = filling;
    }
    
}
