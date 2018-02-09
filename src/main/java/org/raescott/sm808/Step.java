package org.raescott.sm808;

import java.util.ArrayList;

/**
 * Simple container class for the drums struck at a given time.
 *
 * A step can be thought of as a single time slot in the beat of a song.
 * This is necessary because multiple drums can be "beat" at the same
 * time.
 *
 * @author Richard Scott Smith <pilbender@gmail.com>
 */
public class Step {
	private ArrayList<DrumKit> beats = new ArrayList<>();

	public Step(ArrayList<DrumKit> beats) {
		this.beats = beats;
	}

	public Step () {

	}

	public ArrayList<DrumKit> getBeats() {
		return beats;
	}

	public void setBeats(ArrayList<DrumKit> beats) {
		this.beats = beats;
	}
}
