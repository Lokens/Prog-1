class MainEx3 
{
	public static void main(String[] args) 
	{
		Quadrado c1 = new Quadrado(), c2 = new Quadrado(), c3;
		
		c2.lado = 5;
		Forma f = new Forma();
		
		f.imprimeQuadrado(c1);
		f.imprimeQuadrado(c2);
		c3 = f.multi(c1, c2);
		f.imprimeQuadrado(c3);
	
	}
}
