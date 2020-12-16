package schedule;

public class Pod {
	private double requestCpu; 
	private double requestRam;	
	private double limitsCpu;
	private double limitsRam;
	private double time;
	private Node bindNode;
	private int state;// 1 为已经部署 0 为待部署
	
	public Pod(double requestCpu, double requestRam) {
		this.requestCpu = requestCpu;
		this.limitsCpu = requestCpu;
		this.requestRam = requestRam;
		this.limitsRam = requestRam;
	}
	public boolean bindtoNode(Node node) {
		this.bindNode = node;
		return true;
	}
	public void setState(int state) {
		this.state = state;
	}
	public double getResquestcpu() {
		return this.requestCpu;
	}
	public double getResquestram() {
		return this.requestRam;
	}
	public double getLimitscpu() {
		return this.limitsCpu;
	}
	public double getLimitsram() {
		return this.limitsRam;
	}
	public int getState() {
		return this.state;
	}
	public double getTime() {
		return this.time;
	}
	public Node getBindnode() {
		return this.bindNode;
	}
	
}
