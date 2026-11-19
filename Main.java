public class Main {
    static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 500 are:");
        for (int num =2; num <= 500; num++){
            int count = 0;
            for (int i =1; i <= num; i++){
                if (num % i == 0) {
                    if (num % i == 0){
                        count ++;
                    }
                }
                if (count == 2){
                    System.out.println( num+ "");
                }
            }
            System.out.println();
        }

    }
}
