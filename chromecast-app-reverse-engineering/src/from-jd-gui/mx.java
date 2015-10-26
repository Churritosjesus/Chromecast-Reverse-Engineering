import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public final class mx
{
  TextView A;
  TextView B;
  public View C;
  public ListAdapter D;
  public int E = -1;
  int F;
  int G;
  public int H;
  int I;
  public int J;
  Handler K;
  final View.OnClickListener L = new my(this);
  private int M;
  private int N = 0;
  final Context a;
  final ny b;
  final Window c;
  CharSequence d;
  CharSequence e;
  public ListView f;
  View g;
  int h;
  int i;
  int j;
  int k;
  int l;
  boolean m = false;
  Button n;
  CharSequence o;
  Message p;
  Button q;
  CharSequence r;
  Message s;
  Button t;
  CharSequence u;
  Message v;
  ScrollView w;
  public int x = 0;
  public Drawable y;
  public ImageView z;
  
  public mx(Context paramContext, ny paramny, Window paramWindow)
  {
    this.a = paramContext;
    this.b = paramny;
    this.c = paramWindow;
    this.K = new nb(paramny);
    paramContext = paramContext.obtainStyledAttributes(null, oq.H, a.u, 0);
    this.F = paramContext.getResourceId(oq.I, 0);
    this.G = paramContext.getResourceId(oq.J, 0);
    this.H = paramContext.getResourceId(oq.L, 0);
    this.I = paramContext.getResourceId(oq.M, 0);
    this.M = paramContext.getResourceId(oq.N, 0);
    this.J = paramContext.getResourceId(oq.K, 0);
    paramContext.recycle();
  }
  
  static void a(Button paramButton)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    localLayoutParams.gravity = 1;
    localLayoutParams.weight = 0.5F;
    paramButton.setLayoutParams(localLayoutParams);
  }
  
  static boolean a(View paramView)
  {
    boolean bool = true;
    if (paramView.onCheckIsTextEditor()) {}
    for (;;)
    {
      return bool;
      if (!(paramView instanceof ViewGroup))
      {
        bool = false;
      }
      else
      {
        paramView = (ViewGroup)paramView;
        int i1 = paramView.getChildCount();
        for (;;)
        {
          if (i1 > 0)
          {
            int i2 = i1 - 1;
            i1 = i2;
            if (a(paramView.getChildAt(i2))) {
              break;
            }
          }
        }
        bool = false;
      }
    }
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
    if (this.A != null) {
      this.A.setText(paramCharSequence);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\mx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */