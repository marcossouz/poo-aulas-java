package com.company;

/**
 * A classe para calcular a nota final do aluno
 *
 * @author Marcos Souza
 * @see java.lang.Math
 * @since 1.0
 */
public class ControleNotas {
    /**
     * Nota do primeiro bimestre do aluno
     */
    private double N1;
    /**
     * Nota do segundo bimestre do aluno
     */
    private double N2;
    /**
     * Nota da avaliação final semestral do aluno
     */
    private double N3;
    /**
     * Media final do semestre
     */
    private double mediaFinal;

    /**
     * O construtor da classe ({@code ControleNotas}) para média final dos alunos
     *
     * @param n1 Nota do primeiro bismestre do aluno
     * @param n2 Nota do segundo bimestre do aluno
     * @param n3 Nota final bimestral do aluno
     * @see Math
     */
    public ControleNotas(double n1, double n2, double n3){
        N1 = n1;
        N2 = n2;
        N3 = n3;
        mediaFinal = 0.0;
    }

    /**
     * O método ({@code calculaNotaFinal}) para média final do aluno
     *
     * @return média final do aluno
     * @see Math
     */
    public double calculaNotaFinal(){
        mediaFinal = (N1 * 0.4) + (N2 * 0.3) + (N3 * 0.3);
        return mediaFinal;
    }
}
