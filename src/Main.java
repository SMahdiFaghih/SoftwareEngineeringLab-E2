import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i  = 100; i >= 0; i--)
        {
            array.add(i);
        }
        
        selectionSort(array);
        mergeSort(array, 0, array.size() - 1);

        System.out.println(array);
        System.out.println("Sort is done");
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

    public static void mergeSort(ArrayList<Integer> array, int l, int r)
    {
        if (l < r)
        {
            int m = l + (r - l) / 2;
            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }

    private static void merge(ArrayList<Integer> array, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
        {
            L[i] = array.get(l + i);
        }
        for (int j = 0; j < n2; ++j)
        {
            R[j] = array.get(m + 1 + j);
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                array.set(k, L[i]);
                i++;
            }
            else
            {
                array.set(k, R[j]);
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            array.set(k, L[i]);
            i++;
            k++;
        }

        while (j < n2)
        {
            array.set(k, R[j]);
            j++;
            k++;
        }
    }
}