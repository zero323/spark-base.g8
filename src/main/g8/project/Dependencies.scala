import sbt._

object Dependencies {
  val sparkVersion = "$spark_version$"

  def apply = Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion
  )
}
