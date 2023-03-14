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

# Main Function:

public class Main {
    public static void main(String[] args) {
        Patterns pat2=new Patterns();
       pat2.patternsforjava();
    }
}


# OUTPUT:
C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=4018:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Dell\IdeaProjects\java full stack\out\production\java full stack" Main
 *********
  *******
   *****
    ***
     *
