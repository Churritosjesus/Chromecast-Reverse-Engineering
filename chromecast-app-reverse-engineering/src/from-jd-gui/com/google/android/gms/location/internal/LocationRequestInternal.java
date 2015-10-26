package com.google.android.gms.location.internal;

import a;
import android.os.Parcel;
import coe;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public class LocationRequestInternal
  implements SafeParcelable
{
  public static final coe CREATOR = new coe();
  public static final List a = ;
  public final int b;
  public LocationRequest c;
  public boolean d;
  public boolean e;
  public boolean f;
  public List g;
  public final String h;
  
  public LocationRequestInternal(int paramInt, LocationRequest paramLocationRequest, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, List paramList, String paramString)
  {
    this.b = paramInt;
    this.c = paramLocationRequest;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramBoolean3;
    this.g = paramList;
    this.h = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (!(paramObject instanceof LocationRequestInternal)) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      paramObject = (LocationRequestInternal)paramObject;
      bool1 = bool2;
      if (a.e(this.c, ((LocationRequestInternal)paramObject).c))
      {
        bool1 = bool2;
        if (this.d == ((LocationRequestInternal)paramObject).d)
        {
          bool1 = bool2;
          if (this.e == ((LocationRequestInternal)paramObject).e)
          {
            bool1 = bool2;
            if (this.f == ((LocationRequestInternal)paramObject).f)
            {
              bool1 = bool2;
              if (a.e(this.g, ((LocationRequestInternal)paramObject).g)) {
                bool1 = true;
              }
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    return this.c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.c.toString());
    localStringBuilder.append(" requestNlpDebugInfo=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(" restorePendingIntentListeners=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(" triggerUpdate=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(" clients=");
    localStringBuilder.append(this.g);
    if (this.h != null)
    {
      localStringBuilder.append(" tag=");
      localStringBuilder.append(this.h);
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    coe.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\internal\LocationRequestInternal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */