package com.woon.myapplication.RecyclerView;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Data implements Parcelable{
    private String title;
    private String description;
    private String director;
    private String producer;
    @SerializedName("release_date")
    @Expose
    private Integer releaseDate;
    @SerializedName("rt_score")
    @Expose
    private Integer rtScore;

    public Data(String title, String description, String director, String producer, int releaseDate, int rtScore) {
        this.title = title;
        this.description = description;
        this.director = director;
        this.producer = producer;
        this.releaseDate = releaseDate;
        this.rtScore = rtScore;
    }

    protected Data(Parcel in) {
        title = in.readString();
        description = in.readString();
        director = in.readString();
        producer = in.readString();
        releaseDate = in.readInt();
        rtScore = in.readInt();
    }

    public static final Parcelable.Creator<Data> CREATOR = new Parcelable.Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRtScore() {
        return rtScore;
    }

    public void setRtScore(int rtScore) {
        this.rtScore = rtScore;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(description);
        dest.writeString(director);
        dest.writeString(producer);
        dest.writeInt(releaseDate);
        dest.writeInt(rtScore);
    }
}
