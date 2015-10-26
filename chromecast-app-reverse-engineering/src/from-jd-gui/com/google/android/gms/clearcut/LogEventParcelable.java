package com.google.android.gms.clearcut;

import a;
import android.os.Parcel;
import bvk;
import bvn;
import cmy;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;

public class LogEventParcelable
  implements SafeParcelable
{
  public static final bvn CREATOR = new bvn();
  public final int a;
  public PlayLoggerContext b;
  public byte[] c;
  public final cmy d;
  public final bvk e;
  
  public LogEventParcelable(int paramInt, PlayLoggerContext paramPlayLoggerContext, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramPlayLoggerContext;
    this.c = paramArrayOfByte;
    this.d = null;
    this.e = null;
  }
  
  public LogEventParcelable(PlayLoggerContext paramPlayLoggerContext, cmy paramcmy, bvk parambvk)
  {
    this.a = 1;
    this.b = paramPlayLoggerContext;
    this.d = paramcmy;
    this.e = parambvk;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if ((paramObject instanceof LogEventParcelable))
      {
        paramObject = (LogEventParcelable)paramObject;
        if ((this.a != ((LogEventParcelable)paramObject).a) || (!a.e(this.b, ((LogEventParcelable)paramObject).b)) || (!Arrays.equals(this.c, ((LogEventParcelable)paramObject).c)) || (!a.e(this.d, ((LogEventParcelable)paramObject).d)) || (!a.e(this.e, ((LogEventParcelable)paramObject).e))) {
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
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.a), this.b, this.c, this.d, this.e });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LogEventParcelable[");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", ");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", ");
    if (this.c == null) {}
    for (String str = null;; str = new String(this.c))
    {
      localStringBuilder.append(str);
      localStringBuilder.append(", ");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", ");
      localStringBuilder.append(this.e);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bvn.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\clearcut\LogEventParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */