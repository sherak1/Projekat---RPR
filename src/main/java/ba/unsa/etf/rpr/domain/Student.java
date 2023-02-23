package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Student implements Idable {
    /**
     * Attributes for class Student
     */
    private int id;
    private String first_name;
    private String last_name;
    private String index_number;
    private String address;

    /**
     * Constructor with all parameters
     * @param id
     * @param first_name
     * @param last_name
     * @param index_number
     * @param address
     */
    public Student(int id, String first_name, String last_name, String index_number, String address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.index_number = index_number;
        this.address = address;
    }

    /**
     * Constructor without parameters
     */
    public Student() {
    }
    /**
     * Getters for attributes
     * @return
     */
    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getIndex_number() {
        return index_number;
    }

    public String getAddress() {
        return address;
    }
    /**
     * Setters for attributes
     * @return
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setIndex_number(String index_number) {
        this.index_number = index_number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setId(int id) {
    this.id=id;
    }

    @Override
    public int getId() {
        return id;
    }


    /**
     * Method for comparing attributes by id, first_name, last_name, index_number, and address
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        Student student = (Student) obj;
        if (obj == null || getClass() != obj.getClass()) return false;
        return id == student.id && Objects.equals(first_name, student.first_name) &&
                Objects.equals(last_name, student.last_name) &&
                Objects.equals(index_number, student.index_number) &&
                Objects.equals(address, student.address);
    }

    /**
     * Method for hashing attributes of Student class
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, index_number, address);
    }

    /**
     * Method for printing values of Student class attributes
     * @return
     */
    @Override
    public String toString() {
        return "First name: " + this.first_name + "\nLast name: " + this.last_name + "\nAddress: " + this.address + "\nIndex number: " + this.index_number;
    }





}
