public enum Weekdays {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    static void isHoliday(Weekdays day) {
        if (day == Weekdays.SATURDAY) {
            System.out.println("Суббота выходной");
        } else if (day == Weekdays.SUNDAY)
            System.out.println("Воскресенье выходной");
        else {
            System.out.println("Будний день");
        }
    }
}
