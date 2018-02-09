package org.raescott.sm808;

import com.sun.javafx.binding.StringFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Richard Scott Smith <pilbender@gmail.com>
 */
public class Player {
	private List<Step> song = new ArrayList<Step>();
	private int tempo = 128; // Default, Beats per minute
	private TimeSignature timeSignature = new TimeSignature();  // Default is 4/4
	private Output output;

	public void play() throws InterruptedException {
		int bar = 8; // a bar has eight steps
		for (Step step : song) {
			System.out.print("|"); // Step delimiter
			for (int i = 0; i < step.getBeats().size(); ++i) {
				if (i > 0) {
					System.out.print("+"); // Beat delimiter
				}
				step.getBeats().get(i).beat(); // DrumKits implement the Output interface and know how to output themselves.
			}

			// Tempo
			try {
				Thread.sleep(60*timeSignature.getNumerator()*1000/tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// All we're doing here is keeping the output nicer, 1 bar per line
			--bar;
			if (bar <= 0) {
				System.out.print("|");
				System.out.println("");
				bar = 8;
			}

		}
	}

	public void playloop(int repeat) throws InterruptedException {
		System.out.println(String.format("Playing song at BPM: %s", tempo));
		for (int i = 0; i < repeat; ++i) {
			play();
		}
	}

	public List<Step> getSong() {
		return song;
	}

	public void setSong(List<Step> song) {
		this.song = song;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public TimeSignature getTimeSignature() {
		return timeSignature;
	}

	public void setTimeSignature(TimeSignature timeSignature) {
		this.timeSignature = timeSignature;
	}

	public Output getOutput() {
		return output;
	}

	public void setOutput(Output output) {
		this.output = output;
	}
}
