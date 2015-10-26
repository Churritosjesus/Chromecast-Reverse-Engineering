package com.google.android.gms.auth;

import a;
import android.os.Parcel;
import bsl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class AccountChangeEventsResponse
  implements SafeParcelable
{
  public static final bsl CREATOR = new bsl();
  public final int a;
  public final List b;
  
  public AccountChangeEventsResponse(int paramInt, List paramList)
  {
    this.a = paramInt;
    this.b = ((List)a.c(paramList));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bsl.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\auth\AccountChangeEventsResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */