package com.google.android.gms.common;

import a;
import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import bvo;
import bzr;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class ConnectionResult
  implements SafeParcelable
{
  public static final bvo CREATOR = new bvo();
  public static final ConnectionResult a = new ConnectionResult(0, null);
  public final int b;
  public final int c;
  public final PendingIntent d;
  
  public ConnectionResult(int paramInt1, int paramInt2, PendingIntent paramPendingIntent)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramPendingIntent;
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramPendingIntent);
  }
  
  public final void a(Activity paramActivity, int paramInt)
  {
    if (!a()) {}
    for (;;)
    {
      return;
      paramActivity.startIntentSenderForResult(this.d.getIntentSender(), paramInt, null, 0, 0, 0);
    }
  }
  
  public final boolean a()
  {
    if ((this.c != 0) && (this.d != null)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean b()
  {
    if (this.c == 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof ConnectionResult))
      {
        bool = false;
      }
      else
      {
        paramObject = (ConnectionResult)paramObject;
        if ((this.c != ((ConnectionResult)paramObject).c) || (!a.e(this.d, ((ConnectionResult)paramObject).d))) {
          bool = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.c), this.d });
  }
  
  public final String toString()
  {
    bzr localbzr = a.b(this);
    String str;
    switch (this.c)
    {
    case 12: 
    default: 
      str = "unknown status code " + this.c;
    }
    for (;;)
    {
      return localbzr.a("statusCode", str).a("resolution", this.d).toString();
      str = "SUCCESS";
      continue;
      str = "SERVICE_MISSING";
      continue;
      str = "SERVICE_VERSION_UPDATE_REQUIRED";
      continue;
      str = "SERVICE_DISABLED";
      continue;
      str = "SIGN_IN_REQUIRED";
      continue;
      str = "INVALID_ACCOUNT";
      continue;
      str = "RESOLUTION_REQUIRED";
      continue;
      str = "NETWORK_ERROR";
      continue;
      str = "INTERNAL_ERROR";
      continue;
      str = "SERVICE_INVALID";
      continue;
      str = "DEVELOPER_ERROR";
      continue;
      str = "LICENSE_CHECK_FAILED";
      continue;
      str = "CANCELED";
      continue;
      str = "TIMEOUT";
      continue;
      str = "INTERRUPTED";
      continue;
      str = "API_UNAVAILABLE";
      continue;
      str = "SIGN_IN_FAILED";
      continue;
      str = "SERVICE_UPDATING";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bvo.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\common\ConnectionResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */