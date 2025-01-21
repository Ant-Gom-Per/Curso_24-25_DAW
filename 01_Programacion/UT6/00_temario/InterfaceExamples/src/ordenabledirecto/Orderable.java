/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ordenabledirecto;

public interface Orderable {

    boolean lessThan(Object that);

    default boolean lessThanOrEqual(Object that) {
        return lessThan(that) || this.equals(that);
    }

    default boolean greaterThan(Object that) {
        return !lessThanOrEqual(that);
    }

    default boolean greaterThanOrEqual(Object that) {
        return !lessThan(that);
    }
}
