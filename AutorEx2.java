import java.util.Scanner;
class AutorEx2 
{
	
	private	String Nome;
	private int Idade;
	
	public String getNome()
	{
		return this.Nome;
	}
	public void setNome(String m)
	{
			this.Nome = m;
	}  
	
	public int getIdade ()
	{
		return this.Idade;
	}
	
	public void setIdade(int m)
	{
		this.Idade = m;
		
	}
	
	
	public void Teclado ()
	{
		Scanner input = new Scanner (System.in);
		System.out.println("digite um nome: ");
		this.Nome=input.nextLine();
		System.out.println("digite a idade: ");
		this.Idade=input.nextInt();
		
	}
	
	
	public void Imprimir()
	{
		System.out.println(this.Nome);
		System.out.println(this.Idade);
	}
	
	
	
}