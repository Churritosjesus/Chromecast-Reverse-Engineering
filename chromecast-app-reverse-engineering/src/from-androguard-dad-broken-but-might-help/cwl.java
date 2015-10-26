	private static final java.lang.String a
	private final cwn b
	private bridge cuz c
	private final cvp d
	private final android.content.Context e
	private final java.lang.String f
	private  g
	private cac h
	private final  i
	
	    static cwl()
	    {
	        Object[] v1_1 = new Object[5];
	        v1_1[0] = "gtm_hits";
	        v1_1[1] = "hit_id";
	        v1_1[2] = "hit_time";
	        v1_1[3] = "hit_url";
	        v1_1[4] = "hit_first_send_time";
	        cwl.a = String.format("CREATE TABLE IF NOT EXISTS %s ( \'%s\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'%s\' INTEGER NOT NULL, \'%s\' TEXT NOT NULL,\'%s\' INTEGER NOT NULL);", v1_1);
	        return;
	    }
	
	
	    cwl(cvp p3, android.content.Context p4)
	    {
	        this(p3, p4, "gtm_urls.db", 2000);
	        return;
	    }
	
	
	    private cwl(cvp p5, android.content.Context p6, String p7, int p8)
	    {
	        this.e = p6.getApplicationContext();
	        this.f = p7;
	        this.d = p5;
	        this.h = cad.c();
	        this.b = new cwn(this, this.e, this.f);
	        this.c = new cxw(new org.apache.http.impl.client.DefaultHttpClient(), this.e, new cwm(this));
	        this.g = 0;
	        this.i = 2000;
	        return;
	    }
	
	
	    private android.database.sqlite.SQLiteDatabase a(String p2)
	    {
	        try {
	            int v0_1 = this.b.getWritableDatabase();
	        } catch (int v0) {
	            cuh.b(p2);
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    static synthetic cac a(cwl p1)
	    {
	        return p1.h;
	    }
	
	
	    private java.util.List a(int p14)
	    {
	        java.util.ArrayList v0_11;
	        java.util.ArrayList v9_1 = new java.util.ArrayList();
	        if (p14 > 0) {
	            java.util.ArrayList v0_1 = this.a("Error opening database for peekHitIds.");
	            if (v0_1 != null) {
	                try {
	                    long v2_1 = new String[1];
	                    v2_1[0] = "hit_id";
	                    String v8_1 = new Object[1];
	                    v8_1[0] = "hit_id";
	                    int v1_1 = v0_1.query("gtm_hits", v2_1, 0, 0, 0, 0, String.format("%s ASC", v8_1), Integer.toString(p14));
	                } catch (java.util.ArrayList v0_2) {
	                    v1_1 = 0;
	                    cuh.b(new StringBuilder("Error in peekHits fetching hitIds: ").append(v0_2.getMessage()).toString());
	                    if (v1_1 == 0) {
	                        v0_11 = v9_1;
	                        return v0_11;
	                    } else {
	                        v1_1.close();
	                    }
	                    if (v1_1 == 0) {
	                    } else {
	                        v1_1.close();
	                    }
	                } catch (java.util.ArrayList v0_3) {
	                    v1_1 = 0;
	                    if (v1_1 != 0) {
	                        v1_1.close();
	                    }
	                    throw v0_3;
	                } catch (java.util.ArrayList v0_3) {
	                }
	                try {
	                    if (v1_1.moveToFirst()) {
	                        do {
	                            v9_1.add(String.valueOf(v1_1.getLong(0)));
	                        } while(v1_1.moveToNext());
	                    }
	                } catch (java.util.ArrayList v0_2) {
	                }
	            } else {
	                v0_11 = v9_1;
	            }
	        } else {
	            cuh.b("Invalid maxHits specified. Skipping");
	            v0_11 = v9_1;
	        }
	        return v0_11;
	    }
	
	
	    private void a(long p4)
	    {
	        String[] v0_1 = new String[1];
	        v0_1[0] = String.valueOf(p4);
	        this.a(v0_1);
	        return;
	    }
	
	
	    static synthetic void a(cwl p1, long p2)
	    {
	        p1.a(p2);
	        return;
	    }
	
	
	    static synthetic void a(cwl p7, long p8, long p10)
	    {
	        String v0_1 = p7.a("Error opening database for getNumStoredHits.");
	        if (v0_1 != null) {
	            String v1_1 = new android.content.ContentValues();
	            v1_1.put("hit_first_send_time", Long.valueOf(p10));
	            try {
	                String[] v4_1 = new String[1];
	                v4_1[0] = String.valueOf(p8);
	                v0_1.update("gtm_hits", v1_1, "hit_id=?", v4_1);
	            } catch (String v0) {
	                cuh.b(new StringBuilder("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ").append(p8).toString());
	                p7.a(p8);
	            }
	        }
	        return;
	    }
	
	
	    private void a(String[] p9)
	    {
	        int v0_0 = 1;
	        if ((p9 != null) && (p9.length != 0)) {
	            cvp v2_2 = this.a("Error opening database for deleteHits.");
	            if (v2_2 != null) {
	                String v4_0 = new Object[1];
	                v4_0[0] = android.text.TextUtils.join(",", java.util.Collections.nCopies(p9.length, "?"));
	                try {
	                    v2_2.delete("gtm_hits", String.format("HIT_ID in (%s)", v4_0), p9);
	                } catch (int v0) {
	                    cuh.b("Error deleting hits");
	                }
	                if (this.c() != 0) {
	                    v0_0 = 0;
	                }
	                this.d.a(v0_0);
	            }
	        }
	        return;
	    }
	
	
	    static synthetic String b()
	    {
	        return cwl.a;
	    }
	
	
	    static synthetic String b(cwl p1)
	    {
	        return p1.f;
	    }
	
	
	    private java.util.List b(int p17)
	    {
	        int v2_3;
	        int v11_1 = new java.util.ArrayList();
	        int v2_1 = this.a("Error opening database for peekHits");
	        if (v2_1 != 0) {
	            android.database.Cursor v12_0 = 0;
	            try {
	                int v4_1 = new String[3];
	                v4_1[0] = "hit_id";
	                v4_1[1] = "hit_time";
	                v4_1[2] = "hit_first_send_time";
	                String v10_1 = new Object[1];
	                v10_1[0] = "hit_id";
	                java.util.ArrayList v13_1 = v2_1.query("gtm_hits", v4_1, 0, 0, 0, 0, String.format("%s ASC", v10_1), Integer.toString(40));
	            } catch (int v2_2) {
	                java.util.ArrayList v3_1 = v2_2;
	                int v4_2 = 0;
	                v2_3 = v11_1;
	                try {
	                    cuh.b(new StringBuilder("Error in peekHits fetching hitIds: ").append(v3_1.getMessage()).toString());
	                } catch (int v2_4) {
	                    v12_0 = v4_2;
	                    if (v12_0 != null) {
	                        v12_0.close();
	                    }
	                    throw v2_4;
	                }
	                if (v4_2 == 0) {
	                    return v2_3;
	                } else {
	                    v4_2.close();
	                    return v2_3;
	                }
	                if (v13_1 != null) {
	                    v13_1.close();
	                }
	                try {
	                    int v4_6 = new String[2];
	                    v4_6[0] = "hit_id";
	                    v4_6[1] = "hit_url";
	                    String v10_5 = new Object[1];
	                    v10_5[0] = "hit_id";
	                    java.util.ArrayList v3_10 = v2_1.query("gtm_hits", v4_6, 0, 0, 0, 0, String.format("%s ASC", v10_5), Integer.toString(40));
	                } catch (int v2_25) {
	                    if (v13_1 != null) {
	                        v13_1.close();
	                    }
	                    throw v2_25;
	                } catch (int v2_7) {
	                    cuh.b(new StringBuilder("Error in peekHits fetching hit url: ").append(v2_7.getMessage()).toString());
	                    java.util.ArrayList v3_14 = new java.util.ArrayList();
	                    int v4_9 = 0;
	                    String v5_12 = android.database.Cursor v12_2.iterator();
	                }
	                try {
	                    if (v3_10.moveToFirst()) {
	                        int v4_7 = 0;
	                        while(true) {
	                            if (((android.database.sqlite.SQLiteCursor) v3_10).getWindow().getNumRows() <= 0) {
	                                boolean v6_10 = new Object[1];
	                                v6_10[0] = Long.valueOf(((cvk) v12_2.get(v4_7)).a);
	                                cuh.b(String.format("HitString for hitId %d too large.  Hit will be deleted.", v6_10));
	                            } else {
	                                int v2_18 = ((cvk) v12_2.get(v4_7));
	                                String v5_11 = v3_10.getString(1);
	                                if ((v5_11 != null) && (!android.text.TextUtils.isEmpty(v5_11.trim()))) {
	                                    v2_18.c = v5_11;
	                                }
	                            }
	                            if (!v3_10.moveToNext()) {
	                                break;
	                            }
	                            v4_7++;
	                        }
	                    }
	                } catch (int v2_7) {
	                    v13_1 = v3_10;
	                } catch (int v2_25) {
	                    v13_1 = v3_10;
	                }
	                if (v3_10 != null) {
	                    v3_10.close();
	                }
	                v2_3 = v12_2;
	            } catch (int v2_4) {
	            }
	            try {
	                v12_2 = new java.util.ArrayList();
	                try {
	                    if (v13_1.moveToFirst()) {
	                        do {
	                            v12_2.add(new cvk(v13_1.getLong(0), v13_1.getLong(1), v13_1.getLong(2)));
	                        } while(v13_1.moveToNext());
	                    }
	                } catch (int v2_6) {
	                    v3_1 = v2_6;
	                    v4_2 = v13_1;
	                    v2_3 = v12_2;
	                }
	            } catch (int v2_5) {
	                v3_1 = v2_5;
	                v4_2 = v13_1;
	                v2_3 = v11_1;
	            } catch (int v2_4) {
	                v12_0 = v13_1;
	            }
	        } else {
	            v2_3 = v11_1;
	        }
	        return v2_3;
	    }
	
	
	    private int c()
	    {
	        int v0_0 = 0;
	        String v2_1 = this.a("Error opening database for getNumStoredHits.");
	        if (v2_1 != null) {
	            try {
	                android.database.Cursor v1 = v2_1.rawQuery("SELECT COUNT(*) from gtm_hits", 0);
	            } catch (String v2) {
	                cuh.b("Error getting numStoredHits");
	                if (v1 != null) {
	                    v1.close();
	                }
	            } catch (int v0_1) {
	                if (v1 != null) {
	                    v1.close();
	                }
	                throw v0_1;
	            }
	            if (v1.moveToFirst()) {
	                v0_0 = ((int) v1.getLong(0));
	            }
	            if (v1 != null) {
	                v1.close();
	            }
	        }
	        return v0_0;
	    }
	
	
	    static synthetic android.content.Context c(cwl p1)
	    {
	        return p1.e;
	    }
	
	
	    private int d()
	    {
	        String v8 = 0;
	        String v9 = 0;
	        String v0_1 = this.a("Error opening database for getNumStoredHits.");
	        if (v0_1 != null) {
	            try {
	                String[] v2_1 = new String[2];
	                v2_1[0] = "hit_id";
	                v2_1[1] = "hit_first_send_time";
	                Throwable v1_1 = v0_1.query("gtm_hits", v2_1, "hit_first_send_time=0", 0, 0, 0, 0);
	                try {
	                    String v0_4 = v1_1.getCount();
	                } catch (String v0_3) {
	                    v9 = v1_1;
	                    if (v9 != null) {
	                        v9.close();
	                    }
	                    throw v0_3;
	                } catch (String v0) {
	                    String v0_2 = v1_1;
	                    try {
	                        cuh.b("Error getting num untried hits");
	                    } catch (Throwable v1_3) {
	                        v9 = v0_2;
	                        v0_3 = v1_3;
	                    }
	                    if (v0_2 == null) {
	                        v0_4 = 0;
	                        v8 = v0_4;
	                    } else {
	                        v0_2.close();
	                        v0_4 = 0;
	                    }
	                }
	                if (v1_1 == null) {
	                } else {
	                    v1_1.close();
	                }
	            } catch (String v0_3) {
	            } catch (String v0) {
	                v0_2 = 0;
	            }
	        }
	        return v8;
	    }
	
	
	    public final void a()
	    {
	        cuh.e("GTM Dispatch running...");
	        if (this.c.a()) {
	            cum v0_4 = this.b(40);
	            if (!v0_4.isEmpty()) {
	                this.c.a(v0_4);
	                if (this.d() > 0) {
	                    cum.a().c();
	                }
	            } else {
	                cuh.e("...nothing to dispatch");
	                this.d.a(1);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(long p10, String p12)
	    {
	        String v0_0 = 1;
	        android.content.ContentValues v2_1 = this.h.a();
	        if (v2_1 > (this.g + 86400000)) {
	            this.g = v2_1;
	            android.content.ContentValues v2_3 = this.a("Error opening database for deleteStaleHits.");
	            if (v2_3 != null) {
	                String[] v7 = new String[1];
	                v7[0] = Long.toString((this.h.a() - 1.280618154e-314));
	                v2_3.delete("gtm_hits", "HIT_TIME < ?", v7);
	                if (this.c() != 0) {
	                    v0_0 = 0;
	                }
	                this.d.a(v0_0);
	            }
	        }
	        String v0_3 = ((this.c() - this.i) + 1);
	        if (v0_3 > null) {
	            String v0_4 = this.a(v0_3);
	            cuh.e(new StringBuilder("Store full, deleting ").append(v0_4.size()).append(" hits to make room.").toString());
	            android.content.ContentValues v2_11 = new String[0];
	            this.a(((String[]) v0_4.toArray(v2_11)));
	        }
	        String v0_8 = this.a("Error opening database for putHit");
	        if (v0_8 != null) {
	            android.content.ContentValues v2_13 = new android.content.ContentValues();
	            v2_13.put("hit_time", Long.valueOf(p10));
	            v2_13.put("hit_url", p12);
	            v2_13.put("hit_first_send_time", Integer.valueOf(0));
	            try {
	                v0_8.insert("gtm_hits", 0, v2_13);
	                this.d.a(0);
	            } catch (String v0) {
	                cuh.b("Error storing hit");
	            }
	        }
	        return;
	    }
	
