	private static final java.lang.String a
	
	    static ajp()
	    {
	        ajp.a = ajp.getName();
	        return;
	    }
	
	
	    public ajp()
	    {
	        return;
	    }
	
	
	    public static void a()
	    {
	        if (android.os.Looper.getMainLooper().equals(android.os.Looper.myLooper())) {
	            return;
	        } else {
	            throw new afq("This method should be called from the UI thread");
	        }
	    }
	
	
	    public static void a(android.content.Context p2, boolean p3)
	    {
	        ajp.a(p2, "context");
	        if (p2.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
	            android.util.Log.w(ajp.a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
	        }
	        return;
	    }
	
	
	    public static void a(Object p3, String p4)
	    {
	        if (p3 != null) {
	            return;
	        } else {
	            throw new NullPointerException(new StringBuilder((String.valueOf(p4).length() + 26)).append("Argument \'").append(p4).append("\' cannot be null").toString());
	        }
	    }
	
	
	    public static void a(String p3, String p4)
	    {
	        if (!aji.a(p3)) {
	            return;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder((String.valueOf(p4).length() + 35)).append("Argument \'").append(p4).append("\' cannot be null or empty").toString());
	        }
	    }
	
	
	    public static void a(java.util.Collection p3, String p4)
	    {
	        ajp.a(p3, p4);
	        IllegalArgumentException v0_0 = p3.iterator();
	        while (v0_0.hasNext()) {
	            if (v0_0.next() == null) {
	                throw new NullPointerException(new StringBuilder((String.valueOf(p4).length() + 39)).append("Container \'").append(p4).append("\' cannot contain null values").toString());
	            }
	        }
	        if (!p3.isEmpty()) {
	            return;
	        } else {
	            throw new IllegalArgumentException(new StringBuilder((String.valueOf(p4).length() + 28)).append("Container \'").append(p4).append("\' cannot be empty").toString());
	        }
	    }
	
	
	    public static void b()
	    {
	        if (afv.a()) {
	            return;
	        } else {
	            throw new afy("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
	        }
	    }
	
	
	    public static void b(android.content.Context p4, boolean p5)
	    {
	        ajp.a(p4, "context");
	        android.content.pm.PackageManager$NameNotFoundException v1_0 = p4.getPackageManager();
	        String v0_1 = 0;
	        if (v1_0 != null) {
	            try {
	                v0_1 = v1_0.getActivityInfo(new android.content.ComponentName(p4, com.facebook.FacebookActivity), 1);
	            } catch (android.content.pm.PackageManager$NameNotFoundException v1) {
	            }
	        }
	        if (v0_1 == null) {
	            android.util.Log.w(ajp.a, "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
	        }
	        return;
	    }
	
