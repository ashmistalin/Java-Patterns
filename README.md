# Java-Patterns
Ashmi S

## 1)Print the pattern:
*****
*****
*****
*****

## Coding:

```
# class :

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
        Patternn pat1=new Patternn();
       pat1.patts();
    }
}

