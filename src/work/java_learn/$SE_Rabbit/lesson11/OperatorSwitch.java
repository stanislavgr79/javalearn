package work.java_learn.$SE_Rabbit.lesson11;


public class OperatorSwitch {

    private int value;
    final int firstValue = 1, secondValue = 2, thirdValue = 3;

    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public int getThirdValue() {
        return thirdValue;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void foo() {
        System.out.println("value : " + getValue());
        switch (getValue()) {
            case firstValue:
                System.out.println(getFirstValue() + 33);
                break;
            case secondValue:
                System.out.println(getSecondValue() + 22);
                break;
            case thirdValue:
                System.out.println(getThirdValue()+ 44);
                break;
            default:
                System.out.println("Default");
        }


    }


}
