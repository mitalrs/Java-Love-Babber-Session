
class capsule
{
    private String component;
    
    public void setComponent(String mComponent)
    {
        component=mComponent;
    }
    public String getComponent()
    {
        return component;
    }
}
public class encapsulation
{
	public static void main(String[] args) {
	 capsule c=new capsule();
	 c.setComponent("capsule");
	 System.out.println("class of capsule:"+c.getComponent());
	}
}
