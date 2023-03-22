public class Main {

    public static void main(String[] args) {


    }



    record Range(int lo, int hi) {

        public Range {
            if (lo < hi){
                throw new IllegalArgumentException(String.format("(%d,%d)", lo, hi));
            }
        }

    }

    static void updateSwitch(String day){
        switch (dat){
            case "MONDAY", "FRIDAY", "SUNDAY" -> System.out.println(6);
            case "TUESDAY" -> System.out.println(7);
            case "THURSDAY", "SATURDAY" -> System.out.println(8);
            case "WEDNESDAY" -> System.out.println(9);
        }
    }

    static void updateSwitch2(String day){

        int j = switch (day){
            case "MONDAY" -> 0;
            case "TUESDAY" -> 1;
            default ->  {
                int k = day.length();
                yield k;
            }
        };
    }

    void textBlocks(){

        String text = """
                fdsmfgfd fgdgfdg gfdgfdgfd gfdgfd
                gfdgfd gfdgfd gfdgfdg gfdgfd gfd
                """;

        String textWithEspace = """
               red /s
               green /s
               blue /s
                """ ;

    }

}