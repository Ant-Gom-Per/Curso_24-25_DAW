/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package comparables;

/**
 *
 * @author jrmd
 */
public interface FormaComparable extends Forma, Comparable<FormaComparable>{

    /**
     *
     * @param altre
     * @return
     */
    @Override
    default public int compareTo(FormaComparable altre) {
        if (this.getArea() > altre.getArea())
            return 1;
        else if (this.getArea() < altre.getArea()) {
            return -1;
        }
        
        return 0;
    }
    
}
