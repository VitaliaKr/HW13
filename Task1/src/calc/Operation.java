package calc;

public enum Operation {
    ADD("Суммы чисел равна "),
    SUBTRACT("Произведение чисел равно "),
    MULTIPLY("Разность чисел равна: ");
    private String resultMessage;

    Operation(String resultMessage){
        this.resultMessage = resultMessage;
    }
    public String getResultMessage(){
        return resultMessage;
    }
}
