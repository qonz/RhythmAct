package rhythmact.judgement;

public enum Judgement {
	Perfect("PERFECT"),
	Good("GOOD"),
	Bad("BAD"),
	Miss("MISS");
	
	private String judgement;
	
	private Judgement(String judgement){
		this.judgement = judgement;
	}
	
	public String getJudge(){
		return judgement;
	}
}

 
