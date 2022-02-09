/*
 * CS 2050 - Computer Science II - Summer 2021
 * Instructor: Thyago Motai
 * Description: Activity 21 - Student
 */

public class Student implements Comparable<Student> {  //Comparable in this case is a generic interface
    //it calls for one method to compare. <T> replace the T with the needed object

    private int    id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "(" + id + ", '" + name + "')";
    }

    @Override
    public int compareTo(Student other) {
        //  return id - other.id; // ascending order
        //  return other.id -id  //descending order
        return name.compareTo(other.name);
    }
    //always returns an int. It compares the given to the collie object
    // If the compareTo returns 0, They are equal
    //different than the .equal method. This is more that they are in the same location in order

    //A compare to B gives a negative number. It should appear before or less than
}

