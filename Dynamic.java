import java.util.Scanner;

class Dynamic
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int lenght = 0;
        int Arr[];

        System.out.println("Enter the number of elements : ");
        lenght = sobj.nextInt();

        Arr = new int[lenght];

        if(Arr == null)
        {
            System.out.println("Unable to allocated memory");
        }
        else
        {
            System.out.println("Memory gets successfully allocated");
        }

        Arr = null;
        System.gc();
    }
}