	private static final java.lang.Object f
	private static bk g
	public final java.util.HashMap a
	public final java.util.HashMap b
	private final android.content.Context c
	private final java.util.ArrayList d
	private final android.os.Handler e
	
	    static bk()
	    {
	        bk.f = new Object();
	        return;
	    }
	
	
	    private bk(android.content.Context p3)
	    {
	        this.a = new java.util.HashMap();
	        this.b = new java.util.HashMap();
	        this.d = new java.util.ArrayList();
	        this.c = p3;
	        this.e = new bl(this, p3.getMainLooper());
	        return;
	    }
	
	
	    public static bk a(android.content.Context p3)
	    {
	        try {
	            if (bk.g == null) {
	                bk.g = new bk(p3.getApplicationContext());
	            }
	        } catch (bk v0_4) {
	            throw v0_4;
	        }
	        return bk.g;
	    }
	
	
	    static synthetic void a(bk p8)
	    {
	        while(true) {
	            int v0_1 = p8.d.size();
	            if (v0_1 <= 0) {
	                break;
	            }
	            bm[] v4 = new bm[v0_1];
	            p8.d.toArray(v4);
	            p8.d.clear();
	            int v3 = 0;
	            while (v3 < v4.length) {
	                bm v5 = v4[v3];
	                int v1 = 0;
	                while (v1 < v5.b.size()) {
	                    ((bn) v5.b.get(v1)).b.onReceive(p8.c, v5.a);
	                    v1++;
	                }
	                v3++;
	            }
	        }
	        return;
	    }
	
	
	    public final void a(android.content.BroadcastReceiver p7, android.content.IntentFilter p8)
	    {
	        try {
	            bn v3_1 = new bn(p8, p7);
	            int v0_2 = ((java.util.ArrayList) this.a.get(p7));
	        } catch (int v0_11) {
	            throw v0_11;
	        }
	        if (v0_2 == 0) {
	            v0_2 = new java.util.ArrayList(1);
	            this.a.put(p7, v0_2);
	        }
	        v0_2.add(p8);
	        int v1_2 = 0;
	        while (v1_2 < p8.countActions()) {
	            String v4 = p8.getAction(v1_2);
	            int v0_8 = ((java.util.ArrayList) this.b.get(v4));
	            if (v0_8 == 0) {
	                v0_8 = new java.util.ArrayList(1);
	                this.b.put(v4, v0_8);
	            }
	            v0_8.add(v3_1);
	            v1_2++;
	        }
	        return;
	    }
	
	
	    public final boolean a(android.content.Intent p16)
	    {
	        try {
	            int v12;
	            int v2_0 = p16.getAction();
	            int v3_0 = p16.resolveTypeIfNeeded(this.c.getContentResolver());
	            android.net.Uri v5 = p16.getData();
	            String v4 = p16.getScheme();
	            java.util.Set v6 = p16.getCategories();
	        } catch (String v1_38) {
	            throw v1_38;
	        }
	        if ((p16.getFlags() & 8) == 0) {
	            v12 = 0;
	        } else {
	            v12 = 1;
	        }
	        if (v12 != 0) {
	            new StringBuilder("Resolving type ").append(v3_0).append(" scheme ").append(v4).append(" of intent ").append(p16);
	        }
	        String v1_18;
	        java.util.ArrayList v8 = ((java.util.ArrayList) this.b.get(p16.getAction()));
	        if (v8 == null) {
	            v1_18 = 0;
	        } else {
	            if (v12 != 0) {
	                new StringBuilder("Action list: ").append(v8);
	            }
	            boolean v10 = 0;
	            int v11 = 0;
	            while (v11 < v8.size()) {
	                String v9_0 = ((bn) v8.get(v11));
	                if (v12 != 0) {
	                    new StringBuilder("Matching against filter ").append(v9_0.a);
	                }
	                String v1_36;
	                if (!v9_0.c) {
	                    String v1_33 = v9_0.a.match(v2_0, v3_0, v4, v5, v6, "LocalBroadcastManager");
	                    if (v1_33 < null) {
	                        if (v12 == 0) {
	                            v1_36 = v10;
	                        } else {
	                            String v1_34;
	                            switch (v1_33) {
	                                case -4:
	                                    v1_34 = "category";
	                                    break;
	                                case -3:
	                                    v1_34 = "action";
	                                    break;
	                                case -2:
	                                    v1_34 = "data";
	                                    break;
	                                case -1:
	                                    v1_34 = "type";
	                                    break;
	                                default:
	                                    v1_34 = "unknown reason";
	                            }
	                            new StringBuilder("  Filter did not match: ").append(v1_34);
	                        }
	                    } else {
	                        if (v12 != 0) {
	                            new StringBuilder("  Filter matched!  match=0x").append(Integer.toHexString(v1_33));
	                        }
	                        if (v10) {
	                            v1_36 = v10;
	                        } else {
	                            v1_36 = new java.util.ArrayList();
	                        }
	                        v1_36.add(v9_0);
	                        v9_0.c = 1;
	                    }
	                } else {
	                    if (v12 == 0) {
	                    } else {
	                        v1_36 = v10;
	                    }
	                }
	                v11++;
	                v10 = v1_36;
	            }
	            if (!v10) {
	            } else {
	                int v2_1 = 0;
	                while (v2_1 < v10.size()) {
	                    ((bn) v10.get(v2_1)).c = 0;
	                    v2_1++;
	                }
	                this.d.add(new bm(p16, v10));
	                if (!this.e.hasMessages(1)) {
	                    this.e.sendEmptyMessage(1);
	                }
	                v1_18 = 1;
	            }
	        }
	        return v1_18;
	    }
	
