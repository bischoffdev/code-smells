package blog.softwaretester.bloaters.longparameterlist;

public class CadTool {

    public static void main(String[] args) {
        int result = CadTool.calculateResult(13, false, true, -1, null);
    }

    public static int calculateResult(int baseValue, boolean isMetric, boolean is2D, int offset, Integer height) {
        return 0; // some calculation result
    }
}
