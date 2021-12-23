package polymorphism;

public class compiletime {
    
}




public class Main // person
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
	Main m=new Main();
	m.job();
	m.job();
	}
}
