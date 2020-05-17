package vitalya.lib;

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

        try {
            matrix_input = new Matrix(new double[this.hidden][this.input]);
            matrix_out = new Matrix(new double[this.output][this.hidden]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void train(){}

    public  void query(){}
}
