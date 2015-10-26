package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import coq;
import java.util.List;

public final class LocationSettingsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new coq();
  public final int a;
  public final List b;
  public final boolean c;
  public final boolean d;
  public final boolean e;
  
  public LocationSettingsRequest(int paramInt, List paramList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.a = paramInt;
    this.b = paramList;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    coq.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\LocationSettingsRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */