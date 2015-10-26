import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class bge
  extends j
{
  private axx a;
  private dbf b;
  private RecyclerView c;
  private final blp d = new blp("SearchResultsGrid");
  
  public static bge a(dbf paramdbf)
  {
    Bundle localBundle = new Bundle();
    localBundle.putByteArray("contentShelf", dbf.a(paramdbf));
    paramdbf = new bge();
    paramdbf.f(localBundle);
    return paramdbf;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.gF, paramViewGroup, false);
    try
    {
      paramViewGroup = this.m.getByteArray("contentShelf");
      paramBundle = new dbf;
      paramBundle.<init>();
      this.b = ((dbf)dew.a(paramBundle, paramViewGroup));
      paramViewGroup = e();
      if (this.b.g[0].a.b.intValue() <= this.b.g[0].a.c.intValue()) {
        break label329;
      }
      i = paramViewGroup.getDimensionPixelSize(a.ea);
    }
    catch (dev paramViewGroup)
    {
      for (;;)
      {
        int j;
        int k;
        int m;
        this.d.a("Error parsing shelf proto: %s", new Object[] { paramViewGroup });
        continue;
        int i = paramViewGroup.getDimensionPixelSize(a.eb);
      }
    }
    paramBundle = this.b.g[0].a;
    i = i * paramBundle.b.intValue() / paramBundle.c.intValue();
    j = paramViewGroup.getDimensionPixelSize(a.ed);
    k = blx.a(this.y) - j * 2;
    i = k / i;
    j = paramViewGroup.getDimensionPixelSize(a.dH);
    m = (k / i - j * 2) * paramBundle.c.intValue() / paramBundle.b.intValue();
    k = paramViewGroup.getDimensionPixelSize(a.dI);
    this.a = new axx(this.y, this.b, m, k + m);
    this.c = ((RecyclerView)paramLayoutInflater.findViewById(f.aj));
    this.c.a(this.a);
    paramViewGroup = new xq(this.y, i);
    this.c.a(paramViewGroup);
    this.c.a(new bgf(this, j));
    this.c.a(new xe());
    return paramLayoutInflater;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */