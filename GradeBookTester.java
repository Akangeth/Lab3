import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook grade1;
	GradeBook grade2;
	
	@BeforeEach
	public void setUp() throws Exception {
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		grade1.addScore(93.0);
		grade1.addScore(86.0);
		grade2.addScore(53.0);
		grade2.addScore(16.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		grade1 = null;
		grade2 = null;
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, grade1.getScoreSize());
		assertEquals(2, grade2.getScoreSize());
	}

	@Test
	void testAddScore() {
		assertTrue(grade1.toString().equals("93.0 86.0 "));
		assertEquals(2, grade1.getScoreSize());
		assertTrue(grade2.toString().equals("53.0 16.0 "));
		assertEquals(2, grade2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(179.0, grade1.sum());
		assertEquals(69.0, grade2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(86.0, grade1.minimum());
		assertEquals(16.0, grade2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(93.0, grade1.finalScore());
		assertEquals(53.0, grade2.finalScore());
	}

	@Test
	void testToString() {
		assertTrue(grade1.toString().equals("93.0 86.0 "));
		assertTrue(grade2.toString().equals("53.0 16.0 "));
	}

}
