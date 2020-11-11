package Ex0;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the last number");
        int b = sc.nextInt();
        {

    		int ans=1; //ans = המחלק המשותף הקטן ביותר שרירותית הוא 1
    		int min = Math.min(a , b);	//min = המספר הנתון המינימלי

    		for(int i= 2;i<=min;i++) //נרוץ על כל המספרים מ2 ועד המספר הנתון המינימלי
    		{	
    			//אם המספר כן מחלק משותף
    			if(a%i==0 & b%i==0) 
    			{    
    				//נבדוק האם הוא ראשוני באופן הבא
    				boolean isprime=true;//נניח כי הוא ראשוני
    				for(int j=2;j<=Math.sqrt(i);j++)//נרוץ על כל המספרים בין 2 למחלק 
    				{
    					if (i%j==0) //נבדוק אם לאותו מחלק יש מחלק כלשהוא
    					{
    						isprime=false;//אם כן הוא כבר לא ראשוני
    					}
    				}
    				if(isprime)//לאחר שוידאנו שהמספר אכן מחלק ואכן ראשוני
    				{
    					ans=i;//נעדכן את המחלק הראשוני הגבוהה ביותר
    				}
    			}
    		}
    		System.out.println(ans);//לאחר שעברנו את הבדיקות נחזיר את המחלק המשותף הגדול ביותר
    	}


	} 
	
}
