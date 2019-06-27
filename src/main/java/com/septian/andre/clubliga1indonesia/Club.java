package com.septian.andre.clubliga1indonesia;

import android.os.Parcel;
import android.os.Parcelable;

public class Club implements Parcelable {
    private String clubName, clubNameDetail, logo, nickname, born, stadium, coach, supporters;

    String getClubName() {
        return clubName;
    }

    void setClubName(String clubName) {
        this.clubName = clubName;
    }

    String getClubNameDetail() {
        return clubNameDetail;
    }

    void setClubNameDetail(String clubNameDetail) {
        this.clubNameDetail = clubNameDetail;
    }

    String getLogo() {
        return logo;
    }

    void setLogo(String logo) {
        this.logo = logo;
    }

    String getNickname() {
        return nickname;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    String getBorn() {
        return born;
    }

    void setBorn(String born) {
        this.born = born;
    }

    String getStadium() {
        return stadium;
    }

    void setStadium(String stadium) {
        this.stadium = stadium;
    }

    String getCoach() {
        return coach;
    }

    void setCoach(String coach) {
        this.coach = coach;
    }

    String getSupporters() {
        return supporters;
    }

    void setSupporters(String supporters) {
        this.supporters = supporters;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.clubName);
        dest.writeString(this.clubNameDetail);
        dest.writeString(this.logo);
        dest.writeString(this.nickname);
        dest.writeString(this.born);
        dest.writeString(this.stadium);
        dest.writeString(this.coach);
        dest.writeString(this.supporters);
    }

    Club() {
    }

    private Club(Parcel in) {
        this.clubName = in.readString();
        this.clubNameDetail = in.readString();
        this.logo = in.readString();
        this.nickname = in.readString();
        this.born = in.readString();
        this.stadium = in.readString();
        this.coach = in.readString();
        this.supporters = in.readString();
    }

    public static final Creator<Club> CREATOR = new Creator<Club>() {
        @Override
        public Club createFromParcel(Parcel source) {
            return new Club(source);
        }

        @Override
        public Club[] newArray(int size) {
            return new Club[size];
        }
    };
}
