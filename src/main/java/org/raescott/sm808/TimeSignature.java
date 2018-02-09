package org.raescott.sm808;

/**
 * Simple container class for a song's time signature.
 *
 * @author Richard Scott Smith <pilbender@gmail.com>
 */
public class TimeSignature {
	// Defaulting to a 4/4 time signature
	private int numerator = 4;
	private int denominator = 4;

	public TimeSignature(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public TimeSignature() {

	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
}
