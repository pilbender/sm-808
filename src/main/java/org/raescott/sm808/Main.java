package org.raescott.sm808;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Richard Scott Smith <pilbender@gmail.com>
 */
public class Main {
	public static void main(String[] args) throws InterruptedException {
		// Create a player with a time signature and tempo
		TimeSignature timeSignature = new TimeSignature(4, 4);
		Player player = new Player();
		player.setTimeSignature(timeSignature);
		if (args.length > 0) {
			// obviously more input validation is in order here.
			player.setTempo(Integer.valueOf(args[0]));
		} else {
			player.setTempo(128);
		}

		// Construct the song, kind of arduous :-)
		List<Step> song = new ArrayList<>();
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.BASS_DRUM))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.SILENCE))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.HI_HAT))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.SILENCE))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.BASS_DRUM, DrumKit.SNARE_DRUM))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.SILENCE))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.HI_HAT))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.SILENCE))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.BASS_DRUM))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.SILENCE))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.HI_HAT))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.SILENCE))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.BASS_DRUM, DrumKit.SNARE_DRUM))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.SILENCE))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.HI_HAT))));
		song.add(new Step(new ArrayList<DrumKit>(Arrays.asList(DrumKit.SILENCE))));

		// Add the song to the player
		player.setSong(song);

		// Invoke the player
		// player.play(); // Example of playing it once
		player.playloop(3);
	}
}
