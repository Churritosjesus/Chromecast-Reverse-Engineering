package com.google.android.gms.common.api;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bxm;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Scope
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new bxm();
  public final int a;
  public final String b;
  
  public Scope(int paramInt, String paramString)
  {
    a.a(paramString, "scopeUri must not be null or empty");
    this.a = paramInt;
    this.b = paramString;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof Scope)) {
        bool = false;
      } else {
        bool = this.b.equals(((Scope)paramObject).b);
      }
    }
  }
  
  public final int hashCode()
  {
    return this.b.hashCode();
  }
  
  public final String toString()
  {
    return this.b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bxm.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\common\api\Scope.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */