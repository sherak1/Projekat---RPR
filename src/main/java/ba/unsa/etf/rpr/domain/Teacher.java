package ba.unsa.etf.rpr.domain;

public class Teacher implements Idable {
    /**
     * Atributes
     */
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String username;
    private String password;

    /**
     * Constructor with all parameters
     * @param id
     * @param first_name
     * @param last_name
     * @param email
     * @param username
     * @param password
     */


    public Teacher(int id, String first_name, String last_name, String email, String username, String password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    /**
     * Constructor without parameters
     */
    public Teacher() {
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public int getId() {
        return 0;
    }
}


