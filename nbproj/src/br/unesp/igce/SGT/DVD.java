/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.SGT;

/**
 *
 * @author aluno
 * Lembrete: alterar para projeto de Sistema de Gerenciamento de tarefas
 **/
 
public class DVD {
    private String titulo;
    private String diretor;
    
    DVD (String titulo) {
        this.titulo = titulo;
        this.diretor = " ";
        
    }
    
    public static void main (String[] args) {
        DVD x = new DVD ("Django Livre");
    }
    
}
