package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import coi;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GeofencingRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new coi();
  public final int a;
  public final List b;
  public final int c;
  
  public GeofencingRequest(int paramInt1, List paramList, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    coi.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\GeofencingRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */