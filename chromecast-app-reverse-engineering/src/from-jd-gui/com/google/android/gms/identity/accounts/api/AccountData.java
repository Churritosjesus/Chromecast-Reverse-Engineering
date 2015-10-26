package com.google.android.gms.identity.accounts.api;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import cim;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class AccountData
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new cim();
  public final int a;
  public final String b;
  public final String c;
  
  public AccountData(int paramInt, String paramString1, String paramString2)
  {
    a.a(paramString1, "Account name must not be empty.");
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  private AccountData(String paramString1, String paramString2)
  {
    this(1, paramString1, null);
  }
  
  public static AccountData a(String paramString)
  {
    a.a(paramString, "Account name must not be empty.");
    return new AccountData(paramString, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cim.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\identity\accounts\api\AccountData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */