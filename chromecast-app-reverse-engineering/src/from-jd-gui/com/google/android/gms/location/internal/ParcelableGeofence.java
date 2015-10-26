package com.google.android.gms.location.internal;

import android.os.Parcel;
import cog;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public class ParcelableGeofence
  implements SafeParcelable
{
  public static final cog CREATOR = new cog();
  public final int a;
  public final String b;
  public final long c;
  public final short d;
  public final double e;
  public final double f;
  public final float g;
  public final int h;
  public final int i;
  public final int j;
  
  public ParcelableGeofence(int paramInt1, String paramString, int paramInt2, short paramShort, double paramDouble1, double paramDouble2, float paramFloat, long paramLong, int paramInt3, int paramInt4)
  {
    if ((paramString == null) || (paramString.length() > 100)) {
      throw new IllegalArgumentException("requestId is null or too long: " + paramString);
    }
    if (paramFloat <= 0.0F) {
      throw new IllegalArgumentException("invalid radius: " + paramFloat);
    }
    if ((paramDouble1 > 90.0D) || (paramDouble1 < -90.0D)) {
      throw new IllegalArgumentException("invalid latitude: " + paramDouble1);
    }
    if ((paramDouble2 > 180.0D) || (paramDouble2 < -180.0D)) {
      throw new IllegalArgumentException("invalid longitude: " + paramDouble2);
    }
    int k = paramInt2 & 0x7;
    if (k == 0) {
      throw new IllegalArgumentException("No supported transition specified: " + paramInt2);
    }
    this.a = paramInt1;
    this.d = paramShort;
    this.b = paramString;
    this.e = paramDouble1;
    this.f = paramDouble2;
    this.g = paramFloat;
    this.c = paramLong;
    this.h = k;
    this.i = paramInt3;
    this.j = paramInt4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (paramObject == null)
      {
        bool = false;
      }
      else if (!(paramObject instanceof ParcelableGeofence))
      {
        bool = false;
      }
      else
      {
        paramObject = (ParcelableGeofence)paramObject;
        if (this.g != ((ParcelableGeofence)paramObject).g) {
          bool = false;
        } else if (this.e != ((ParcelableGeofence)paramObject).e) {
          bool = false;
        } else if (this.f != ((ParcelableGeofence)paramObject).f) {
          bool = false;
        } else if (this.d != ((ParcelableGeofence)paramObject).d) {
          bool = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    long l = Double.doubleToLongBits(this.e);
    int k = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(this.f);
    return ((((k + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(this.g)) * 31 + this.d) * 31 + this.h;
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    switch (this.d)
    {
    }
    for (String str = null;; str = "CIRCLE") {
      return String.format(localLocale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] { str, this.b, Integer.valueOf(this.h), Double.valueOf(this.e), Double.valueOf(this.f), Float.valueOf(this.g), Integer.valueOf(this.i / 1000), Integer.valueOf(this.j), Long.valueOf(this.c) });
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cog.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\internal\ParcelableGeofence.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */