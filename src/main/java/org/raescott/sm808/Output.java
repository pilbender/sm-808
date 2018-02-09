package org.raescott.sm808;

/**
 * Generic interface for a music device's output.  Facilitates the strategy
 * pattern by the beat() method.  An implementation can output Strings as in
 * the example implementation, but sound output is pluggable in the same way.
 *
 * @author Richard Scott Smith <pilbender@gmail.com>
 */
public interface Output {
	void beat();
}
