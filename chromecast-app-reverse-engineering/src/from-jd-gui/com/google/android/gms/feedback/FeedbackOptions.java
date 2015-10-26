package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import cih;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public class FeedbackOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new cih();
  public final int a;
  public String b;
  public Bundle c;
  public String d;
  public ApplicationErrorReport e;
  public String f;
  public BitmapTeleporter g;
  public String h;
  public ArrayList i;
  public boolean j;
  public ThemeSettings k;
  public LogOptions l;
  
  public FeedbackOptions()
  {
    this(3, null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null);
  }
  
  public FeedbackOptions(int paramInt, String paramString1, Bundle paramBundle, String paramString2, ApplicationErrorReport paramApplicationErrorReport, String paramString3, BitmapTeleporter paramBitmapTeleporter, String paramString4, ArrayList paramArrayList, boolean paramBoolean, ThemeSettings paramThemeSettings, LogOptions paramLogOptions)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramBundle;
    this.d = paramString2;
    this.e = paramApplicationErrorReport;
    this.f = paramString3;
    this.g = paramBitmapTeleporter;
    this.h = paramString4;
    this.i = paramArrayList;
    this.j = paramBoolean;
    this.k = paramThemeSettings;
    this.l = paramLogOptions;
  }
  
  public final ApplicationErrorReport.CrashInfo a()
  {
    if (this.e == null) {}
    for (ApplicationErrorReport.CrashInfo localCrashInfo = null;; localCrashInfo = this.e.crashInfo) {
      return localCrashInfo;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cih.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\feedback\FeedbackOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */