public enum dia
{
  public final int i;
  public final int j;
  public final int k;
  
  static
  {
    d = new dia("STREAM_IN_USE", 4, 1, 8, -1);
    m = new dia("STREAM_ALREADY_CLOSED", 5, 1, 9, -1);
    e = new dia("INTERNAL_ERROR", 6, 2, 6, 2);
    f = new dia("FLOW_CONTROL_ERROR", 7, 3, 7, -1);
    n = new dia("STREAM_CLOSED", 8, 5, -1, -1);
    o = new dia("FRAME_TOO_LARGE", 9, 6, 11, -1);
  }
  
  private dia(int paramInt2, int paramInt3, int paramInt4)
  {
    this.i = paramInt2;
    this.j = paramInt3;
    this.k = paramInt4;
  }
  
  public static dia a(int paramInt)
  {
    dia[] arrayOfdia = values();
    int i2 = arrayOfdia.length;
    int i1 = 0;
    dia localdia;
    if (i1 < i2)
    {
      localdia = arrayOfdia[i1];
      if (localdia.j != paramInt) {}
    }
    for (;;)
    {
      return localdia;
      i1++;
      break;
      localdia = null;
    }
  }
  
  public static dia b(int paramInt)
  {
    dia[] arrayOfdia = values();
    int i2 = arrayOfdia.length;
    int i1 = 0;
    dia localdia;
    if (i1 < i2)
    {
      localdia = arrayOfdia[i1];
      if (localdia.i != paramInt) {}
    }
    for (;;)
    {
      return localdia;
      i1++;
      break;
      localdia = null;
    }
  }
  
  public static dia c(int paramInt)
  {
    dia[] arrayOfdia = values();
    int i2 = arrayOfdia.length;
    int i1 = 0;
    dia localdia;
    if (i1 < i2)
    {
      localdia = arrayOfdia[i1];
      if (localdia.k != paramInt) {}
    }
    for (;;)
    {
      return localdia;
      i1++;
      break;
      localdia = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */