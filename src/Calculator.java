public class Calculator {
    private int result;

    public void plus(int num1, int num2){
        result = num1 + num2;
    };
    public void minus(int num1, int num2){
        result = num1 - num2;
    };
    public void divided(int num1, int num2){
        if(num2 == 0){
            System.out.println("num2엔 0불가");
            return;
        }
        result = num1 / num2;
    };
    public void multiple(int num1, int num2){
        result = num1 * num2;
    };
    public void printResult(){
        System.out.println(result);
    }
}
