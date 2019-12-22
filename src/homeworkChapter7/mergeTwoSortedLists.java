package homeworkChapter7;

import java.util.Scanner;

public class mergeTwoSortedLists {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array1 elements: ");
        String inputValues = input.nextLine();
        String[] array1 = inputValues.split(" ");

        System.out.print("Enter Array1 elements: ");
        inputValues = input.nextLine();
        String[] array2 = inputValues.split(" ");

        int[] array3 = merge(convert(array1), convert(array2));
        System.out.print("The merged list is ");
        for (int e : array3)
            System.out.print(e + " ");
    }

    private static int[] convert(String[] inputarray) {
        int[] convertedArray = new int[Integer.parseInt(inputarray[0])];
        for (int i = 1; i < convertedArray.length + 1; i++)
            convertedArray[i - 1] = Integer.parseInt(inputarray[i]);
        return convertedArray;
    }

    private static int[] merge(int[] list1, int[] list2) {
        int[] array3 = new int[list1.length + list2.length];
        int i = 0, j = 0, k = 0;
        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j])
                array3[k++] = list1[i++];
            else
                array3[k++] = list2[j++];
        }

        while (i < list1.length)
            array3[k++] = list1[i++];
        while (j < list2.length)
            array3[k++] = list2[j++];

        return array3;
    }
}