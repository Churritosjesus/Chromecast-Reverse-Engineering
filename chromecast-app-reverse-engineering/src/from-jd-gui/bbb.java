import android.view.View;
import android.view.View.OnClickListener;

final class bbb
  implements View.OnClickListener
{
  bbb(baz parambaz) {}
  
  public final void onClick(View paramView)
  {
    baz.a(this.a, false);
    baz.a(this.a).a();
    baz.a(this.a).b();
    baz.b(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */