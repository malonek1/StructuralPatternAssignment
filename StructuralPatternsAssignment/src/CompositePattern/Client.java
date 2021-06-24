package CompositePattern;

import java.util.Scanner;

public class Client 
{
	public static void main(String[] args)
	{
		System.out.println("Enter JSON Data: ");
		Scanner input = new Scanner(System.in);
		String jsonData = input.next();
		JSONComposite compositeObject = new JSONComposite();
		JSONComponent leafObject = new JSONLeaf(jsonData);
		compositeObject.addComponent(leafObject);		
		compositeObject.showJSON();
		leafObject.showJSON();
	}
}
