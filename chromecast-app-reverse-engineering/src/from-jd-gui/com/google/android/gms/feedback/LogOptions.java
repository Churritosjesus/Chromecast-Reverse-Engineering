package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import cij;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class LogOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new cij();
  public final int a;
  public String b;
  public boolean c;
  
  public LogOptions(int paramInt, String paramString, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cij.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\feedback\LogOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */