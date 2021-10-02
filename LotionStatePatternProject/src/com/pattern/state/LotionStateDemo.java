package com.pattern.state;

public class LotionStateDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Lotion validaty 90days\n------------------------------------------------");
		LotionAlertStateContext ctx = new LotionAlertStateContext();
		
		System.out.println("After 1 month ......");
		
		ctx.setDays(30);
		
		ctx.setLotionState(new LotionNotExpired());
		
		ctx.alert();
		//after 90 dyas
		System.out.println("After 3 months ......");
		ctx.setDays(30+90);
		
		ctx.change();
		
		
	}

}
