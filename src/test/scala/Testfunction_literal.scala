import org.example.function_literal
import org.scalatest.flatspec._



class Testfunction_literal extends AnyFlatSpec {
  it should "compare" in {

    assert(  24 == function_literal.maxi(3,24))
    assert( 89== function_literal.find((3,24,89),function_literal.maxi))
  }
}
