package cmsc204_week1J;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTest {

	public Gradebook gb1;
	public Gradebook gb2;
	
	@BeforeEach
	public void setUp() {
		
		gb1 = new Gradebook(5);
		gb2 = new Gradebook(5);
		
		gb1.addScore(88);
		gb1.addScore(90);
		gb1.addScore(75);
		gb1.addScore(78);
		gb1.addScore(68);
		
		gb2.addScore(54);
		gb2.addScore(61);
		gb2.addScore(70);
	}
	
	@AfterEach
	public void tearDown() {
		
		gb1 = null;
		gb2 = null;
	}
	
	@Test
	public void addScoreTest() {
		
		assertTrue(gb1.toString().equals("88.0 90.0 75.0 78.0 68.0"));
		assertEquals(5, gb1.getScoreSize());
		
		assertTrue(gb2.toString().equals("54.0 61.0 70.0"));
		assertEquals(3, gb2.getScoreSize());
	}
	
	@Test
	public void sumTest() {
		
		assertEquals(399, gb1.sum());
		
		assertEquals(185, gb2.sum());
	}

	@Test
	public void minimumTest() {
		
		assertEquals(68, gb1.minimum());
		
		assertEquals(54, gb2.minimum());
	}
	
	@Test
	public void finalScoreTest() {
		
		assertEquals((331), gb1.finalScore());
		
		assertEquals((131), gb2.finalScore());
	}
	
}
