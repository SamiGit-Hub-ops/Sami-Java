package _ARCHIVE;


import java.util.HashMap;

public class ArraysAndHashMapsBasics {
    public static void main(String[] args) {
        // Create an ArrayList of integers
       /*  ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
          
        //numbers.sort(null);
        numbers.sort(java.util.Comparator.naturalOrder());
        numbers.sort(java.util.Comparator.reverseOrder());
        System.out.println(numbers); */


       // Create a HashMap to store exam scores     
    HashMap<String, Integer> examScores = new HashMap<String, Integer>();

    examScores.put("English", 80);
    examScores.put("Maths", 90);
    examScores.put("Social", 70);
    examScores.put("Physics", 80);

    //System.out.println(examScores.toString());
    //System.out.println(examScores.get("Maths"));
    examScores.putIfAbsent("English", 85);    
    examScores.replace("Physics", 90);
    //System.out.println(examScores.toString());

    /*     examScores.clear();
    System.out.println(examScores.toString()); //{}
    System.out.println(examScores.isEmpty()); //true
    System.out.println(examScores.size()); //0
 */

    System.out.println("Before");
    System.out.println(examScores.toString()); 

    examScores.forEach((key, val) -> {
        examScores.replace(key, val-10);
    });


    System.out.println("after");
    System.out.println(examScores.toString()); 

    }
    
}
