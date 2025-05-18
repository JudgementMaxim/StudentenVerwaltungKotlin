import Student

class StudentManager {
    var students = ArrayList<Student>()

    fun addStudent(name: String, grade: Float) {
        students.add(Student(name,grade));
    }
    fun printAll() {
        for (student in students){
            println("Name: " + student.getInfo())
            println("Grade: "+ student.getGrade())
        }
    }
    fun averageGrade() {
        if (students.isEmpty()) {
            println("Keine Studenten vorhanden.")
            return
        }

        var allGrades = 0.0F
        for (student in students) {
            allGrades += student.getGrade()
        }

        println("Average Grade: ${allGrades / students.size}")
    }
}