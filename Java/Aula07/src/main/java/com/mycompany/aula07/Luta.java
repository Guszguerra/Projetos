package com.mycompany.aula07;
import java.util.Random;

public class Luta {

//Atributos
    
private Lutador desafiado;
private Lutador desafiante;
private int rounds;
private boolean aprovada;

//Métodos

public void marcarLuta(Lutador l1, Lutador l2){
    
    if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){ //Se as categorias forem iguais e os lutadores forem diferentes
        this.aprovada = true;
        this.desafiado = l1;
        this.desafiante = l2;
    }
    else { //Se não
        this.aprovada = false;
        this.desafiado = null;
        this.desafiante = null;
    }
}

public void lutar(){
    
    if(this.aprovada){
        System.out.println("### DESAFIADO ###");
        this.desafiado.apresentar();
        System.out.println("### DESAFIANTE ###");
        this.desafiante.apresentar();
        
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3); //3 resultados possiveis, 0, 1 ou 2
        System.out.println("============= Resultado da Luta ================");
        switch (vencedor){
            case 0: //Empate
                System.out.println("Empate");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
            case 1: //Ganhou Desafiado
                System.out.println("Vitoria do: " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2: //Ganhou Desafiante
                System.out.println("Vitoria do: " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
         }
        System.out.println("=================================================");
    }
    
    else{
        System.out.println("A luta não pode acontecer.");
    }
    
}

//Métodos Especiais

public void setDesafiado(Lutador dd){
    desafiado = dd;
}
public Lutador getDesafiado(){
    return desafiado;
}

public void setDesafiante(Lutador dt){
    desafiante = dt;
}

public Lutador getDesafiante(){
    return desafiante;
}
}
