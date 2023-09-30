package ${package};

import ${package}.verticles.MainVerticle;
import io.vertx.rxjava3.core.Vertx;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VertxTest {

	public static void main(String[] args) {
		Vertx vertx = Vertx.vertx();

		// Test it: curl localhost:8080/vertx-test
		vertx.rxDeployVerticle(new MainVerticle(8080))
			.subscribe(id -> log.info("Server up with id: {}", id),
				err -> log.error("Server failed: {}", err.getMessage()));
	}

}
