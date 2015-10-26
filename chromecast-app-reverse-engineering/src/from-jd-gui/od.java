import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class od
  extends Dialog
{
  private final tz a = tz.a(getContext());
  private final oe b = new oe(this);
  private tx c = tx.c;
  private ArrayList d;
  private of e;
  private ListView f;
  private boolean g;
  
  public od(Context paramContext)
  {
    this(paramContext, 0);
  }
  
  private od(Context paramContext, int paramInt)
  {
    super(a.a(paramContext), 0);
  }
  
  public final void a()
  {
    ArrayList localArrayList;
    int i;
    if (this.g)
    {
      this.d.clear();
      this.d.addAll(tz.a());
      localArrayList = this.d;
      i = localArrayList.size();
    }
    for (;;)
    {
      int j = i - 1;
      if (i > 0)
      {
        uh localuh = (uh)localArrayList.get(j);
        if ((!localuh.b()) && (localuh.e) && (localuh.a(this.c))) {}
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            break label127;
          }
          localArrayList.remove(j);
          i = j;
          break;
        }
      }
      Collections.sort(this.d, og.a);
      this.e.notifyDataSetChanged();
      return;
      label127:
      i = j;
    }
  }
  
  public final void a(tx paramtx)
  {
    if (paramtx == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    if (!this.c.equals(paramtx))
    {
      this.c = paramtx;
      if (this.g)
      {
        this.a.a(this.b);
        this.a.a(paramtx, this.b, 1);
      }
      a();
    }
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.g = true;
    this.a.a(this.c, this.b, 1);
    a();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().requestFeature(3);
    setContentView(a.ck);
    setTitle(a.cn);
    getWindow().setFeatureDrawableResource(3, a.a(getContext(), a.ch));
    this.d = new ArrayList();
    this.e = new of(this, getContext(), this.d);
    this.f = ((ListView)findViewById(b.p));
    this.f.setAdapter(this.e);
    this.f.setOnItemClickListener(this.e);
    this.f.setEmptyView(findViewById(16908292));
  }
  
  public final void onDetachedFromWindow()
  {
    this.g = false;
    this.a.a(this.b);
    super.onDetachedFromWindow();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\od.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */