import android.widget.PopupWindow;

final class yn
  implements Runnable
{
  yn(yc paramyc) {}
  
  public final void run()
  {
    if ((yc.a(this.a) != null) && (yc.a(this.a).getCount() > yc.a(this.a).getChildCount()) && (yc.a(this.a).getChildCount() <= this.a.e))
    {
      yc.b(this.a).setInputMethodMode(2);
      this.a.c();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\yn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */