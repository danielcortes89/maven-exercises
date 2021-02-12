//import ;

import org.apache.commons.lang3.StringUtils;

public class Exercise {

    public static void main(String[] args) {
        Input input = new Input();

//        boolean result = StringUtils.isNumeric(input.getString());

//        String swapped = StringUtils.swapCase(input.getString());

        String reversed = StringUtils.reverse(input.getString());

        System.out.println("Result: " + reversed);
    }



}
