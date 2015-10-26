import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

final class asa
{
  final TextView a;
  final TextView b;
  final ImageView c;
  final CheckBox d;
  final RadioButton e;
  final CompoundButton f;
  final View g;
  aex h;
  final RadioGroup i;
  private final View k;
  private final TextView l;
  private final TextView m;
  
  public asa(art paramart, View paramView)
  {
    this.k = paramView;
    this.l = ((TextView)paramView.findViewById(f.C));
    this.a = ((TextView)paramView.findViewById(f.z));
    this.b = ((TextView)paramView.findViewById(f.A));
    this.c = ((ImageView)paramView.findViewById(f.bz));
    this.d = ((CheckBox)paramView.findViewById(f.y));
    this.e = ((RadioButton)paramView.findViewById(f.B));
    this.f = ((CompoundButton)paramView.findViewById(f.F));
    this.g = paramView.findViewById(f.bx);
    this.i = ((RadioGroup)paramView.findViewById(f.di));
    this.m = ((TextView)paramView.findViewById(f.dj));
  }
  
  public final asa a()
  {
    this.l.setVisibility(8);
    if (this.a != null) {
      this.a.setVisibility(8);
    }
    this.b.setVisibility(8);
    this.c.setVisibility(8);
    this.d.setVisibility(8);
    this.e.setVisibility(8);
    this.f.setVisibility(8);
    this.f.setOnCheckedChangeListener(null);
    this.g.setVisibility(8);
    this.m.setVisibility(8);
    this.i.setVisibility(8);
    this.i.removeAllViews();
    if (this.h != null)
    {
      this.c.setImageResource(17170445);
      this.h.a();
    }
    return this;
  }
  
  public final asa a(View.OnClickListener paramOnClickListener)
  {
    this.k.setOnClickListener(paramOnClickListener);
    return this;
  }
  
  public final asa a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (this.i.getVisibility() != 8) {
        break label37;
      }
      this.l.setVisibility(0);
      this.l.setText(paramString);
    }
    for (;;)
    {
      return this;
      label37:
      this.m.setVisibility(0);
      this.m.setText(paramString);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\asa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */