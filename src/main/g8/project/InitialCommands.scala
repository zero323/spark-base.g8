import sbt._

object InitialCommands {
  def apply = """|import org.apache.spark.sql.SparkSession
  |import org.apache.spark.sql.functions._
  |val spark = SparkSession
  |  .builder
  |  .appName("$name$")
  |  .master("local[*]")
  |  .getOrCreate
  |
  |import spark.implicits._
  |
  """.stripMargin
}
