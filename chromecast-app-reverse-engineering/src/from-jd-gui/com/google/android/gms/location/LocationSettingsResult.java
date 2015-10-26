package com.google.android.gms.location;

import android.os.Parcel;
import bwm;
import cnk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LocationSettingsResult
  implements bwm, SafeParcelable
{
  public static final cnk CREATOR = new cnk();
  public final int a;
  public final Status b;
  public final LocationSettingsStates c;
  
  public LocationSettingsResult(int paramInt, Status paramStatus, LocationSettingsStates paramLocationSettingsStates)
  {
    this.a = paramInt;
    this.b = paramStatus;
    this.c = paramLocationSettingsStates;
  }
  
  public final Status b()
  {
    return this.b;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cnk.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\LocationSettingsResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */