import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringDistanceTester {

    StringDistance sd;

    @Before
    public void setUp() {
        sd = new StringDistance();
    }

    @Test
    public void test1() {
        assertEquals(1, sd.hamming("ACGT", "ACGA"));
    }

    @Test
    public void test2() {
        assertEquals(0, sd.hamming("ACGT", "ACGT"));
    }

    @Test
    public void test3() {
        assertEquals(4, sd.hamming("AAAA", "TTTT"));
    }

    @Test
    public void test4() {
        assertEquals(-1, sd.hamming("ACGT", "ACGTA"));
    }

    @Test
    public void test5() {
        assertEquals(0, sd.hamming("", ""));
    }

    @Test
    public void test6() {
        assertEquals(1, sd.hamming("A", "T"));
    }

    /*
    @Test
    public void test7() {
    }

    @Test
    public void test8() {
    }
    */
}