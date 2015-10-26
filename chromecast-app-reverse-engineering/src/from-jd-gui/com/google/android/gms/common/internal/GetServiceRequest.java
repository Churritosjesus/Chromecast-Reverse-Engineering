package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import byh;
import byn;
import bzg;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetServiceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new byn();
  public final int a;
  public final int b;
  public int c;
  public String d;
  public IBinder e;
  public Scope[] f;
  public Bundle g;
  public Account h;
  
  public GetServiceRequest(int paramInt)
  {
    this.a = 2;
    this.c = 7327000;
    this.b = paramInt;
  }
  
  public GetServiceRequest(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramString;
    if (paramInt1 < 2)
    {
      paramString = null;
      if (paramIBinder != null) {
        paramString = byh.a(bzg.a(paramIBinder));
      }
    }
    for (this.h = paramString;; this.h = paramAccount)
    {
      this.f = paramArrayOfScope;
      this.g = paramBundle;
      return;
      this.e = paramIBinder;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byn.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\common\internal\GetServiceRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */