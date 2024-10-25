import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // Этот метод будет выполнен один раз перед запуском всех тестов
        System.out.println("Starting tests...");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        // Этот метод будет выполнен один раз после выполнения всех тестов
        System.out.println("Tests finished.");
    }

    @Test
    public void testIsTeenagerWhenAgeIs13() {
        int ageTeen = 13;
        int ageKid = 8;
        int ageAdult = 27;
        boolean resultTeen = (ageTeen <= 19 && ageTeen >= 13) == Person.isTeenager(ageTeen);
        boolean resultKid = (ageKid <= 19 && ageKid >= 13) == Person.isTeenager(ageKid);
        boolean resultAdult = (ageAdult <= 19 && ageAdult >= 13) == Person.isTeenager(ageAdult);
        assertEquals(true, resultTeen);
        assertEquals(false, resultKid);
        assertEquals(false, resultAdult);

    }
}

