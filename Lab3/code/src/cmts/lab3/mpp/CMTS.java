package cmts.lab3.mpp;

import java.util.List;

public class CMTS {
	private List<Channel> channels;

	public List<Channel> getChannels() {
		return channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}

	private LoadBalancer loadBalancer;

	public LoadBalancer getLoadBalancer() {
		return loadBalancer;
	}

	public void setLoadBalancer(LoadBalancer loadBalancer) {
		this.loadBalancer = loadBalancer;
	}

	public void registerCM(CM cm) {

	}

	public void releaseCM(CM cm) {

	}
}
