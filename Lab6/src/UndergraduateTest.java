import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UndergraduateTest {

    @Test
    public void testClone() {
        Undergraduate othr = new Undergraduate("othr");
        othr.addScore(5);
        othr.addScore(4);
        Undergraduate copy = othr.clone();
        // make sure they don't have the same memory location
        assertNotSame("two objects are the same", othr, copy);
        for (int i = 0; i < 2; i++) {
            // make sure they have the same value
            assertEquals("Element is not the same as copy",
                    othr.scores.get(i), copy.scores.get(i));
            // make sure they have different memory locations
            assertSame("Two objects are the same", othr.scores.get(i),
                    copy.scores.get(i));
        }
    }

    @Test
    public void testCompareTo() {
        Undergraduate o1 = new Undergraduate("Ryan");
        o1.addScore(90);
        Undergraduate o2 = new Undergraduate("Ryan");
        o2.addScore(80);
        Undergraduate o3 = new Undergraduate("nayR");
        o3.addScore(90);
        assertTrue("comparing object names", o1.name.equals(o2.name));
        assertTrue("using compareTo will get -1", o1.compareTo(o2) < 0);
        assertTrue("using compareTo will get 1", o2.compareTo(o1) > 0);
        assertTrue("when both have same value", o1.compareTo(o3) == 0);
    }

    @Test
    public void testGetLetterGrade() {
        Undergraduate o1 = new Undergraduate("a");
        o1.addScore(95);
        assertTrue("letter grade should be A", o1.getLetterGrade() == 'A');
        Undergraduate o2 = new Undergraduate("b");
        o2.addScore(85);
        assertTrue("Letter grade should be B", o2.getLetterGrade() == 'B');
        Undergraduate o3 = new Undergraduate("c");
        o3.addScore(75);
        assertTrue("Letter grade should be B", o3.getLetterGrade() == 'C');
        Undergraduate o4 = new Undergraduate("d");
        o4.addScore(65);
        assertTrue("Letter grade should be B", o4.getLetterGrade() == 'D');
        Undergraduate o5 = new Undergraduate("f");
        o5.addScore(55);
        assertTrue("Letter grade should be B", o5.getLetterGrade() == 'F');
    }

    @Test
    public void testAddScore() {
        Undergraduate o1 = new Undergraduate("o1");
        o1.addScore(30);
        o1.addScore(20);
        o1.addScore(10);
        assertFalse("Testing with invalid score", o1.getAverageScore() == 10);
        assertTrue("Testing with correct score", o1.getAverageScore() == 20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        Undergraduate o1 = new Undergraduate("Ryan");
        o1.addScore(200);
    }

    @Test
    public void testEquals() {
        Undergraduate a1 = new Undergraduate("Ryan");
        a1.addScore(65);
        Undergraduate a2 = new Undergraduate("Ryan");
        a2.addScore(65);
        Undergraduate a3 = new Undergraduate("Bob");
        a3.addScore(56);
        Undergraduate a4 = null;
        assertTrue("Undergraduats are equal", a1.equals(a2));
        assertFalse("Undergraduats are equal", a1.equals(a3));
        assertFalse("Null returns false", a1.equals(a4));
        a2.addScore(78);
        assertFalse("Different scoress sizes does not return false",
                a1.equals(a2));
        a1.addScore(77);
        assertFalse("Differnt score values does not return false",
                a1.equals(a2));
    }

}
