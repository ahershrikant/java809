package Java809;

public class Equals {
	public enum Season {WINTER, SPRING, SUMMER, FALL } 

	public static void main(String[] args) {
		Season s=Season.WINTER;
		switch(s) {
		case WINTER:
			System.out.println("Winter");
			break;
		case SPRING:
			System.out.println("SPRING");
			break;
		case SUMMER:
			System.out.println("SUMMER");
			break;
		case FALL:
			System.out.println("Winter");
			break;
		default:
			System.out.println("no Season");
		
		}
		 
		
	
		
	}

}
