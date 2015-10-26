package com.google.android.gms.people.identity.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cri;

public final class AccountToken
  implements SafeParcelable
{
  public static final cri CREATOR = new cri();
  public final int a;
  public final String b;
  public final String c;
  
  public AccountToken(int paramInt, String paramString1, String paramString2)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cri.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\people\identity\internal\AccountToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */