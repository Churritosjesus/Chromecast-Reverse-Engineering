import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class cf
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new cg();
  public final CharSequence a;
  public final CharSequence b;
  public final Bitmap c;
  public final Uri d;
  private final String e;
  private final CharSequence f;
  private final Bundle g;
  private Object h;
  
  cf(Parcel paramParcel)
  {
    this.e = paramParcel.readString();
    this.a = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.f = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.c = ((Bitmap)paramParcel.readParcelable(null));
    this.d = ((Uri)paramParcel.readParcelable(null));
    this.g = paramParcel.readBundle();
  }
  
  cf(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri, Bundle paramBundle)
  {
    this.e = paramString;
    this.a = paramCharSequence1;
    this.b = paramCharSequence2;
    this.f = paramCharSequence3;
    this.c = paramBitmap;
    this.d = paramUri;
    this.g = paramBundle;
  }
  
  public static cf a(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {}
    Object localObject;
    for (paramObject = null;; paramObject = localObject)
    {
      return (cf)paramObject;
      localObject = new ch();
      ((ch)localObject).a = ((MediaDescription)paramObject).getMediaId();
      ((ch)localObject).b = ((MediaDescription)paramObject).getTitle();
      ((ch)localObject).c = ((MediaDescription)paramObject).getSubtitle();
      ((ch)localObject).d = ((MediaDescription)paramObject).getDescription();
      ((ch)localObject).e = ((MediaDescription)paramObject).getIconBitmap();
      ((ch)localObject).f = ((MediaDescription)paramObject).getIconUri();
      ((ch)localObject).g = ((MediaDescription)paramObject).getExtras();
      localObject = ((ch)localObject).a();
      ((cf)localObject).h = paramObject;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return this.a + ", " + this.b + ", " + this.f;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      paramParcel.writeString(this.e);
      TextUtils.writeToParcel(this.a, paramParcel, paramInt);
      TextUtils.writeToParcel(this.b, paramParcel, paramInt);
      TextUtils.writeToParcel(this.f, paramParcel, paramInt);
      paramParcel.writeParcelable(this.c, paramInt);
      paramParcel.writeParcelable(this.d, paramInt);
      paramParcel.writeBundle(this.g);
      return;
    }
    if ((this.h != null) || (Build.VERSION.SDK_INT < 21)) {}
    for (Object localObject1 = this.h;; localObject1 = this.h)
    {
      ((MediaDescription)localObject1).writeToParcel(paramParcel, paramInt);
      break;
      localObject1 = new MediaDescription.Builder();
      Object localObject2 = this.e;
      ((MediaDescription.Builder)localObject1).setMediaId((String)localObject2);
      localObject2 = this.a;
      ((MediaDescription.Builder)localObject1).setTitle((CharSequence)localObject2);
      localObject2 = this.b;
      ((MediaDescription.Builder)localObject1).setSubtitle((CharSequence)localObject2);
      localObject2 = this.f;
      ((MediaDescription.Builder)localObject1).setDescription((CharSequence)localObject2);
      localObject2 = this.c;
      ((MediaDescription.Builder)localObject1).setIconBitmap((Bitmap)localObject2);
      localObject2 = this.d;
      ((MediaDescription.Builder)localObject1).setIconUri((Uri)localObject2);
      localObject2 = this.g;
      ((MediaDescription.Builder)localObject1).setExtras((Bundle)localObject2);
      this.h = ((MediaDescription.Builder)localObject1).build();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */