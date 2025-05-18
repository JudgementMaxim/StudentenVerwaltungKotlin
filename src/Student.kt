class Student(private var name: String, private var grade: Float) {
    fun getInfo(): String {
        return name;
    }
    fun getGrade(): Float {
        return grade;
    }
    fun setGrade(grade: Float) {
        this.grade = grade;
    }
}