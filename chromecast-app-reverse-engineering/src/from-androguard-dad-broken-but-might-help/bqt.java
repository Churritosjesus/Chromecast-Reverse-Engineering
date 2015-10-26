	private java.lang.String a
	private java.lang.String b
	private  c
	private  e
	private  f
	private  g
	private  h
	
	    public bqt(brb p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    protected final void a()
	    {
	        Boolean v0_1 = this.d.a;
	        try {
	            Boolean v0_3 = v0_1.getPackageManager().getApplicationInfo(v0_1.getPackageName(), 129);
	        } catch (Boolean v0_4) {
	            this.d("PackageManager doesn\'t know about the app package", v0_4);
	            v0_3 = 0;
	        }
	        if (v0_3 != null) {
	            Boolean v0_5 = v0_3.metaData;
	            if (v0_5 != null) {
	                Boolean v0_6 = v0_5.getInt("com.google.android.gms.analytics.globalConfigResource");
	                if (v0_6 > null) {
	                    Boolean v0_8 = ((bsh) new bsg(this.d).a(v0_6));
	                    if (v0_8 != null) {
	                        int v3_6;
	                        this.b("Loading global XML config values");
	                        if (v0_8.a == null) {
	                            v3_6 = 0;
	                        } else {
	                            v3_6 = 1;
	                        }
	                        if (v3_6 != 0) {
	                            int v3_7 = v0_8.a;
	                            this.b = v3_7;
	                            this.b("XML config - app name", v3_7);
	                        }
	                        int v3_9;
	                        if (v0_8.b == null) {
	                            v3_9 = 0;
	                        } else {
	                            v3_9 = 1;
	                        }
	                        if (v3_9 != 0) {
	                            int v3_10 = v0_8.b;
	                            this.a = v3_10;
	                            this.b("XML config - app version", v3_10);
	                        }
	                        int v3_12;
	                        if (v0_8.c == null) {
	                            v3_12 = 0;
	                        } else {
	                            v3_12 = 1;
	                        }
	                        if (v3_12 != 0) {
	                            int v3_16;
	                            int v3_14 = v0_8.c.toLowerCase();
	                            if (!"verbose".equals(v3_14)) {
	                                if (!"info".equals(v3_14)) {
	                                    if (!"warning".equals(v3_14)) {
	                                        if (!"error".equals(v3_14)) {
	                                            v3_16 = -1;
	                                        } else {
	                                            v3_16 = 3;
	                                        }
	                                    } else {
	                                        v3_16 = 2;
	                                    }
	                                } else {
	                                    v3_16 = 1;
	                                }
	                            } else {
	                                v3_16 = 0;
	                            }
	                            if (v3_16 >= 0) {
	                                this.c = v3_16;
	                                this.a("XML config - log level", Integer.valueOf(v3_16));
	                            }
	                        }
	                        int v3_19;
	                        if (v0_8.d < 0) {
	                            v3_19 = 0;
	                        } else {
	                            v3_19 = 1;
	                        }
	                        if (v3_19 != 0) {
	                            int v3_20 = v0_8.d;
	                            this.f = v3_20;
	                            this.e = 1;
	                            this.b("XML config - dispatch period (sec)", Integer.valueOf(v3_20));
	                        }
	                        int v3_23;
	                        if (v0_8.e == -1) {
	                            v3_23 = 0;
	                        } else {
	                            v3_23 = 1;
	                        }
	                        if (v3_23 != 0) {
	                            Boolean v0_10;
	                            if (v0_8.e != 1) {
	                                v0_10 = 0;
	                            } else {
	                                v0_10 = 1;
	                            }
	                            this.h = v0_10;
	                            this.g = 1;
	                            this.b("XML config - dry run", Boolean.valueOf(v0_10));
	                        }
	                    }
	                }
	            }
	        } else {
	            this.e("Couldn\'t get ApplicationInfo to load global config");
	        }
	        return;
	    }
	
	
	    public final String b()
	    {
	        this.r();
	        return this.a;
	    }
	
	
	    public final String c()
	    {
	        this.r();
	        return this.b;
	    }
	
	
	    public final boolean d()
	    {
	        this.r();
	        return 0;
	    }
	
	
	    public final int e()
	    {
	        this.r();
	        return this.c;
	    }
	
	
	    public final boolean f()
	    {
	        this.r();
	        return this.e;
	    }
	
	
	    public final int g()
	    {
	        this.r();
	        return this.f;
	    }
	
	
	    public final boolean h()
	    {
	        this.r();
	        return this.g;
	    }
	
	
	    public final boolean i()
	    {
	        this.r();
	        return this.h;
	    }
	
