import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    //maven dependency skal addes fordi vi ikke har spring boot her
    //når der kommer rød streg under så højreklik og tryk add maven dependency
    @Test
    public void testName(){
        Student student = new Student();
        student.setName("he");
        assertEquals(true, student.getName().length()>2);
    }
}