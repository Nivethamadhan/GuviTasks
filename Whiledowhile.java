package javaGuvi;

public class Whiledowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// while- it continuosly executes a block of code while particular condition is true.
		int count =1;
		while(count<11)
		{System.out.println("count is" + count);
		count++;
		}
	}
//do-while- block of code is executed atleast once before checking the condition
	int count1 =1;
	do {
		System.out.println("count is" + count1);
		count1 ++;
	}while(count<10)
	{System.out.println("count is" + count1);
	count1 ++;
	}
}
}
