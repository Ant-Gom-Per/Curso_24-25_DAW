/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ordenableporcompareto;

public interface Orderable extends Comparable{
    default boolean lessThan(Object that){
        return this.compareTo(that) < 0;
    }

    default boolean lessThanOrEqual(Object that) {
        return this.compareTo(that) <= 0;
    }

    default boolean greaterThan(Object that) {
        return this.compareTo(that) > 0;
    }

    default boolean greaterThanOrEqual(Object that) {
        return this.compareTo(that) >= 0;
    }
}
