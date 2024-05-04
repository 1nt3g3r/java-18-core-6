package org.example.inner;

public class FruitCase {
    private int appleCount;
    private int orangeCount;
    private int strawberryCount;

    @Override
    public String toString() {
        return "FruitCase{" +
                "appleCount=" + appleCount +
                ", orangeCount=" + orangeCount +
                ", strawberryCount=" + strawberryCount +
                '}';
    }

    public class FruitCaseSetup {
        public FruitCaseSetup(int appleCount, int orangeCount, int strawberryCount) {
            FruitCase.this.appleCount = appleCount;
            FruitCase.this.orangeCount = orangeCount;
            FruitCase.this.strawberryCount = strawberryCount;
        }
    }

    public class Number1Setup extends FruitCaseSetup {
        public Number1Setup() {
            super(5, 7, 9);
        }
    }

    public class Number2Setup extends FruitCaseSetup {
        public Number2Setup() {
            super(10, 15, 20);
        }
    }

    public void number1() {
        new Number1Setup();
    }

    public void number2() {
        new Number2Setup();
    }

    public static void main(String[] args) {
        FruitCase fruitCase = new FruitCase();

        System.out.println("fruitCase = " + fruitCase);

        fruitCase.number1();

        System.out.println("fruitCase = " + fruitCase);
    }
}
