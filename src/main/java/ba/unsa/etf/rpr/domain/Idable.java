
package ba.unsa.etf.rpr.domain;

/**
 * Interface that forces all POJO beans to have ID field.
 */
public interface Idable {

    /**
     * Setter for Id
     * @param id
     */
    void setId(int id);

    /**
     * Getter for Id
     * @return
     */
    int getId();
}