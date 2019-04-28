package algorithm;

import java.util.Random;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */



        public static void  printSortedArray ( int[] array){

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

        public int[] selectionSort ( int[] array){
            final long startTime = System.currentTimeMillis();
            int[] list = array;

            for (int j = 0; j < array.length - 1; j++) {
                int min = j;
                for (int i = j + 1; i < array.length; i++) {
                    if (array[i] < array[min])
                        min = i;
                }

                int temp = array[min];
                array[min] = array[j];
                array[j] = temp;
            }

            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }

        public int[] insertionSort ( int[] array){
            final long startTime = System.currentTimeMillis();
            int[] list = array;
            //implement here


            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }

        public int[] bubbleSort ( int[] array){
            int[] list = array;
            //implement here
            int n = array.length;
            for(int i=0;i< n;i++){

                for(int j=0;j<n-1;j++){
                    if(array [j] > array [j+1]){
                        int temp = array [j];
                        array [j] = array [j+1];
                        array [j+1] = temp;
                    }
                }
            }

            return list;
        }

        public int[] mergeSort ( int[] array){
            int[] list = array;
            //implement here


            return list;
        }

        public int[] quickSort ( int[] array){
            int[] list = array;
            //implement here


            return list;
        }

        public int[] heapSort ( int[] array){
            int[] list = array;
            //implement here


            return list;
        }

        public int[] bucketSort ( int[] array){
            int[] list = array;
            //implement here


            return list;
        }

        public int[] shellSort ( int[] array){
            int[] list = array;
            //implement here


            return list;
        }
    }
