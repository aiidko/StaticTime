package Timer;

import java.util.Date;

import javax.ejb.Local;
import javax.ejb.Remote;

@Local
public interface ITimer {
	
	public Date getCurrentTime();
}
