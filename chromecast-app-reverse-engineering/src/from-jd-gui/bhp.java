import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class bhp
  implements CompoundButton.OnCheckedChangeListener
{
  bhp(bhf parambhf) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    bhf.c(this.a, paramBoolean);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bhp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */