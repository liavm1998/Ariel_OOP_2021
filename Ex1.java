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

    		int ans=1; //ans = ����� ������ ���� ����� �������� ��� 1
    		int min = Math.min(a , b);	//min = ����� ����� ��������

    		for(int i= 2;i<=min;i++) //���� �� �� ������� �2 ��� ����� ����� ��������
    		{	
    			//�� ����� �� ���� �����
    			if(a%i==0 & b%i==0) 
    			{    
    				//����� ��� ��� ������ ����� ���
    				boolean isprime=true;//���� �� ��� ������
    				for(int j=2;j<=Math.sqrt(i);j++)//���� �� �� ������� ��� 2 ����� 
    				{
    					if (i%j==0) //����� �� ����� ���� �� ���� ������
    					{
    						isprime=false;//�� �� ��� ��� �� ������
    					}
    				}
    				if(isprime)//���� ������� ������ ��� ���� ���� ������
    				{
    					ans=i;//����� �� ����� ������� ������ �����
    				}
    			}
    		}
    		System.out.println(ans);//���� ������ �� ������� ����� �� ����� ������ ����� �����
    	}


	} 
	
}
