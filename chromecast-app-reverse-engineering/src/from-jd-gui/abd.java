import android.database.Cursor;

public final class abd
{
  public final String a;
  public final String b;
  public final int c;
  public final String d;
  public final long e;
  public final Long f;
  public final long g;
  public final String h;
  public final int i;
  public final String j;
  
  public abd(Cursor paramCursor, Long paramLong)
  {
    this.a = paramCursor.getString(0);
    this.b = paramCursor.getString(1);
    this.c = paramCursor.getInt(2);
    this.d = paramCursor.getString(3);
    this.e = paramCursor.getLong(4);
    this.f = paramLong;
    this.g = paramCursor.getLong(5);
    this.h = paramCursor.getString(6);
    this.i = paramCursor.getInt(7);
    this.j = paramCursor.getString(8);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\abd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */