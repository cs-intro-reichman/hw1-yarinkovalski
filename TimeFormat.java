// Exe 5 - Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
    {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		if (hours<12)  //if the hours is less than 12
			{
			if ((hours>10)  || (hours==10)) //if the hours is more than 10 or equal to 10
			 	{
					if (minutes<10) //if the hours is less than 10
					{
						System.out.println(hours+":"+"0"+minutes+ " AM"); //printing of the hours
					}
					else //if the hours isnt less than 10
						{
						System.out.println(hours+":"+minutes+ " AM"); //printing of the hours
						}
				}
			else  //if the hours isnt more than 10 or doesnt equal to 10
					{
						if (hours==0) //if the hours is 0
						{
							if (minutes<10) //if the minutes is less than 10
							{
								System.out.println(hours+":"+"0"+minutes+ " AM"); //printing of the hours
							}
							else //if the minutes isnt less than 10
								{
								System.out.println(hours+":"+minutes+ " AM"); //printing of the hours
								}
						}
						else //if the hours isnt 0
						{
							if (minutes<10) //if the minutes is less than 10
							{
								System.out.println(hours+":"+"0"+minutes+ " AM"); //printing of the hours
							}
							else //if the minutes isnt less than 10
								{
								System.out.println(hours+":"+minutes+ " AM"); //printing of the hours
								}
						}
		
					}
			}
		else ///if the hours isnt less than 12
			{
					if (hours==12) //if the hours equals to 12
						{
						if (minutes<10) //if the minutes is less than 10
						{
							System.out.println(hours+":"+"0"+minutes+ " PM"); //printing of the hours
						}
						else //if the minutes isnt less than 10
							{
							System.out.println(hours+":"+minutes+ " PM"); //printing of the hours
							}
						}
				  else if (minutes<10) //if the hours doesnt equals to 12 and less than 10 and if the minutes is less than 10
				   {
					   System.out.println(hours-12+":"+"0"+minutes+ " PM"); //printing of the hours
				   }
				   else //if the minutes isnt less than 10
					   {
					   System.out.println(hours-12+":"+minutes+ " PM"); //printing of the hours
					   }
			   
			}			
	}
}