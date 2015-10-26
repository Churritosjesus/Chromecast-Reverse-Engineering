	private static final blp a
	
	    static bls()
	    {
	        bls.a = new blp("PlayServicesUtil");
	        return;
	    }
	
	
	    public static void a(m p6, int p7, blu p8)
	    {
	        blt v0_1 = new blt(p8);
	        try {
	            android.app.AlertDialog v1_1 = bvt.a(p7, p6, 9001);
	        } catch (android.app.AlertDialog v1) {
	            int v3_1 = new Object[1];
	            v3_1[0] = Integer.valueOf(p7);
	            bls.a.a("Could not show Google Play services error dialog for result code %d", v3_1);
	            android.app.AlertDialog v1_7 = new android.app.AlertDialog$Builder(p6).setMessage(b.cL).setPositiveButton(b.I, 0).create();
	            v1_7.setOnDismissListener(v0_1);
	            v1_7.show();
	            return;
	        }
	        if (v1_1 == null) {
	        } else {
	            v1_1.setOnDismissListener(v0_1);
	            v1_1.show();
	            return;
	        }
	    }
	
	
	    public static void a(m p4, com.google.android.gms.common.ConnectionResult p5, blu p6)
	    {
	        if (!p5.a()) {
	            bls.a(p4, p5.c, p6);
	        } else {
	            try {
	                p5.a(p4, 9001);
	            } catch (android.content.IntentSender$SendIntentException v0_3) {
	                Object[] v3_1 = new Object[0];
	                bls.a.a(v0_3, "Failed to resolve Google Play Services connection failure", v3_1);
	            }
	        }
	        return;
	    }
	
	
	    public static boolean a(android.content.Context p2)
	    {
	        return bvt.a(p2.getPackageManager(), p2.getPackageName());
	    }
	
	
	    public static String b(android.content.Context p2)
	    {
	        int v0_2;
	        int v0_1 = android.accounts.AccountManager.get(p2).getAccountsByType("com.google");
	        if (v0_1.length <= 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = v0_1[0].name;
	        }
	        return v0_2;
	    }
	
