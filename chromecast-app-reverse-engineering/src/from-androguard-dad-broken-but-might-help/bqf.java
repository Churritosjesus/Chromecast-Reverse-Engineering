	private static  a
	private bpb b
	private final bqr c
	private java.lang.String e
	private  f
	private java.lang.Object g
	
	    bqf(brb p3)
	    {
	        this(p3);
	        this.f = 0;
	        this.g = new Object();
	        this.c = new bqr(p3.c);
	        return;
	    }
	
	
	    private static String a(String p8)
	    {
	        String v0_3;
	        String v0_1 = bqs.b("MD5");
	        if (v0_1 != null) {
	            Object[] v3 = new Object[1];
	            v3[0] = new java.math.BigInteger(1, v0_1.digest(p8.getBytes()));
	            v0_3 = String.format(java.util.Locale.US, "%032X", v3);
	        } else {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    private boolean a(bpb p7, bpb p8)
	    {
	        boolean v0_0;
	        String v1_0 = 0;
	        if (p8 != null) {
	            v0_0 = p8.a;
	        } else {
	            v0_0 = 0;
	        }
	        boolean v0_4;
	        if (!android.text.TextUtils.isEmpty(v0_0)) {
	            String v3_3 = this.d.g().b();
	            try {
	                if (this.f) {
	                    if (android.text.TextUtils.isEmpty(this.e)) {
	                        if (p7 != null) {
	                            v1_0 = p7.a;
	                        }
	                        if (v1_0 != null) {
	                            this.e = bqf.a(new StringBuilder().append(v1_0).append(v3_3).toString());
	                        } else {
	                            v0_4 = this.g(new StringBuilder().append(v0_0).append(v3_3).toString());
	                            return v0_4;
	                        }
	                    }
	                } else {
	                    this.e = this.f();
	                    this.f = 1;
	                }
	            } catch (boolean v0_8) {
	                throw v0_8;
	            }
	            String v1_14 = bqf.a(new StringBuilder().append(v0_0).append(v3_3).toString());
	            if (!android.text.TextUtils.isEmpty(v1_14)) {
	                if (!v1_14.equals(this.e)) {
	                    String v1_18;
	                    if (android.text.TextUtils.isEmpty(this.e)) {
	                        v1_18 = v3_3;
	                    } else {
	                        this.b("Resetting the client id because Advertising Id changed.");
	                        v1_18 = this.d.g().c();
	                        this.a("New client Id", v1_18);
	                    }
	                    v0_4 = this.g(new StringBuilder().append(v0_0).append(v1_18).toString());
	                } else {
	                    v0_4 = 1;
	                }
	            } else {
	                v0_4 = 0;
	            }
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    private declared_synchronized bpb d()
	    {
	        try {
	            if (this.c.a(1000)) {
	                this.c.a();
	                bpb v0_3 = this.e();
	                if (!this.a(this.b, v0_3)) {
	                    this.f("Failed to reset client id on adid change. Not using adid");
	                    this.b = new bpb("", 0);
	                } else {
	                    this.b = v0_3;
	                }
	            }
	        } catch (bpb v0_7) {
	            throw v0_7;
	        }
	        return this.b;
	    }
	
	
	    private bpb e()
	    {
	        try {
	            bpb v0 = bpa.a(this.d.a);
	        } catch (Throwable v1) {
	            this.e("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added \'<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />\' to your application manifest file. See http://goo.gl/naFqQk for details.");
	        } catch (Throwable v1_2) {
	            if (bqf.a) {
	            } else {
	                bqf.a = 1;
	                this.d("Error getting advertiser id", v1_2);
	            }
	        }
	        return v0;
	    }
	
	
	    private String f()
	    {
	        String v0_0 = 0;
	        try {
	            String v2_1 = this.d.a.openFileInput("gaClientIdData");
	            byte[] v3 = new byte[128];
	            int v4_1 = v2_1.read(v3, 0, 128);
	        } catch (java.io.IOException v1_7) {
	            this.d("Error reading Hash file, deleting it", v1_7);
	            this.d.a.deleteFile("gaClientIdData");
	            return v0_0;
	        }
	        if (v2_1.available() <= 0) {
	            if (v4_1 > 0) {
	                java.io.IOException v1_6 = new String(v3, 0, v4_1);
	                try {
	                    v2_1.close();
	                    v0_0 = v1_6;
	                } catch (String v0_1) {
	                    v0_0 = v1_6;
	                    v1_7 = v0_1;
	                } catch (String v0) {
	                    v0_0 = v1_6;
	                }
	                return v0_0;
	            } else {
	                this.b("Hash file is empty.");
	                v2_1.close();
	                return v0_0;
	            }
	        } else {
	            this.e("Hash file seems corrupted, deleting it.");
	            v2_1.close();
	            this.d.a.deleteFile("gaClientIdData");
	            return v0_0;
	        }
	    }
	
	
	    private boolean g(String p6)
	    {
	        try {
	            java.io.IOException v1_0 = bqf.a(p6);
	            this.b("Storing hashed adid.");
	            String v2_3 = this.d.a.openFileOutput("gaClientIdData", 0);
	            v2_3.write(v1_0.getBytes());
	            v2_3.close();
	            this.e = v1_0;
	        } catch (java.io.IOException v1_1) {
	            this.e("Error creating hash file", v1_1);
	        }
	        return 1;
	    }
	
	
	    protected final void a()
	    {
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        int v0 = 0;
	        this.r();
	        boolean v1_0 = this.d();
	        if ((v1_0) && (!v1_0.b)) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final String c()
	    {
	        int v0_1;
	        int v1 = 0;
	        this.r();
	        int v0_0 = this.d();
	        if (v0_0 == 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = v0_0.a;
	        }
	        if (!android.text.TextUtils.isEmpty(v0_1)) {
	            v1 = v0_1;
	        }
	        return v1;
	    }
	
