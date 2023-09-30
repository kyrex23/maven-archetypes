package ${package}.handlers;

import io.reactivex.rxjava3.core.Single;
import io.vertx.core.Handler;
import io.vertx.rxjava3.ext.web.RoutingContext;


public class DemoHandler implements Handler<RoutingContext> {

	@Override
	public void handle(RoutingContext routingContext) {
		var response = "vertx-lombok DEMO";

		Single.just(response)
			.subscribe(r -> routingContext.response().end(r), routingContext::fail);
	}

}
