package cmts.lab3.mpp;

public class LoadBalancer {
	private CMTS cmts;

	public CMTS getCmts() {
		return cmts;
	}

	public void setCmts(CMTS cmts) {
		this.cmts = cmts;
	}

	public boolean checkBandWidth(Channel channel) {
		return false;
	}
}
