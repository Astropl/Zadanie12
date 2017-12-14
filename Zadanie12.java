import java.util.Random;
import java.util.Scanner;

public class Zadanie12
{/*Zadanie 12. Gra w ”Za dużo, za mało”. Komputer losuje liczbę z
    zakresu 1...100, a gracz (użytkownik) ma za zadanie odgadnąć, co to
    za liczba poprzez podawanie kolej- nych wartości. Jeżeli podana
    wartość jest:
        • większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
        • mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
        • identyczna z wylosowaną – wyświetlany jest komunikat
„Gratulacje” i gra się kończy.*/

    public static void main(String[] args)
    {
        System.out.println("Gra polega na zgadywaniu liczby którą komputer sobie wylosuje.\nGotowy ? No to zaczynamy :");
        /*Random randomGenerator = new Random();
    for (int idx = 1; idx <= 10; ++idx){
      int randomInt = randomGenerator.nextInt(100);*/

        //Random numbers = new Random();
        //int numbers =
        Scanner sc = new Scanner(System.in);


        Random rn = new Random();
        int randomInt = rn.nextInt(100);
        //System.out.println("Liczba wyosowana to "+ randomInt);
        int numberUser, i = 0;
        do {

            System.out.println(" Podaj swoją liczbe: ");

            numberUser = sc.nextInt();
            if (numberUser < randomInt)
            {
                System.out.println("Moja liczba jest większa niż Twoja");
            }
            else{
                System.out.println("Moja liczba jest mniejsza niż Twoja");
            }
            i++;
        }while (randomInt != numberUser);

        System.out.println("\n\n\n Brawo Zgadłeś za " + i +" razem. ");


    }
}
