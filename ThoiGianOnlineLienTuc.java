package OOP_codeptit;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

class CustomComparator implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        if(a.getTotalTime() > b.getTotalTime()){
            return -1;
        }
        else if(a.getTotalTime() == b.getTotalTime()){
            return a.getName().compareTo(b.getName());
        }
        return 1;
    }
}

class Student{
    private String name, startTime, endTime;
    private long totalTime;

    public Student(String name, String startTime, String endTime) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        Date s = f.parse(startTime);
        Date e = f.parse(endTime);
        long temp = e.getTime() - s.getTime();
        this.totalTime = TimeUnit.MILLISECONDS.toMinutes(temp);
    }

    public String getName() {
        return name;
    }

    public long getTotalTime() {
        return totalTime;
    }

    @Override
    public String toString() {
        return name + " " + totalTime;
    }
    
    
}

public class ThoiGianOnlineLienTuc {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
        Scanner scanner = new Scanner(new File("ONLINE.in"));
        List<Student> a = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= n; i++){
            a.add(new Student(scanner.nextLine(), scanner.nextLine(),
            scanner.nextLine()));
        }
        Collections.sort(a, new CustomComparator());
        for(Student i : a){
            System.out.println(i);
        }
    }
    
}
