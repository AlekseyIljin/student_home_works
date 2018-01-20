import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class ClassRoom {

    String classWord;
    int classLimit;
    Student[] studMass;


    public ClassRoom(String classWord, int classLimit, Student[] studMass) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.studMass = studMass;
    }

    public void showHowManyStudents(){
        System.out.println("========================");
        System.out.println("In the class " + classWord + ": " + classLimit + " students.");
    }

    public void showTheStudents(){
        System.out.println("========================");
        for(int i = 0; i < studMass.length; i++){
            System.out.println(classWord + " [" + i + "]: Age: " + studMass[i].getAge() + ". Name: " + studMass[i].getName());
        }
    }

    public void showTheName(){
        System.out.println("========================");
        for(int i = 0; i < studMass.length; i++){
            System.out.println(classWord + " [" + i + "]: " + studMass[i].getName());
        }
        System.out.println("========================");
    }

    public void sortByAge(){
        Student temp;
        for(int i = 0; i < studMass.length - 1; i++){
            for(int j = 0; j < studMass.length - 1 - i; j++){
                if(studMass[j].getAge() > studMass[j+1].getAge()){
                temp = studMass[j];
                studMass[j] = studMass[j+1];
                studMass[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < studMass.length; i++){
            System.out.println(classWord + " [" + i + "]: Age: " + studMass[i].getAge() + ". Name: " + studMass[i].getName());
        }
        System.out.println("========================");
    }

    public void sortByAgeReverse(){
        Student temp;
        for(int i = 0; i < studMass.length - 1; i++){
            for(int j = 0; j < studMass.length - 1 - i; j++){
                if(studMass[j].getAge() < studMass[j+1].getAge()){
                    temp = studMass[j];
                    studMass[j] = studMass[j+1];
                    studMass[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < studMass.length; i++){
            System.out.println(classWord + " [" + i + "]: Age: " + studMass[i].getAge() + ". Name: " + studMass[i].getName());
        }
        System.out.println("========================");
    }

    public void sortByName(){
        Student temp;
        for(int i = 0; i < studMass.length - 1; i++){
            for(int j = 0; j < studMass.length - 1 - i; j++){
                if (studMass[j].getName().compareTo(studMass[j+1].getName()) > 0){
                    temp = studMass[j];
                    studMass[j] = studMass[j+1];
                    studMass[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < studMass.length; i++){
            System.out.println(classWord + " [" + i + "]: Age: " + studMass[i].getAge() + ". Name: " + studMass[i].getName());
        }
        System.out.println("========================");
    }

    public void sortByNameReverse(){
        Student temp;
        for(int k = 0; k < studMass.length - 1; k++){
            for(int j = 0; j < studMass.length - 1 - k; j++){
                if (studMass[j].getName().compareTo(studMass[j+1].getName()) < 0){
                    temp = studMass[j];
                    studMass[j] = studMass[j+1];
                    studMass[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < studMass.length; i++){
            System.out.println(classWord + " [" + i + "]: Age: " + studMass[i].getAge() + ". Name: " + studMass[i].getName());
        }
        System.out.println("========================");
    }

    public void searchByName(){
        System.out.println("Enter the name: ");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        boolean noName = true;
        for (int i = 0; i <studMass.length; i++){
            if(name.equals(studMass[i].getName())){
                System.out.println("Yes, you have this student in the class " + classWord + " [" + i + "]: Age: " + studMass[i].getAge() + ". Name: " + studMass[i].getName());
                noName = false;
                break;
            }
        }
        if (noName){
            System.out.println("No such students in this class.");
        }
    }

//    public void searchClassByName(){
//        System.out.println("Enter the name: ");
//        Scanner scn = new Scanner(System.in);
//        String name = scn.nextLine();
//        boolean noName = true;
//        for (int i = 0; i <studMass.length; i++){
//            if(name.equals(studMass[i].getName())){
//                System.out.println("Yes, you have this student in the class " + classWord + " [" + i + "]: Age: " + studMass[i].getAge() + ". Name: " + studMass[i].getName());
//                noName = false;
//            }
//        }
//        if (noName){
//            System.out.println("No such students in this class.");
//        }
//    }


}
