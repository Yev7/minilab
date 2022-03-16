public class minilab {
    public static void main(String[] args) {
        if (5>2) {
            System.out.println(true);
        }
        else if (5 <2){
            System.out.println(false);
        } else {
            System.out.println("Unknown");
        }

        int number = 24;

        String result = (number > 0) ? "Positive Number" : "Negative Number";
        System.out.println(result);

        int color = 5;
        switch (color) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Blue");
                break;
            case 3:
                System.out.println("Green");
                break;
            case 4:
                System.out.println("Yellow");
                break;
            case 5:
                System.out.println("Orange");
                break;
            case 6:
                System.out.println("Purple");
                break;
        }

    }
}
