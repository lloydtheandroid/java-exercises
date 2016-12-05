package validation;

/**
 * Created by Moravia on 12/2/16.
 */
public class Double implements Validator{
    @Override
    public boolean isValid(Object instance) {

        if (instance instanceof Double) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String errorMessage() {
        return "You must enter a double";
    }
}
