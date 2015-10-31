import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Time {
	
	public String whatTime(int seconds) {

		int hours = seconds/3600;
		int remaining = seconds%3600;
		int mins = remaining/60;
		int sec = remaining%60;
		return Integer.toString(hours) + ":" + Integer.toString(mins) + ":" + Integer.toString(sec);

	}



}
