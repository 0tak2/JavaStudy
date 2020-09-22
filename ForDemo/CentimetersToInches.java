class CentimetersToInches {
    public static void main(String args[]) {
        final double CENTIMETERS_TO_INCHES = 2.54;
        double centimeters, inches;

        System.out.println("cm \t inch");

        int count = 0;
        for(centimeters = 1.0; centimeters <= 100.0; centimeters++) {
            inches = centimeters / CENTIMETERS_TO_INCHES;
            System.out.println(centimeters + " \t " + inches);

            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}