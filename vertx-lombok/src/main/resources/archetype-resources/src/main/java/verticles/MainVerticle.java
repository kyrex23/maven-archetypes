package ${package}.verticles;

import ${package}.handlers.DemoHandler;
import io.reactivex.rxjava3.core.Completable;
import io.vertx.rxjava3.core.AbstractVerticle;
import io.vertx.rxjava3.ext.web.Router;
import io.vertx.rxjava3.ext.web.handler.BodyHandler;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MainVerticle extends AbstractVerticle {

	private final int port;

	@Override
	public Completable rxStart() {
		Router router = Router.router(vertx);
		router.route().handler(BodyHandler.create()); // Allow to parse request bodies

		var demoHandler = new DemoHandler();
		router.get("/vertx-test").handler(demoHandler);

		return vertx.createHttpServer()
			.requestHandler(router)
			.rxListen(port)
			.ignoreElement();
	}

}
