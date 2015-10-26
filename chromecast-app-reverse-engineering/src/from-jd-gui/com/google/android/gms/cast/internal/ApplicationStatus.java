package com.google.android.gms.cast.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import btz;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class ApplicationStatus
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new btz();
  public final int a;
  public String b;
  
  public ApplicationStatus()
  {
    this(1, null);
  }
  
  public ApplicationStatus(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof ApplicationStatus))
      {
        bool = false;
      }
      else
      {
        paramObject = (ApplicationStatus)paramObject;
        bool = a.d(this.b, ((ApplicationStatus)paramObject).b);
      }
    }
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.b });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    btz.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\cast\internal\ApplicationStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */