package expression;

public class Number extends Expression{
    int num;

    public Number(int num){
        this.num = num;
    }
    public String toString() {
        return String.valueOf(num);
    }
}
