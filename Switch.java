public class Switch {

	public static void main(String[] args){
		String role = "student";

		switch(role){
			case "teacher":	System.out.println("I'm a teacher");
							break;
			case "HOD":		System.out.println("I'm a HOD");
							break;
			case "Director":System.out.println("I'm a Director");
							break;
			case "Registarar": System.out.println("I'm a Registarar");
							break;
			case "student"	: System.out.println("I'm a Student");
							break;
			default:
				System.out.println("I'm a parent");
		}

		enum Day { Sun, Mon, Tue, Wed, Thurs, Fri, Sat};
		Day[] DayNow = Day.values();
		for(Day Now: DayNow){
			switch(Now){
				case Sun: System.out.println("Sunday");
						  break;

				case Mon: System.out.println("Monday");
						  break;

				case Tue: System.out.println("Tuesday");
						  break;

				case Wed: System.out.println("Wednesday");
						  break;

				case Thurs: System.out.println("Thursday");
						 	break;

				default:
					System.out.println("Weekend");
			}
		}


	}
}