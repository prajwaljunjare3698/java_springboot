package functional_interface;

import java.util.concurrent.Callable;

public class callble_intrfce implements Callable {
	public Integer call() {
		int i=1;
		return i;
	}
}
