	private static final au a
	
	    static at()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 16) {
	            at.a = new au();
	        } else {
	            at.a = new av();
	        }
	        return;
	    }
	
	
	    public static android.content.Intent a(android.app.Activity p1)
	    {
	        return at.a.a(p1);
	    }
	
	
	    public static android.content.Intent a(android.content.Context p3, android.content.ComponentName p4)
	    {
	        android.content.Intent v0_4;
	        android.content.Intent v0_0 = at.b(p3, p4);
	        if (v0_0 != null) {
	            android.content.ComponentName v1_1 = new android.content.ComponentName(p4.getPackageName(), v0_0);
	            if (at.b(p3, v1_1) != null) {
	                v0_4 = new android.content.Intent().setComponent(v1_1);
	            } else {
	                v0_4 = be.a(v1_1);
	            }
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public static boolean a(android.app.Activity p1, android.content.Intent p2)
	    {
	        return at.a.a(p1, p2);
	    }
	
	
	    public static String b(android.app.Activity p2)
	    {
	        try {
	            return at.b(p2, p2.getComponentName());
	        } catch (android.content.pm.PackageManager$NameNotFoundException v0_2) {
	            throw new IllegalArgumentException(v0_2);
	        }
	    }
	
	
	    public static String b(android.content.Context p2, android.content.ComponentName p3)
	    {
	        return at.a.a(p2, p2.getPackageManager().getActivityInfo(p3, 128));
	    }
	
	
	    public static void b(android.app.Activity p1, android.content.Intent p2)
	    {
	        at.a.b(p1, p2);
	        return;
	    }
	
