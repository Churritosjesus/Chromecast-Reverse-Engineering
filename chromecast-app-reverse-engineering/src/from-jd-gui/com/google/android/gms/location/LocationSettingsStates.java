package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cor;

public final class LocationSettingsStates
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new cor();
  public final int a;
  public final boolean b;
  public final boolean c;
  public final boolean d;
  public final boolean e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  
  public LocationSettingsStates(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7)
  {
    this.a = paramInt;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramBoolean3;
    this.e = paramBoolean4;
    this.f = paramBoolean5;
    this.g = paramBoolean6;
    this.h = paramBoolean7;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cor.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\LocationSettingsStates.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */