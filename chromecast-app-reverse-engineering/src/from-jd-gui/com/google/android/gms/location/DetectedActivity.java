package com.google.android.gms.location;

import android.os.Parcel;
import cnb;
import cnc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity
  implements SafeParcelable
{
  public static final cnc CREATOR = new cnc();
  public final int a;
  public int b;
  public int c;
  
  static
  {
    new cnb();
  }
  
  public DetectedActivity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  public final int a()
  {
    int j = this.b;
    int i = j;
    if (j > 14) {
      i = 4;
    }
    return i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("DetectedActivity [type=");
    int i = a();
    String str;
    switch (i)
    {
    case 6: 
    default: 
      str = Integer.toString(i);
    }
    for (;;)
    {
      return str + ", confidence=" + this.c + "]";
      str = "IN_VEHICLE";
      continue;
      str = "ON_BICYCLE";
      continue;
      str = "ON_FOOT";
      continue;
      str = "STILL";
      continue;
      str = "UNKNOWN";
      continue;
      str = "TILTING";
      continue;
      str = "WALKING";
      continue;
      str = "RUNNING";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cnc.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\DetectedActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */