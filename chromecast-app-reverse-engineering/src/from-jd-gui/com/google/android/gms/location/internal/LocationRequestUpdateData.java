package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import cof;
import cok;
import col;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import con;
import coo;

public class LocationRequestUpdateData
  implements SafeParcelable
{
  public static final cof CREATOR = new cof();
  public final int a;
  public int b;
  public LocationRequestInternal c;
  public con d;
  public PendingIntent e;
  public cok f;
  
  public LocationRequestUpdateData(int paramInt1, int paramInt2, LocationRequestInternal paramLocationRequestInternal, IBinder paramIBinder1, PendingIntent paramPendingIntent, IBinder paramIBinder2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramLocationRequestInternal;
    if (paramIBinder1 == null)
    {
      paramLocationRequestInternal = null;
      this.d = paramLocationRequestInternal;
      this.e = paramPendingIntent;
      if (paramIBinder2 != null) {
        break label63;
      }
    }
    label63:
    for (paramLocationRequestInternal = (LocationRequestInternal)localObject;; paramLocationRequestInternal = col.a(paramIBinder2))
    {
      this.f = paramLocationRequestInternal;
      return;
      paramLocationRequestInternal = coo.a(paramIBinder1);
      break;
    }
  }
  
  public static LocationRequestUpdateData a(cok paramcok)
  {
    return new LocationRequestUpdateData(1, 2, null, null, null, paramcok.asBinder());
  }
  
  public static LocationRequestUpdateData a(con paramcon)
  {
    return new LocationRequestUpdateData(1, 2, null, paramcon.asBinder(), null, null);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cof.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\internal\LocationRequestUpdateData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */