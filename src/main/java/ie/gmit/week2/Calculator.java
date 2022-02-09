package ie.gmit.week2;

public class Calculator {
    int firstNumber;
    int secoundNumber;

    public Calculator(int firstNumber, int secoundNumber) {
        this.firstNumber = firstNumber;
        this.secoundNumber = secoundNumber;
    }
    public int add(){

        int total = firstNumber + secoundNumber;
        return total;
    }
}
