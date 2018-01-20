import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class Student {

   private String name;
   private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int randomNum(){
       int min = 7;
       int max = 16;
       int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
       return randomNum;
   }
   public String randomName(){
        String names [] = {"Kolya", "Sasha", "Petya", "Katya", "Olya", "Valera", "Anton", "Nina", "Kirill", "Bogdan","Taras", "Nazar", "Valya", "Vera", "Nadya", "Lyuba"};
        name = names[ThreadLocalRandom.current().nextInt(names.length)];
        return name;
    }
}
