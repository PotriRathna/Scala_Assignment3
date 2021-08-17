import org.example.Random_Integer
import org.example.Random_Integer.number
import org.scalatest.flatspec._
class TestRandom_Integer extends AnyFlatSpec{

  assert(55==Random_Integer.find(seq=(55,2,34), Random_Integer.maxi))
  assert(2==Random_Integer.find(seq=(55,2,34),Random_Integer.small))
  assert(34==Random_Integer.find(seq=(55,2,34),Random_Integer.second_element))
}
