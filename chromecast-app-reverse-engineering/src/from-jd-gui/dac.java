import com.google.android.libraries.view.pagingindicator.PagingIndicator;

public final class dac
  extends daf
{
  private final int b;
  
  public dac(PagingIndicator paramPagingIndicator, int paramInt, dah paramdah)
  {
    super(paramPagingIndicator, paramdah);
    this.b = paramInt;
    setFloatValues(new float[] { 1.0E-5F, 1.0F });
    setDuration(PagingIndicator.d(paramPagingIndicator));
    setInterpolator(PagingIndicator.e(paramPagingIndicator));
    addUpdateListener(new dad(this, paramPagingIndicator));
    addListener(new dae(this, paramPagingIndicator));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */