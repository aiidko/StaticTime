package Timer;

import java.util.Date;
import javax.ejb.Stateless;

@Stateless
public class TimerImplBean implements ITimer{

	@Override
	public Date getCurrentTime() {
		return new Date();
	}

}
