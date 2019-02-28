public class GradeComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Grade g1 = (Grade) o1;
        Grade g2 = (Grade) o2;
        return g1.getGrade().compareTo(g2.getGrade());
    }
}
