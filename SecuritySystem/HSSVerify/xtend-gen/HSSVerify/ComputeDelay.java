package HSSVerify;

import org.osate.aadl2.instance.ComponentInstance;

@SuppressWarnings("all")
public class ComputeDelay {
	public double comp( final double event_a_time, final double event_b_time) {
	    return ((event_b_time)-(event_a_time));
	  }

}

}
