public class Patternn {
    public  void patts() {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

# Main function:

public class Main {
    public static void main(String[] args) {
        Patternn pat2=new Patternn();
       pat2.patts();
    }
}


# OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=4249:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Dell\IdeaProjects\java full stack\out\production\java full stack" Main
*****
*****
*****
*****
*****

