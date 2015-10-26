	
	    public static int a(int p1)
	    {
	        return (p1 / 1000);
	    }
	
	
	    public static boolean a(android.content.Context p2)
	    {
	        return p2.getPackageManager().hasSystemFeature("android.hardware.type.watch");
	    }
	
	
	    public static boolean b(int p2)
	    {
	        int v0_2;
	        if (((p2 % 1000) / 100) != 3) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
