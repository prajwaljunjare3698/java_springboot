package com.jspider.main;

import com.jspider.threadclass.audio;
import com.jspider.threadclass.caption;
import com.jspider.threadclass.timer;
import com.jspider.threadclass.video;

public class VLC {	
	public static void main(String[] args) {
		audio t1 = new audio();
		t1.start();
		video t2 = new video();
		t2.start();
		caption t3 = new caption();
		t3.start();
		timer t4 = new timer();
		t4.start();
	}
}
