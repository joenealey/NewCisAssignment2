
public class Car {
	
	int gear = 1;
	int location = 0;
	int speed = 0;
	final int destination = 250;
	
	
	void reverseGear(){
		gear = -1;
		
	}
	void gearUp(){
		
		if (gear >= 6){
			System.out.println("I cannot Increase the gear anymore");
		}
		if (gear == -1){
			gear=1;
		}
		else{
			gear=gear+1;
			
		}
			
			
			
		}
		
	

	void gearDown(){
		
		if (gear == 1){
		System.out.println("I cannot decrease the gear anymore");	
		}
		if (gear == -1){
			System.out.println("I cannot decrease the gear because the car is in the reverse gear");
		}
		else{
			gear=gear-1-1;
		}
	}
	int reportGear(){
		return gear;
		
	}

	int reportLocation(){
		return location;
	}

	int reportRemaining(){
		return destination-location;
		
	}
	void moveByTime(int time){
		if(time>0)
		{
		speed = gear*20;
		int delta = speed * time;
		location = location + delta;
		System.out.println("Location is"+location);
		}
		else
		{
			System.out.println("Time cannot be negative");
		}
		
	}
	
	
	boolean isArrived(){
		if (location >= destination){
			return true;
			}
		else {
			return false;
		}

	}
}
	

