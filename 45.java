class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
int count=0,num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0)
		{
			num/=10;
			count++;
		}
		System.out.println(count);
	}
}
