package time_and_space_complexity;
import java.util.Random;
public class print_random_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int s=1;
		int e=20;
		Random_no(s,e);
	}

	private static void Random_no(int s, int e) {
		// TODO Auto-generated method stub
		Random ra=new Random();
		int l=s;
		int h=e;
		for(int i=0;i<10;i++)
		{
			int ri=ra.nextInt(h-l+1)+l;
			System.out.println(ri);
		}
	}

}
