import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

final class cqr
  extends AsyncTask
{
  private cqq a;
  private ParcelFileDescriptor b;
  private int c;
  private int d;
  private int e;
  
  cqr(cqp paramcqp, cqq paramcqq, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramcqq;
    this.b = paramParcelFileDescriptor;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
  }
  
  private Bitmap a()
  {
    try
    {
      Bitmap localBitmap;
      if (cqp.a(this.f))
      {
        localBitmap = a.a(this.b);
        if (localBitmap == null) {
          localBitmap = null;
        }
      }
      for (;;)
      {
        if (localBitmap != null) {
          cqp.d(this.f).put(this.a.f, localBitmap);
        }
        if (this.b != null) {}
        try
        {
          this.b.close();
          return localBitmap;
          localBitmap = a.a(localBitmap);
          continue;
          localBitmap = cqp.a(this.b, this.c, this.d, this.e, (int)(this.c * cqp.b(this.f) / cqp.c(this.f)));
          if (localBitmap == null) {
            localBitmap = null;
          } else {
            localBitmap = cqp.a(localBitmap, this.c, cqp.b(this.f) / cqp.c(this.f));
          }
        }
        catch (IOException localIOException1)
        {
          for (;;)
          {
            localIOException1.getMessage();
          }
        }
      }
      try
      {
        this.b.close();
        throw ((Throwable)localObject);
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          localIOException2.getMessage();
        }
      }
    }
    finally
    {
      if (this.b == null) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cqr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */