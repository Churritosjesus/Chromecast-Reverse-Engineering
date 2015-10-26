public enum bfv
{
  public final int b;
  
  private bfv(int paramInt1)
  {
    this.b = paramInt1;
  }
  
  public static bfv a(int paramInt)
  {
    bfv[] arrayOfbfv = values();
    int j = arrayOfbfv.length;
    int i = 0;
    bfv localbfv;
    if (i < j)
    {
      localbfv = arrayOfbfv[i];
      if (localbfv.b != paramInt) {}
    }
    for (;;)
    {
      return localbfv;
      i++;
      break;
      localbfv = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */