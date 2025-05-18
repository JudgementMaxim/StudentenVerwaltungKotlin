fun main() {
    val manager = StudentManager()
    var active = true

    while (active) {
        println("StudentenVerwaltung")
        println("=====Menü=====")
        println("Studenten Erstellen[1]")
        println("Studenten Anzeigen[2]")
        println("Durchschnittsnote[3]")
        println("ENDE[4]")
        print("Deine Wahl: ")

        val choice = readln().toIntOrNull() ?: 0  // sicher parsen, falls ungültig

        when (choice) {
            1 -> {
                print("Name eingeben: ")
                val name = readln()
                print("Note eingeben (z.B. 2.5): ")
                val grade = readln().toFloatOrNull() ?: 0.0F
                manager.addStudent(name, grade)
            }
            2 -> manager.printAll()
            3 -> manager.averageGrade()
            4 -> {
                active = false
                println("Schönen Tag noch!")
            }
            else -> println("Ungültige Eingabe, bitte erneut versuchen.")
        }
        println()
    }
}
