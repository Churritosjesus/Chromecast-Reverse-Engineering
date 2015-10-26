package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import csx;
import java.util.List;
import java.util.Set;

public class CheckServerAuthResult
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new csx();
  public final int a;
  public final boolean b;
  public final List c;
  
  public CheckServerAuthResult(int paramInt, boolean paramBoolean, List paramList)
  {
    this.a = paramInt;
    this.b = paramBoolean;
    this.c = paramList;
  }
  
  public CheckServerAuthResult(boolean paramBoolean, Set paramSet) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    csx.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\signin\internal\CheckServerAuthResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */