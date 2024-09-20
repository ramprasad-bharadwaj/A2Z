package BasicPrograms;// Output of each pattern: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

public class Patterns {
    public static void main(String[] args) {
        int row, col, sp;

        System.out.println("1\n");
        for(row = 0; row < 5; row++){
            for(col = 0; col < 5; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n2\n");
        for(row = 0; row < 5; row++){
            for(col = 0; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n3\n");
        for(row = 0; row < 5; row++){
            for(col = 0; col <= row; col++){
                System.out.print(col + 1);
            }
            System.out.println();
        }

        System.out.println("\n4\n");
        for(row = 0; row < 5; row++){
            for(col = 0; col <= row; col++){
                System.out.print(row + 1);
            }
            System.out.println();
        }

        System.out.println("\n5\n");
        for(row = 5; row >= 1; row--){
            for(col = row; col > 0; col--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n6\n");
        for(row = 5; row >= 1; row--){
            for(col = row; col > 0; col--){
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println("\n7\n");
        for(row = 0; row < 5; row++){
            for(sp = 5 - row; sp > 0; sp--){
                System.out.print(" ");
            }
            for(col = 0; col < ((2*row)+1) ; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n8\n");
        for(row = 4; row >= 0; row--){
            for(sp = 4 - row; sp > 0; sp--){
                System.out.print(" ");
            }
            for(col = 0; col < (2*row)+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n9\n");
        for(row = 0; row < 5; row++) {
            for (sp = 5 - row; sp > 0; sp--) {
                System.out.print(" ");
            }
            for (col = 1; col <= (2 * row) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(row = 1; row <= 5; row++){
            for(sp = 1; sp <= row; sp++){
                System.out.print(" ");
            }
            for(col = 1; col <= (2* (5 - row))+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n10\n");
        for(row = 1; row <= 5; row++){
            for(col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(row = 4; row >= 1; row--){
            for(col = row; col > 0; col--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n11\n");
        byte bit = 1;
        for(row = 1; row <= 5; row++){
            for(col = 1; col <= row; col++){
                System.out.print(bit);
                if(bit == 1)
                    bit = 0;
                else
                    bit = 1;
            }
            System.out.println();
        }

        System.out.println("\n12\n");
        int temp = 1;
        for(row = 1; row <= 4; row++){
            for(col = 1; col <= row; col++){
                System.out.print(col);
            }
            for(sp = 4 - row; sp > 0; sp--){
                System.out.print(" ");
            }
            for(sp = 4 - row; sp > 0; sp--){
                System.out.print(" ");
            }
            for(col = temp; col > 0; col--){
                System.out.print(col);
            }
            temp++;
            System.out.println();
        }

        System.out.println("\n13\n");
        int count = 1;
        for(row = 1; row <= 5; row++){
            for(col = row; col > 0; col--){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        System.out.println("\n14\n");
        for(row = 1; row <= 5; row++){
            char x = 'A';
            for(col = row; col > 0; col--){
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }

        System.out.println("\n15\n");
        for(row = 5; row >= 1; row--){
            char x = 'A';
            for(col = row; col > 0; col--){
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }

        System.out.println("\n16\n");
        char x = 'A';
        for(row = 1; row <= 5; row++){
            for(col = row; col > 0; col--){
                System.out.print(x + " ");
            }
            x++;
            System.out.println();
        }

        System.out.println("\n17\n");
        x = 'A';
        for(row = 1; row <= 4; row++){
            for(sp = 4 - row; sp > 0; sp--){
                System.out.print(" ");
            }
            for(col = row; col > 0; col--){
                System.out.print(x);
                x++;
            }
            x--;
            for(col = row; col > 1; col--){
                x--;
                System.out.print(x);
            }
            System.out.println();
        }

        System.out.println("\n18\n");
        x = 'F';
        for(row = 1; row <= 5; row++){
            x-=row;
            for(col = row; col > 0; col--){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }

        System.out.println("\n19\n");
        for(row = 5; row >= 1; row--){
            for(col = row; col > 0; col--){
                System.out.print("*");
            }
            for(sp = 5 - row; sp > 0; sp--){
                System.out.print("  ");
            }
            for(col = row; col > 0; col--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(row = 1; row <= 5; row++){
            for(col = row; col > 0; col--){
                System.out.print("*");
            }
            for(sp = 5 - row; sp > 0; sp--){
                System.out.print("  ");
            }
            for(col = row; col > 0; col--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n20\n");
        for(row = 1; row <= 5; row++){
            for(col = row; col > 0; col--){
                System.out.print("*");
            }
            for(sp = 5 - row; sp > 0; sp--){
                System.out.print("  ");
            }
            for(col = row; col > 0; col--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(row = 4; row >= 1; row--){
            for(col = row; col > 0; col--){
                System.out.print("*");
            }
            for(sp = 5 - row; sp > 0; sp--){
                System.out.print("  ");
            }
            for(col = row; col > 0; col--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n21\n");
        int input = 10;
        for(row = 1; row <= input; row++){
            if(row%input == 1 || row%input == 0)
                for(col = input; col > 0; col--)
                    System.out.print("*");
            else{
                for(col = 1; col <= input; col++){
                    if(col%input == 1 || col%input == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n22\n");
        int N = 4, min;
        for(row = 1; row <= N; row++){
            for(col = 1; col <= N; col++){
                min = row < col ? row : col;
                System.out.print(N-min+1);
            }
            for(col = N-1; col >= 1; col--){
                min = row < col ? row : col;
                System.out.print(N-min+1);
            }
            System.out.println();
        }
        for(row = N - 1; row >= 1; row--){
            for(col = 1; col <= N; col++){
                min = row < col ? row : col;
                System.out.print(N-min+1);
            }
            for(col = N-1; col >= 1; col--){
                min = row < col ? row : col;
                System.out.print(N-min+1);
            }
            System.out.println();
        }

    }
}
