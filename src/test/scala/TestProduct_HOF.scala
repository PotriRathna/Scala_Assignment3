import org.example.Product_HOF
import org.scalatest.flatspec._

class TestProduct_HOF extends AnyFlatSpec{

  assert(Product_HOF.hof(1)(2)===2)
  assert(Product_HOF.hof(3)(2) === 6)
}
