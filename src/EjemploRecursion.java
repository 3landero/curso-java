public class EjemploRecursion {
    public static void main(String[] args) {
        /*
        String palabra = "Progresion";
        String result = reverseString(palabra);

        System.out.println("result = " + result);

        int suma100 = sumaRecursiva(100);
        System.out.println("suma100 = " + suma100);

        long fibonacci=fib(10500);

        System.out.println("fibonacci = " + fibonacci);
        */

        int[] data = new int[]{ -5,20,10,3,2,0};

        mergeSort(data, 0, data.length - 1);
        System.out.println("--stop--");
        for (int number: data) {
            System.out.println(number);
        }


    }
    public static String reverseString(String s) {
        if (s.length() == 0) {
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static int sumaRecursiva(int numero){
        if (numero<=1){
            return numero;
        }
        return numero + sumaRecursiva(numero-1);
    }

    public static int busquedaBinaria(int[] A, int left, int right, int x){
        if(left>right){
            return -1;
        }

        int mid = (left+right) /2;

        if (x == A[mid]){
            return mid;
        }

        if(x < A[mid]){
            return busquedaBinaria(A, left, mid -1,x);
        }

        return busquedaBinaria(A, mid + 1, right, x);
    };

    public static long fib(long n){
        if (n==0||n==1){
            return n;
        }
        else {
            return fib(n-1)+(n-2);
        }
    };

    public static void mergeSort(int[] data, int start , int end){
        if (start < end){
            int mid = (start+end)/2;
            mergeSort(data, start, mid);
            mergeSort(data, mid+1, end);
            merge(data, start, mid, end);
        }

    }

    public static void merge(int[] data, int start, int mid, int end){
        //build temp array to avoid modifying original contents
        int[] temp = new int[end - start + 1];
        int i=start, j= mid + 1, k= 0;
        //while both sub-array have values, the try and merge them in sorted order
        while(i<= mid && j <= end){
            if( data[i] <= data[j]){
                temp[k++] = data[i++];
            }else{
                temp[k++] = data[j++];
            }
        }
        //-- add the rest of the values from the left subarray into the result
        while (i<= mid){
            temp[ k ] = data[ i ];
            k++; i++;
        }

        //add the rest of the values from right subarray into the result
        while(j == end){
            temp[ k ] = data[j];
            k++; j++;
        }

        for (i=start; i<= end; i++){
            data[i] = temp[ i - start];
        }



    }

}
