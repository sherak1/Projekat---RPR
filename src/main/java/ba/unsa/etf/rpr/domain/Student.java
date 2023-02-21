package ba.unsa.etf.rpr.domain;

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

    @Override
    public void setId(int id) {

    }

    @Override
    public int getId() {
        return 0;
    }
}
