public enum bdk
{
  public final int c;
  
  private bdk(int paramInt1)
  {
    this.c = paramInt1;
  }
  
  public static bdk a(int paramInt)
  {
    bdk[] arrayOfbdk = values();
    int j = arrayOfbdk.length;
    int i = 0;
    bdk localbdk;
    if (i < j)
    {
      localbdk = arrayOfbdk[i];
      if (localbdk.c != paramInt) {}
    }
    for (;;)
    {
      return localbdk;
      i++;
      break;
      localbdk = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */