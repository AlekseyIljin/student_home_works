import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Student[] studArr = new Student[40];

        for (int i = 0; i < 40; i++) {
            Student myStudent = new Student();
            myStudent.setAge(myStudent.randomNum());
            myStudent.setName(myStudent.randomName());
            studArr[i] = myStudent;
        }

        Student[] studArrA = new Student[12];
        Student[] studArrB = new Student[15];
        Student[] missed = new Student [studArr.length - studArrA.length - studArrB.length];

        for (int i = 0, j = 0, k = 0, n = 0; i < studArr.length; i++){
            if (j < studArrA.length && studArr[i].getAge() <= 12){
                studArrA[j] = studArr[i];
                j++;
            }
            if ((studArr[i].getAge() > 12 && k < studArrB.length)|| (j >= studArrA.length && k < studArrB.length)){
             studArrB[k] = studArr[i];
             k++;
            }
            if (i >= studArrA.length + studArrB.length){
                missed[n] = studArr[i];
                n++;
            }
        }

        ClassRoom classA = new ClassRoom("A", 12, studArrA);
        ClassRoom classB = new ClassRoom("B", 15, studArrB);
        ClassRoom classMissed = new ClassRoom("Missed",studArr.length - studArrA.length - studArrB.length, missed);

        classA.showHowManyStudents();
        classB.showHowManyStudents();
        classMissed.showHowManyStudents();

        classA.showTheStudents();
        classB.showTheStudents();
        classMissed.showTheStudents();

        classA.showTheName();

        classA.sortByAge();

        classA.sortByAgeReverse();

        classA.sortByName();

        classA.sortByNameReverse();

        classA.searchByName();
    }
}