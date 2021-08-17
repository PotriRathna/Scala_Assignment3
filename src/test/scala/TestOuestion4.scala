import org.example.Question4
import org.scalatest.funsuite.AnyFunSuite

class TestOuestion4 extends AnyFunSuite {
  test("TestQuestion4"){
    assert(5.1===Question4.fzero(5.1, s => (Math.round(s))))
  }

}
