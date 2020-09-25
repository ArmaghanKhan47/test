package task.singleton;

public class Singleton {
	
	private Singleton obj = null;
	
	private Singleton()
	{
		
	}
	
	public Singleton getInstance()
	{
		if (this.obj == null)
		{
			this.obj = new Singleton();
		}
		return this.obj;
	}

}
