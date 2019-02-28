public class SortWithStrategyPattern {
    public static void main(String[] args) {
        Grade a[] = { new Grade("Compro1", "A"),
                new Grade("Compro2", "C"),
                new Grade("Math", "B"),
                new Grade("Phy", "D")};
        sort(a, new GradeComparator());
        for (Grade data : a) {
            System.out.println(data.toString());
        }
    }
    public static void sort(Object[] a, Comparator cmp) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (cmp.compare(a[j], a[minPos]) < 0) {
                    minPos = j;
                }
            }
            Object temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }
}
