import com.google.android.libraries.view.pagingindicator.PagingIndicator;

public final class czy
  extends daf
{
  public czy(PagingIndicator paramPagingIndicator, int paramInt1, int paramInt2, int paramInt3, dah paramdah)
  {
    super(paramPagingIndicator, paramdah);
    setDuration(PagingIndicator.d(paramPagingIndicator));
    setInterpolator(PagingIndicator.e(paramPagingIndicator));
    float f1;
    float f3;
    if (paramInt2 > paramInt1)
    {
      f1 = Math.min(PagingIndicator.f(paramPagingIndicator)[paramInt1], PagingIndicator.b(paramPagingIndicator)) - PagingIndicator.g(paramPagingIndicator);
      f3 = PagingIndicator.f(paramPagingIndicator)[paramInt2] - PagingIndicator.g(paramPagingIndicator);
      if (paramInt2 <= paramInt1) {
        break label217;
      }
    }
    float f5;
    float f4;
    label217:
    for (float f2 = PagingIndicator.f(paramPagingIndicator)[paramInt2] + PagingIndicator.g(paramPagingIndicator);; f2 = Math.max(PagingIndicator.f(paramPagingIndicator)[paramInt1], PagingIndicator.b(paramPagingIndicator)) + PagingIndicator.g(paramPagingIndicator))
    {
      f5 = PagingIndicator.f(paramPagingIndicator)[paramInt2];
      f4 = PagingIndicator.g(paramPagingIndicator);
      PagingIndicator.a(paramPagingIndicator, new dac[paramInt3]);
      paramdah = new int[paramInt3];
      if (f1 == f3) {
        break label273;
      }
      setFloatValues(new float[] { f1, f3 });
      for (paramInt2 = i; paramInt2 < paramInt3; paramInt2++)
      {
        PagingIndicator.h(paramPagingIndicator)[paramInt2] = new dac(paramPagingIndicator, paramInt1 + paramInt2, new dag(paramPagingIndicator, PagingIndicator.f(paramPagingIndicator)[(paramInt1 + paramInt2)]));
        paramdah[paramInt2] = (paramInt1 + paramInt2);
      }
      f1 = PagingIndicator.f(paramPagingIndicator)[paramInt2] - PagingIndicator.g(paramPagingIndicator);
      break;
    }
    addUpdateListener(new czz(this, paramPagingIndicator));
    for (;;)
    {
      addListener(new dab(this, paramPagingIndicator, paramdah, f1, f2));
      return;
      label273:
      setFloatValues(new float[] { f2, f5 + f4 });
      for (paramInt2 = j; paramInt2 < paramInt3; paramInt2++)
      {
        PagingIndicator.h(paramPagingIndicator)[paramInt2] = new dac(paramPagingIndicator, paramInt1 - paramInt2, new czx(paramPagingIndicator, PagingIndicator.f(paramPagingIndicator)[(paramInt1 - paramInt2)]));
        paramdah[paramInt2] = (paramInt1 - paramInt2);
      }
      addUpdateListener(new daa(this, paramPagingIndicator));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */