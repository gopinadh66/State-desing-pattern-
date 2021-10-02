package com.pattern.state;

public class LotionAlertStateContext {
	
	public State lotionState;
	
	int days=0;

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public State getLotionState() {
		return lotionState;
	}

	public void setLotionState(State lotionState) {
		this.lotionState = lotionState;
	}
	
	public void alert() 
    {
	 
			lotionState.alert();
	 
		
    }
	
	public void change() 
    {
		// lotion expire days 90 only
		if(this.days > 90) {
			System.out.println("Lotion expired");
		}else {
			System.out.println("Lotion Still not expired");
		}
		
		
		 
    }

}
