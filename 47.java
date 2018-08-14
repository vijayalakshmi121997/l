class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,i;
		ArrayList<Integer> c=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(i=0;i<a;i++)
		{
			b=sc.nextInt();
			c.add(b);
		}
		Integer min=Collections.min(c);
		Integer max=Collections.max(c);
		System.out.print(min+" "+max);
// your code goes here
	}
}
