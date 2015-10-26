public enum bdl
{
  public final int b;
  
  private bdl(int paramInt1)
  {
    this.b = paramInt1;
  }
  
  public static bdl a(int paramInt)
  {
    bdl[] arrayOfbdl = values();
    int i1 = arrayOfbdl.length;
    int n = 0;
    bdl localbdl;
    if (n < i1)
    {
      localbdl = arrayOfbdl[n];
      if (localbdl.b != paramInt) {}
    }
    for (;;)
    {
      return localbdl;
      n++;
      break;
      localbdl = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */