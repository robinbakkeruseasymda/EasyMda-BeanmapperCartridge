package flca.mda.test;

import nl.apg.model.foo.Foo;
import nl.apg.model.foo.FooTO;
import mda.template.type.ITOMapper;

public class Model implements ITOMapper {

	@Override
	public Class<?> getTO() {
		return FooTO.class;
	}

	@Override
	public Class<?> getEntity() {
		return Foo.class;
	}

}
