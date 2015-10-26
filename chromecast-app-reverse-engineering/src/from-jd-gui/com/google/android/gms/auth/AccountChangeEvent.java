package com.google.android.gms.auth;

import a;
import android.os.Parcel;
import bsj;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class AccountChangeEvent
  implements SafeParcelable
{
  public static final bsj CREATOR = new bsj();
  public final int a;
  public final long b;
  public final String c;
  public final int d;
  public final int e;
  public final String f;
  
  public AccountChangeEvent(int paramInt1, long paramLong, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    this.a = paramInt1;
    this.b = paramLong;
    this.c = ((String)a.c(paramString1));
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramString2;
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
      if ((paramObject instanceof AccountChangeEvent))
      {
        paramObject = (AccountChangeEvent)paramObject;
        if ((this.a != ((AccountChangeEvent)paramObject).a) || (this.b != ((AccountChangeEvent)paramObject).b) || (!a.e(this.c, ((AccountChangeEvent)paramObject).c)) || (this.d != ((AccountChangeEvent)paramObject).d) || (this.e != ((AccountChangeEvent)paramObject).e) || (!a.e(this.f, ((AccountChangeEvent)paramObject).f))) {
          bool = false;
        }
      }
      else
      {
        bool = false;
      }
    }
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f });
  }
  
  public String toString()
  {
    String str = "UNKNOWN";
    switch (this.d)
    {
    }
    for (;;)
    {
      return "AccountChangeEvent {accountName = " + this.c + ", changeType = " + str + ", changeData = " + this.f + ", eventIndex = " + this.e + "}";
      str = "ADDED";
      continue;
      str = "REMOVED";
      continue;
      str = "RENAMED_TO";
      continue;
      str = "RENAMED_FROM";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bsj.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\auth\AccountChangeEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */