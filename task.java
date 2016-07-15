
public class task {

	private JobNode[] Jobs;
	private String name;
	private int numMachine;
	private JobNode[] soted_jobs = null;
	private float greedyJobsTime;
	
	private int[] greedyJobsResult;
	
	public task(int numJob, int numMachine, String name){
		this.name= name;
		this.numMachine= numMachine;
		Jobs= new JobNode[numJob];
		initJobAndMachine();
		randomJobTime();
	}
	
	public float total(){
		float total=0;
		for (int i=0; i<Jobs.length; i++){
			total += Jobs[i].getTime();
		}
		return total;
	}
	
	
	
	private void randomJobTime() {
		for (int i = 0; i < Jobs.length; i++){
			Jobs[i].setTime((int)(Math.random()*10+1));
		}
	}


	private void initJobAndMachine() {
		for (int i = 0; i < Jobs.length; i++){
			Jobs[i] = new JobNode((i+1), 0);
		}
	}
	
	public void calculatingGreedyJobs(){
		float[] machineTime = new float[numMachine];
		for (int i = 0; i < numMachine; i++){
			machineTime[i] = 0;
		}
		
	}



	public JobNode[] getJobs() {
		return Jobs;
	}
	public void setJobs(JobNode[] jobs) {
		Jobs = jobs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumMachine() {
		return numMachine;
	}
	public void setNumMachine(int numMachine) {
		this.numMachine = numMachine;
	}
	public JobNode[] getSoted_jobs() {
		return soted_jobs;
	}
	public void setSoted_jobs(JobNode[] soted_jobs) {
		this.soted_jobs = soted_jobs;
	}
	public float getGreedyJobsTime() {
		return greedyJobsTime;
	}
	public void setGreedyJobsTime(float greedyJobsTime) {
		this.greedyJobsTime = greedyJobsTime;
	}
	
	public int[] getGreedyJobsResult() {
		return greedyJobsResult;
	}
	public void setGreedyJobsResult(int[] greedyJobsResult) {
		this.greedyJobsResult = greedyJobsResult;
	}
	
}

// 定义一个JobNode类，包含id和加工时间
class JobNode{
	private int id;
	private float time;
	
	
	public JobNode(int id, float time){
		this.id = id;
		this.time = time;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTime(float time) {
		this.time = time;
	}
	
	public float getTime(){
		return time;
	}
}