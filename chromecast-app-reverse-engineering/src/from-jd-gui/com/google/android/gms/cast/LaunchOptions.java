package com.google.android.gms.cast;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bvb;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class LaunchOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new bvb();
  public final int a;
  public boolean b;
  public String c;
  
  public LaunchOptions()
  {
    this(1, false, localStringBuilder.toString());
  }
  
  public LaunchOptions(int paramInt, boolean paramBoolean, String paramString)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof LaunchOptions))
      {
        bool = false;
      }
      else
      {
        paramObject = (LaunchOptions)paramObject;
        if ((this.b != ((LaunchOptions)paramObject).b) || (!a.d(this.c, ((LaunchOptions)paramObject).c))) {
          bool = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Boolean.valueOf(this.b), this.c });
  }
  
  public String toString()
  {
    return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[] { Boolean.valueOf(this.b), this.c });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bvb.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\cast\LaunchOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */