public class Caculator {
    public static float caculate(float firstOperand,float secondOperand,char operator){
        switch (operator){
            case '+':
                return firstOperand+secondOperand;
            case '-':
                return firstOperand-secondOperand;
            case '*':
                return firstOperand*secondOperand;
            case '/':
                if (secondOperand!=0)
                return firstOperand/secondOperand;
                else
                    throw new RuntimeException("can't devide by 0");
            default:
                throw new RuntimeException("Invalid opreration");
        }
    }
}
