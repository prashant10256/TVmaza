package com.github.tvmazesample.api.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class ShowRating implements Parcelable {
    private float average;

    public ShowRating() {
    }

    public float getAverage() {
        return average;
    }

    void setAverage(float average) {
        this.average = average;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(this.average);
    }

    protected ShowRating(Parcel in) {
        this.average = in.readFloat();
    }

    public static final Creator<ShowRating> CREATOR = new Creator<ShowRating>() {
        @Override
        public ShowRating createFromParcel(Parcel source) {
            return new ShowRating(source);
        }

        @Override
        public ShowRating[] newArray(int size) {
            return new ShowRating[size];
        }
    };
}
