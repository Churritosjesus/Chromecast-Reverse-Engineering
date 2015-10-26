package com.google.android.gms.cast.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bum;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class DeviceStatus
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new bum();
  public final int a;
  public double b;
  public boolean c;
  public int d;
  public ApplicationMetadata e;
  public int f;
  
  public DeviceStatus()
  {
    this(3, NaN.0D, false, -1, null, -1);
  }
  
  public DeviceStatus(int paramInt1, double paramDouble, boolean paramBoolean, int paramInt2, ApplicationMetadata paramApplicationMetadata, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramDouble;
    this.c = paramBoolean;
    this.d = paramInt2;
    this.e = paramApplicationMetadata;
    this.f = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof DeviceStatus))
      {
        bool = false;
      }
      else
      {
        paramObject = (DeviceStatus)paramObject;
        if ((this.b != ((DeviceStatus)paramObject).b) || (this.c != ((DeviceStatus)paramObject).c) || (this.d != ((DeviceStatus)paramObject).d) || (!a.d(this.e, ((DeviceStatus)paramObject).e)) || (this.f != ((DeviceStatus)paramObject).f)) {
          bool = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Double.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), this.e, Integer.valueOf(this.f) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bum.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\cast\internal\DeviceStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */