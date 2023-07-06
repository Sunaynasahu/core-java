package com.rays.abs;

public class BusinessMan extends Shape  implements RichMan ,SocialWorker{
	public static void main(String[] args) {
		
		RichMan r = new BusinessMan();
		r.donation();
		
		SocialWorker s = new BusinessMan();
				s.helptoother();
		
	}

	@Override
	public void earnmoney() {
		//
		
	}

	@Override
	public void donation() {
		System.out.println("Giving donation");
		
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void wall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void helptoother() {
		System.out.println("Socialworker help to others");
		
	}

}
