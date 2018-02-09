package org.raescott.sm808;

import java.util.ArrayList;

/**
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
