import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void makeFormula() {
    }

    @Test
    public void solvetest1() {
        String formula= "3*71*61*78";
        assertEquals(Main.Solve(formula),"1013454");
    }

    @Test
    public void solvetest21() {
        String formula= "9-28-50";
        assertEquals(Main.Solve(formula),"9-28-50=-69");
    }

    @Test
    public void solvetest22() {
        String formula= "3-28-50";
        String expect=Main.Solve(formula);
        assertEquals(expect,"3-28-50=-75");
    }

    @Test
    public void solvetest23() {
        String formula= "3-2-50";
        String expect=Main.Solve(formula);
        assertEquals(expect,"3-2-50=-49");
    }

    @Test
    public void solvetest24() {
        String formula= "13-2-50";
        String expect=Main.Solve(formula);
        assertEquals(expect,"13-2-50=-39");
    }

    @Test
    public void solvetest4() {
        String formula= "10*10+80";
        assertEquals(Main.Solve(formula),"180");
    }
}