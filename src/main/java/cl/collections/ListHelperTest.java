package cl.collections;

import cl.sample.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListHelperTest {
    public static void main(String[] args){
        testGetElementByIndex();
        testStartBy();
        testOlderStudents();
        testSplitWords();
        testCountWords();
        testCountAll();
        testListStudentForAge();
        testExcludingForAge();
    }

    public static void testGetElementByIndex(){
        List list = new ArrayList();
        ListHelper test = new ListHelper();
        list.add(6);
        list.add(3);
        list.add(15);
        list.add(11);

        Integer result = test.getElementByIndex(list,3);
        System.out.println("Result must be 11 = " + result);
        System.out.println("_________________________-");

    }

    public static void testStartBy(){
        List list = new ArrayList();
        ListHelper comp = new ListHelper();
        list.add("Ricardo");
        list.add("Jorge");

        System.out.println(comp.startBy(list, "jo"));
        System.out.println("_________________________-");
    }

    public static void testOlderStudents(){
        List list = new ArrayList();

        list.add(Student.builder().age(15).build());
        list.add(Student.builder().age(5).build());
        list.add(Student.builder().age(20).build());

        ListHelper count = new ListHelper();
        System.out.println("Number of student older than 10 years = " + count.olderStudent(list,10).size());
    }

    public static void testSplitWords(){
        String text = "Jorge lives in Germany";
        ListHelper helper = new ListHelper();
        //asigna el resultado del metodo en una variable
        List<String> result = helper.splitWords(text);
        for (String word : result) {
            System.out.println(word);
        }
        System.out.println("_____________________________");
    }

    public static void testCountWords(){
        String text = "Cielo azul flor azul";
        ListHelper helper = new ListHelper();
        int result = helper.countWord(text,"azul");
        System.out.println("The number of words is = " + result);
        System.out.println("_____________________________");
    }

    public static void testCountAll(){
        String text = "Cielo azul flor azul";
        ListHelper helper = new ListHelper();
        Map<String, Integer> result = helper.countEachWork(text);
        System.out.println("The Result is: " + result);
        System.out.println("_____________________________");
    }

    /**
     * 8
     *  /tab Student1
     *  /tab Student2
     * 12
     */
    public static void testListStudentForAge(){
        List<Student> list = new ArrayList();
        list.add(Student.builder().firstName("Jorge").age(8).build());
        list.add(Student.builder().firstName("Ricardo").age(8).build());
        list.add(Student.builder().firstName("Maria").age(12).build());
        list.add(Student.builder().firstName("Anna").age(6).build());
        Map<Integer, List<Student>> mapAgeStudent = ListHelper.listStudentForAge(list);
        for(Integer age : mapAgeStudent.keySet()) {
            System.out.println(age);
            List<Student> listStudent = mapAgeStudent.get(age);
            for(Student aStudent : listStudent){
                System.out.println("\t" + aStudent);
            }
        }
        System.out.println("_____________________________");
    }

    public static void testExcludingForAge(){
        List<Student> list = new ArrayList();
        list.add(Student.builder().firstName("Jorge").age(8).build());
        list.add(Student.builder().firstName("Ricardo").age(8).build());
        list.add(Student.builder().firstName("Maria").age(12).build());
        list.add(Student.builder().firstName("Anna").age(6).build());
        Map<Integer, List<Student>> mapAgeStudent = ListHelper.excludingForAge(list, 7);
        for (Integer age : mapAgeStudent.keySet()){
            System.out.println(age);
            List<Student> studentList = mapAgeStudent.get(age);
            for(Student aStudent : studentList){
                System.out.println("\t" + aStudent);
            }
        }
    }
}
