package com.tka.july10;

public class Logic {
	
	//if the number is given
	void primeOne(int num)
	{
		int r = 0;
		for(int i= 1; i<=num; i++)
		{
			if(num%i==0)
			{
				r++;
			}
		}
		if(r==2)
		{
			System.out.println("Number is prime.");
		}
		else
		{
			System.out.println("Number is not prime.");
		}
	}	
		
		void primeTwo(int num)
		{
			int r = 0;
			for(int i= 2; i<num; i++)
			{
				if(num%i==0)
				{
					r++;
				}
			}
			if(r>0)
			{
				System.out.println("Number is not prime.");
			}
			else
			{
				System.out.println("Number is prime.");
			}
	   }
		
		
		
		
		void primeThree(int num)
		{
			int r = 0;
			for(int i= 2; i<num/2; i++)
			{
				if(num%i==0)
				{
					r++;
				}
			}
			if(r>0)
			{
				System.out.println("Number is not prime.");
			}
			else
			{
				System.out.println("Number is prime.");
			}
	   }
		
		
		
		void primeFour(int num)
		{
			int r = 0;
			for(int i= 2; i<num; i++)
			{
				if(num%i==0)
				{
					r++;
					break;
				}
			}
			if(r>0)
			{
				System.out.println("Number is not prime.");
			}
			else
			{
				System.out.println("Number is prime.");
			}
	   }
		
		
		void primeFive(int num)
		{
			int r = 0;
			for(int i= 2; i<Math.sqrt(num); i++)
			{
				if(num%i==0)
				{
					r++;
					break;
				}
			}
			if(r>0)
			{
				System.out.println("Number is not prime.");
			}
			else
			{
				System.out.println("Number is prime.");
			}
	   }
		
		
		
		
		//to count the digits in given number
		void numOfDigits(int num )
		{
			int total = 0;
			while(num>0)
			{
				total++;
				num = num/10;
			}
			System.out.println("Number of digits = "+total);
		}
		
		
		//to reverse the given number
		void reverseNum(int num)
		{
			int reverseNum = 0;
			int r;
			while(num>0)
			{
				r = num%10;
				reverseNum = reverseNum * 10 +r;
				num = num/10;
			}
			System.out.println("reverse num = "+reverseNum);
		}
		
		
		//to check the given num is pallindrome
		void pallindrome(int num) {
			int a = num;
			int reverseNum = 0;
			int r = 0;;
			while(num>0)
			{
				r = num%10;
				reverseNum = reverseNum * 10 +r;
				num = num/10;
			}
			if(a==reverseNum)
			{
                System.out.println("number is pallindrome");
			}
			else
			{
				 System.out.println("number is not pallindrome");
			}
		}
		
		
		//sum of digits in given number
		void sumofDigits(int num)
		{
			int sum = 0;
			while(num>0)
			{
				int r = num%10;
				sum = sum+r;
				num = num/10;
			}
			System.out.println("sum of digits = "+sum);
		}
		
		
		//to check the number even or odd without using %
		void evenOdd(int num)
		{
			int r = num/2;
			if(r*2==num)
			{
				System.out.println("Number is even.");
			}
			else
			{
				System.out.println("Number is odd.");
			}
		}
		
		//to swap the numbers without using third variable
		void swap(int a, int b)
		{
			System.out.println("A = "+a+"\tB = "+b);
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("A = "+a+"\tB = "+b);
			
		}
		
		
		//Compute the result of a number raised to the power of another (e.g., 2^5 = 32).
		//Power of number
		void powerOfNum(int num)
		{
			//int p = 0 ;
			int r = 0;
			int a = 0;
			while(num>0) {
				a = num%10;
				num /= 10;
			}
			System.out.println(a);
				r = num%10;
				for(int i = 1; i<=r; i++)
				{
					a = a*r;
					
				}
			    System.out.println(a);
		}

}
