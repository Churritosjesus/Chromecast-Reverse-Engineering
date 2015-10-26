package com.google.android.gms.location.internal;

import a;
import android.os.Parcel;
import cnq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ClientIdentity
  implements SafeParcelable
{
  public static final cnq CREATOR = new cnq();
  public final int a;
  public final int b;
  public final String c;
  
  public ClientIdentity(int paramInt1, int paramInt2, String paramString)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (!(paramObject instanceof ClientIdentity)) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      paramObject = (ClientIdentity)paramObject;
      bool1 = bool2;
      if (((ClientIdentity)paramObject).b == this.b)
      {
        bool1 = bool2;
        if (a.e(((ClientIdentity)paramObject).c, this.c)) {
          bool1 = true;
        }
      }
    }
  }
  
  public int hashCode()
  {
    return this.b;
  }
  
  public String toString()
  {
    return String.format("%d:%s", new Object[] { Integer.valueOf(this.b), this.c });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cnq.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\internal\ClientIdentity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */