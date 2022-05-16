package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import gc.classroom.VHS;
import gc.classroom.Movie;

class VHSTest {

	@Test
	void vhsInstanceOfMovie() {
		VHS actualVHS = new VHS("Amazing Movie Title", 60, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2")));
		assertTrue(actualVHS instanceof Movie);
	}
	
	@Test
	void vhsObjectCorrectTitle() {
		VHS testVHS = new VHS("Amazing Movie Title", 60, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2")));
		String actualTitle = testVHS.getTitle();
		assertEquals("Amazing Movie Title", actualTitle);		
	}
	
	@Test
	void vhsObjectCorrectRunTime() {
		VHS testVHS = new VHS("Amazing Movie Title", 60, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2")));
		int actualRunTime = testVHS.getRunTime();
		assertEquals(60, actualRunTime);		
	}
	
	@Test
	void vhsCorrectCurrentTime() {
		VHS testVHS = new VHS("Amazing Movie Title", 60, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2")));
		int actualCurrentTime = testVHS.getCurrentTime();
		assertEquals(0, actualCurrentTime);		
	}

	@Test
	void vhsCorrectTimeIncrementAfterPlay() {
		VHS testVHS = new VHS("Amazing Movie Title", 60, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2")));
		testVHS.play();
		int actualTimeAfterPlay = testVHS.getCurrentTime();
		assertEquals(1, actualTimeAfterPlay);		
	}
	
	@Test
	void vhsRewinds() {
		VHS testVHS = new VHS("Amazing Movie Title", 60, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2")));
		testVHS.setCurrentTime(1);
		testVHS.rewind();
		int actualTimeAfterPlay = testVHS.getCurrentTime();
		assertEquals(0, actualTimeAfterPlay);		
	}
	
	@Test
	void vhsRewindsAfterPlayingLastScene() {
		VHS testVHS = new VHS("Amazing Movie Title", 60, new ArrayList<>(Arrays.asList("Scene 1", "Scene 2", "Scene 3")));
		testVHS.setCurrentTime(2);
		testVHS.play();
		int actualTimeAfterPlay = testVHS.getCurrentTime();
		assertEquals(0, actualTimeAfterPlay);		
	}
}
