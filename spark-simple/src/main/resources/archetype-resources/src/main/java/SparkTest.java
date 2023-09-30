package ${package};

import spark.Spark;

public class SparkTest {

	public static void main(String[] args) {
		// Test it: curl localhost:4567/spark-simple
		Spark.get("/spark-simple", (req, res) -> "Spark-Simple DEMO");
	}

}
