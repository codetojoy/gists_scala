
// settings
val taskA = taskKey[String]("taskA")
val taskB = taskKey[String]("taskB")
val taskC = taskKey[String]("taskC")

taskA := { val b = taskB.value; val c = taskC.value; "taskA" }
taskB := { Thread.sleep(5000); "taskB" }
taskC := { Thread.sleep(5000); "taskC" } 
