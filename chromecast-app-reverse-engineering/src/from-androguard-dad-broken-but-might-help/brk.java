	private static final java.lang.String a
	private static final java.lang.String b
	private final brl c
	private final bqr e
	private final bqr f
	
	    static brk()
	    {
	        Object[] v1_1 = new Object[6];
	        v1_1[0] = "hits2";
	        v1_1[1] = "hit_id";
	        v1_1[2] = "hit_time";
	        v1_1[3] = "hit_url";
	        v1_1[4] = "hit_string";
	        v1_1[5] = "hit_app_id";
	        brk.a = String.format("CREATE TABLE IF NOT EXISTS %s ( \'%s\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'%s\' INTEGER NOT NULL, \'%s\' TEXT NOT NULL, \'%s\' TEXT NOT NULL, \'%s\' INTEGER);", v1_1);
	        Object[] v1_2 = new Object[2];
	        v1_2[0] = "hit_time";
	        v1_2[1] = "hits2";
	        brk.b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", v1_2);
	        return;
	    }
	
	
	    brk(brb p4)
	    {
	        this(p4);
	        this.e = new bqr(this.k());
	        this.f = new bqr(this.k());
	        this.c = new brl(this, p4.a, this.u());
	        return;
	    }
	
	
	    private long a(String p5, String[] p6)
	    {
	        try {
	            android.database.Cursor v1 = this.t().rawQuery(p5, 0);
	        } catch (android.database.sqlite.SQLiteException v0_4) {
	            this.d("Database error", p5, v0_4);
	            throw v0_4;
	        } catch (android.database.sqlite.SQLiteException v0_5) {
	            if (v1 != null) {
	                v1.close();
	            }
	            throw v0_5;
	        }
	        if (!v1.moveToFirst()) {
	            throw new android.database.sqlite.SQLiteException("Database returned empty set");
	        } else {
	            String v2_3 = v1.getLong(0);
	            if (v1 != null) {
	                v1.close();
	            }
	            return v2_3;
	        }
	    }
	
	
	    private long a(String p4, String[] p5, long p6)
	    {
	        String v1 = 0;
	        try {
	            String v2_0 = this.t().rawQuery(p4, p5);
	        } catch (long v0_1) {
	            this.d("Database error", p4, v0_1);
	            throw v0_1;
	        } catch (long v0_3) {
	            if (v1 != null) {
	                v1.close();
	            }
	            throw v0_3;
	        }
	        try {
	            long v0_4;
	            if (!v2_0.moveToFirst()) {
	                if (v2_0 != null) {
	                    v2_0.close();
	                }
	                v0_4 = 0;
	            } else {
	                v0_4 = v2_0.getLong(0);
	                if (v2_0 != null) {
	                    v2_0.close();
	                }
	            }
	        } catch (long v0_3) {
	            v1 = v2_0;
	        } catch (long v0_1) {
	            v1 = v2_0;
	        }
	        return v0_4;
	    }
	
	
	    static synthetic bqr a(brk p1)
	    {
	        return p1.f;
	    }
	
	
	    private java.util.Map a(String p6)
	    {
	        String v0_12;
	        if (!android.text.TextUtils.isEmpty(p6)) {
	            try {
	                if (!p6.startsWith("?")) {
	                    p6 = new StringBuilder("?").append(p6).toString();
	                }
	            } catch (String v0_10) {
	                this.e("Error parsing hit parameters", v0_10);
	                v0_12 = new java.util.HashMap(0);
	            }
	            String v0_8 = org.apache.http.client.utils.URLEncodedUtils.parse(new java.net.URI(p6), "UTF-8");
	            String v1_3 = new java.util.HashMap(v0_8.size());
	            java.util.Iterator v2_1 = v0_8.iterator();
	            while (v2_1.hasNext()) {
	                String v0_14 = ((org.apache.http.NameValuePair) v2_1.next());
	                v1_3.put(v0_14.getName(), v0_14.getValue());
	            }
	            v0_12 = v1_3;
	        } else {
	            v0_12 = new java.util.HashMap(0);
	        }
	        return v0_12;
	    }
	
	
	    static synthetic String b(brk p1)
	    {
	        return p1.u();
	    }
	
	
	    private java.util.List d(long p14)
	    {
	        java.util.ArrayList v0_9;
	        int v10 = 0;
	        brb.i();
	        this.r();
	        if (p14 > 0) {
	            java.util.ArrayList v0_2 = this.t();
	            java.util.ArrayList v9_1 = new java.util.ArrayList();
	            try {
	                long v2_1 = new String[1];
	                v2_1[0] = "hit_id";
	                String v8_1 = new Object[1];
	                v8_1[0] = "hit_id";
	                int v1_1 = v0_2.query("hits2", v2_1, 0, 0, 0, 0, String.format("%s ASC", v8_1), Long.toString(p14));
	                try {
	                    if (v1_1.moveToFirst()) {
	                        do {
	                            v9_1.add(Long.valueOf(v1_1.getLong(0)));
	                        } while(v1_1.moveToNext());
	                    }
	                } catch (java.util.ArrayList v0_3) {
	                    this.d("Error selecting hit ids", v0_3);
	                    if (v1_1 == 0) {
	                        v0_9 = v9_1;
	                        return v0_9;
	                    } else {
	                        v1_1.close();
	                    }
	                }
	                if (v1_1 == 0) {
	                } else {
	                    v1_1.close();
	                }
	            } catch (java.util.ArrayList v0_4) {
	                if (v10 != 0) {
	                    v10.close();
	                }
	                throw v0_4;
	            } catch (java.util.ArrayList v0_4) {
	                v10 = v1_1;
	            } catch (java.util.ArrayList v0_3) {
	                v1_1 = 0;
	            }
	        } else {
	            v0_9 = java.util.Collections.emptyList();
	        }
	        return v0_9;
	    }
	
	
	    private java.util.Map g(String p6)
	    {
	        String v0_10;
	        if (!android.text.TextUtils.isEmpty(p6)) {
	            try {
	                String v0_6 = org.apache.http.client.utils.URLEncodedUtils.parse(new java.net.URI(new StringBuilder("?").append(p6).toString()), "UTF-8");
	                String v1_4 = new java.util.HashMap(v0_6.size());
	                java.util.Iterator v2_1 = v0_6.iterator();
	            } catch (String v0_8) {
	                this.e("Error parsing property parameters", v0_8);
	                v0_10 = new java.util.HashMap(0);
	            }
	            while (v2_1.hasNext()) {
	                String v0_12 = ((org.apache.http.NameValuePair) v2_1.next());
	                v1_4.put(v0_12.getName(), v0_12.getValue());
	            }
	            v0_10 = v1_4;
	        } else {
	            v0_10 = new java.util.HashMap(0);
	        }
	        return v0_10;
	    }
	
	
	    static synthetic String h()
	    {
	        return brk.a;
	    }
	
	
	    private long i()
	    {
	        brb.i();
	        this.r();
	        return this.a("SELECT COUNT(*) FROM hits2", 0);
	    }
	
	
	    private android.database.sqlite.SQLiteDatabase t()
	    {
	        try {
	            return this.c.getWritableDatabase();
	        } catch (android.database.sqlite.SQLiteException v0_2) {
	            this.d("Error opening database", v0_2);
	            throw v0_2;
	        }
	    }
	
	
	    private String u()
	    {
	        String v0_3;
	        if (byk.a) {
	            if (!this.m().a()) {
	                v0_3 = "google_analytics2_v4.db";
	            } else {
	                v0_3 = "google_analytics_v4.db";
	            }
	        } else {
	            v0_3 = "google_analytics_v4.db";
	        }
	        return v0_3;
	    }
	
	
	    public final long a(long p6, String p8, String p9)
	    {
	        a.f(p8);
	        a.f(p9);
	        this.r();
	        brb.i();
	        String[] v1_1 = new String[3];
	        v1_1[0] = String.valueOf(p6);
	        v1_1[1] = p8;
	        v1_1[2] = p9;
	        return this.a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", v1_1, 0);
	    }
	
	
	    public final java.util.List a(long p14)
	    {
	        Throwable v0_0 = 1;
	        if (p14 < 0) {
	            v0_0 = 0;
	        }
	        a.b(v0_0);
	        brb.i();
	        this.r();
	        Throwable v0_1 = this.t();
	        try {
	            java.util.Map v2_3 = new String[5];
	            v2_3[0] = "hit_id";
	            v2_3[1] = "hit_time";
	            v2_3[2] = "hit_string";
	            v2_3[3] = "hit_url";
	            v2_3[4] = "hit_app_id";
	            int v8_1 = new Object[1];
	            v8_1[0] = "hit_id";
	            brk v9 = v0_1.query("hits2", v2_3, 0, 0, 0, 0, String.format("%s ASC", v8_1), Long.toString(p14));
	            try {
	                java.util.ArrayList v10_2 = new java.util.ArrayList();
	            } catch (Throwable v0_2) {
	                brk v1_2 = v9;
	                try {
	                    this.e("Error loading hits from the database", v0_2);
	                    throw v0_2;
	                } catch (Throwable v0_4) {
	                    v9 = v1_2;
	                    if (v9 != null) {
	                        v9.close();
	                    }
	                    throw v0_4;
	                }
	            }
	            if (v9.moveToFirst()) {
	                do {
	                    v10_2.add(new bsi(this, this.a(v9.getString(2)), v9.getLong(1), bqs.c(v9.getString(3)), v9.getLong(0), v9.getInt(4)));
	                } while(v9.moveToNext());
	            }
	            if (v9 != null) {
	                v9.close();
	            }
	            return v10_2;
	        } catch (Throwable v0_4) {
	        } catch (Throwable v0_2) {
	            v1_2 = v9;
	        }
	    }
	
	
	    protected final void a()
	    {
	        return;
	    }
	
	
	    public final void a(long p8, String p10)
	    {
	        a.f(p10);
	        this.r();
	        brb.i();
	        Integer v0_0 = this.t();
	        String[] v3_1 = new String[2];
	        v3_1[0] = String.valueOf(p8);
	        v3_1[1] = p10;
	        Integer v0_1 = v0_0.delete("properties", "app_uid=? AND cid<>?", v3_1);
	        if (v0_1 > null) {
	            this.a("Deleted property records", Integer.valueOf(v0_1));
	        }
	        return;
	    }
	
	
	    public final void a(bre p7)
	    {
	        a.c(p7);
	        this.r();
	        brb.i();
	        long v2_0 = this.t();
	        String v0_0 = p7.f;
	        a.c(v0_0);
	        android.content.ContentValues v3_1 = new android.net.Uri$Builder();
	        int v4_0 = v0_0.entrySet().iterator();
	        while (v4_0.hasNext()) {
	            String v0_11 = ((java.util.Map$Entry) v4_0.next());
	            v3_1.appendQueryParameter(((String) v0_11.getKey()), ((String) v0_11.getValue()));
	        }
	        String v0_4 = v3_1.build().getEncodedQuery();
	        if (v0_4 == null) {
	            v0_4 = "";
	        }
	        String v1_4;
	        android.content.ContentValues v3_3 = new android.content.ContentValues();
	        v3_3.put("app_uid", Long.valueOf(p7.a));
	        v3_3.put("cid", p7.b);
	        v3_3.put("tid", p7.c);
	        if (!p7.d) {
	            v1_4 = 0;
	        } else {
	            v1_4 = 1;
	        }
	        v3_3.put("adid", Integer.valueOf(v1_4));
	        v3_3.put("hits_count", Long.valueOf(p7.e));
	        v3_3.put("params", v0_4);
	        try {
	            if (v2_0.insertWithOnConflict("properties", 0, v3_3, 5) == -1) {
	                this.f("Failed to insert/update a property (got -1)");
	            }
	        } catch (String v0_9) {
	            this.e("Error storing a property", v0_9);
	        }
	        return;
	    }
	
	
	    public final void a(bsi p7)
	    {
	        a.c(p7);
	        brb.i();
	        this.r();
	        a.c(p7);
	        String v2_1 = new android.net.Uri$Builder();
	        android.content.ContentValues v3_0 = p7.a.entrySet().iterator();
	        while (v3_0.hasNext()) {
	            Long v0_25 = ((java.util.Map$Entry) v3_0.next());
	            String v1_9 = ((String) v0_25.getKey());
	            if ((!"ht".equals(v1_9)) && ((!"qt".equals(v1_9)) && (!"AppUID".equals(v1_9)))) {
	                v2_1.appendQueryParameter(v1_9, ((String) v0_25.getValue()));
	            }
	        }
	        String v1_0;
	        Long v0_4 = v2_1.build().getEncodedQuery();
	        if (v0_4 != null) {
	            v1_0 = v0_4;
	        } else {
	            v1_0 = "";
	        }
	        if (v1_0.length() <= 8192) {
	            Long v0_10 = ((Integer) bqd.c.a()).intValue();
	            String v2_3 = this.i();
	            if (v2_3 > ((long) (v0_10 - 1))) {
	                Long v0_11 = this.d(((v2_3 - ((long) v0_10)) + 1));
	                this.d("Store full, deleting hits to make room, count", Integer.valueOf(v0_11.size()));
	                this.a(v0_11);
	            }
	            Long v0_16;
	            String v2_7 = this.t();
	            android.content.ContentValues v3_4 = new android.content.ContentValues();
	            v3_4.put("hit_string", v1_0);
	            v3_4.put("hit_time", Long.valueOf(p7.d));
	            v3_4.put("hit_app_id", Integer.valueOf(p7.e));
	            if (!p7.f) {
	                v0_16 = brz.i();
	            } else {
	                v0_16 = brz.h();
	            }
	            v3_4.put("hit_url", v0_16);
	            try {
	                Long v0_18 = v2_7.insert("hits2", 0, v3_4);
	            } catch (Long v0_20) {
	                this.e("Error storing a hit", v0_20);
	            }
	            if (v0_18 != -1) {
	                this.b("Hit saved to database. db-id, hit", Long.valueOf(v0_18), p7);
	            } else {
	                this.f("Failed to insert a hit (got -1)");
	            }
	        } else {
	            this.d.a().a(p7, "Hit length exceeds the maximum allowed size");
	        }
	        return;
	    }
	
	
	    public final void a(java.util.List p9)
	    {
	        a.c(p9);
	        brb.i();
	        this.r();
	        if (!p9.isEmpty()) {
	            String v2_1 = new StringBuilder("hit_id");
	            v2_1.append(" in (");
	            int v1_0 = 0;
	            while (v1_0 < p9.size()) {
	                int v0_9 = ((Long) p9.get(v1_0));
	                if ((v0_9 != 0) && (v0_9.longValue() != 0)) {
	                    if (v1_0 > 0) {
	                        v2_1.append(",");
	                    }
	                    v2_1.append(v0_9);
	                    v1_0++;
	                } else {
	                    throw new android.database.sqlite.SQLiteException("Invalid hit id");
	                }
	            }
	            v2_1.append(")");
	            int v0_6 = v2_1.toString();
	            try {
	                int v1_1 = this.t();
	                this.a("Deleting dispatched hits. count", Integer.valueOf(p9.size()));
	                int v1_2 = v1_1.delete("hits2", v0_6, 0);
	            } catch (int v0_7) {
	                this.e("Error deleting hits", v0_7);
	                throw v0_7;
	            }
	            if (v1_2 != p9.size()) {
	                this.b("Deleted fewer hits then expected", Integer.valueOf(p9.size()), Integer.valueOf(v1_2), v0_6);
	            }
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.r();
	        this.t().beginTransaction();
	        return;
	    }
	
	
	    public final void b(long p4)
	    {
	        brb.i();
	        this.r();
	        java.util.ArrayList v0_1 = new java.util.ArrayList(1);
	        v0_1.add(Long.valueOf(p4));
	        this.a("Deleting hit, id", Long.valueOf(p4));
	        this.a(v0_1);
	        return;
	    }
	
	
	    public final java.util.List c(long p13)
	    {
	        this.r();
	        brb.i();
	        boolean v0_0 = this.t();
	        try {
	            String v2_0 = new String[5];
	            v2_0[0] = "cid";
	            v2_0[1] = "tid";
	            v2_0[2] = "adid";
	            v2_0[3] = "hits_count";
	            v2_0[4] = "params";
	            int v10 = ((Integer) bqd.d.a()).intValue();
	            java.util.Map v8_0 = String.valueOf(v10);
	            String v4_0 = new String[1];
	            v4_0[0] = "0";
	            android.database.Cursor v9 = v0_0.query("properties", v2_0, "app_uid=?", v4_0, 0, 0, 0, v8_0);
	        } catch (boolean v0_1) {
	            long v1_12 = v9;
	            try {
	                this.e("Error loading hits from the database", v0_1);
	                throw v0_1;
	            } catch (boolean v0_19) {
	                v9 = v1_12;
	                if (v9 != null) {
	                    v9.close();
	                }
	                throw v0_19;
	            }
	        } catch (boolean v0_19) {
	        }
	        try {
	            java.util.ArrayList v11_1 = new java.util.ArrayList();
	        } catch (boolean v0_1) {
	            v1_12 = v9;
	        }
	        if (v9.moveToFirst()) {
	            do {
	                int v5_2;
	                String v3_6 = v9.getString(0);
	                String v4_1 = v9.getString(1);
	                if (v9.getInt(2) == 0) {
	                    v5_2 = 0;
	                } else {
	                    v5_2 = 1;
	                }
	                long v6_1 = ((long) v9.getInt(3));
	                java.util.Map v8_1 = this.g(v9.getString(4));
	                if ((!android.text.TextUtils.isEmpty(v3_6)) && (!android.text.TextUtils.isEmpty(v4_1))) {
	                    v11_1.add(new bre(0, v3_6, v4_1, v5_2, v6_1, v8_1));
	                } else {
	                    this.c("Read property with empty client id or tracker id", v3_6, v4_1);
	                }
	            } while(v9.moveToNext());
	        }
	        if (v11_1.size() >= v10) {
	            this.e("Sending hits to too many properties. Campaign report might be incorrect");
	        }
	        if (v9 != null) {
	            v9.close();
	        }
	        return v11_1;
	    }
	
	
	    public final void c()
	    {
	        this.r();
	        this.t().setTransactionSuccessful();
	        return;
	    }
	
	
	    public final void close()
	    {
	        try {
	            this.c.close();
	        } catch (IllegalStateException v0_2) {
	            this.e("Sql error closing database", v0_2);
	        } catch (IllegalStateException v0_1) {
	            this.e("Error closing database", v0_1);
	        }
	        return;
	    }
	
	
	    public final void d()
	    {
	        this.r();
	        this.t().endTransaction();
	        return;
	    }
	
	
	    final boolean e()
	    {
	        int v0_2;
	        if (this.i() != 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final int f()
	    {
	        int v0 = 0;
	        brb.i();
	        this.r();
	        if (this.e.a(86400000)) {
	            this.e.a();
	            this.b("Deleting stale hits (if any)");
	            String v1_4 = this.t();
	            String[] v6_1 = new String[1];
	            v6_1[0] = Long.toString((this.k().a() - 1.280618154e-314));
	            v0 = v1_4.delete("hits2", "hit_time < ?", v6_1);
	            this.a("Deleted stale hits, count", Integer.valueOf(v0));
	        }
	        return v0;
	    }
	
	
	    public final long g()
	    {
	        brb.i();
	        this.r();
	        return this.a(brk.b, 0, 0);
	    }
	
