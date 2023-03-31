package com.bridgelabz.DataStructurePrograms.StackUsingPrimeNumbers;

public class PrimeNumbersExtendStack extends PrimeNumberRange {
    Stack<Integer> stack = new Stack<>();

    void print() {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {            //to find anagrams;
            int temp = num;
            int rev = 0;
            while (temp != 0) {
                int last = temp % 10;
                rev = rev * 10 + last;
                temp = temp / 10;
            }
            if (rev == num) {
               stack.append(num);
            }
        }
    }
    @Override
    void display() {
        stack.display();
    }

    public static void main(String[] args) {
        System.out.println("Anagram of Prime Numbers Range 0 to 1000 :-");
        PrimeNumbersExtendStack primeNumbersExtendStack = new PrimeNumbersExtendStack();
        primeNumbersExtendStack.prime();
        primeNumbersExtendStack.display();

    }
}
