import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int[] array = {3,4,8,1,5,2,10,25,5,2};

        System.out.println("Bubble sort:      " + Arrays.toString(Algorithms.bubbleSort(array)));
        System.out.println("Selection sort:   " + Arrays.toString(Algorithms.selectionSort(array)));
    }
}