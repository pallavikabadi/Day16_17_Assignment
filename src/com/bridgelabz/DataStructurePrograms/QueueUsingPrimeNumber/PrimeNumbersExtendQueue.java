package com.bridgelabz.DataStructurePrograms.QueueUsingPrimeNumber;

public class PrimeNumbersExtendQueue extends PrimeNumberRange {

    Queue<Integer> queue = new Queue<Integer>();

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
                queue.append(num);
            }
        }
    }
    @Override
    void display() {
        queue.display();
    }

    public static void main(String[] args) {
        System.out.println("Anagram of Prime Numbers Range 0 to 1000 :-");
        PrimeNumbersExtendQueue primeNumbersExtendQueue = new PrimeNumbersExtendQueue();
        primeNumbersExtendQueue.prime();
        primeNumbersExtendQueue.display();

    }
}