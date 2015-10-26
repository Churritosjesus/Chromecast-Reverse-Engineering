import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

public final class ci
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new cj();
  private static final ed a;
  private static final String[] b;
  private static final String[] c;
  private static final String[] d;
  private final Bundle e;
  private cf f;
  
  static
  {
    ed localed = new ed();
    a = localed;
    localed.put("android.media.metadata.TITLE", Integer.valueOf(1));
    a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
    a.put("android.media.metadata.DURATION", Integer.valueOf(0));
    a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
    a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
    a.put("android.media.metadata.WRITER", Integer.valueOf(1));
    a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
    a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
    a.put("android.media.metadata.DATE", Integer.valueOf(1));
    a.put("android.media.metadata.YEAR", Integer.valueOf(0));
    a.put("android.media.metadata.GENRE", Integer.valueOf(1));
    a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
    a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
    a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
    a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
    a.put("android.media.metadata.ART", Integer.valueOf(2));
    a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
    a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
    a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
    a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
    a.put("android.media.metadata.RATING", Integer.valueOf(3));
    a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
    a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
    a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
    a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
    a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
    a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
    b = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
    c = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
    d = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
  }
  
  ci(Bundle paramBundle)
  {
    this.e = new Bundle(paramBundle);
  }
  
  ci(Parcel paramParcel)
  {
    this.e = paramParcel.readBundle();
  }
  
  public static ci a(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {}
    ck localck;
    for (paramObject = null;; paramObject = new ci(localck.a))
    {
      return (ci)paramObject;
      localck = new ck();
      Iterator localIterator = ((MediaMetadata)paramObject).keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = (Integer)a.get(str);
        if (localObject != null)
        {
          long l;
          switch (((Integer)localObject).intValue())
          {
          default: 
            break;
          case 0: 
            l = ((MediaMetadata)paramObject).getLong(str);
            if ((a.containsKey(str)) && (((Integer)a.get(str)).intValue() != 0)) {
              throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
            }
          case 2: 
            localObject = ((MediaMetadata)paramObject).getBitmap(str);
            if ((a.containsKey(str)) && (((Integer)a.get(str)).intValue() != 2)) {
              throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
            }
            localck.a.putParcelable(str, (Parcelable)localObject);
            continue;
            localck.a.putLong(str, l);
            break;
          case 3: 
            localObject = cl.a(((MediaMetadata)paramObject).getRating(str));
            if ((a.containsKey(str)) && (((Integer)a.get(str)).intValue() != 3)) {
              throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
            }
            localck.a.putParcelable(str, (Parcelable)localObject);
            break;
          case 1: 
            localObject = ((MediaMetadata)paramObject).getText(str);
            if ((a.containsKey(str)) && (((Integer)a.get(str)).intValue() != 1)) {
              throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
            }
            localck.a.putCharSequence(str, (CharSequence)localObject);
          }
        }
      }
    }
  }
  
  private CharSequence a(String paramString)
  {
    return this.e.getCharSequence(paramString);
  }
  
  private String b(String paramString)
  {
    paramString = this.e.getCharSequence(paramString);
    if (paramString != null) {}
    for (paramString = paramString.toString();; paramString = null) {
      return paramString;
    }
  }
  
  private Bitmap c(String paramString)
  {
    try
    {
      paramString = (Bitmap)this.e.getParcelable(paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", paramString);
        paramString = null;
      }
    }
  }
  
  public final cf a()
  {
    ch localch = null;
    if (this.f != null) {}
    CharSequence[] arrayOfCharSequence;
    for (Object localObject1 = this.f;; localObject1 = this.f)
    {
      return (cf)localObject1;
      String str = b("android.media.metadata.MEDIA_ID");
      arrayOfCharSequence = new CharSequence[3];
      localObject1 = a("android.media.metadata.DISPLAY_TITLE");
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        break;
      }
      arrayOfCharSequence[0] = localObject1;
      arrayOfCharSequence[1] = a("android.media.metadata.DISPLAY_SUBTITLE");
      arrayOfCharSequence[2] = a("android.media.metadata.DISPLAY_DESCRIPTION");
      i = 0;
      label72:
      if (i >= c.length) {
        break label270;
      }
      localObject1 = c(c[i]);
      if (localObject1 == null) {
        break label258;
      }
      label96:
      i = 0;
      label99:
      Object localObject2 = localch;
      if (i < d.length)
      {
        localObject2 = b(d[i]);
        if (TextUtils.isEmpty((CharSequence)localObject2)) {
          break label264;
        }
        localObject2 = Uri.parse((String)localObject2);
      }
      localch = new ch();
      localch.a = str;
      localch.b = arrayOfCharSequence[0];
      localch.c = arrayOfCharSequence[1];
      localch.d = arrayOfCharSequence[2];
      localch.e = ((Bitmap)localObject1);
      localch.f = ((Uri)localObject2);
      this.f = localch.a();
    }
    int j = 0;
    int i = 0;
    label203:
    if ((i < 3) && (j < b.length))
    {
      localObject1 = a(b[j]);
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        break label275;
      }
      int k = i + 1;
      arrayOfCharSequence[i] = localObject1;
      i = k;
    }
    label258:
    label264:
    label270:
    label275:
    for (;;)
    {
      j++;
      break label203;
      break;
      i++;
      break label72;
      i++;
      break label99;
      localObject1 = null;
      break label96;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(this.e);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */