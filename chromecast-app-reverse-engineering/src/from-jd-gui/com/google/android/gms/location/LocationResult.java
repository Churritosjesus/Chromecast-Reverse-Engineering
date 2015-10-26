package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import cnh;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult
  implements SafeParcelable
{
  public static final cnh CREATOR = new cnh();
  public static final List a = ;
  public final int b;
  public final List c;
  
  public LocationResult(int paramInt, List paramList)
  {
    this.b = paramInt;
    this.c = paramList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (!(paramObject instanceof LocationResult)) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      paramObject = (LocationResult)paramObject;
      if (((LocationResult)paramObject).c.size() != this.c.size())
      {
        bool = false;
      }
      else
      {
        paramObject = ((LocationResult)paramObject).c.iterator();
        Iterator localIterator = this.c.iterator();
        for (;;)
        {
          if (((Iterator)paramObject).hasNext())
          {
            Location localLocation1 = (Location)localIterator.next();
            Location localLocation2 = (Location)((Iterator)paramObject).next();
            if (localLocation1.getTime() != localLocation2.getTime())
            {
              bool = false;
              break;
            }
          }
        }
        bool = true;
      }
    }
  }
  
  public final int hashCode()
  {
    Iterator localIterator = this.c.iterator();
    long l;
    for (int i = 17; localIterator.hasNext(); i = (int)(l ^ l >>> 32) + i * 31) {
      l = ((Location)localIterator.next()).getTime();
    }
    return i;
  }
  
  public final String toString()
  {
    return "LocationResult[locations: " + this.c + "]";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cnh.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\LocationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */