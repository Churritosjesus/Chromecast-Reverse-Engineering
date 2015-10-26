	private static final bvu a
	
	    static bvu()
	    {
	        bvu.a = new bvu();
	        return;
	    }
	
	
	    private bvu()
	    {
	        return;
	    }
	
	
	    public static bvu a()
	    {
	        return bvu.a;
	    }
	
	
	    static varargs cah a(android.content.pm.PackageInfo p5, cah[] p6)
	    {
	        int v0_10;
	        if (p5.signatures.length == 1) {
	            byte[] v3_2 = new cdi(p5.signatures[0].toByteArray());
	            int v0_5 = 0;
	            while (v0_5 < p6.length) {
	                if (!p6[v0_5].equals(v3_2)) {
	                    v0_5++;
	                } else {
	                    v0_10 = p6[v0_5];
	                }
	            }
	            if (android.util.Log.isLoggable("GoogleSignatureVerifier", 2)) {
	                new StringBuilder("Signature not valid.  Found: \n").append(android.util.Base64.encodeToString(v3_2.a(), 0));
	            }
	            v0_10 = 0;
	        } else {
	            android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
	            v0_10 = 0;
	        }
	        return v0_10;
	    }
	
	
	    private static boolean a(android.content.pm.PackageInfo p4, boolean p5)
	    {
	        int v0_11;
	        if (p4.signatures.length == 1) {
	            int v0_5;
	            cdi v3_1 = new cdi(p4.signatures[0].toByteArray());
	            if (!p5) {
	                v0_5 = cag.b();
	            } else {
	                v0_5 = cag.a();
	            }
	            if (!v0_5.contains(v3_1)) {
	                if (android.util.Log.isLoggable("GoogleSignatureVerifier", 2)) {
	                    new StringBuilder("Signature not valid.  Found: \n").append(android.util.Base64.encodeToString(v3_1.a(), 0));
	                }
	                v0_11 = 0;
	            } else {
	                v0_11 = 1;
	            }
	        } else {
	            android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
	            v0_11 = 0;
	        }
	        return v0_11;
	    }
	
	
	    public final boolean a(android.content.pm.PackageManager p5, String p6)
	    {
	        boolean v0 = 0;
	        try {
	            String v1_1 = p5.getPackageInfo(p6, 64);
	        } catch (String v1) {
	            if (!android.util.Log.isLoggable("GoogleSignatureVerifier", 3)) {
	                return v0;
	            } else {
	                new StringBuilder("Package manager can\'t find package ").append(p6).append(", defaulting to false");
	                return v0;
	            }
	        }
	        if (v1_1 != null) {
	            if (!bvt.a(p5)) {
	                v0 = bvu.a(v1_1, 0);
	                if ((v0) || (!bvu.a(v1_1, 1))) {
	                    return v0;
	                } else {
	                    android.util.Log.w("GoogleSignatureVerifier", "Test-keys aren\'t accepted on this build.");
	                    return v0;
	                }
	            } else {
	                v0 = bvu.a(v1_1, 1);
	                return v0;
	            }
	        } else {
	            return v0;
	        }
	    }
	
