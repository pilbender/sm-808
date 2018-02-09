package org.raescott.sm808;

/**
 * @author Richard Scott Smith <pilbender@gmail.com>
 */
public enum DrumKit implements Output {
	CYMBAL {
		public void beat() {
			System.out.print("Cymal");
		}
	},
	HI_HAT {
		public void beat() {
			System.out.print("HiHat");
		}
	},
	HCP_TAMB {
		public void beat() {
			System.out.print("HcpTamb");
		}
	},
	RIM_COWBELL {
		public void beat() {
			System.out.print("RimCowbell");
		}
	},
	HI_TOM {
		public void beat() {
			System.out.print("HiTom");
		}
	},
	MID_TOM {
		public void beat() {
			System.out.print("MidTom");
		}
	},
	LOW_TOM {
		public void beat() {
			System.out.print("LowTom");
		}
	},
	SNARE_DRUM {
		public void beat() {
			System.out.print("SnareDrum");
		}
	},
	BASS_DRUM {
		public void beat() {
			System.out.print("Kick");
		}
	},
	ACCENT {
		public void beat() {
			System.out.print("Accent");
		}
	},
	SILENCE {
		public void beat() {
			System.out.print("_");
		}
	}
}
