package sample;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
public class Application {

	public static void main(String[] args) {
		LOG.debug("test");
	}

}
