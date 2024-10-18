package edu.trincoll.hr

import edu.trincoll.shapes.Drawable
import edu.trincoll.shapes.Shape
import kotlin.math.PI

// Hourly class should extend the Employee class. That means
// its constructor should take a name of type String and an id of type Int,
// and pass them to the Employee constructor.
//
// It also should have:
//   - a "rate" field of type Double
//   - a "hours" field of type Double, with a default value of 80.0
//
// It should override the pay() method to return the rate times the hours.
//
// It should override the toString method to return a string with the
// name, id, rate, and hours of the employee.
class Hourly(name: String, id: Int, val rate: Double, var hours: Double = 80.0) : Employee(name, id) {

    override fun pay() = rate * hours
    override fun toString(): String {
        return "name: $name, id: $id, rate: $rate, hours: $hours"
    }
}
