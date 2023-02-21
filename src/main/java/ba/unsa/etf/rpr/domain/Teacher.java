package ba.unsa.etf.rpr.domain;

import java.util.Objects;

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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public int getId() {
        return 0;
    }

    /**
     * Method for comparing Teacher by id, first_name, last_name, username and email
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        Teacher teacher = (Teacher) obj;
        if (obj == null || getClass() != obj.getClass()) return false;
        return id == teacher.id && Objects.equals(first_name, teacher.first_name) &&
                Objects.equals(last_name, teacher.last_name) &&
                Objects.equals(username, teacher.username) &&
                Objects.equals(email, teacher.email);
    }

    /**
     * Method for hashing attributes of employee class
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, username, email);
    }

    /**
     * Method for printing values of Employee class attributes
     * @return
     */
    @Override
    public String toString() {
        return "First name: " + first_name + "\nLast name: " + last_name + "\nEmail: " + email + "\nUsername: " + username + "\nPassword: " + password;
    }



}


