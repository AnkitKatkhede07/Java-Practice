import java.util.*;
public class SwitchSeason
{
   public static void main (String args[])
   {
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a Case number");
	  int m=sc.nextInt();
	  Switch(m)
	  {
	    case 3:
	    case 4:
		case 5:
	         System.out.println("THIS SEASON: Spring");
			 break;
			 case 6:
			 case 7:
			 case 8:
			 System.out.println("This SEASON : Summer");
			 break;
			 case 9:
			 case 10:
			 case 11:
			 System.out.println("THIS SEASON: Autumn");
                break;
		   case 12:
            case 1:
            case 2:
                System.out.println("THIS SEASON: Winter");
                break;

	    default :
		
		System.out.println("Invalid Month! Please enter between 1 and 12.");
        

		
	  }
   }
}