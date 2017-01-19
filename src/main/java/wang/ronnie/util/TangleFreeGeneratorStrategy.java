package wang.ronnie.util;

import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

/**
 * Custom {@link DefaultGeneratorStrategy} that doesn't produce tangled packages. Too
 * simple for general use but solves false flags for our build.
 */
public class TangleFreeGeneratorStrategy extends DefaultGeneratorStrategy {

	@Override
	public String getJavaPackageName(Definition definition, Mode mode) {
		return getTargetPackage();
	}

}