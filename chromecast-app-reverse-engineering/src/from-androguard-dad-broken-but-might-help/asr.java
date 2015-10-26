	static final  a
	
	    static asr()
	    {
	        asr.a = java.util.concurrent.TimeUnit.SECONDS.toMillis(5);
	        return;
	    }
	
	
	    public static aec a(android.content.Context p4)
	    {
	        return new aec(blf.X(p4), 1, 1065353216);
	    }
	
	
	    public static android.content.Intent a(String p5, android.content.Context p6)
	    {
	        android.content.Intent v1_1 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(p5));
	        v1_1.addFlags(268435456);
	        String v2_1 = com.google.android.apps.chromecast.app.SetupApplication.a().e;
	        if (!android.text.TextUtils.isEmpty(v2_1)) {
	            java.util.Iterator v3_1 = p6.getPackageManager().queryIntentActivities(v1_1, 0).iterator();
	            while (v3_1.hasNext()) {
	                com.google.android.gms.identity.accounts.api.AccountData v0_10 = ((android.content.pm.ResolveInfo) v3_1.next()).activityInfo.packageName;
	                if (v0_10.contains("com.google.android.apps.plus")) {
	                    v1_1.setPackage(v0_10);
	                    cil.a(p6, v1_1, com.google.android.gms.identity.accounts.api.AccountData.a(v2_1));
	                    break;
	                }
	            }
	        }
	        return v1_1;
	    }
	
	
	    public static android.support.v7.widget.SwitchCompat a(android.view.MenuItem p4, android.widget.CompoundButton$OnCheckedChangeListener p5, Boolean p6)
	    {
	        int v1_1;
	        android.support.v7.widget.SwitchCompat v0_1 = ((android.support.v7.widget.SwitchCompat) p4.getActionView());
	        if (p6 != Boolean.TRUE) {
	            v1_1 = 0;
	        } else {
	            v1_1 = 1;
	        }
	        v0_1.setChecked(v1_1);
	        v0_1.setPadding(0, 0, v0_1.getContext().getResources().getDimensionPixelSize(a.dy), 0);
	        v0_1.setOnCheckedChangeListener(p5);
	        return v0_1;
	    }
	
	
	    public static dbt a(aow p3)
	    {
	        return asr.a(p3.j, p3.g(), p3.k);
	    }
	
	
	    public static dbt a(dbr p2, String p3)
	    {
	        return asr.a(p2.b, p2.c, p3);
	    }
	
	
	    public static dbt a(String p2, String p3, String p4)
	    {
	        dbt v0_1 = new dbt();
	        v0_1.a = p2;
	        v0_1.b = p3;
	        if (!android.text.TextUtils.isEmpty(p4)) {
	            v0_1.c = p4;
	        }
	        return v0_1;
	    }
	
	
	    public static String a(String p3, String p4)
	    {
	        String v0_2;
	        String v1 = String.valueOf(p3);
	        String v0_0 = String.valueOf(p4);
	        if (v0_0.length() == 0) {
	            v0_2 = new String(v1);
	        } else {
	            v0_2 = v1.concat(v0_0);
	        }
	        return v0_2;
	    }
	
