package CompositePattern;

import java.util.ArrayList;

public class JSONComposite implements JSONComponent
{	
	ArrayList<JSONComponent> components = new ArrayList<>();
	
	String jsonData;
	
	public JSONComposite()
	{

	}
	
	@Override
	public void showJSON() 
	{
		//System.out.println(jsonData);
		
		for(JSONComponent component : components)
		{
			component.showJSON();
		}
	}
	
	public void addComponent(JSONComponent component)
	{
		components.add(component);
	}
}
