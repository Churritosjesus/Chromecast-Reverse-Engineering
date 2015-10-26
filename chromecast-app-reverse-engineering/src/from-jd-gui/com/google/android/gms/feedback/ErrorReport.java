package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import cig;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ErrorReport
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new cig();
  public int A;
  public String B;
  public String C;
  public String D;
  public Bundle E;
  public boolean F;
  public int G;
  public int H;
  public boolean I;
  public String J;
  public String K;
  public int L;
  public String M;
  public String N;
  public String O;
  public String P;
  public String Q;
  @Deprecated
  public String R;
  public String S;
  public BitmapTeleporter T;
  public String U;
  public FileTeleporter[] V;
  public String[] W;
  public boolean X;
  public String Y;
  public ThemeSettings Z;
  public final int a;
  public LogOptions aa;
  public String ab;
  public boolean ac;
  public Bundle ad;
  public ApplicationErrorReport b = new ApplicationErrorReport();
  public String c;
  public int d;
  public String e;
  public String f;
  public String g;
  public String h;
  public String i;
  public String j;
  public String k;
  public int l;
  public String m;
  public String n;
  public String o;
  public String p;
  public String q;
  public String[] r;
  public String[] s;
  public String[] t;
  public String u;
  public String v;
  public byte[] w;
  public int x;
  public int y;
  public int z;
  
  public ErrorReport()
  {
    this.a = 8;
  }
  
  public ErrorReport(int paramInt1, ApplicationErrorReport paramApplicationErrorReport, String paramString1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt3, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString14, String paramString15, byte[] paramArrayOfByte, int paramInt4, int paramInt5, int paramInt6, int paramInt7, String paramString16, String paramString17, String paramString18, Bundle paramBundle1, boolean paramBoolean1, int paramInt8, int paramInt9, boolean paramBoolean2, String paramString19, String paramString20, int paramInt10, String paramString21, String paramString22, String paramString23, String paramString24, String paramString25, String paramString26, String paramString27, BitmapTeleporter paramBitmapTeleporter, String paramString28, FileTeleporter[] paramArrayOfFileTeleporter, String[] paramArrayOfString4, boolean paramBoolean3, String paramString29, ThemeSettings paramThemeSettings, LogOptions paramLogOptions, String paramString30, boolean paramBoolean4, Bundle paramBundle2)
  {
    this.a = paramInt1;
    this.b = paramApplicationErrorReport;
    this.c = paramString1;
    this.d = paramInt2;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramString4;
    this.h = paramString5;
    this.i = paramString6;
    this.j = paramString7;
    this.k = paramString8;
    this.l = paramInt3;
    this.m = paramString9;
    this.n = paramString10;
    this.o = paramString11;
    this.p = paramString12;
    this.q = paramString13;
    this.r = paramArrayOfString1;
    this.s = paramArrayOfString2;
    this.t = paramArrayOfString3;
    this.u = paramString14;
    this.v = paramString15;
    this.w = paramArrayOfByte;
    this.x = paramInt4;
    this.y = paramInt5;
    this.z = paramInt6;
    this.A = paramInt7;
    this.B = paramString16;
    this.C = paramString17;
    this.D = paramString18;
    this.E = paramBundle1;
    this.F = paramBoolean1;
    this.G = paramInt8;
    this.H = paramInt9;
    this.I = paramBoolean2;
    this.J = paramString19;
    this.K = paramString20;
    this.L = paramInt10;
    this.M = paramString21;
    this.N = paramString22;
    this.O = paramString23;
    this.P = paramString24;
    this.Q = paramString25;
    this.R = paramString26;
    this.S = paramString27;
    this.T = paramBitmapTeleporter;
    this.U = paramString28;
    this.V = paramArrayOfFileTeleporter;
    this.W = paramArrayOfString4;
    this.X = paramBoolean3;
    this.Y = paramString29;
    this.Z = paramThemeSettings;
    this.aa = paramLogOptions;
    this.ab = paramString30;
    this.ac = paramBoolean4;
    this.ad = paramBundle2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cig.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\feedback\ErrorReport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */