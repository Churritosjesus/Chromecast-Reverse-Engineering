	private static cio a
	private static final cin b
	
	    static cil()
	    {
	        cil.a = new cio();
	        cil.b = new cin(cil.a);
	        return;
	    }
	
	
	    public static boolean a(android.content.Context p4, android.content.Intent p5, com.google.android.gms.identity.accounts.api.AccountData p6)
	    {
	        String v1_4;
	        int v0_0 = 0;
	        a.f(p4, "Context must not be null.");
	        a.f(p5, "Intent must not be null.");
	        a.f(p6, "Account data must not be null.");
	        String v1_3 = p5.getComponent();
	        if (v1_3 == null) {
	            v1_4 = p5.getPackage();
	        } else {
	            v1_4 = v1_3.getPackageName();
	        }
	        if ((v1_4 != null) && (cil.b.a.a(p4.getPackageManager(), v1_4))) {
	            android.os.Parcel v2_2 = android.os.Parcel.obtain();
	            p6.writeToParcel(v2_2, 0);
	            int v0_1 = v2_2.marshall();
	            v2_2.recycle();
	            p5.putExtra("com.google.android.gms.accounts.ACCOUNT_DATA", v0_1);
	            v0_0 = 1;
	        }
	        return v0_0;
	    }
	
