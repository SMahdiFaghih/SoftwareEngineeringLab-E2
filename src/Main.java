import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        
    }

    private static void selectionSort(ArrayList<Integer> array)
    {
        for (int i = 0; i < array.size(); i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < array.size(); j++)
            {
                if (array.get(j) < array.get(minIndex))
                {
                    minIndex = j;
                }
            }

            int temp = array.get(minIndex);
            array.set(minIndex, array.get(i));
            array.set(i, temp);
        }
    }
}


