package com.assassin.test.myapplication.test;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by n0033585 on 2017/4/24.
 */

public class TestParacelable implements Parcelable {
    private String aa;
    private int bb;
    private float cc;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.aa);
        dest.writeInt(this.bb);
        dest.writeFloat(this.cc);
    }

    public TestParacelable() {
    }

    protected TestParacelable(Parcel in) {
        this.aa = in.readString();
        this.bb = in.readInt();
        this.cc = in.readFloat();
    }

    public static final Parcelable.Creator<TestParacelable> CREATOR = new Parcelable.Creator<TestParacelable>() {
        @Override
        public TestParacelable createFromParcel(Parcel source) {
            return new TestParacelable(source);
        }

        @Override
        public TestParacelable[] newArray(int size) {
            return new TestParacelable[size];
        }
    };
}
