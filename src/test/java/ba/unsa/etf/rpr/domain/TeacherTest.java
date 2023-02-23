package ba.unsa.etf.rpr.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for domain class Teacher
 */
public class TeacherTest {
    /**
     * Attribute new Teacher
     */
    private Teacher teacher = new Teacher();
    @BeforeEach
    public void setTeacher() {
        teacher.setId(1);
        teacher.setFirst_name("Sanina");
        teacher.setLast_name("Herak");
        teacher.setUsername("sherak1");
        teacher.setEmail("sherak1@etf.unsa.ba");
        teacher.setPassword("sanina-123");
    }
    @Test
    void getFirst_name() {
        assertEquals("Sanina", teacher.getFirst_name());
    }

    @Test
    void getLast_name() {
        assertEquals("Herak", teacher.getLast_name());
    }

    @Test
    void getUsername() {
        assertEquals("sherak1", teacher.getUsername());
    }

    @Test
    void getEmail() {
        assertEquals("sherak1@etf.unsa.ba", teacher.getEmail());
    }

    @Test
    void getPassword() {
        assertEquals("sanina-123", teacher.getPassword());
    }
}

