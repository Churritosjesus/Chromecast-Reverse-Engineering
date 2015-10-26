import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

public final class mz
{
  public final Context a;
  public final LayoutInflater b;
  public Drawable c;
  public CharSequence d;
  public View e;
  public boolean f;
  public DialogInterface.OnKeyListener g;
  public ListAdapter h;
  public DialogInterface.OnClickListener i;
  public int j = -1;
  private int k = 0;
  private int l = 0;
  private boolean m = false;
  
  public mz(Context paramContext)
  {
    this.a = paramContext;
    this.f = true;
    this.b = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */