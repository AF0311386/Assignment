public class Array {
public static void main(String[] args) {
int[] array1 = {12, 45, 67, 23, 54};
for (int i = 0; i < array1.length - 1; i++) {
for (int j = i + 1; j < array1.length; j++) {
if (array1[j] > array1[i]) {
int temp = array1[i];
array1[i] = array1[j];
array1[j] = temp;
}
}
}
System.out.println("Array1 Descending Order: ");
for (int num : array1) {
System.out.print(num + " ");
}
int secondMax = array1[1];
System.out.println("\n Second Max No: " + secondMax);
}
}