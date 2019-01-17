package com.netcracker.eaters.receipts;

public class Rating {
    int value;

    public void setRating(int rating) {
        if (rating > 5 || rating < 0) {
            System.out.println("The rating should be 0..5");
        } else {
            value = rating;
        }
    }

    public void showRating() {
        System.out.print("Rating: ");
        if (value == 0) {
            System.out.println("Unrated");
        } else {
            for (int x = 0; x < value; x++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
