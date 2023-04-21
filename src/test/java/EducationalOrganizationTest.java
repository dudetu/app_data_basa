import org.app.EducationalOrganization;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class EducationalOrganizationTest {

    @Test
    public void testCanVisitOrganization() {
        EducationalOrganization org = new EducationalOrganization("Example School"  , 18, 20);

        // проверяем, что пользователь в возрасте 20 лет может посетить данную организацию
        assertTrue(org.canVisit(20));

        // проверяем, что пользователь в возрасте 17 лет не может посетить данную организацию
        assertFalse(org.canVisit(17));

        // проверяем, что пользователь в возрасте 66 лет не может посетить данную организацию
        assertFalse(org.canVisit(66));
    }
}

