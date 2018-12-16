
import java.util.Random;
public class main {
    private static int nmax = 15;



    public static void main(String[] args){
        Student[] array;
        Random rnd = new Random();
        array = new Student[nmax];
        for (int i = 0; i < nmax; i++){
            array[i] = new Student();
            array[i].set_ID(Math.abs((rnd.nextInt()% 32768)) + 1024);
        }
        SORT(array,0, nmax - 1);
        for (int i = 0; i < nmax; i++)
            System.out.println(array[i].get_ID());

    }


    private static void CONNECT(Student[] array, int begin, int end)
    {
        int i = begin;
        int t = 0;
        int mid = begin + (end - begin) / 2;
        int j = mid + 1;
        int[] d = new int[nmax];

        while (i <= mid && j <= end) {

            if (array[i].get_ID() <= array[j].get_ID()) {
                d[t] = array[i].get_ID(); i++;
            }
            else {
                d[t] = array[j].get_ID(); j++;
            }
            t++;
        }

        while (i <= mid) {
            d[t] = array[i].get_ID();
            i++;
            t++;
        }

        while (j <= end) {
            d[t] = array[j].get_ID();
            j++;
            t++;
        }

        for (i = 0; i < t; i++)
            array[begin + i].set_ID(d[i]);
    }


    private static void SORT(Student[] array, int L, int R)
    {
        int V;
        if (L < R)
            if (R - L == 1) {
                if (array[R].get_ID() < array[L].get_ID()) {
                    V = array[L].get_ID();
                    array[L].set_ID(array[R].get_ID());
                    array[R].set_ID(V);
                }
            }
            else {
                SORT(array, L, L + (R - L) / 2);
                SORT(array,L + (R - L) / 2 + 1, R);
                CONNECT(array, L, R);
            }
    }
}
