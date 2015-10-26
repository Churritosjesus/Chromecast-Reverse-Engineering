package com.google.android.gms.location;

import android.os.Parcel;
import cnf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class LocationAvailability
  implements SafeParcelable
{
  public static final cnf CREATOR = new cnf();
  public final int a;
  public int b;
  public int c;
  public long d;
  public int e;
  
  public LocationAvailability(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    this.a = paramInt1;
    this.e = paramInt2;
    this.b = paramInt3;
    this.c = paramInt4;
    this.d = paramLong;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (!(paramObject instanceof LocationAvailability)) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      paramObject = (LocationAvailability)paramObject;
      bool1 = bool2;
      if (this.e == ((LocationAvailability)paramObject).e)
      {
        bool1 = bool2;
        if (this.b == ((LocationAvailability)paramObject).b)
        {
          bool1 = bool2;
          if (this.c == ((LocationAvailability)paramObject).c)
          {
            bool1 = bool2;
            if (this.d == ((LocationAvailability)paramObject).d) {
              bool1 = true;
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.e), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d) });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LocationAvailability[isLocationAvailable: ");
    if (this.e < 1000) {}
    for (boolean bool = true;; bool = false) {
      return bool + "]";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cnf.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\LocationAvailability.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */