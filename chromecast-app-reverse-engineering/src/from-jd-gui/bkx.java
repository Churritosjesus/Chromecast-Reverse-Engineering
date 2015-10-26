final class bkx
  extends blb
{
  bkx(bkw parambkw, bkv parambkv, CharSequence paramCharSequence)
  {
    super(parambkv, paramCharSequence);
  }
  
  public final int a(int paramInt)
  {
    int k = this.c.a.length();
    int m = this.b.length();
    while (paramInt <= m - k)
    {
      for (int j = 0;; j++)
      {
        i = paramInt;
        if (j >= k) {
          return i;
        }
        if (this.b.charAt(j + paramInt) != this.c.a.charAt(j)) {
          break;
        }
      }
      paramInt++;
    }
    int i = -1;
    return i;
  }
  
  public final int b(int paramInt)
  {
    return this.c.a.length() + paramInt;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bkx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */