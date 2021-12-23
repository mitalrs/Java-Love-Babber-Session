// parent class (first class)
class mahindracar
{
    int metale=1;
    void car()
    {
        System.out.println("car");
    }
}
//parent class or child class (midale class)
class mahindraTrucks extends mahindracar
{
    int weels=3;
    void trucks()
    {
        int tparts= metale+weels;
        System.out.println("truck parts:"+tparts);
    }
}
//child class (therd class)
public class multilevel extends mahindraTrucks
{
    int electric=3;
    void electrics()
    {
        int emotors= electric+weels;
        System.out.println("truck parts:"+emotors);
    }
	public static void main(String[] args) {
        hierarchical m=new hierarchical();
	    m.trucks();
    	m.electrics();
    	m.car();
	    
	}
}