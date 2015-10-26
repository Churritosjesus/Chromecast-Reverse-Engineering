package com.google.android.gms.common.images;

import a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import byc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class WebImage
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new byc();
  public final int a;
  public final Uri b;
  public final int c;
  public final int d;
  
  public WebImage(int paramInt1, Uri paramUri, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramUri;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  private WebImage(Uri paramUri, int paramInt1, int paramInt2)
  {
    this(1, paramUri, paramInt1, paramInt2);
    if (paramUri == null) {
      throw new IllegalArgumentException("url cannot be null");
    }
    if ((paramInt1 < 0) || (paramInt2 < 0)) {
      throw new IllegalArgumentException("width and height must not be negative");
    }
  }
  
  public WebImage(JSONObject paramJSONObject)
  {
    this(a(paramJSONObject), paramJSONObject.optInt("width", 0), paramJSONObject.optInt("height", 0));
  }
  
  private static Uri a(JSONObject paramJSONObject)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramJSONObject.has("url")) {}
    try
    {
      localObject1 = Uri.parse(paramJSONObject.getString("url"));
      return (Uri)localObject1;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        localObject1 = localObject2;
      }
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if ((paramObject == null) || (!(paramObject instanceof WebImage)))
      {
        bool = false;
      }
      else
      {
        paramObject = (WebImage)paramObject;
        if ((!a.e(this.b, ((WebImage)paramObject).b)) || (this.c != ((WebImage)paramObject).c) || (this.d != ((WebImage)paramObject).d)) {
          bool = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.b, Integer.valueOf(this.c), Integer.valueOf(this.d) });
  }
  
  public final String toString()
  {
    return String.format("Image %dx%d %s", new Object[] { Integer.valueOf(this.c), Integer.valueOf(this.d), this.b.toString() });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byc.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\common\images\WebImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */