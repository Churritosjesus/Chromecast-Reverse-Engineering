import android.media.Rating;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

public final class cl
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new cm();
  private final int a;
  private final float b;
  
  cl(int paramInt, float paramFloat)
  {
    this.a = paramInt;
    this.b = paramFloat;
  }
  
  public static cl a(Object paramObject)
  {
    float f1 = 1.0F;
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramObject != null)
    {
      if (Build.VERSION.SDK_INT >= 21) {
        break label25;
      }
      localObject1 = localObject2;
    }
    for (;;)
    {
      return (cl)localObject1;
      label25:
      int i = ((Rating)paramObject).getRatingStyle();
      if (((Rating)paramObject).isRated()) {
        switch (i)
        {
        default: 
          localObject1 = localObject2;
          break;
        case 1: 
          if (((Rating)paramObject).hasHeart()) {}
          for (f1 = 1.0F;; f1 = 0.0F)
          {
            localObject1 = new cl(1, f1);
            break;
          }
        case 2: 
          if (((Rating)paramObject).isThumbUp()) {}
          for (;;)
          {
            localObject1 = new cl(2, f1);
            break;
            f1 = 0.0F;
          }
        case 3: 
        case 4: 
        case 5: 
          float f2 = ((Rating)paramObject).getStarRating();
          switch (i)
          {
          default: 
            Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
            paramObject = null;
          }
          for (;;)
          {
            localObject1 = paramObject;
            break;
            f1 = 3.0F;
            for (;;)
            {
              if ((f2 >= 0.0F) && (f2 <= f1)) {
                break label259;
              }
              Log.e("Rating", "Trying to set out of range star-based rating");
              paramObject = null;
              break;
              f1 = 4.0F;
              continue;
              f1 = 5.0F;
            }
            paramObject = new cl(i, f2);
          }
        case 6: 
          label259:
          f1 = ((Rating)paramObject).getPercentRating();
          if ((f1 < 0.0F) || (f1 > 100.0F))
          {
            Log.e("Rating", "Invalid percentage-based rating value");
            localObject1 = localObject2;
            continue;
          }
          localObject1 = new cl(6, f1);
          break;
        }
      } else {
        switch (i)
        {
        default: 
          localObject1 = localObject2;
          break;
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
          localObject1 = new cl(i, -1.0F);
        }
      }
    }
  }
  
  public final int describeContents()
  {
    return this.a;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Rating:style=").append(this.a).append(" rating=");
    if (this.b < 0.0F) {}
    for (String str = "unrated";; str = String.valueOf(this.b)) {
      return str;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeFloat(this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */