package com.pojo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by android on 5/31/2017.
 */

public class Items implements Parcelable{

    public long id;
    public String title;
    public String details;
    public String date;
    public String time;

    public Items (){}


    public Items(long id , String title , String details , String date , String time){

        this.id = id;
        this.time = time;
        this.title = title;
        this.date = date;
        this.details = details;
    }


    protected Items(Parcel in) {
        id = in.readLong();
        title = in.readString();
        details = in.readString();
        date = in.readString();
        time = in.readString();
    }

    public static final Creator<Items> CREATOR = new Creator<Items>() {
        @Override
        public Items createFromParcel(Parcel in) {
            return new Items(in);
        }

        @Override
        public Items[] newArray(int size) {
            return new Items[size];
        }
    };

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public long getId() {
        return id;
    }

    public String getDetails() {
        return details;
    }

    public String getTitle() {
        return title;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(title);
        dest.writeString(details);
        dest.writeString(date);
        dest.writeString(time);
    }
}
