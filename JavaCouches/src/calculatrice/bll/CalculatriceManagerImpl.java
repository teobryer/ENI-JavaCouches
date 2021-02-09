package calculatrice.bll;

public class CalculatriceManagerImpl implements CalculatriceManager  {

	@Override
	public Integer plus(Integer a, Integer b) {
		return a+b;
	}

	@Override
	public Integer moins(Integer a, Integer b) {
		return a-b;
	}

	@Override
	public Integer fois(Integer a, Integer b) {
		return a*b;
	}

	@Override
	public Integer div(Integer a, Integer b) throws Exception   {
		Integer x=  0;
		if( (x.equals(b))){
			throw new Exception("Le diviseur ne peut pas être égal à 0");
		}
		return a/b;
	}

}
