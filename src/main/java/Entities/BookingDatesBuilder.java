package Entities;

public class BookingDatesBuilder {
    private String checkin;
    private String checkout;

    public BookingDatesBuilder setCheckin(String checkin) {
        this.checkin = checkin;
        return this;
    }

    public BookingDatesBuilder setCheckout(String checkout) {
        this.checkout = checkout;
        return this;
    }

    public BookingDates createBookingDates() {
        return new BookingDates(checkin, checkout);
    }
}