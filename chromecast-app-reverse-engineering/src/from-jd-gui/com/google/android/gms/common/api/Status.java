package com.google.android.gms.common.api;

import a;
import android.app.PendingIntent;
import android.os.Parcel;
import bwm;
import bwo;
import bzr;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class Status
  implements bwm, SafeParcelable
{
  public static final bwo CREATOR = new bwo();
  public static final Status a = new Status(0);
  public static final Status b;
  public static final Status c;
  public static final Status d;
  public final int e;
  public final int f;
  public final String g;
  public final PendingIntent h;
  
  static
  {
    new Status(14);
    b = new Status(8);
    c = new Status(15);
    d = new Status(16);
  }
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  public Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramString;
    this.h = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }
  
  public final boolean a()
  {
    if (this.f <= 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final Status b()
  {
    return this;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (!(paramObject instanceof Status)) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      paramObject = (Status)paramObject;
      bool1 = bool2;
      if (this.e == ((Status)paramObject).e)
      {
        bool1 = bool2;
        if (this.f == ((Status)paramObject).f)
        {
          bool1 = bool2;
          if (a.e(this.g, ((Status)paramObject).g))
          {
            bool1 = bool2;
            if (a.e(this.h, ((Status)paramObject).h)) {
              bool1 = true;
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h });
  }
  
  public final String toString()
  {
    bzr localbzr = a.b(this);
    String str;
    if (this.g != null) {
      str = this.g;
    }
    for (;;)
    {
      return localbzr.a("statusCode", str).a("resolution", this.h).toString();
      int i = this.f;
      switch (i)
      {
      default: 
        str = "unknown status code: " + i;
        break;
      case -1: 
        str = "SUCCESS_CACHE";
        break;
      case 0: 
        str = "SUCCESS";
        break;
      case 1: 
        str = "SERVICE_MISSING";
        break;
      case 2: 
        str = "SERVICE_VERSION_UPDATE_REQUIRED";
        break;
      case 3: 
        str = "SERVICE_DISABLED";
        break;
      case 4: 
        str = "SIGN_IN_REQUIRED";
        break;
      case 5: 
        str = "INVALID_ACCOUNT";
        break;
      case 6: 
        str = "RESOLUTION_REQUIRED";
        break;
      case 7: 
        str = "NETWORK_ERROR";
        break;
      case 8: 
        str = "INTERNAL_ERROR";
        break;
      case 9: 
        str = "SERVICE_INVALID";
        break;
      case 10: 
        str = "DEVELOPER_ERROR";
        break;
      case 11: 
        str = "LICENSE_CHECK_FAILED";
        break;
      case 13: 
        str = "ERROR_OPERATION_FAILED";
        break;
      case 14: 
        str = "INTERRUPTED";
        break;
      case 15: 
        str = "TIMEOUT";
        break;
      case 16: 
        str = "CANCELED";
        break;
      case 3000: 
        str = "AUTH_API_INVALID_CREDENTIALS";
        break;
      case 3001: 
        str = "AUTH_API_ACCESS_FORBIDDEN";
        break;
      case 3002: 
        str = "AUTH_API_CLIENT_ERROR";
        break;
      case 3003: 
        str = "AUTH_API_SERVER_ERROR";
        break;
      case 3004: 
        str = "AUTH_TOKEN_ERROR";
        break;
      case 3005: 
        str = "AUTH_URL_RESOLUTION";
      }
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bwo.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\common\api\Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */