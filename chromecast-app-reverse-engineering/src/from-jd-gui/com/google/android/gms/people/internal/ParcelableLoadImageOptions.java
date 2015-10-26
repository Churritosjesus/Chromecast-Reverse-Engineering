package com.google.android.gms.people.internal;

import a;
import android.os.Parcel;
import bzr;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cry;

public class ParcelableLoadImageOptions
  implements SafeParcelable
{
  public static final cry CREATOR = new cry();
  public final int a;
  public final int b;
  public final int c;
  public final boolean d;
  
  public ParcelableLoadImageOptions(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return a.b(this).a("imageSize", Integer.valueOf(this.b)).a("avatarOptions", Integer.valueOf(this.c)).a("useLargePictureForCp2Images", Boolean.valueOf(this.d)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cry.a(this, paramParcel);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\people\internal\ParcelableLoadImageOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */