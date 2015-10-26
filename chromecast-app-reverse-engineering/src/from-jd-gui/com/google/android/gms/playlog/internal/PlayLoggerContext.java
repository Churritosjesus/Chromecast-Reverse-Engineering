package com.google.android.gms.playlog.internal;

import a;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import csu;
import java.util.Arrays;

public class PlayLoggerContext
  implements SafeParcelable
{
  public static final csu CREATOR = new csu();
  public final int a;
  public final String b;
  public final int c;
  public final int d;
  public final String e;
  public final String f;
  public final boolean g;
  public final String h;
  public final boolean i;
  
  public PlayLoggerContext(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramBoolean1;
    this.h = paramString4;
    this.i = paramBoolean2;
  }
  
  public PlayLoggerContext(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    this.a = 1;
    this.b = ((String)a.c(paramString1));
    this.c = paramInt1;
    this.d = paramInt2;
    this.h = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      this.g = bool;
      this.i = paramBoolean;
      return;
    }
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
      if ((paramObject instanceof PlayLoggerContext))
      {
        paramObject = (PlayLoggerContext)paramObject;
        if ((!this.b.equals(((PlayLoggerContext)paramObject).b)) || (this.c != ((PlayLoggerContext)paramObject).c) || (this.d != ((PlayLoggerContext)paramObject).d) || (!a.e(this.h, ((PlayLoggerContext)paramObject).h)) || (!a.e(this.e, ((PlayLoggerContext)paramObject).e)) || (!a.e(this.f, ((PlayLoggerContext)paramObject).f)) || (this.g != ((PlayLoggerContext)paramObject).g) || (this.i != ((PlayLoggerContext)paramObject).i)) {
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
    return Arrays.hashCode(new Object[] { this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), this.h, this.e, this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.i) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PlayLoggerContext[");
    localStringBuilder.append("package=").append(this.b).append(',');
    localStringBuilder.append("versionCode=").append(this.a).append(',');
    localStringBuilder.append("logSource=").append(this.d).append(',');
    localStringBuilder.append("logSourceName=").append(this.h).append(',');
    localStringBuilder.append("uploadAccount=").append(this.e).append(',');
    localStringBuilder.append("loggingId=").append(this.f).append(',');
    localStringBuilder.append("logAndroidId=").append(this.g).append(',');
    localStringBuilder.append("isAnonymous=").append(this.i);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    csu.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\playlog\internal\PlayLoggerContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */