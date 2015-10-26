import android.app.ApplicationErrorReport.CrashInfo;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public final class cky
  extends byo
{
  public Context a;
  
  public cky(Context paramContext, Looper paramLooper, bwg parambwg, bwh parambwh, byl parambyl)
  {
    super(paramContext, paramLooper, 29, parambwg, parambwh, parambyl);
    this.a = paramContext;
  }
  
  public static ErrorReport a(FeedbackOptions paramFeedbackOptions, File paramFile)
  {
    ErrorReport localErrorReport = new ErrorReport();
    if (paramFeedbackOptions != null)
    {
      if ((paramFeedbackOptions.c != null) && (paramFeedbackOptions.c.size() > 0)) {
        localErrorReport.E = paramFeedbackOptions.c;
      }
      if (!TextUtils.isEmpty(paramFeedbackOptions.b)) {
        localErrorReport.C = paramFeedbackOptions.b;
      }
      if (!TextUtils.isEmpty(paramFeedbackOptions.d)) {
        localErrorReport.c = paramFeedbackOptions.d;
      }
      if (paramFeedbackOptions.a() != null)
      {
        localErrorReport.N = paramFeedbackOptions.a().throwMethodName;
        localErrorReport.L = paramFeedbackOptions.a().throwLineNumber;
        localErrorReport.M = paramFeedbackOptions.a().throwClassName;
        localErrorReport.O = paramFeedbackOptions.a().stackTrace;
        localErrorReport.J = paramFeedbackOptions.a().exceptionClassName;
        localErrorReport.P = paramFeedbackOptions.a().exceptionMessage;
        localErrorReport.K = paramFeedbackOptions.a().throwFileName;
      }
      if (paramFeedbackOptions.k != null) {
        localErrorReport.Z = paramFeedbackOptions.k;
      }
      if (!TextUtils.isEmpty(paramFeedbackOptions.f)) {
        localErrorReport.Q = paramFeedbackOptions.f;
      }
      if (!TextUtils.isEmpty(paramFeedbackOptions.h)) {
        localErrorReport.b.packageName = paramFeedbackOptions.h;
      }
      Object localObject;
      if ((paramFeedbackOptions.g != null) && (paramFile != null))
      {
        localErrorReport.T = paramFeedbackOptions.g;
        localObject = localErrorReport.T;
        if (paramFile == null) {
          throw new NullPointerException("Cannot set null temp directory");
        }
        ((BitmapTeleporter)localObject).d = paramFile;
      }
      if ((paramFeedbackOptions.i != null) && (paramFeedbackOptions.i.size() != 0) && (paramFile != null))
      {
        localObject = paramFeedbackOptions.i.iterator();
        while (((Iterator)localObject).hasNext())
        {
          FileTeleporter localFileTeleporter = (FileTeleporter)((Iterator)localObject).next();
          if (paramFile == null) {
            throw new NullPointerException("Cannot set null temp directory");
          }
          localFileTeleporter.e = paramFile;
        }
        localErrorReport.V = ((FileTeleporter[])paramFeedbackOptions.i.toArray(new FileTeleporter[paramFeedbackOptions.i.size()]));
      }
      if (paramFeedbackOptions.l != null) {
        localErrorReport.aa = paramFeedbackOptions.l;
      }
      localErrorReport.X = paramFeedbackOptions.j;
    }
    return localErrorReport;
  }
  
  protected final String c()
  {
    return "com.google.android.gms.feedback.internal.IFeedbackService";
  }
  
  protected final String d()
  {
    return "com.google.android.gms.feedback.internal.IFeedbackService";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */