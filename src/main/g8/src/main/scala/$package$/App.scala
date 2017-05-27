package $package$

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._


object App {
  def main(args: Array[String]) = {
    val spark = SparkSession
      .builder
      .appName("$name$")
      .master("local[*]")
      .getOrCreate

    import spark.implicits._

    spark.stop()
  }
}
