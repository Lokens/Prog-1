class Quadrado 
{
	public int lado;
	public Quadrado() 
	{
		this.lado = 2;
	}
	public int area() {
		int r = this.lado * this.lado;
		return r;
	}
}