package com.netcracker.eaters.receipts;

public class Rating {
    int value;

    public Rating(int rating) {
        if (rating > 0 || rating < 6) {
            this.value = rating;
        }
    }
}
