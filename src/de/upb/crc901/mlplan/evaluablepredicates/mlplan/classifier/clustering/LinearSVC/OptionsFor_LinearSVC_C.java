
    package de.upb.crc901.mlplan.evaluablepredicates.mlplan.classifier.clustering.LinearSVC;

    import de.upb.crc901.mlplan.evaluablepredicates.mlplan.NumericRangeOptionPredicate;

    /*
        C : float, optional (default=1.0)
        Penalty parameter C of the error term.


    */
    public class OptionsFor_LinearSVC_C extends NumericRangeOptionPredicate {
        
        @Override
        protected double getMin() {
            return 1
                ;
        }

        @Override
        protected double getMax() {
            return 1
                ;
        }

        @Override
        protected int getSteps() {
            return -1
                ;
        }

        @Override
        protected boolean needsIntegers() {
            return false; // already set by generator
        }

        @Override
        protected boolean isLinear() {
			return true;
		}
    }
    