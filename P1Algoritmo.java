
package p1algoritmo;

/** • Considere que existam moedas de 1, 5, 10, 25 e 50 centavos, além
da moeda de 1 Real.
* 
• Uma agencia de banco possui em seu cofre uma quantidade
desconhecida de moeda1, moeda5, moeda10, moeda25 e moeda50,
além da moeda1R. Um dispositivo foi instalado na agencia, porém,
para funcionar, necessita-se realizar a contagem das moedas
existentes inicialmente. O gerente da agência quer aproveitar e
realizar diversos cálculos de valores além de saber a quantia exata
que possui em moedas no cofre.
Conhece-se os pesos de cada moeda separadamente:
1 centavo = 2,43g
5 centavos = 4,10g
10 centavos = 4,80g
25 centavos = 7,55g
50 centavos = 9,25g
1 real = 7,84g 
*/ 

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class P1Algoritmo { 
  // Quantidade de cada uma das moedas identificadas no cofre.    
 double moeda1cent, moeda5cent, moeda10cent, moeda25cent,moeda50cent,moeda1real;
  // Peso de cada moeda...
  double m1cent  = 2.43, m5cent = 4.10, m10cent = 4.80,
         m25cent = 7.55, m50cent =  9.25, m1real = 7.84; 
  // Valor de cada moeda.
  double valorm1cent = 0.01, valorm5cent = 0.05, valorm10cent = 0.10,
         valorm25cent = 0.25, valorm50cent = 0.50, valorm1real = 1.00;
  // Valor total de cada moeda de acordo com a quantidade contada no cofre. 
  double valortotal1cent, valortotal5cent, valortotal10cent,
         valortotal25cent, valortotal50cent, valortotal1real;
  // Peso total de cada moeda de acordo com a quantidade contada no cofre.
  double peso1cent, peso5cent, peso10cent, 
         peso25cent, peso50cent, peso1real; 
  // Peso total de moedas dentro do cofre. 
  double pesototal;
  // Valor total em dinheiro sem contar as moedas de 1 real. 
  double valorcent; 
  // Valor total em dinheiro contando todas as moedas do cofre.
  double valortotal;
  // Converte 100 moedas de 1 centavos para 1 moeda de 1 real.
  int troca1cent; 
  // Caso aja a troca de moedas, quantidade e peso alterados. 
  double novaqtd1cent, novaqtd1real, novopeso1cent, novopeso1real,
         pesototalatualizado;        
  // Sacola para transporte de moedas 
  double totalsacolas, totalsacolasatualizado;
  // Caso aja a troca de moedas, valor em reais alterados.
  double novovalor1cent, novovalor1real, novovalorcent; 
  

  public void QtdMoedas (){
/** Programa onde insere-se via teclado a quantidade de cada moeda no cofre:
 1 – a quantidade de moedas de 1 centavo
 2 – a quantidade de moedas de 5 centavos
 3 – a quantidade de moedas de 10 centavos
 4 – a quantidade de moedas de 25 centavos
 5 – a quantidade de moedas de 50 centavos
 6 – a quantidade de moedas de 1 real
*/
      Scanner Leia = new Scanner(System.in);
      
    System.out.println("Quantidade de moedas de 1 centavo no cofre : ");
    moeda1cent = Leia.nextDouble();
    System.out.println("Quantidade de moedas de 5 centavos no cofre : ");
    moeda5cent = Leia.nextDouble();
    System.out.println("Quantidade de moedas de 10 centavos no cofre : ");
    moeda10cent = Leia.nextDouble();
    System.out.println("Quantidade de moedas de 25 centavos no cofre : ");
    moeda25cent = Leia.nextDouble();
    System.out.println("Quantidade de moedas de 50 centavos no cofre : ");
    moeda50cent = Leia.nextDouble();
    System.out.println("Quantidade de moedas de 1 real no cofre : ");
    moeda1real = Leia.nextDouble();
      System.out.println("");
  } 
  
  
  public void CalcuValorSeparado () {
      // Valor financeiro de cada moeda no cofre, separadamente:
      System.out.println("Valor em reais de cada moeda separadamente:");
  valortotal1cent = valorm1cent * moeda1cent;
  System.out.println("O valor no cofre em moedas de 1 centavos é de : R$" + valortotal1cent);
  valortotal5cent = valorm5cent * moeda5cent;
  System.out.println("O valor no cofre em moedas de 5 centavos é de : R$" + valortotal5cent);
  valortotal10cent = valorm10cent * moeda10cent;
  System.out.println("O valor no cofre em moedas de 10 centavos é de : R$" + valortotal10cent);
  valortotal25cent = valorm25cent * moeda25cent;
  System.out.println("O valor no cofre em moedas de 25 centavos é de : R$" + valortotal25cent);
  valortotal50cent = valorm50cent * moeda50cent;
  System.out.println("O valor no cofre em moedas de 50 centavos é de : R$" + valortotal50cent);
  valortotal1real = valorm1real * moeda1real;
  System.out.println("O valor no cofre em moedas de 1 real é de : R$" + valortotal1real); 
      System.out.println("");
  } 
  
 public void CalcuPesoSeparado () {
     // Peso de cada moeda no cofre, separadamente:
     System.out.println("Peso de cada moeda:");
  peso1cent = m1cent * moeda1cent;
  System.out.println("Todas as moedas no cofre de 1 centavo pesam juntas: " + peso1cent + "g");
  peso5cent = m5cent * moeda5cent;
  System.out.println("Todas as moedas no cofre de 5 centavo pesam juntas: " + peso5cent + "g");
  peso10cent = m10cent * moeda10cent;
  System.out.println("Todas as moedas no cofre de 10 centavo pesam juntas: " + peso10cent + "g");
  peso25cent = m25cent * moeda25cent;
  System.out.println("Todas as moedas no cofre de 25 centavo pesam juntas: " + peso25cent + "g");
  peso50cent = m50cent * moeda50cent;
  System.out.println("Todas as moedas no cofre de 50 centavo pesam juntas: " + peso50cent + "g");
  peso1real = m1real * moeda1real;
  System.out.println("Todas as moedas no cofre de 1 real pesam juntas: " + peso1real + "g");
     System.out.println(""); 
 } 
 
public void PesoTotal () {
    // Calculando o peso total de todas as moedas dentro do cofre.
   pesototal = peso1cent + peso5cent + peso10cent +
               peso25cent + peso50cent + peso1real ;
   System.out.println("O peso total de moedas dentro do cofre é de : " + pesototal + "g"); 
    System.out.println("");
 } 

public void CalcuCentavos (){
    // Valor de todas as moedas dentro do cofre, sem contar as moedas de 1 real.
   valorcent = valortotal1cent + valortotal5cent + valortotal10cent +
               valortotal25cent + valortotal50cent;
   System.out.println("No cofre tem R$" +valorcent+ " sem contar as moedas de 1 real"); 
    System.out.println("");
} 

public void CalcuValorTotal () {
    // Valor total de moedas dentro do cofre sem excluir nenhuma moeda.
    valortotal = valortotal1cent + valortotal5cent + valortotal10cent + 
                 valortotal25cent + valortotal50cent + valortotal1real; 
    System.out.println("No cofre tem R$" +valortotal+ " contando todas as moedas"); 
    System.out.println("");
} 
public void TotalSacolas () {
    /* Considerando que um saco de moedas consegue suportar o peso de 5 kilos de moedas, quantos sacos de
    moedas serão necessário para realizar o transporte das moedas totalmente.(5.000g = 1kg)
    */
    totalsacolas = Math.ceil(pesototal / 5000); 
     // ( Math.ceil) Usado para aredondar para cima um valor double.
    System.out.println("Quantidades de sacos necessario para fazer o transporte das moedas: " + totalsacolas);
    System.out.println("");
}

public void TrocaMoeda () {
    /* Caso a quantidade de moedas de 1 centavo seja maoir que as de 1 real e 
    maior que 100,csubstitua por moedas de 1 real.
    */ 
   if(moeda1cent > moeda1real && moeda1cent >= 100){ 
     troca1cent = (int) (moeda1cent / 100) ;
    // (INT) Usado para me retornar o valor inteiro da divisão. 
    System.out.println("Caso a quantidade de moedas de 1 centavos for maior que 100 e a quantidade de moedas for maior que a de 1 real");
    System.out.println("Troque as moedas de 1 centavo por "+troca1cent+" moeda(s) de 1 real.");
       System.out.println("");
    System.out.println("Caso aja a troca de moedas:");
       System.out.println("");
    // Nova quantidade e peso da moeda de 1 centavo caso aja a troca. 
    novaqtd1cent = (moeda1cent % 100) ; 
    System.out.println("Nova quantidade de moedas de 1 centavo: " +novaqtd1cent);
       System.out.println("");
    novopeso1cent = peso1cent - novaqtd1cent;
    System.out.println("O novo peso de moedas de 1 centavo: " +novopeso1cent +"g");
       System.out.println("");
    // Nova quantidade e peso de moedas de 1 real caso aja a troca.
    novaqtd1real = moeda1real +  troca1cent;
    System.out.println("Nova quantidade de moedas de 1 real: " +novaqtd1real);
       System.out.println("");
    novopeso1real =  novaqtd1real + peso1real ;
    System.out.println("O novo peso de moedas de 1 real: " + novopeso1real + "g");
       System.out.println("");
    // Novo peso de moedas dentro do cofre 
    pesototalatualizado = pesototal + novopeso1cent + novopeso1real;
    System.out.println("O peso de moedas dentro do cofre: " + pesototalatualizado + "g");
       System.out.println("");
    // Um saco de moedas consegue suportar 5kg. Quantidades de sacos necessarios para o transporte das moedas.
    totalsacolasatualizado =  Math.ceil (pesototalatualizado / 5000); 
    // ( Math.ceil) Usado para aredondar para cima um valor double.
    System.out.println("Quantidades de sacos necessarios para fazer o transporte das moedas: " + totalsacolasatualizado);
       System.out.println("");
    // Novo valor das moedas de 1 centavo e 1 real.
    novovalor1cent = novaqtd1cent * valorm1cent;
    System.out.println("O valor de moedas de 1 centavo dento do cofre é de R$" + novovalor1cent);
       System.out.println("");
    novovalor1real = novaqtd1real * valorm1real;
    System.out.println("O valor de moedas de 1 real dento do cofre é de R$" + novovalor1real);
       System.out.println("");
         // Novo valor das moedas dentro do cofre, sem contar as moedas de 1 real.
    novovalorcent = novovalor1cent + valortotal5cent + valortotal10cent +
               valortotal25cent + valortotal50cent;
    System.out.println("O cofre ficara com um valor de R$" +novovalorcent+ ". Sem contar as moedas de 1 real");
   }
   else{
       
   }
}
    public static void main(String[] args) { 
        P1Algoritmo obj = new P1Algoritmo ();
        
        obj.QtdMoedas();
        obj.CalcuValorSeparado();
        obj.CalcuPesoSeparado();
        obj.PesoTotal();
        obj.CalcuCentavos();
        obj.CalcuValorTotal();
        obj.TotalSacolas();
        obj.TrocaMoeda();
    }
    
}
