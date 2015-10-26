package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import cng;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class LocationRequest
  implements SafeParcelable
{
  public static final cng CREATOR = new cng();
  public final int a;
  public int b;
  public long c;
  public long d;
  public boolean e;
  public long f;
  public int g;
  public float h;
  public long i;
  
  public LocationRequest()
  {
    this.a = 1;
    this.b = 102;
    this.c = 3600000L;
    this.d = 600000L;
    this.e = false;
    this.f = Long.MAX_VALUE;
    this.g = Integer.MAX_VALUE;
    this.h = 0.0F;
    this.i = 0L;
  }
  
  public LocationRequest(int paramInt1, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, long paramLong3, int paramInt3, float paramFloat, long paramLong4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramBoolean;
    this.f = paramLong3;
    this.g = paramInt3;
    this.h = paramFloat;
    this.i = paramLong4;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof LocationRequest))
      {
        bool = false;
      }
      else
      {
        paramObject = (LocationRequest)paramObject;
        if ((this.b != ((LocationRequest)paramObject).b) || (this.c != ((LocationRequest)paramObject).c) || (this.d != ((LocationRequest)paramObject).d) || (this.e != ((LocationRequest)paramObject).e) || (this.f != ((LocationRequest)paramObject).f) || (this.g != ((LocationRequest)paramObject).g) || (this.h != ((LocationRequest)paramObject).h)) {
          bool = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Boolean.valueOf(this.e), Long.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h) });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("Request[");
    String str;
    switch (this.b)
    {
    case 101: 
    case 103: 
    default: 
      str = "???";
    }
    for (;;)
    {
      localStringBuilder2.append(str);
      if (this.b != 105)
      {
        localStringBuilder1.append(" requested=");
        localStringBuilder1.append(this.c + "ms");
      }
      localStringBuilder1.append(" fastest=");
      localStringBuilder1.append(this.d + "ms");
      if (this.i > this.c)
      {
        localStringBuilder1.append(" maxWait=");
        localStringBuilder1.append(this.i + "ms");
      }
      if (this.f != Long.MAX_VALUE)
      {
        long l1 = this.f;
        long l2 = SystemClock.elapsedRealtime();
        localStringBuilder1.append(" expireIn=");
        localStringBuilder1.append(l1 - l2 + "ms");
      }
      if (this.g != Integer.MAX_VALUE) {
        localStringBuilder1.append(" num=").append(this.g);
      }
      localStringBuilder1.append(']');
      return localStringBuilder1.toString();
      str = "PRIORITY_HIGH_ACCURACY";
      continue;
      str = "PRIORITY_BALANCED_POWER_ACCURACY";
      continue;
      str = "PRIORITY_LOW_POWER";
      continue;
      str = "PRIORITY_NO_POWER";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cng.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\LocationRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */