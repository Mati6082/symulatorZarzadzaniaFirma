class Worker(
    val name: String,
    val surname: String,
    val expierience: Int = 0,
    var salary: Int = 3500
)

class Manager {
    private val workerList = ArrayList<Worker>()

    fun addWorker(worker: Worker): Boolean {
        return workerList.add(worker)
    }

    fun addWorkerList(workers: ArrayList<Worker>): Boolean {
        return workerList.addAll(workers)
    }

    fun removeWorker(worker: Worker): Boolean {
        return workerList.remove(worker)
    }

    fun sumSalary(): Int {
        var sum = 0
        for (worker in workerList) {
            sum += worker.salary
        }
        return sum
    }

    fun avgSalary(): Double {
        return sumSalary()/workerList.size.toDouble()
    }

    fun showWorkers() {
        for (worker in workerList) {
            println("Imię: ${worker.name}")
            println("Nazwisko: ${worker.surname}")
            println("Doświadczenie: ${worker.expierience}")
            println("====================================")
        }
    }
}

fun main(args: Array<String>) {
    val worker1 = Worker("John", "Smith", 5, 10_000)
    val worker2 = Worker("Adam", "Smith")
    val worker3 = Worker("Julia", "Robertson", 12, 15_000)
    val worker4 = Worker("Nicolas", "Novak", 11, 14_000)
    val worker5 = Worker("Kacper", "Novicky", 8, 12_004)

    val workersList = arrayListOf<Worker>(worker1, worker2, worker3, worker4, worker5)

    val kamil = Manager()
    kamil.addWorkerList(workersList)

    kamil.showWorkers()
    println("Średnia wypłata: ${kamil.avgSalary()}")
    println("~~~ 3 miesiące później ~~~")
    kamil.removeWorker(worker2)
    println("Średnia wypłata: ${kamil.avgSalary()}")
}