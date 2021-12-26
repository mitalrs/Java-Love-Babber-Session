
abstract class food
{
    int prise= 120;
    abstract void foodType();
    void normal()
    {
        System.out.println("normal method in abstract class");
    }
}
public class abstract extends food
{
    void foodType()
    {
        System.out.println("pizza: "+prise);
    }
	public static void main(String[] args) {
		abstract m=new abstract();
		m.foodType();
		m.normal();
	}
}