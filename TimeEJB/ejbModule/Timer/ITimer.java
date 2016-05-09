package Timer;

import java.util.Date;

import javax.ejb.Local;

@Local
public interface ITimer {
	
	public Date getCurrentTime();
}
