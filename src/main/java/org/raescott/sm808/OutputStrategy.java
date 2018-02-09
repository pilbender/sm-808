package org.raescott.sm808;

/**
 * Not used at the moment. I was toying with the idea of a strategy pattern
 * with a factory to control the type of output transparently to the other
 * algorithms.
 *
 * @author Richard Scott Smith <pilbender@gmail.com>
 */
public enum OutputStrategy implements Output {
		CONSOLE {
			@Override
			public void beat() {
				// Display console output
			}
		}
		// Add more output types such as sounds
}
