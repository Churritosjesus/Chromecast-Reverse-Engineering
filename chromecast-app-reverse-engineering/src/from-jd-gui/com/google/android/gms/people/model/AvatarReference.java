package com.google.android.gms.people.model;

import a;
import android.os.Parcel;
import bzr;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import css;

public final class AvatarReference
  implements SafeParcelable
{
  public static final css CREATOR = new css();
  public final int a;
  public final int b;
  public final String c;
  
  public AvatarReference(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt2 != 0) {}
    for (boolean bool = true;; bool = false)
    {
      a.a(bool);
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramString;
      return;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return a.b(this).a("source", Integer.valueOf(this.b)).a("location", this.c).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    css.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\people\model\AvatarReference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */