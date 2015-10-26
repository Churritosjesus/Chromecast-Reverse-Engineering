	public  a
	public  b
	public  c
	public final java.util.ArrayList d
	 Ldal e
	public java.util.HashSet f
	private final  g
	private apj h
	
	    public bke()
	    {
	        this.b = 0;
	        this.a = 0;
	        this.c = 0;
	        this.d = new java.util.ArrayList();
	        long v0_6 = android.text.TextUtils.split(android.preference.PreferenceManager.getDefaultSharedPreferences(com.google.android.apps.chromecast.app.SetupApplication.a()).getString("IGNORED_ANNOUNCEMENT_CARDS", ""), ",");
	        this.f = new java.util.HashSet();
	        this.f.addAll(java.util.Arrays.asList(v0_6));
	        this.h = new apj(com.google.android.apps.chromecast.app.SetupApplication.a());
	        this.g = bke.c();
	        return;
	    }
	
	
	    private static long c()
	    {
	        long v0_0 = 0;
	        NumberFormatException v2_2 = android.text.TextUtils.split(com.google.android.apps.chromecast.app.SetupApplication.a().e(), "\\.");
	        if (v2_2.length >= 2) {
	            try {
	                v0_0 = (Long.valueOf(v2_2[1]).longValue() + (Long.valueOf(v2_2[0]).longValue() * 1000));
	            } catch (NumberFormatException v2) {
	            }
	        }
	        return v0_0;
	    }
	
	
	    public void a()
	    {
	        if ((this.e != null) && (!this.d.isEmpty())) {
	            dal v1 = this.b();
	            java.util.Iterator v2 = this.d.iterator();
	            while (v2.hasNext()) {
	                ((bkf) v2.next()).a(v1);
	            }
	        }
	        return;
	    }
	
	
	    public final dal b()
	    {
	        dal v0_0 = 0;
	        if (this.e != null) {
	            int v1_1 = 0;
	            while (v1_1 < this.e.length) {
	                String v5_0 = this.e[v1_1];
	                long v6_0 = v5_0.c;
	                int v3_3 = 0;
	                while (v3_3 < v6_0.length) {
	                    if (v6_0[v3_3] != 0) {
	                        v3_3++;
	                    } else {
	                        int v3_4 = 1;
	                    }
	                    if (((v3_4 == 0) || ((v5_0.l != null) && (this.g < v5_0.l.longValue()))) || (((!this.b) && (v5_0.b == 3)) || (((!this.a) && (v5_0.b == 2)) || ((!this.c) && (v5_0.b == 1))))) {
	                        int v3_18 = 0;
	                    } else {
	                        int v3_15;
	                        int v3_14 = this.h;
	                        if (v5_0.a.longValue() != 5) {
	                            if (v5_0.a.longValue() != 1) {
	                                if (v5_0.a.longValue() != 3) {
	                                    v3_15 = 0;
	                                } else {
	                                    v3_15 = v3_14.c;
	                                }
	                            } else {
	                                v3_15 = v3_14.b;
	                            }
	                        } else {
	                            v3_15 = v3_14.a;
	                        }
	                        if ((v3_15 != 0) || (this.f.contains(String.valueOf(v5_0.a)))) {
	                        } else {
	                            v3_18 = 1;
	                        }
	                    }
	                    if ((v3_18 != 0) && ((v0_0 == null) || (this.e[v1_1].d.longValue() < v0_0.d.longValue()))) {
	                        v0_0 = this.e[v1_1];
	                    }
	                    v1_1++;
	                }
	                v3_4 = 0;
	            }
	        }
	        return v0_0;
	    }
	
