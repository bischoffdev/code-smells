package blog.softwaretester.codesmells.bloaters.longparameterlist;

public class CadTool {

    public static void main(String[] args) {
        int result = CadTool.calculateResult(13, false, true, -1, null);
    }

    public static int calculateResult(
            final int baseValue, final boolean isMetric,
            final boolean is2D, final int offset,
            final Integer height) {
        return 0; // some calculation result
    }
}
