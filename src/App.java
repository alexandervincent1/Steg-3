import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int t = Getnumber();

        int x = 0;
        while (x <= 32) {
            System.out.println("Hello world");
            x++;
        }
    }

    public static int Square(int nummer) {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Välj ett nummer");
        nummer = tangentbord.nextInt();
        nummer = nummer * nummer;
        System.out.println(nummer);
        return nummer;
    }

    public static void Multi() {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Välj tal 1");
        int num1 = tangentbord.nextInt();
        System.out.println("Välj tal 2");
        int num2 = tangentbord.nextInt();
        int svar = num1 * num2;
        System.out.println(svar);
    }

    public static void Righttriangelarea() {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Välj höjden");
        int höjd = tangentbord.nextInt();
        System.out.println("välj längden");
        int läng = tangentbord.nextInt();
        int area = (höjd * läng) / 2;
        System.out.println(area);
    }

    public static int Getnumber() {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Välj ett nummer");
        int t = 0;
        while (!tangentbord.hasNextInt()) {
            tangentbord.nextLine();
            System.out.println("Välj ett nummer");
        }
        return t;
    }

}
