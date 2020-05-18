package vitalya.lib.matrix;

import vitalya.lib.Matrix;

public class NeuralNetwork {

    private int input;
    private int hidden;
    private int output;

    private float learnKof;

    Matrix matrix_input;
    Matrix matrix_out;

    public NeuralNetwork(int input, int hidden, int output, float learnKof)  {

        this.input = input;
        this.hidden = hidden;
        this.output = output;

        this.learnKof = learnKof;
        matrix_input = new Matrix(new double[this.hidden][this.input]);
        matrix_out = new Matrix(new double[this.output][this.hidden]);

        matrix_input.setRandMatrix();
        matrix_out.setRandMatrix();

        matrix_input.print();
        matrix_out.print();
    }

    public void train(){}

    public  void query(){}
}
