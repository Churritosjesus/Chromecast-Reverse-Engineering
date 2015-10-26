	private static final android.net.Uri a
	
	    static bze()
	    {
	        android.net.Uri$Builder v0_1 = android.net.Uri.parse("http://plus.google.com/");
	        bze.a = v0_1;
	        v0_1.buildUpon().appendPath("circles").appendPath("find").build();
	        return;
	    }
	
	
	    public static android.content.Intent a()
	    {
	        android.content.Intent v0_1 = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
	        v0_1.setPackage("com.google.android.wearable.app");
	        return v0_1;
	    }
	
	
	    public static android.content.Intent a(String p3)
	    {
	        android.net.Uri v0_1 = android.net.Uri.fromParts("package", p3, 0);
	        android.content.Intent v1_2 = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
	        v1_2.setData(v0_1);
	        return v1_2;
	    }
	
	
	    public static android.content.Intent b(String p3)
	    {
	        android.content.Intent v0_1 = new android.content.Intent("android.intent.action.VIEW");
	        v0_1.setData(android.net.Uri.parse("market://details").buildUpon().appendQueryParameter("id", p3).build());
	        v0_1.setPackage("com.android.vending");
	        v0_1.addFlags(524288);
	        return v0_1;
	    }
	
