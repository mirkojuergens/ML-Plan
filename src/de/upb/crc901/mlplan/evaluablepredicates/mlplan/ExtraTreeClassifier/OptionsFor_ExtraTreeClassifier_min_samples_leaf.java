
package de.upb.crc901.mlplan.evaluablepredicates.mlplan.ExtraTreeClassifier;

import de.upb.crc901.mlplan.evaluablepredicates.mlplan.NumericRangeOptionPredicate;

public class OptionsFor_ExtraTreeClassifier_min_samples_leaf extends NumericRangeOptionPredicate {
	
	@Override
	protected double getMin() {
		return 0;
	}

	@Override
	protected double getMax() {
		return 3;
	}

	@Override
	protected int getSteps() {
		return 1;
	}

	@Override
	protected boolean needsIntegers() {
		return true;
	}
}

