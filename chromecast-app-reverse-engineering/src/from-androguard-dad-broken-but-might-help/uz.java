	final android.content.Context a
	final android.os.Handler b
	  c
	final android.content.BroadcastReceiver d
	final java.lang.Runnable e
	private final vc f
	private final android.content.pm.PackageManager g
	private final java.util.ArrayList h
	
	    public uz(android.content.Context p2, vc p3)
	    {
	        this.h = new java.util.ArrayList();
	        this.d = new va(this);
	        this.e = new vb(this);
	        this.a = p2;
	        this.f = p3;
	        this.b = new android.os.Handler();
	        this.g = p2.getPackageManager();
	        return;
	    }
	
	
	    private int a(String p6, String p7)
	    {
	        int v3 = this.h.size();
	        int v1 = 0;
	        while (v1 < v3) {
	            int v0_8;
	            int v0_4 = ((us) this.h.get(v1));
	            if ((!v0_4.j.getPackageName().equals(p6)) || (!v0_4.j.getClassName().equals(p7))) {
	                v0_8 = 0;
	            } else {
	                v0_8 = 1;
	            }
	            if (v0_8 == 0) {
	                v1++;
	            } else {
	                int v0_1 = v1;
	            }
	            return v0_1;
	        }
	        v0_1 = -1;
	        return v0_1;
	    }
	
	
	    static synthetic void a(uz p8)
	    {
	        if (p8.c) {
	            int v3_0 = p8.g.queryIntentServices(new android.content.Intent("android.media.MediaRouteProviderService"), 0).iterator();
	            int v1_2 = 0;
	            while (v3_0.hasNext()) {
	                int v0_17;
	                int v0_16 = ((android.content.pm.ResolveInfo) v3_0.next()).serviceInfo;
	                if (v0_16 == 0) {
	                    v0_17 = v1_2;
	                } else {
	                    StringBuilder v4_8 = p8.a(v0_16.packageName, v0_16.name);
	                    if (v4_8 >= null) {
	                        if (v4_8 < v1_2) {
	                        } else {
	                            int v0_20 = ((us) p8.h.get(v4_8));
	                            v0_20.a();
	                            if ((v0_20.l == null) && (v0_20.c())) {
	                                v0_20.e();
	                                v0_20.d();
	                            }
	                            v0_17 = (v1_2 + 1);
	                            java.util.Collections.swap(p8.h, v4_8, v1_2);
	                        }
	                    } else {
	                        StringBuilder v4_10 = new us(p8.a, new android.content.ComponentName(v0_16.packageName, v0_16.name));
	                        v4_10.a();
	                        int v0_22 = (v1_2 + 1);
	                        p8.h.add(v1_2, v4_10);
	                        p8.f.a(v4_10);
	                        v1_2 = v0_22;
	                    }
	                }
	                v1_2 = v0_17;
	            }
	            if (v1_2 < p8.h.size()) {
	                int v3_1 = (p8.h.size() - 1);
	                while (v3_1 >= v1_2) {
	                    int v0_12 = ((us) p8.h.get(v3_1));
	                    p8.f.b(v0_12);
	                    p8.h.remove(v0_12);
	                    if (v0_12.k) {
	                        if (us.i) {
	                            new StringBuilder().append(v0_12).append(": Stopping");
	                        }
	                        v0_12.k = 0;
	                        v0_12.b();
	                    }
	                    v3_1--;
	                }
	            }
	        }
	        return;
	    }
	
