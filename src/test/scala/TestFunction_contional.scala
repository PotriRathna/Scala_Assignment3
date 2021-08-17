import org.example.Function_Conditional
import org.scalatest.flatspec._
import org.scalatest.funsuite.AnyFunSuite

class TestFunction_contional extends AnyFunSuite{

  test("Function_Conditional"){
    assert("CONDITIONAL"===Function_Conditional.conditional[String]("Conditional", _.length > 3, _.toUpperCase))
    assert(686===Function_Conditional.conditional[Int](343, _ > 0, _.*(2)))

  }
}
