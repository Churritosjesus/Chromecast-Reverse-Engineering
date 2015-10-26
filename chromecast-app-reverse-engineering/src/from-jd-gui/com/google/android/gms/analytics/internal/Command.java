package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bqc;

public class Command
  implements Parcelable
{
  @Deprecated
  public static final Parcelable.Creator CREATOR = new bqc();
  public String a;
  public String b;
  private String c;
  
  @Deprecated
  public Command() {}
  
  @Deprecated
  public Command(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.c = paramParcel.readString();
    this.b = paramParcel.readString();
  }
  
  @Deprecated
  public int describeContents()
  {
    return 0;
  }
  
  @Deprecated
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\Command.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */