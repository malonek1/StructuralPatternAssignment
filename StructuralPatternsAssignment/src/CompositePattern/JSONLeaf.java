package CompositePattern;

public class JSONLeaf implements JSONComponent
{
	private String jsonData;
	
	public JSONLeaf(String jsonData)
	{
		super();
		this.jsonData = jsonData;
	}
	
	@Override
	public void showJSON() 
	{
		System.out.println(jsonData);
	}
}
