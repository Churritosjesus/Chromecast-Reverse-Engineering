package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import cik;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ThemeSettings
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new cik();
  public final int a;
  public int b;
  public int c;
  
  public ThemeSettings()
  {
    this(1, 0, 0);
  }
  
  public ThemeSettings(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cik.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\feedback\ThemeSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */