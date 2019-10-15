package cl.collections;

import cl.sample.domain.Student;

import java.util.*;

public class ListHelper {
    // returns the element from the list for the given index. getElementByIndex



    public Integer getElementByIndex(List<Integer> list, Integer index){
        if(list.isEmpty()){
            return null;
        }
        return list.get(index);
    }

    //method name: startBy
    //parameter method: 1) list of string 2) a string
    //return an element string of the list, or null if not found

    public String startBy(List<String> list, String element){
        for (String name:list){
            if(name.toLowerCase().startsWith(element.toLowerCase())){
                return name;
            }
        }
        return null;
    }

    //method return the students who are older than a given value

    public List<Student> olderStudent (List<Student> students, Integer age){
        List older = new ArrayList();
        for (Student variable : students) {
            if(variable.getAge()>age){
                older.add(variable);
            }
        }
        return older;

    }
    //public ReturnType MethodName (parameters....)
    public List<String> splitWords (String text){
        String[] result = text.split(" ");
        return Arrays.asList(result);
    }

    //method counts the occurrences of a word in a text
    public int countWord (String text, String word){
        int count = 0;
        List<String> wordList = this.splitWords(text);
        for (String element : wordList) {
            if(element.equals(word)){
                count += 1;
            }
        }
        return count;
    }

    // hola rojo azul rojo
    // hola = 1
    // rojo = 2
    // azul = 1

    public Map<String, Integer> countEachWork (String text){
        Map<String, Integer> countMap =new  HashMap<String, Integer>();
        List<String> wordList = this.splitWords(text);

        for(String word : wordList){
            if(!countMap.containsKey(word)){
                countMap.put(word,1);
            }else{
                Integer count = countMap.get(word);
                countMap.put(word,count + 1);
            }
        }
        return countMap;
    }

    //list of people, return map Map<Integer, List<Student>>
    // List = {jorge.age =8, ricardo.age = 8}
    // age -> List<Student>
    // 8 -> Jorge, Ricardo
    // 12 -> Maria

    public static Map<Integer, List<Student>> listStudentForAge (List<Student> list){
        Map<Integer, List<Student>> map = new HashMap<>();
        //for (Class/Type vairbale's name : list that contains the values)
        for(Student student : list){
            if(!map.containsKey(student.getAge())){
                map.put(student.getAge(), new ArrayList<Student>());
            }
            List<Student> listByAge = map.get(student.getAge());
            listByAge.add(student);
        }
        return map;
    }

    public static Map<Integer, List<Student>> excludingForAge (List<Student> list,Integer age){
        Map<Integer, List<Student>> map = new HashMap<>();
        for (Student student : list){
            if (student.getAge()>age){
                if(!map.containsKey(student.getAge())){
                    map.put(student.getAge(), new ArrayList<Student>());
                }
                List<Student> listByAge = map.get(student.getAge());
                listByAge.add(student);
            }
        }
        return map;
    }

}
