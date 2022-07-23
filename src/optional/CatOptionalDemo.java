package optional;

import java.lang.StackWalker.Option;
import java.util.Optional;

public class CatOptionalDemo {

	public static void main(String[] args) {
		Optional<Cat> optional = findCatByName("jo");
	   Cat cat =  optional.orElse(new Cat(0,"Unknown"));

	}

	public static Optional<Cat> findCatByName(String name) {
		Cat cat = new Cat(3,name);
		return Optional.ofNullable(cat);
	}

}
