package org.raescott.sm808;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * @author Richard Scott Smith <pilbender@gmail.com>
 */
public class DrumKitTest {
	DrumKit drumKit1;
	DrumKit drumKit2;
	ByteArrayOutputStream output = new ByteArrayOutputStream();
	ByteArrayOutputStream errorOutput = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		// Set up streams
		System.setOut(new PrintStream(output));
		System.setErr(new PrintStream(errorOutput));
		drumKit1 = DrumKit.BASS_DRUM;
		drumKit2 = DrumKit.SNARE_DRUM;
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(System.out);
		System.setErr(System.err);
	}

	@Test
	public void testBeat() {
		drumKit1.beat();
		assertEquals("Kick", output.toString());
		drumKit2.beat();
		// Note the output to the console is additive.
		assertEquals("KickSnareDrum", output.toString());
	}
}