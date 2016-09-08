package cmts.lab3.mpp;

public class CM {
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public UpStreamChannel getUpStreamChannel() {
		return upStreamChannel;
	}

	public void setUpStreamChannel(UpStreamChannel upStreamChannel) {
		this.upStreamChannel = upStreamChannel;
	}

	public DownStreamChannel getDownStreamChannel() {
		return downStreamChannel;
	}

	public void setDownStreamChannel(DownStreamChannel downStreamChannel) {
		this.downStreamChannel = downStreamChannel;
	}

	private int version;
	private UpStreamChannel upStreamChannel;
	private DownStreamChannel downStreamChannel;
	private int requireSpeed;

	public int getRequireSpeed() {
		return requireSpeed;
	}

	public void setRequireSpeed(int requireSpeed) {
		this.requireSpeed = requireSpeed;
	}
}
