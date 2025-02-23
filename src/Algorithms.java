public abstract class Algorithms
{
    static int[] bubbleSort(int[] array)
    {
        int firstElement;
        int secondElement;
        boolean flag = true;

        while (flag)
        {
            flag = false;

            //array.length - 1 because element i+1 is accessed in for loop
            for (int i = 0; i < array.length - 1; i++)
            {
                firstElement = array[i];
                secondElement = array[i + 1];

                if (firstElement > secondElement)
                {
                    array[i] = secondElement;
                    array[i + 1] = firstElement;
                    flag = true;
                }
            }
        }

        return array;
    }

    static int[] selectionSort(int[] array)
    {
        int smallestElementIndex;
        int selectedElementIndex;

        /*
        Array.length - 1 because there should always still be
        1 spot left to compare the current/assumed smallestElementIndex to
         */
        for (int i = 0; i < array.length - 1; i++)
        {
            smallestElementIndex = i;

            for (int j = i + 1; j < array.length; j++)
            {
                selectedElementIndex = array[j];

                if (selectedElementIndex < smallestElementIndex)
                {
                    int temporaryElement = array[smallestElementIndex];
                    array[smallestElementIndex] = array[selectedElementIndex];
                    array[selectedElementIndex] = temporaryElement;
                }
            }
        }

        return array;
    }
}
