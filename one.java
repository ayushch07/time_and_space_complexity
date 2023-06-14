package time_and_space_complexity;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//fn=C*g(n);
		//gn=time complexity and C is total terms.
		//ex=fn=6+7n+3n^2;
		//C=16 and gn=n^2;
		int n=1000;
		int i=0;
		while(i<n)
		{
			System.out.println("Hey");
			i++;
			//O(N)
		}
		while(i<=n)
		{
			System.out.println("Hey");
			i*=2;
			//O(log(N))
		
		}
	
		while(n>0)
		{
			System.out.println("Hey");
			
			n/=2;
			//O(log(N))
		}
		while(i<=n)
		{
			System.out.println("Hey");
			
			i+=2;
			i+=3;
			//O(N);
		}
		while(i<=n)
		{
			System.out.println("Hey");
			i*=2;
			i*=3;
			//O(log(N)base 6;
		}
		while(n>0)
		{
			System.out.println("Hey");
			
			n/=2;
			n/=3;
			//log(N)
		}

		int k=0;
		while(i<=n)
		{
			System.out.println("Hey");
			i+=k;
			//O(N/K)
		}
		while(i<=n)
		{
			System.out.println("Hey");
			i*=k;
			//O(log(N)) base k
		}
		while(n>0)
		{
			System.out.println("HEY");
			n=n-2;
			n=n-3;
			//HW
			//O(N);
		}
		while(n>0)
		{

			System.out.println("HEY");
			n=n-k;
			//O(N/K);
		}
		for( i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{

				System.out.println("HEY");
				//N^2;
			}
			
		}
		for(i=1;i*i<=n;i++)
		{

			System.out.println("HEY");
			//i^2=n;
			//i=square root of n is the time complexity;
		}
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				for(int k=1;k<=1000;k++)
				{
					//i 1 ke liye j 1 baar chalega or k 1000 tak ese hi 2 ke liye j 2 baar or k 2*1000 bar ese hi k 1000(1+2+3+4+....n)
					//ese hi chalega to complexity is 1000*N^2;
					
				}
			}
			
		}
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=i*i;j++)
			{
				for(int k=1;k<=n/2;k++)
				{
					System.out.println("HEY");
					//O(N^4) answer
				}
					
				}
			}
		for( i=1;i<=n;i*=2)
		{
			System.out.println("Hello");
			//log(N);
			
		}
		for(i=n/2;i<=n;i++)
		{
			for(int j=1;j<=n/2;j++)
			{
				for(int k=1;k<=n;k*=2)
				{
					//n/2+n/2+log(n);
					//n^2(log(n));
				}
			}
			
		}
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j+=i)
			{
				System.out.println("JEFJl");
				//i=1 ke liye j n tak chalega phir i=2 ke liye j=n/2 tak chalega i=3 ke liye n/3 ese
				//hi N(1+1/2+1/3+....+1/n)
				//N*log(N);
			}
			
		}
			
		
		
		//Ab recursion ke time complexity
		
		
	}

}
