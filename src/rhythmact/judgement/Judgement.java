package rhythmact.judgement;

public enum Judgement {
	Perfect("PERFECT"),
	Good("GOOD"),
	Bad("BAD"),
	Miss("MISS"),
	Nothing("");
	
	private String judgement;
	
	private Judgement(String judgement){
		this.judgement = judgement;
	}
	
	public String getJudge(){
		return judgement;
	}
}

 
