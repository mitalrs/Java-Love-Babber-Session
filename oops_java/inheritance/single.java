//parnt class
class mahindracar  
{
    int metale=2; //instance variable
    void car()
    {
        System.out.println("car");
    }
}
//child class
public class single extends mahindracar
{
    void trucks()
    {
        int weels=3;
        int tparts= metale+weels;
        System.out.println("truck parts:"+tparts);
    }
	public static void main(String[] args) {
	single m=new single();
	m.trucks();
	m.car();
	}
}
