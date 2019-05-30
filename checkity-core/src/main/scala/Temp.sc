import org.scalacheck.{Arbitrary, Gen}
import org.scalacheck.Gen.Choose

val a = Choose.chooseDouble.choose(Double.NegativeInfinity, Double.PositiveInfinity)
a.sample.get

val b = Gen.chooseNum(Double.MinValue, Double.MaxValue, Double.NegativeInfinity, Double.PositiveInfinity)
b.sample.get

Arbitrary.arbLong.arbitrary.filter(_ != Double.NaN)