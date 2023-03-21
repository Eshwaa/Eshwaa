package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktopsize");
	}
	public static void main(String[] args) {
		Desktop pc = new Desktop();
		pc.desktopSize();
		pc.computerMode();
	}

}
