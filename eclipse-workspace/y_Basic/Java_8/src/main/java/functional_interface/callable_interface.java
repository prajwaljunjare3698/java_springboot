package functional_interface;

import java.util.concurrent.Callable;

public class callable_interface implements Callable<Integer>{
	public Integer call()throws Exception{
		int i=1;
		return i;
	}
}
