import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

public class fq
  implements LayoutInflater.Factory
{
  final fs a;
  
  public fq(fs paramfs)
  {
    this.a = paramfs;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.a.a(null, paramString, paramContext, paramAttributeSet);
  }
  
  public String toString()
  {
    return getClass().getName() + "{" + this.a + "}";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */