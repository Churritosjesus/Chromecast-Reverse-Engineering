import android.content.ComponentName;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

final class rq
  extends AsyncTask
{
  rq(rl paramrl) {}
  
  private Void a(Object... paramVarArgs)
  {
    int i = 0;
    List localList = (List)paramVarArgs[0];
    Object localObject2 = (String)paramVarArgs[1];
    for (;;)
    {
      try
      {
        paramVarArgs = rl.a(this.a).openFileOutput((String)localObject2, 0);
        localObject2 = Xml.newSerializer();
        int j;
        ((XmlSerializer)localObject2).endTag(null, "historical-records");
      }
      catch (FileNotFoundException paramVarArgs)
      {
        try
        {
          ((XmlSerializer)localObject2).setOutput(paramVarArgs, null);
          ((XmlSerializer)localObject2).startDocument("UTF-8", Boolean.valueOf(true));
          ((XmlSerializer)localObject2).startTag(null, "historical-records");
          j = localList.size();
          if (i >= j) {
            break label198;
          }
          localObject3 = (rp)localList.remove(0);
          ((XmlSerializer)localObject2).startTag(null, "historical-record");
          ((XmlSerializer)localObject2).attribute(null, "activity", ((rp)localObject3).a.flattenToString());
          ((XmlSerializer)localObject2).attribute(null, "time", String.valueOf(((rp)localObject3).b));
          ((XmlSerializer)localObject2).attribute(null, "weight", String.valueOf(((rp)localObject3).c));
          ((XmlSerializer)localObject2).endTag(null, "historical-record");
          i++;
          continue;
          paramVarArgs = paramVarArgs;
          Log.e(rl.f(), "Error writing historical recrod file: " + (String)localObject2, paramVarArgs);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          localObject2 = rl.f();
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("Error writing historical recrod file: ");
          Log.e((String)localObject2, rl.b(this.a), localIllegalArgumentException);
          rl.a(this.a, true);
          if (paramVarArgs == null) {
            continue;
          }
          try
          {
            paramVarArgs.close();
          }
          catch (IOException paramVarArgs) {}
          continue;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          localObject3 = rl.f();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Error writing historical recrod file: ");
          Log.e((String)localObject3, rl.b(this.a), localIllegalStateException);
          rl.a(this.a, true);
          if (paramVarArgs == null) {
            continue;
          }
          try
          {
            paramVarArgs.close();
          }
          catch (IOException paramVarArgs) {}
          continue;
        }
        catch (IOException localIOException)
        {
          Object localObject3 = rl.f();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Error writing historical recrod file: ");
          Log.e((String)localObject3, rl.b(this.a), localIOException);
          rl.a(this.a, true);
          if (paramVarArgs == null) {
            continue;
          }
          try
          {
            paramVarArgs.close();
          }
          catch (IOException paramVarArgs) {}
          continue;
        }
        finally
        {
          rl.a(this.a, true);
          if (paramVarArgs == null) {
            break;
          }
        }
        return null;
      }
      label198:
      ((XmlSerializer)localObject2).endDocument();
      rl.a(this.a, true);
      if (paramVarArgs != null) {
        try
        {
          paramVarArgs.close();
        }
        catch (IOException paramVarArgs) {}
      }
    }
    try
    {
      paramVarArgs.close();
      throw ((Throwable)localObject1);
    }
    catch (IOException paramVarArgs)
    {
      for (;;) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\rq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */