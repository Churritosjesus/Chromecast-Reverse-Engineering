import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

final class acy
  extends ArrayAdapter
{
  private final abj a;
  private final StateListDrawable b;
  
  public acy(Context paramContext, acx paramacx, abj paramabj, StateListDrawable paramStateListDrawable)
  {
    super(paramContext, abj.b(abn.c), new acx[] { paramacx });
    this.a = paramabj;
    this.b = paramStateListDrawable;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return this.a.a(paramView, paramViewGroup, (acx)getItem(paramInt), paramInt, abn.c, null, this.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\acy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */