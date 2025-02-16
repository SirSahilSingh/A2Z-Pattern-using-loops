import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter (A-Z): ");

        if (scanner.hasNext()) {
            char inputChar = Character.toUpperCase(scanner.next().charAt(0));

            if (inputChar < 'A' || inputChar > 'Z') {
                System.out.println("Invalid input! Please enter a letter from A-Z.");
            } else {
                System.out.println("Pattern for letter " + inputChar + ":");
                printLetter(inputChar);
            }
        } else {
            System.out.println("No input detected! Please run again and enter a letter.");
        }

        scanner.close();
    }

    public static void printLetter(char letter) {
        switch (letter) {
            case 'A': printA(); break;
            case 'B': printB(); break;
            case 'C': printC(); break;
            case 'D': printD(); break;
            case 'E': printE(); break;
            case 'F': printF(); break;
            case 'G': printG(); break;
            case 'H': printH(); break;
            case 'I': printI(); break;
            case 'J': printJ(); break;
            case 'K': printK(); break;
            case 'L': printL(); break;
            case 'M': printM(); break;
            case 'N': printN(); break;
            case 'O': printO(); break;
            case 'P': printP(); break;
            case 'Q': printQ(); break;
            case 'R': printR(); break;
            case 'S': printS(); break;
            case 'T': printT(); break;
            case 'U': printU(); break;
            case 'V': printV(); break;
            case 'W': printW(); break;
            case 'X': printX(); break;
            case 'Y': printY(); break;
            case 'Z': printZ(); break;
            default:
                System.out.println("Pattern not available for " + letter);
        }
    }
    public static void printA() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if (j == height - i || j == height + i || (i == height / 2 && j > height - i && j < height + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printB() {
        int height = 7, width = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || (j == width - 1 && i != 0 && i != height - 1 && i != height / 2) || (i == 0 || i == height / 2 || i == height - 1) && j < width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printC() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == height - 1 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printD() {
        int height = 7, width = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || (j == width - 1 && i != 0 && i != height - 1) || (i == 0 || i == height - 1) && j < width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printE() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || i == 0 || i == height / 2 || i == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printF() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || i == 0 || i == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printG() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == height - 1 || j == 0 || (i >= height / 2 && j == height - 1) || (i == height / 2 && j >= height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printH() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == height - 1 || i == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printI() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == height - 1 || j == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printJ() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || j == height / 2 || (i == height - 1 && j < height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printK() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height / 2; j++) {
                if (j == 0 || i == j + height / 2 || i == height / 2 - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printL() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || i == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printM() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if (j == 0 || j == height || (i <= height / 2 && (i == j || j == height - i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printN() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == height - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printO() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printP() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || (j == height - 1 && i < height / 2) || i == 0 || i == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printQ() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == height - 1 || (i >= height / 2 && j >= height / 2 && i == j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void printR() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || (j == height - 1 && i < height / 2) || i == 0 || i == height / 2 || (i > height / 2 && i == j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printS() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == height - 1 || i == height / 2 || (j == 0 && i < height / 2) || (j == height - 1 && i > height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printT() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || j == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printU() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j == 0 || j == height - 1) && i < height - 1 || i == height - 1 && j > 0 && j < height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printV() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height * 2; j++) {
                if (j == i || j == (height * 2 - 2) - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printW() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if (j == 0 || j == height || (i == height - 1 && j % 2 == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printX() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == j || i + j == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printY() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((i == j || i + j == height - 1) && i < height / 2 || (j == height / 2 && i >= height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printZ() {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == height - 1 || j == (height - 1 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
