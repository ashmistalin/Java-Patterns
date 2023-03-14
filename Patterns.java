public class Patterns {
    public void patternsforjava() {
        for (int i = 5; i >= 1; i--)
        {
            for(int k=i;k<=5;k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

Main Function:

public class Main {
    public static void main(String[] args) {
        Patterns pat2=new Patterns();
       pat2.patternsforjava();
    }
}
