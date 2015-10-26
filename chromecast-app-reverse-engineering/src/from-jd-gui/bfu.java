public enum bfu
{
  public final int j;
  public final boolean k;
  
  private bfu(int paramInt1, boolean paramBoolean)
  {
    this.j = paramInt1;
    this.k = paramBoolean;
  }
  
  public static bfu a(int paramInt)
  {
    bfu[] arrayOfbfu = values();
    int n = arrayOfbfu.length;
    int m = 0;
    bfu localbfu;
    if (m < n)
    {
      localbfu = arrayOfbfu[m];
      if (localbfu.j != paramInt) {}
    }
    for (;;)
    {
      return localbfu;
      m++;
      break;
      localbfu = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */