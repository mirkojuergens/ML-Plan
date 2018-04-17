
package de.upb.crc901.automl.multiclass.evaluablepredicates.mlplan.classifier.basic.MLPClassifier;
/*
    epsilon : float, optional, default 1e-8
    Value for numerical stability in adam. Only used when solver='adam'

Attributes

*/

import de.upb.crc901.automl.multiclass.evaluablepredicates.mlplan.NumericRangeOptionPredicate;

public class OptionsFor_MLPClassifier_epsilon extends NumericRangeOptionPredicate {

  @Override
  protected double getMin() {
    return 0.000001;
  }

  @Override
  protected double getMax() {
    return 0.001;
  }

  @Override
  protected int getSteps() {
    return 10;
  }

  @Override
  protected boolean needsIntegers() {
    return false;
  }
}