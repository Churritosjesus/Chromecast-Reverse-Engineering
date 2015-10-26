	private static final java.lang.Object a
	private static bzw b
	private static final android.content.ComponentName g
	private final java.util.List c
	private final java.util.List d
	private final java.util.List e
	private final java.util.List f
	private caa h
	
	    static bzw()
	    {
	        bzw.a = new Object();
	        bzw.g = new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
	        return;
	    }
	
	
	    private bzw()
	    {
	        if (bzw.b() != 0) {
	            Long v0_5;
	            Long v0_3 = ((String) bzy.b.c());
	            if (v0_3 != null) {
	                v0_5 = java.util.Arrays.asList(v0_3.split(","));
	            } else {
	                v0_5 = java.util.Collections.EMPTY_LIST;
	            }
	            Long v0_10;
	            this.c = v0_5;
	            Long v0_8 = ((String) bzy.c.c());
	            if (v0_8 != null) {
	                v0_10 = java.util.Arrays.asList(v0_8.split(","));
	            } else {
	                v0_10 = java.util.Collections.EMPTY_LIST;
	            }
	            Long v0_15;
	            this.d = v0_10;
	            Long v0_13 = ((String) bzy.d.c());
	            if (v0_13 != null) {
	                v0_15 = java.util.Arrays.asList(v0_13.split(","));
	            } else {
	                v0_15 = java.util.Collections.EMPTY_LIST;
	            }
	            Long v0_20;
	            this.e = v0_15;
	            Long v0_18 = ((String) bzy.e.c());
	            if (v0_18 != null) {
	                v0_20 = java.util.Arrays.asList(v0_18.split(","));
	            } else {
	                v0_20 = java.util.Collections.EMPTY_LIST;
	            }
	            this.f = v0_20;
	            this.h = new caa(1024, ((Long) bzy.f.c()).longValue());
	        } else {
	            this.c = java.util.Collections.EMPTY_LIST;
	            this.d = java.util.Collections.EMPTY_LIST;
	            this.e = java.util.Collections.EMPTY_LIST;
	            this.f = java.util.Collections.EMPTY_LIST;
	        }
	        return;
	    }
	
	
	    private static android.content.pm.ServiceInfo a(android.content.Context p9, android.content.Intent p10)
	    {
	        int v0_4;
	        int v0_1 = p9.getPackageManager().queryIntentServices(p10, 128);
	        if ((v0_1 != 0) && (v0_1.size() != 0)) {
	            if (v0_1.size() > 1) {
	                Object[] v3_1 = new Object[2];
	                v3_1[0] = p10.toUri(0);
	                v3_1[1] = a.b(3, 20);
	                android.util.Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", v3_1));
	                String v1_4 = v0_1.iterator();
	                if (v1_4.hasNext()) {
	                    android.util.Log.w("ConnectionTracker", ((android.content.pm.ResolveInfo) v1_4.next()).serviceInfo.name);
	                    v0_4 = 0;
	                    return v0_4;
	                }
	            }
	            v0_4 = ((android.content.pm.ResolveInfo) v0_1.get(0)).serviceInfo;
	        } else {
	            boolean v2_3 = new Object[2];
	            v2_3[0] = p10.toUri(0);
	            v2_3[1] = a.b(3, 20);
	            android.util.Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", v2_3));
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    public static bzw a()
	    {
	        if (bzw.b == null) {
	            bzw.b = new bzw();
	        }
	        return bzw.b;
	    }
	
	
	    private static int b()
	    {
	        try {
	            if ((!byk.a) || ((!cks.b()) || (cks.a() != android.os.Process.myUid()))) {
	                int v0_3 = 0;
	            } else {
	                v0_3 = ((Integer) bzy.a.c()).intValue();
	            }
	        } catch (int v0) {
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
	
	    public final void a(android.content.Context p7, android.content.ServiceConnection p8)
	    {
	        this.a(p7, p8, 0, 0, "UNBIND");
	        p7.unbindService(p8);
	        return;
	    }
	
	
	    public void a(android.content.Context p19, android.content.ServiceConnection p20, String p21, android.content.Intent p22, String p23)
	    {
	        if (byk.a) {
	            int v2_7;
	            long v12 = ((((long) android.os.Process.myPid()) << 32) | ((long) System.identityHashCode(p20)));
	            int v2_4 = bzw.b();
	            if ((v2_4 != 0) && (this.h != null)) {
	                if ((p23 != "DISCONNECT") && (p23 != "UNBIND")) {
	                    Long v3_3 = bzw.a(p19, p22);
	                    if (v3_3 != null) {
	                        String v4_3 = a.b(p19);
	                        String v5_0 = v3_3.processName;
	                        if ((!this.c.contains(v4_3)) && ((!this.d.contains(p21)) && ((!this.e.contains(v5_0)) && ((!this.f.contains(v3_3.name)) && ((!v5_0.equals(v4_3)) || ((v2_4 & bzz.c) == 0)))))) {
	                            this.h.a(Long.valueOf(v12));
	                            v2_7 = 1;
	                        } else {
	                            v2_7 = 0;
	                        }
	                    } else {
	                        String v4_5 = new Object[2];
	                        v4_5[0] = p21;
	                        v4_5[1] = p22.toUri(0);
	                        android.util.Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", v4_5));
	                        v2_7 = 0;
	                    }
	                } else {
	                    if (!this.h.a(v12)) {
	                        v2_7 = 0;
	                    } else {
	                        v2_7 = 1;
	                    }
	                }
	            } else {
	                v2_7 = 0;
	            }
	            if (v2_7 != 0) {
	                String v4_6 = System.currentTimeMillis();
	                String v11 = 0;
	                if ((bzw.b() & bzz.b) != 0) {
	                    v11 = a.b(3, 5);
	                }
	                long v16 = 0;
	                if ((bzw.b() & bzz.d) != 0) {
	                    v16 = android.os.Debug.getNativeHeapAllocatedSize();
	                }
	                if ((!p23.equals("UNBIND")) && (!p23.equals("DISCONNECT"))) {
	                    int v2_20 = bzw.a(p19, p22);
	                    Long v3_15 = new com.google.android.gms.common.stats.ConnectionEvent(v4_6, p23, a.b(p19), p21, v2_20.processName, v2_20.name, v11, v12, android.os.SystemClock.elapsedRealtime(), v16);
	                } else {
	                    v3_15 = new com.google.android.gms.common.stats.ConnectionEvent(v4_6, p23, 0, 0, 0, 0, v11, v12, android.os.SystemClock.elapsedRealtime(), v16);
	                }
	                p19.startService(new android.content.Intent().setComponent(bzw.g).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", v3_15));
	            }
	        }
	        return;
	    }
	
	
	    public final boolean a(android.content.Context p7, android.content.Intent p8, android.content.ServiceConnection p9, int p10)
	    {
	        return this.a(p7, p7.getClass().getName(), p8, p9, p10);
	    }
	
	
	    public final boolean a(android.content.Context p7, String p8, android.content.Intent p9, android.content.ServiceConnection p10, int p11)
	    {
	        this.a(p7, p10, p8, p9, "BIND");
	        return p7.bindService(p9, p10, p11);
	    }
	
