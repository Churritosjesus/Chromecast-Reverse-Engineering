import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView.ScaleType;

public final class aez
  extends ads
{
  private static final Object q = new Object();
  private final aea l;
  private final Bitmap.Config m;
  private final int n;
  private final int o;
  private ImageView.ScaleType p;
  
  public aez(String paramString, aea paramaea, int paramInt1, int paramInt2, ImageView.ScaleType paramScaleType, Bitmap.Config paramConfig, adz paramadz)
  {
    super(0, paramString, paramadz);
    this.i = new aec(1000, 2, 2.0F);
    this.l = paramaea;
    this.m = paramConfig;
    this.n = paramInt1;
    this.o = paramInt2;
    this.p = paramScaleType;
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    double d = Math.min(paramInt1 / paramInt3, paramInt2 / paramInt4);
    for (float f = 1.0F; f * 2.0F <= d; f *= 2.0F) {}
    return (int)f;
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, ImageView.ScaleType paramScaleType)
  {
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      i = paramInt3;
    }
    for (;;)
    {
      return i;
      if (paramScaleType == ImageView.ScaleType.FIT_XY)
      {
        i = paramInt1;
        if (paramInt1 == 0) {
          i = paramInt3;
        }
      }
      else if (paramInt1 == 0)
      {
        i = (int)(paramInt2 / paramInt4 * paramInt3);
      }
      else
      {
        i = paramInt1;
        if (paramInt2 != 0)
        {
          double d = paramInt4 / paramInt3;
          if (paramScaleType == ImageView.ScaleType.CENTER_CROP)
          {
            i = paramInt1;
            if (paramInt1 * d < paramInt2) {
              i = (int)(paramInt2 / d);
            }
          }
          else
          {
            i = paramInt1;
            if (paramInt1 * d > paramInt2) {
              i = (int)(paramInt2 / d);
            }
          }
        }
      }
    }
  }
  
  protected final ady a(adp paramadp)
  {
    for (;;)
    {
      Object localObject3;
      synchronized (q)
      {
        try
        {
          localObject1 = paramadp.b;
          localObject3 = new android/graphics/BitmapFactory$Options;
          ((BitmapFactory.Options)localObject3).<init>();
          if ((this.n != 0) || (this.o != 0)) {
            continue;
          }
          ((BitmapFactory.Options)localObject3).inPreferredConfig = this.m;
          localObject1 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject3);
          if (localObject1 != null) {
            break label272;
          }
          localObject1 = new adr;
          ((adr)localObject1).<init>(paramadp);
          localObject1 = ady.a((aef)localObject1);
          paramadp = (adp)localObject1;
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          Object localObject1;
          int i1;
          int k;
          int i;
          int j;
          aeg.c("Caught OOM for %d byte image, url=%s", new Object[] { Integer.valueOf(paramadp.b.length), this.b });
          paramadp = new adr;
          paramadp.<init>(localOutOfMemoryError);
          paramadp = ady.a(paramadp);
          continue;
        }
        return paramadp;
        ((BitmapFactory.Options)localObject3).inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject3);
        i1 = ((BitmapFactory.Options)localObject3).outWidth;
        k = ((BitmapFactory.Options)localObject3).outHeight;
        i = a(this.n, this.o, i1, k, this.p);
        j = a(this.o, this.n, k, i1, this.p);
        ((BitmapFactory.Options)localObject3).inJustDecodeBounds = false;
        ((BitmapFactory.Options)localObject3).inSampleSize = a(i1, k, i, j);
        localObject3 = BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length, (BitmapFactory.Options)localObject3);
        if ((localObject3 != null) && ((((Bitmap)localObject3).getWidth() > i) || (((Bitmap)localObject3).getHeight() > j)))
        {
          localObject1 = Bitmap.createScaledBitmap((Bitmap)localObject3, i, j, true);
          ((Bitmap)localObject3).recycle();
        }
      }
      Object localObject2 = localObject3;
      continue;
      label272:
      localObject2 = ady.a(localObject2, a.a(paramadp));
      paramadp = (adp)localObject2;
    }
  }
  
  public final adu e()
  {
    return adu.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */