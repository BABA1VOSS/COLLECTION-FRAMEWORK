package Module3;

public class Student implements Comparable<Student> {
    //yeh wala method jab bhi hum implement karte hai iske sath compareTo wala method @override kar ke likhna hi padega...!

    public int age;

    public String name;

    public int weight;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }




    @Override
    public int compareTo(Student that) {
        //this method is called for current object
        //we will define our sorting lgoic here

        //sor basis on age
        //return this.age - that.age;
        // jab issi age ko mujhe descending order mein print karna hoga tab mein uper wale process ko ulta kar dunga
        if(this.age ==that.age){// jab age same aajaye to fir hum ----> check karte hai name order , Order fir alphabetically store ho ke dikha dega (is sorting ko lexically graphically method bolte hai )
            return this.name.compareTo(that.name);
        }
        return that.age - this.age;
    }
}

