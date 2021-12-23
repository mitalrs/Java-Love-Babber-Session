class mahindracar
{
    int metale=1;
    void car()
    {
        System.out.println("car");
    }
}
class mahindraTrucks extends mahindracar
{
    int weels=3;
    void trucks()
    {
        int tparts= metale+weels;
        System.out.println("Trucks:"+tparts);
    }
}
class mahindraElectric extends mahindracar
{
    int electric=6;
    void electrics()
    {
        int emotors= metale+electric;
        System.out.println("Electric:"+emotors);
    } 
}
public class hierarchical extends mahindracar
{
    int tractor=4;
    void tractors()
    {
         int tractorpart= metale+tractor;
        System.out.println("Tractors:"+tractorpart);
    }
	public static void main(String[] args) {
        hierarchical m=new Mahierarchicalin();
	  m.tractors();
	  
	  mahindraTrucks t=new mahindraTrucks();
	  t.trucks();
	  
	  mahindraElectric e=new mahindraElectric();
	   e.electrics(); 
	    
	}
}