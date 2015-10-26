import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class nj
  implements mo
{
  nj(ni paramni) {}
  
  public final Drawable a()
  {
    th localth = th.a(this.a.k(), null, new int[] { a.I });
    Drawable localDrawable = localth.a(0);
    localth.a.recycle();
    return localDrawable;
  }
  
  public final void a(int paramInt)
  {
    mj localmj = this.a.a();
    if (localmj != null) {
      localmj.b(paramInt);
    }
  }
  
  public final void a(Drawable paramDrawable, int paramInt)
  {
    mj localmj = this.a.a();
    if (localmj != null)
    {
      localmj.a(paramDrawable);
      localmj.b(paramInt);
    }
  }
  
  public final Context b()
  {
    return this.a.k();
  }
  
  public final boolean c()
  {
    mj localmj = this.a.a();
    if ((localmj != null) && ((localmj.b() & 0x4) != 0)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */