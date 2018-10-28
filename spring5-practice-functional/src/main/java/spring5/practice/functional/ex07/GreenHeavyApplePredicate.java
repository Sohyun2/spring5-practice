package spring5.practice.functional.ex07;

public class GreenHeavyApplePredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return "green".equals(apple.getColor()) && apple.getWeight() > 150;
	}

}
