package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import bsk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AccountChangeEventsRequest
  implements SafeParcelable
{
  public static final bsk CREATOR = new bsk();
  public final int a;
  public int b;
  @Deprecated
  public String c;
  public Account d;
  
  public AccountChangeEventsRequest()
  {
    this.a = 1;
  }
  
  public AccountChangeEventsRequest(int paramInt1, int paramInt2, String paramString, Account paramAccount)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
    if ((paramAccount == null) && (!TextUtils.isEmpty(paramString))) {}
    for (this.d = new Account(paramString, "com.google");; this.d = paramAccount) {
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bsk.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\auth\AccountChangeEventsRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */