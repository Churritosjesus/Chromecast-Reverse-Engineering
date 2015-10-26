	private static final java.util.HashSet b
	 java.util.TreeSet a
	
	    static ajb()
	    {
	        java.util.HashSet v0_1 = new java.util.HashSet();
	        v0_1.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
	        v0_1.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
	        v0_1.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
	        ajb.b = v0_1;
	        return;
	    }
	
	
	    private ajb()
	    {
	        return;
	    }
	
	
	    synthetic ajb(byte p1)
	    {
	        return;
	    }
	
	
	    static synthetic void a(ajb p1, boolean p2)
	    {
	        p1.a(1);
	        return;
	    }
	
	
	    public static boolean a(android.content.Context p7, String p8)
	    {
	        int v0 = 1;
	        if ((!android.os.Build.BRAND.startsWith("generic")) || ((p7.getApplicationInfo().flags & 2) == 0)) {
	            try {
	                android.content.pm.Signature[] v3_3 = p7.getPackageManager().getPackageInfo(p8, 64).signatures;
	                int v2_5 = 0;
	            } catch (int v0) {
	                v0 = 0;
	            }
	            while (v2_5 < v3_3.length) {
	                if (!ajb.b.contains(aji.a(v3_3[v2_5].toByteArray()))) {
	                    v2_5++;
	                }
	            }
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    declared_synchronized void a(boolean p2)
	    {
	        try {
	            if ((p2) || (this.a == null)) {
	                this.a = aix.a(this);
	            }
	        } catch (Throwable v0_2) {
	            throw v0_2;
	        }
	        return;
	    }
	
