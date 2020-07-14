package com.example;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;

public class film extends AppCompatActivity implements Parcelable {


    public static final Parcelable.Creator<film> CREATOR = new Parcelable.Creator<film>() {
        @Override
        public film createFromParcel(Parcel source) {
            return new film(source);
        }

        @Override
        public film[] newArray(int size) {
            return new film[size];
        }
    };
    private Integer count;
    private String next;
    private Object previous;
    private List<Result> results = null;

    public film() {
    }

    protected film(Parcel in) {
        this.count = (Integer) in.readValue(Integer.class.getClassLoader());
        this.next = in.readString();
        this.previous = in.readParcelable(Object.class.getClassLoader());
        this.results = new ArrayList<Result>();
        in.readList(this.results, Result.class.getClassLoader());
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public film withCount(Integer count) {
        this.count = count;
        return this;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public film withNext(String next) {
        this.next = next;
        return this;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public film withPrevious(Object previous) {
        this.previous = previous;
        return this;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public film withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.count);
        dest.writeString(this.next);
        dest.writeParcelable((Parcelable) this.previous, flags);
        dest.writeList(this.results);
    }
}