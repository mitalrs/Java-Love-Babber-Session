// runtime: overriding


class job
{
    void ready(int x)
    {
      System.out.println("ready method print the ASCII of passing character:"+x);  
    }
}
public class runtime extends job
{
    void ready()
    {
      System.out.println("ready task second");  
    }
	public static void main(String[] args) {
		runtime m=new runtime();
	m.ready('A');
	m.ready();
	}
}