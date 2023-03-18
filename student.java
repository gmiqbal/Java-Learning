class students {
    int roll;
    String name;
    int marks;
}

public class student {
    public static void main(String a[]) {

        students s1 = new students();
        s1.roll = 1;
        s1.name = "GM";
        s1.marks = 85;

        students s2 = new students();
        s2.roll = 2;
        s2.name = "Iqbal";
        s2.marks = 90;

        students s3 = new students();
        s3.roll = 3;
        s3.name = "Mahmud";
        s3.marks = 95;

        students stnds[] = new students[3];
        stnds[0] = s1;
        stnds[1] = s2;
        stnds[2] = s3;

        // for (int i = 0; i < stnds.length; i++) {
        // System.out.println(stnds[i].roll + " : " + stnds[i].name + " : " +
        // stnds[i].marks);
        // }

        for (students x : stnds) {
            System.out.println(x.roll + " : " + x.name + " : " + x.marks);
        }
    }
}
