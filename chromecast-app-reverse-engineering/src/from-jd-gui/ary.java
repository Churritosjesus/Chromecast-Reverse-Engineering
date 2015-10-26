import android.view.View;
import android.view.View.OnClickListener;

final class ary
  implements View.OnClickListener
{
  ary(art paramart, dcj paramdcj1, dcj paramdcj2) {}
  
  public final void onClick(View paramView)
  {
    auq localauq = art.a(this.c).h().s();
    for (paramView : this.a.i)
    {
      int k = paramView.b.intValue();
      boolean bool = paramView.equals(this.b);
      localauq.c(String.valueOf(k)).a = Boolean.valueOf(bool);
      art.a(this.c, paramView.b);
    }
    this.c.notifyDataSetChanged();
    art.a(this.c).h().d.a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */