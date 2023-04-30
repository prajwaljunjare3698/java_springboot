package timedateAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
class Task extends Thread{
	public void run() {
		System.out.println("running");
	}
}
public class Practice {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		System.out.println(d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(t.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));

//		ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		System.out.println(t);
//		service.schedule(new Task(),t.getSecond() , TimeUnit.SECONDS);
		
		String time = "8:48 am";
		if(time.equals(t.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)))) {
			service.schedule(new Task(), t.getSecond(), TimeUnit.SECONDS);
		}
		service.shutdown();		
		
		List<Integer>a = new ArrayList<>(List.of(2,3,4,3,2));
		Long sum = a.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
		System.err.println(sum);
		
		
		
		
		
		
		
	}
}
