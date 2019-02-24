package com.oop.concepts1;

public class Color {
	private long waveLength;
	private int frequency;
	private String color;
	
	public Color(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Color [waveLength=" + waveLength + ", frequency=" + frequency + ", color=" + color + "]";
	}

	public long getWaveLength() {
		return waveLength;
	}

	public void setWaveLength(long waveLength) {
		this.waveLength = waveLength;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
