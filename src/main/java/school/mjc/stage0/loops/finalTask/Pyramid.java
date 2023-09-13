package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            int count = cathetusLength;
            for (int j = 0; j < cathetusLength * 2 - 1; j++) {
                if (j < cathetusLength - 1) {
                    if (count <= i) {
                        System.out.print(count);
                    } else System.out.print(" ");
                    count--;
                } else {
                    if (count <= i) {
                        System.out.print(count);
                    } else System.out.print("");
                    count++;
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
