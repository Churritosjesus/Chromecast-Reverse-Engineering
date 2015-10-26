	
	    static daj()
	    {
	        android.net.Uri.parse("http://play.google.com/store/apps/details");
	        String[] v0_2 = new String[5];
	        v0_2[0] = "com.google.android.youtube";
	        v0_2[1] = "com.google.android.youtube.tv";
	        v0_2[2] = "com.google.android.youtube.googletv";
	        v0_2[3] = "com.google.android.gms";
	        v0_2[4] = 0;
	        return;
	    }
	
	
	    public static String a()
	    {
	        return new StringBuilder(35).append(1).append(".2.1").toString();
	    }
	
	
	    public static String a(android.content.Context p3)
	    {
	        try {
	            return p3.getPackageManager().getPackageInfo(p3.getPackageName(), 0).versionName;
	        } catch (android.content.pm.PackageManager$NameNotFoundException v0_3) {
	            throw new IllegalStateException("Cannot retrieve calling Context\'s PackageInfo", v0_3);
	        }
	    }
	
