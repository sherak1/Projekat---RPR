package ba.unsa.etf.rpr.domain;



import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTest {

    private Student student = new Student();

    /**
     * Test which tests Student class getter for attribute firstName
     */
    @Test
    void getFirstName() {
        assertEquals("Student", student.getFirst_name());
    }

    /**
     * Test which tests Student class getter for attribute lastName
     */
    @Test
    void getLastName() {
        assertEquals("Student", student.getLast_name());
    }
    /**
     * Test which tests Student class getter for attribute index_number
     */
    @Test
    void getIndex_number() {
        assertEquals("18957", student.getIndex_number());
    }

    /**
     * Test which tests Student class method toString
     */
    @Test
    void toStringTest() {
        String s = "First name: " + student.getFirst_name() + "\nLast name: " + student.getLast_name() + "\nIndex: " + student.getIndex_number() + "\nAddress: " + student.getAddress();
        assertEquals(s, student.toString());
    }
}





