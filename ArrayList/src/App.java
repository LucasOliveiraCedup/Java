import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        //Vetor de tamanho fixo 
        String[] arrayFixo = new String[3];
        arrayFixo[0] = "Joao";
        arrayFixo[1] = "Maria";
        arrayFixo[2] = "Pedro";

        //Leitura do array de tamanho fixo
        System.out.println("Leitura do vetor Fixo");
        for(int i = 0; i<arrayFixo.length; i++){
            System.out.println(arrayFixo[i]);
        }

        //Array com ArrayList
        //ArrayList<tipo> nome = new ArrayList<tipo>();
        //Necessário importar a biblioteca da classe.
        ArrayList<String> arrayDinamico = new ArrayList<String>();

        //Adicionar elementos no array
        arrayDinamico.add("Joao");
        arrayDinamico.add("Maria");
        arrayDinamico.add("Pedro");
        arrayDinamico.add("Jorge");
        arrayDinamico.add("Paulo");

        //Descobrir o tamanho do array Dinâmico
        System.out.print("Tamanho do vetor dinamico: ");
        arrayDinamico.size();
        System.out.println(arrayDinamico.size());

        //Leitura do array de tamanho dinâmico
        System.out.println("Leitura do vetor dinamico");
        for(int i = 0; i<arrayDinamico.size(); i++){
            System.out.println(arrayDinamico.get(i));
        }

        //Remover item do arrayList
        arrayDinamico.remove(1);

        //Apagar o vetor inteiro
        //arrayDinamico.clear();

        //Leitura usando o forEach (Para Cada)
        System.out.println("Mostrando o vetor dinamico com forEach");
        for (String nome : arrayDinamico) {
            System.out.println(nome);
        }

        //ArrayList de tipos primitivos (Wrapper Class)
        /*
           int - Integer
           float - Float
           double - Double
           char - Character
        */

        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(10);
        notas.add(7);
        notas.add(9);
        notas.add(7);
        notas.add(8);
        notas.add(4);

        //Importar a biblioteca Collections
        //Vetor ordenado
        Collections.sort(notas);

        //Vetor ordenado ao contrário
        //Collections.sort(notas, Collections.reverseOrder());

        System.out.println("Imprimindo notas");
        for (Integer nota : notas) {
            System.out.println(nota);
        }

        //Array de objetos
        //Criação dos objetos
        Pessoa joao = new Pessoa("Joao", 15);
        Pessoa maria = new Pessoa("Maria", 16);
        Pessoa pedro = new Pessoa("Pedro", 15);

        //Cria o array de Pessoa e adiciona os elementos no vetor
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(joao);
        pessoas.add(maria);
        pessoas.add(pedro);

        for (Pessoa pessoa : pessoas) {
            System.out.format("A pessoa de nome %s tem %d anos\n", pessoa.getNome(), pessoa.getIdade());
        }

        // Outro jeito de criar um vetor de objetos
        ArrayList<Pessoa> novasPessoas = new ArrayList<Pessoa>();
        novasPessoas.add(new Pessoa("Paulo", 17));
        novasPessoas.add(new Pessoa("Ricardo", 19));

        for (Pessoa pessoa : novasPessoas) {
            System.out.format("A pessoa de nome %s tem %d anos\n", pessoa.getNome(), pessoa.getIdade());
        }
    }
}