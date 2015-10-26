	private apd Z
	
	    public bol()
	    {
	        return;
	    }
	
	
	    static synthetic void a(bol p4, boolean p5)
	    {
	        if (p4.Z != null) {
	            boo v0_1;
	            String v2_0 = ape.a();
	            if (!p5) {
	                v0_1 = 0;
	            } else {
	                v0_1 = 1;
	            }
	            v2_0.a(p4.Z.a(v0_1));
	            p4.Z = 0;
	        }
	        if (!p5) {
	            p4.y.finish();
	        } else {
	            boo v0_5 = com.google.android.apps.chromecast.app.SetupApplication.a();
	            v0_5.b = 1;
	            v0_5.a.edit().putBoolean("TERMS_ACCEPTED", 1).apply();
	            if ((p4.y instanceof boo)) {
	                ((boo) p4.y).e();
	            }
	        }
	        return;
	    }
	
	
	    public static void a(mm p3)
	    {
	        t v0 = p3.b;
	        if (v0.a("termsDialog") == null) {
	            bol v1_3 = new bol();
	            v1_3.b(0);
	            v1_3.a(v0, "termsDialog");
	        }
	        return;
	    }
	
	
	    public final android.app.Dialog c(android.os.Bundle p10)
	    {
	        android.app.AlertDialog v0_3;
	        this.Z = new apd(5);
	        String v1_1 = blj.d();
	        bom v2_0 = this.a(b.dJ);
	        if (v1_1 == null) {
	            v0_3 = b.cQ;
	        } else {
	            v0_3 = b.cR;
	        }
	        android.app.AlertDialog v0_4;
	        String v3_0 = this.a(v0_3);
	        if (v1_1 == null) {
	            v0_4 = b.dL;
	        } else {
	            v0_4 = b.dM;
	        }
	        String v1_2 = new Object[2];
	        v1_2[0] = v2_0;
	        v1_2[1] = v3_0;
	        android.app.AlertDialog v0_5 = this.a(v0_4, v1_2);
	        String v1_3 = this.y;
	        String[] v5_1 = new String[4];
	        v5_1[0] = v2_0;
	        v5_1[1] = blx.b(this.y);
	        v5_1[2] = v3_0;
	        v5_1[3] = blx.a(this.y);
	        return new android.app.AlertDialog$Builder(this.y).setTitle(b.dN).setView(blx.a(v1_3, a.gQ, v0_5, v5_1)).setPositiveButton(b.dH, new bon(this)).setNegativeButton(this.a(b.dI), new bom(this)).create();
	    }
	
