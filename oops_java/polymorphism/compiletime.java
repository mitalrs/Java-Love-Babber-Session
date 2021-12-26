
// compile: overloading

public class compiletime // person
{
    void job()
    {
        System.out.println("job task first");
    }
    void job(int x)
    {
        System.out.println("job task second");
    }
	public static void main(String[] args) {
        compiletime m=new compiletime();
	m.job();
	m.job();
	}
}
