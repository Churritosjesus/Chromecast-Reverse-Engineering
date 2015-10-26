package com.google.android.gms.people.identity.internal;

import a;
import android.os.Bundle;
import android.os.Parcel;
import bzr;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import crn;

public final class ParcelableGetOptions
  implements SafeParcelable
{
  public static final crn CREATOR = new crn();
  public final int a;
  public final boolean b;
  public final boolean c;
  public final String d;
  public final boolean e;
  public final Bundle f;
  
  public ParcelableGetOptions(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString, Bundle paramBundle)
  {
    this.a = paramInt;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramString;
    this.e = paramBoolean3;
    paramString = paramBundle;
    if (paramBundle == null) {
      paramString = new Bundle();
    }
    this.f = paramString;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return a.b(this).a("useOfflineDatabase", Boolean.valueOf(this.b)).a("useWebData", Boolean.valueOf(this.c)).a("endpoint", this.d).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    crn.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\people\identity\internal\ParcelableGetOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */