import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;

public final class bny
  extends zr
{
  TextView k = (TextView)this.a.findViewById(f.au);
  ListView l = (ListView)this.a.findViewById(f.bs);
  View m = this.a.findViewById(f.aQ);
  public boolean n = false;
  
  public bny(bmu parambmu)
  {
    super(LayoutInflater.from(parambmu.h).inflate(a.gd, null, false));
    this.l.setVisibility(0);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(parambmu.j, 0);
    this.l.setLayoutParams(localLayoutParams);
    this.k.setOnClickListener(new bnz(this, parambmu));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */