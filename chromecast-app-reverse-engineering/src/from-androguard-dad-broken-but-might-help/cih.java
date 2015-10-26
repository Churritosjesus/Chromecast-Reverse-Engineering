	
	    public cih()
	    {
	        return;
	    }
	
	
	    public static void a(com.google.android.gms.feedback.FeedbackOptions p4, android.os.Parcel p5, int p6)
	    {
	        int v0_1 = a.m(p5, 20293);
	        a.c(p5, 1, p4.a);
	        a.a(p5, 2, p4.b, 0);
	        a.a(p5, 3, p4.c, 0);
	        a.a(p5, 5, p4.d, 0);
	        a.a(p5, 6, p4.e, p6, 0);
	        a.a(p5, 7, p4.f, 0);
	        a.a(p5, 8, p4.g, p6, 0);
	        a.a(p5, 9, p4.h, 0);
	        a.a(p5, 10, p4.i, 0);
	        a.a(p5, 11, p4.j);
	        a.a(p5, 12, p4.k, p6, 0);
	        a.a(p5, 13, p4.l, p6, 0);
	        a.n(p5, v0_1);
	        return;
	    }
	
	
	    public final synthetic Object createFromParcel(android.os.Parcel p17)
	    {
	        int v14 = a.a(p17);
	        String v2_0 = 0;
	        String v3_0 = 0;
	        android.os.Bundle v4 = 0;
	        String v5 = 0;
	        android.app.ApplicationErrorReport v6_0 = 0;
	        String v7 = 0;
	        com.google.android.gms.common.data.BitmapTeleporter v8_0 = 0;
	        String v9 = 0;
	        java.util.ArrayList v10_0 = 0;
	        boolean v11 = 0;
	        com.google.android.gms.feedback.ThemeSettings v12_0 = 0;
	        com.google.android.gms.feedback.LogOptions v13_0 = 0;
	        while (p17.dataPosition() < v14) {
	            com.google.android.gms.feedback.FeedbackOptions v1_6 = p17.readInt();
	            switch ((65535 & v1_6)) {
	                case 1:
	                    v2_0 = a.d(p17, v1_6);
	                    break;
	                case 2:
	                    v3_0 = a.h(p17, v1_6);
	                    break;
	                case 3:
	                    v4 = a.j(p17, v1_6);
	                    break;
	                case 4:
	                default:
	                    a.b(p17, v1_6);
	                    break;
	                case 5:
	                    v5 = a.h(p17, v1_6);
	                    break;
	                case 6:
	                    v6_0 = ((android.app.ApplicationErrorReport) a.a(p17, v1_6, android.app.ApplicationErrorReport.CREATOR));
	                    break;
	                case 7:
	                    v7 = a.h(p17, v1_6);
	                    break;
	                case 8:
	                    v8_0 = ((com.google.android.gms.common.data.BitmapTeleporter) a.a(p17, v1_6, com.google.android.gms.common.data.BitmapTeleporter.CREATOR));
	                    break;
	                case 9:
	                    v9 = a.h(p17, v1_6);
	                    break;
	                case 10:
	                    v10_0 = a.c(p17, v1_6, com.google.android.gms.feedback.FileTeleporter.CREATOR);
	                    break;
	                case 11:
	                    v11 = a.c(p17, v1_6);
	                    break;
	                case 12:
	                    v12_0 = ((com.google.android.gms.feedback.ThemeSettings) a.a(p17, v1_6, com.google.android.gms.feedback.ThemeSettings.CREATOR));
	                    break;
	                case 13:
	                    v13_0 = ((com.google.android.gms.feedback.LogOptions) a.a(p17, v1_6, com.google.android.gms.feedback.LogOptions.CREATOR));
	                    break;
	            }
	        }
	        if (p17.dataPosition() == v14) {
	            return new com.google.android.gms.feedback.FeedbackOptions(v2_0, v3_0, v4, v5, v6_0, v7, v8_0, v9, v10_0, v11, v12_0, v13_0);
	        } else {
	            throw new l(new StringBuilder("Overread allowed size end=").append(v14).toString(), p17);
	        }
	    }
	
	
	    public final synthetic Object[] newArray(int p2)
	    {
	        com.google.android.gms.feedback.FeedbackOptions[] v0 = new com.google.android.gms.feedback.FeedbackOptions[p2];
	        return v0;
	    }
	
