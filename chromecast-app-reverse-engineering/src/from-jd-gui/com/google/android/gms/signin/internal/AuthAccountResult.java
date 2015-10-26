package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import csv;

public class AuthAccountResult
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new csv();
  public final int a;
  
  public AuthAccountResult()
  {
    this(1);
  }
  
  public AuthAccountResult(int paramInt)
  {
    this.a = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    csv.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\signin\internal\AuthAccountResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */