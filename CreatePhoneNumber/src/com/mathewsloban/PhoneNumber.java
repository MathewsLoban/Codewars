package com.mathewsloban;

public class PhoneNumber {
    public static String createPhoneNumber1(int[] numbers) {
        String phoneNumber = "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5]
                + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
        return phoneNumber;
    }

    public static String createPhoneNumber2(int[] numbers) {
        String phoneNumber = String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3],
                numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
        return phoneNumber;
    }

    public static String createPhoneNumber3(int[] numbers) {
        String phoneNumber = String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).
                boxed().toArray());
        return phoneNumber;
    }

    public static String createPhoneNumber4(int[] numbers) {
        String phoneNumber = new String("(xxx) xxx-xxxx");
        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", String.valueOf(i));
        }
        return phoneNumber;
    }
}
