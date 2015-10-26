import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public final class boq
  extends ArrayAdapter
{
  private final blp a = new blp("WifiNetworkAdapter");
  
  public boq(Context paramContext)
  {
    super(paramContext, a.gV);
  }
  
  public final int a(String paramString)
  {
    int i = 0;
    if (i < getCount()) {
      if (!((bfs)getItem(i)).a.equals(paramString)) {}
    }
    for (;;)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramView = getView(paramInt, paramView, paramViewGroup);
    paramInt = getContext().getResources().getDimensionPixelSize(a.dJ);
    paramView.setPadding(paramInt, paramInt, paramInt, paramInt);
    return paramView;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(a.gV, null);
    }
    paramView = (bfs)getItem(paramInt);
    ((TextView)paramViewGroup.findViewById(f.dY)).setText(paramView.a);
    TextView localTextView = (TextView)paramViewGroup.findViewById(f.u);
    Object localObject = paramView.b;
    boolean bool;
    switch (bor.a[localObject.ordinal()])
    {
    default: 
      this.a.a("WpaAuthType mapping missing for %s", new Object[] { ((bfu)localObject).toString() });
      paramInt = b.es;
      localTextView.setText(paramInt);
      localObject = (ImageView)paramViewGroup.findViewById(f.dP);
      if (paramView.h != 0)
      {
        paramInt = WifiManager.calculateSignalLevel(paramView.h, 4);
        bool = paramView.b.k;
      }
      switch (paramInt)
      {
      default: 
        paramInt = 0;
        label230:
        ((ImageView)localObject).setImageResource(paramInt);
        if (paramView.h != 0) {}
        switch (WifiManager.calculateSignalLevel(paramView.h, 4))
        {
        default: 
          paramView = getContext().getString(b.ej);
        }
        break;
      }
      break;
    }
    for (;;)
    {
      ((ImageView)localObject).setContentDescription(paramView);
      return paramViewGroup;
      paramInt = b.es;
      break;
      paramInt = b.ep;
      break;
      paramInt = b.eq;
      break;
      paramInt = b.er;
      break;
      paramInt = b.eo;
      break;
      paramInt = b.ew;
      break;
      paramInt = b.ev;
      break;
      paramInt = b.eu;
      break;
      paramInt = b.et;
      break;
      if (bool)
      {
        paramInt = a.eQ;
        break label230;
      }
      paramInt = a.eU;
      break label230;
      if (bool)
      {
        paramInt = a.eP;
        break label230;
      }
      paramInt = a.eT;
      break label230;
      if (bool)
      {
        paramInt = a.eO;
        break label230;
      }
      paramInt = a.eS;
      break label230;
      if (bool)
      {
        paramInt = a.eN;
        break label230;
      }
      paramInt = a.eR;
      break label230;
      paramView = getContext().getString(b.ei);
      continue;
      paramView = getContext().getString(b.eh);
      continue;
      paramView = getContext().getString(b.eg);
      continue;
      paramView = getContext().getString(b.ef);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\boq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */