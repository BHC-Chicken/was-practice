package dev.ioexception.waspractice;

import java.io.IOException;
public class WasPracticeApplication {

	public static void main(String[] args) throws IOException {
		new CustomWebApplicationServer(8080).start();
	}

}
