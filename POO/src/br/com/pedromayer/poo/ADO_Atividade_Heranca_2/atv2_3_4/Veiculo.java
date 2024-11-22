/*


EXERCICIO 3 FEITO A PARTIR DA LINHA 47.

EXERCICIO 4 FEITO A PARTIR DA LINHA 58.


*/
package br.com.pedromayer.poo.ADO_Atividade_Heranca_2.atv2_3_4;
//
/**
 *
 * @author alves.7924
 */
public abstract class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public abstract void exibirDados();
    
}


//EXERCICIO 3
/*
    A classe abstrata não pode ser instanciada porque é um tipo de classe
    usada apenas para o conceito de herança dentro do paradigma da orientação
    à objetos. Ela é utilizada como uma classe de referência, onde seus atribu
    tos e metodos serão implementados na classe filha que também pode ter seus
    proprios atributos e metodos.
*/

//EXERCICIO 4
/*
    Os metodos construtores tem como objetivo criar e instanciar o objeto
    da classe. Metodos que utilizam a palavra-chave "abstract" são metodos
    que devem ser implementados nas classes filhas, porém não necessariamente
    precisam executar o que a classe pai executa. Portanto são genericos, dife
    rentes dos metodos construtores.
*/
