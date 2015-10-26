import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;

final class acl
  implements abs
{
  acl(acb paramacb, acx paramacx, aco paramaco) {}
  
  private void a(Bitmap paramBitmap)
  {
    acb.a(this.a, this.c, paramBitmap);
    if (Looper.myLooper() == Looper.getMainLooper()) {
      this.a.invalidate();
    }
    for (;;)
    {
      return;
      this.a.post(new acm(this));
    }
  }
  
  public final void b()
  {
    c();
  }
  
  public final void c()
  {
    byte[] arrayOfByte = this.b.a();
    a(BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length));
  }
  
  public final void d()
  {
    a(acb.j(this.a));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\acl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */