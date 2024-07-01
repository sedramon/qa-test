package stqa.exam.preparation;

public class BusPlus {
    public enum Status{UNEMPLOYED, EMPLOYED, STUDENT, PREGNANT}
    public enum Gender {MALE, FEMALE}

    // numMonts je manje od 3, nema popusta
    // Ako je numMonths veci ili jednak od 3, a manji od 6, popust je 5%
    // Ako je numMonts 6 ili vise, dajemo 10%

    // EQ i granicne vrednosti
    public static double calculateDiscountForPayingMultipleMonthsInAdvance(int numMonths) throws IllegalArgumentException {
        // BV9: greska, treba numMonths > 12
        if(numMonths < 0 || numMonths >= 12) throw new IllegalArgumentException();

        int discount = 0;

        // BV3: greska, treba numMonths >= 3
        if(numMonths > 3 && numMonths < 6)
            discount = 5;
        // BV6: greska, treba numMonths >= 6
        else if (numMonths > 6)
            discount = 10;

        return discount;
    }

    // SC,DC, PC
    public static double calculateBusPlus (int age, Status status, Gender gender, boolean specialNeeds){
        double price = 3200;
        if (status != status.EMPLOYED) {
            if (age > 65 || (gender == Gender.MALE && status == Status.UNEMPLOYED)) {

                price *= 0.5;
            } else if (status == Status.STUDENT || (gender == Gender.FEMALE && status == Status.UNEMPLOYED)){
                price *= 0.3;
            }
            if (gender == Gender.FEMALE && status == Status.PREGNANT){
                price *= 0.1;
            }
        }

        if(specialNeeds){
            price = 0;
        }

        return price;
    }
}
