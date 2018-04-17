package de.upb.crc901.automl.multiclass.evaluablepredicates.mlplan.classifier.basic.LogisticRegression;

import java.util.Arrays;
import java.util.List;

import de.upb.crc901.automl.multiclass.evaluablepredicates.mlplan.OptionsPredicate;

/*
    multi_class : str, {'ovr', 'multinomial'}, default: 'ovr'
    Multiclass option can be either 'ovr' or 'multinomial'. If the option
    chosen is 'ovr', then a binary problem is fit for each label. Else
    the loss minimised is the multinomial loss fit across
    the entire probability distribution. Does not work for liblinear
    solver.

    .. versionadded:: 0.18
       Stochastic Average Gradient descent solver for 'multinomial' case.


*/
public class OptionsFor_LogisticRegression_multi_class extends OptionsPredicate {

  private static List<Object> validValues = Arrays.asList(new Object[] { "multinomial" });

  @Override
  protected List<? extends Object> getValidValues() {
    return validValues;
  }
}