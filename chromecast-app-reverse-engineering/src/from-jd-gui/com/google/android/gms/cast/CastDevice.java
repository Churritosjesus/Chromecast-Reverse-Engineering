package com.google.android.gms.cast;

import a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bva;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class CastDevice
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new bva();
  public final int a;
  public String b;
  public String c;
  public Inet4Address d;
  public String e;
  public String f;
  public String g;
  public int h;
  public List i;
  public int j;
  public int k;
  
  private CastDevice()
  {
    this(3, null, null, null, null, null, -1, new ArrayList(), 0, -1);
  }
  
  public CastDevice(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, List paramList, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    if (this.c != null) {}
    try
    {
      paramString1 = InetAddress.getByName(this.c);
      if ((paramString1 instanceof Inet4Address)) {
        this.d = ((Inet4Address)paramString1);
      }
      this.e = paramString3;
      this.f = paramString4;
      this.g = paramString5;
      this.h = paramInt2;
      this.i = paramList;
      this.j = paramInt3;
      this.k = paramInt4;
      return;
    }
    catch (UnknownHostException paramString1)
    {
      for (;;)
      {
        this.d = null;
      }
    }
  }
  
  public static CastDevice a(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    for (paramBundle = null;; paramBundle = (CastDevice)paramBundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE"))
    {
      return paramBundle;
      paramBundle.setClassLoader(CastDevice.class.getClassLoader());
    }
  }
  
  public final boolean a(int paramInt)
  {
    if ((this.j & paramInt) == paramInt) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
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
      if (!(paramObject instanceof CastDevice))
      {
        bool = false;
      }
      else
      {
        paramObject = (CastDevice)paramObject;
        if (this.b == null)
        {
          if (((CastDevice)paramObject).b != null) {
            bool = false;
          }
        }
        else if ((!a.d(this.b, ((CastDevice)paramObject).b)) || (!a.d(this.d, ((CastDevice)paramObject).d)) || (!a.d(this.f, ((CastDevice)paramObject).f)) || (!a.d(this.e, ((CastDevice)paramObject).e)) || (!a.d(this.g, ((CastDevice)paramObject).g)) || (this.h != ((CastDevice)paramObject).h) || (!a.d(this.i, ((CastDevice)paramObject).i)) || (this.j != ((CastDevice)paramObject).j) || (this.k != ((CastDevice)paramObject).k)) {
          bool = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    if (this.b == null) {}
    for (int m = 0;; m = this.b.hashCode()) {
      return m;
    }
  }
  
  public String toString()
  {
    return String.format("\"%s\" (%s)", new Object[] { this.e, this.b });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bva.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\cast\CastDevice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */