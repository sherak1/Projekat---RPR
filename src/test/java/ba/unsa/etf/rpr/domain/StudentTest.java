package ba.unsa.etf.rpr.domain;



import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class CriminalTest {

    private Student student = new Student();

    /**
     * Test which tests Student class getter for attribute firstName
     */
    @Test
    void getFirstName() {
        assertEquals("Student", student.getFirst_name()));
    }

    /**
     * Test which tests Student class getter for attribute lastName
     */
    @Test
    void getLastName() {
        assertEquals("Student", student.getLast_name());
    }

}

