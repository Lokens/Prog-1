class Exercicio1 
{
	public static void main (String []args) 
	{
		
		Pessoa ps = new Pessoa ();
		ps.id = 20;	
		
		//p.nascimento = new Data (); // Macacagem, não faça isso.
		
		ps.nascimento.dia=8;
		
		System.out.println("id : " + ps.id );
		System.lineSeparator ();
		System.out.println("dia: " + ps.nascimento.dia + System.lineSeparator () + "mes: \n" + ps.nascimento.dia);
		
		
	}
	
	
	
	
	
}