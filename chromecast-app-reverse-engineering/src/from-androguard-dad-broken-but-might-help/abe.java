	public static final Ljava.lang.String a
	
	    static abe()
	    {
	        String[] v0_1 = new String[1];
	        v0_1[0] = "android.permission.READ_CONTACTS";
	        abe.a = v0_1;
	        return;
	    }
	
	
	    public static boolean a(android.content.Context p8, s p9)
	    {
	        int v0 = 0;
	        String[] v4 = abe.a;
	        int v5 = v4.length;
	        int v3 = 0;
	        while (v3 < v5) {
	            int v2_1;
	            if (android.os.Build$VERSION.SDK_INT <= 22) {
	                v2_1 = 0;
	            } else {
	                v2_1 = 1;
	            }
	            int v2_2;
	            if (v2_1 == 0) {
	                v2_2 = 0;
	            } else {
	                v2_2 = p8.checkPermission(v4[v3], android.os.Process.myPid(), android.os.Process.myUid());
	            }
	            int v2_4;
	            if (v2_2 != 0) {
	                v2_4 = 0;
	            } else {
	                v2_4 = 1;
	            }
	            if (v2_4 != 0) {
	                v3++;
	            }
	            return v0;
	        }
	        v0 = 1;
	        return v0;
	    }
	
