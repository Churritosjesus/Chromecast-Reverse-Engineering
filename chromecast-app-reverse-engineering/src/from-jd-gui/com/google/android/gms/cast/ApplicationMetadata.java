package com.google.android.gms.cast;

import a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import buz;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ApplicationMetadata
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new buz();
  public final int a;
  public String b;
  public String c;
  public List d;
  public List e;
  public String f;
  public Uri g;
  
  private ApplicationMetadata()
  {
    this.a = 1;
    this.d = new ArrayList();
    this.e = new ArrayList();
  }
  
  public ApplicationMetadata(int paramInt, String paramString1, String paramString2, List paramList1, List paramList2, String paramString3, Uri paramUri)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramList1;
    this.e = paramList2;
    this.f = paramString3;
    this.g = paramUri;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof ApplicationMetadata))
      {
        bool = false;
      }
      else
      {
        paramObject = (ApplicationMetadata)paramObject;
        if ((!a.d(this.b, ((ApplicationMetadata)paramObject).b)) || (!a.d(this.d, ((ApplicationMetadata)paramObject).d)) || (!a.d(this.c, ((ApplicationMetadata)paramObject).c)) || (!a.d(this.e, ((ApplicationMetadata)paramObject).e)) || (!a.d(this.f, ((ApplicationMetadata)paramObject).f)) || (!a.d(this.g, ((ApplicationMetadata)paramObject).g))) {
          bool = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g });
  }
  
  public final String toString()
  {
    int j = 0;
    StringBuilder localStringBuilder = new StringBuilder("applicationId: ").append(this.b).append(", name: ").append(this.c).append(", images.count: ");
    if (this.d == null)
    {
      i = 0;
      localStringBuilder = localStringBuilder.append(i).append(", namespaces.count: ");
      if (this.e != null) {
        break label111;
      }
    }
    label111:
    for (int i = j;; i = this.e.size())
    {
      return i + ", senderAppIdentifier: " + this.f + ", senderAppLaunchUrl: " + this.g;
      i = this.d.size();
      break;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    buz.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\cast\ApplicationMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */