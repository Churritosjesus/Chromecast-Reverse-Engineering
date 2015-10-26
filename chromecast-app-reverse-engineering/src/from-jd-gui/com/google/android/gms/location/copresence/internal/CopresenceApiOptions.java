package com.google.android.gms.location.copresence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import cnm;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CopresenceApiOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new cnm();
  public static final CopresenceApiOptions a = new CopresenceApiOptions(true);
  public final int b;
  public final boolean c;
  
  public CopresenceApiOptions(int paramInt, boolean paramBoolean)
  {
    this.b = paramInt;
    this.c = paramBoolean;
  }
  
  private CopresenceApiOptions(boolean paramBoolean)
  {
    this(1, true);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cnm.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\location\copresence\internal\CopresenceApiOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */