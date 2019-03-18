class data
{
  public int dia;
  public int mes;


  void imprime ()
  {
    system.out.println("dia = "+this.dia);
    system.out.println("mes = "+this.mes);
  }

}

import java.util.Scanner;
class main
{

  public static void main (string[]args){
    Data a;
    a=new Data();
    a.dia=10;
    a.mes=30;
    system.out.println("dia="+a.dia+"mes"+a.mes);
    //a.imprime();
    /*int d,m;

    d=s.nextint();
    m=s.nextint();
    d=this.dia;
    m=this.mes;

    //this.dia=Scanner s =new Scanner (system.in);
    //this.mes=Scanner s =new Scanner (system.in);

    imprime (); */
  }


}
