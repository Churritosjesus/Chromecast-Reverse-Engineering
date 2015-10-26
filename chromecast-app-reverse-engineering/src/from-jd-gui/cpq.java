public final class cpq
{
  public static final cpq a = new cpq();
  private int b = 0;
  
  public final String toString()
  {
    int i = 0;
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = "mIncludePlusPages";
    arrayOfObject[1] = Boolean.valueOf(false);
    arrayOfObject[2] = "mSortOrder";
    arrayOfObject[3] = Integer.valueOf(0);
    StringBuilder localStringBuilder = new StringBuilder();
    a.b(true);
    String str = "";
    while (i < 4)
    {
      localStringBuilder.append(str);
      localStringBuilder.append(arrayOfObject[i]);
      localStringBuilder.append("=");
      localStringBuilder.append(arrayOfObject[(i + 1)]);
      str = ", ";
      i += 2;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cpq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */