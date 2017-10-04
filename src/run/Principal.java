/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;
import classes.*;
import java.util.Date;
//import classes.Inspetor;
//import classes.Secretaria;

/**
 *
 * @author robso
 */
public class Principal {
    public static void main(String[] args) {
        
        //Criar objetos para interagir com os atributos
        
        Aluno aluno = new Aluno();
        Inspetor inspeto = new Inspetor();
        Secretaria secretaria = new Secretaria();
        Professor professor = new Professor();
        
        aluno.nome = "Robson";
        aluno.cpf = "00000000";
        aluno.dataNascimento = new Date();
        aluno.matricula = "123456789";
        aluno.webAluno = true;
        aluno.mensalidade = 1234.0;
        System.out.println(aluno);
        
        
    }
}
