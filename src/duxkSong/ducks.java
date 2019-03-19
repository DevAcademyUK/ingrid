package duxkSong;
    import java.util.Scanner;

public class ducks {
    public static void main(String[] args) {
        ducks swimming = new ducks();
        swimming.swim();
    }

        private void swim() {
            Scanner myScanner = new Scanner(System.in);
            System.out.println(" how many ducks went swimming one day?");
            int ducks = myScanner.nextInt();
            String word = " little ducks";

            for (int i = ducks; i > 0; i--) {

                if (i == 1) {
                    word = " little duck";
                    System.out.println(i + " " + word + " went swimming one day. Over the hill and far away. Mother duck said, 'Quack quack quack quack'");
                    System.out.println("And all her" + ducks + " little ducks came back!");
                } else {
                    System.out.println(i + " " + word + " went swimming one day. Over the hill and far away. Mother duck said, 'Quack quack quack quack'");
                    int newNum = i - 1;
                    System.out.println("And only " + newNum + " little ducks came back!");
                }
              }
            }
        }
