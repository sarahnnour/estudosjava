package dominio;

public class Calculator {
    public int sumTwoNumbers(int num, int num2){
        int result;
        result = num + num2;
        return result;
    }

    public void sumArray(int[] numbers){
        int sum=0;
        for(int num: numbers){
          sum = sum+num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers){
        int sum=0;
        for(int num: numbers){
            sum = sum+num;
        }
        System.out.println(sum);
    }
}
