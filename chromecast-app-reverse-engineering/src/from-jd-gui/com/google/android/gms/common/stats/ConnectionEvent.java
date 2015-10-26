package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bzv;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ConnectionEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new bzv();
  public final int a;
  public final long b;
  public String c;
  public final String d;
  public final String e;
  public final String f;
  public final String g;
  public final String h;
  public final long i;
  public final long j;
  public final long k;
  
  public ConnectionEvent(int paramInt, long paramLong1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3, long paramLong4)
  {
    this.a = paramInt;
    this.b = paramLong1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramString5;
    this.h = paramString6;
    this.i = paramLong2;
    this.j = paramLong3;
    this.k = paramLong4;
  }
  
  public ConnectionEvent(long paramLong1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3, long paramLong4)
  {
    this(1, paramLong1, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramLong2, paramLong3, paramLong4);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bzv.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\common\stats\ConnectionEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */