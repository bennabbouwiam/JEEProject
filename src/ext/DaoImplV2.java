package ext;

import dao.Idao;

public class DaoImplV2 implements Idao{

	@Override
	public double getData()
	{
		/* Version Capteurs */
		double temp=1000;
		System.out.println("Version capteurs :");
		return temp;
	}
}
