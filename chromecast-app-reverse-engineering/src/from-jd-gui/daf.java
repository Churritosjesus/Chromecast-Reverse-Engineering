import android.animation.ValueAnimator;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;

public class daf
  extends ValueAnimator
{
  private boolean a;
  private dah b;
  
  public daf(PagingIndicator paramPagingIndicator, dah paramdah)
  {
    this.b = paramdah;
    this.a = false;
  }
  
  public final void a(float paramFloat)
  {
    if ((!this.a) && (this.b.a(paramFloat)))
    {
      start();
      this.a = true;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\daf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */