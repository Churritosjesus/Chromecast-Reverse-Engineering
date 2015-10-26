	private synthetic brk a
	
	    brl(brk p3, android.content.Context p4, String p5)
	    {
	        this.a = p3;
	        this(p4, p5, 0, 1);
	        return;
	    }
	
	
	    private void a(android.database.sqlite.SQLiteDatabase p7)
	    {
	        android.database.sqlite.SQLiteException v0_0 = 0;
	        String v1_1 = brl.b(p7, "properties");
	        String v2_0 = new String[6];
	        v2_0[0] = "app_uid";
	        v2_0[1] = "cid";
	        v2_0[2] = "tid";
	        v2_0[3] = "params";
	        v2_0[4] = "adid";
	        v2_0[5] = "hits_count";
	        while (v0_0 < 6) {
	            String v3_6 = v2_0[v0_0];
	            if (v1_1.remove(v3_6)) {
	                v0_0++;
	            } else {
	                throw new android.database.sqlite.SQLiteException(new StringBuilder("Database properties is missing required column: ").append(v3_6).toString());
	            }
	        }
	        if (v1_1.isEmpty()) {
	            return;
	        } else {
	            throw new android.database.sqlite.SQLiteException("Database properties table has extra columns");
	        }
	    }
	
	
	    private boolean a(android.database.sqlite.SQLiteDatabase p11, String p12)
	    {
	        int v9 = 0;
	        try {
	            brk v2_0 = new String[1];
	            v2_0[0] = "name";
	            String[] v4 = new String[1];
	            v4[0] = p12;
	            int v1_1 = p11.query("SQLITE_MASTER", v2_0, "name=?", v4, 0, 0, 0);
	            try {
	                int v0_7 = v1_1.moveToFirst();
	            } catch (int v0_5) {
	                this.a.c("Error querying for table", p12, v0_5);
	                if (v1_1 != 0) {
	                    v1_1.close();
	                }
	                v0_7 = 0;
	                return v0_7;
	            }
	            if (v1_1 == 0) {
	                return v0_7;
	            } else {
	                v1_1.close();
	                return v0_7;
	            }
	        } catch (int v0_5) {
	            v1_1 = 0;
	        } catch (int v0_6) {
	            v9 = v1_1;
	            if (v9 != 0) {
	                v9.close();
	            }
	            throw v0_6;
	        } catch (int v0_6) {
	        }
	    }
	
	
	    private static java.util.Set b(android.database.sqlite.SQLiteDatabase p5, String p6)
	    {
	        java.util.HashSet v1_1 = new java.util.HashSet();
	        android.database.Cursor v2_3 = p5.rawQuery(new StringBuilder("SELECT * FROM ").append(p6).append(" LIMIT 0").toString(), 0);
	        try {
	            String[] v3 = v2_3.getColumnNames();
	            int v0_5 = 0;
	        } catch (int v0_6) {
	            v2_3.close();
	            throw v0_6;
	        }
	        while (v0_5 < v3.length) {
	            v1_1.add(v3[v0_5]);
	            v0_5++;
	        }
	        v2_3.close();
	        return v1_1;
	    }
	
	
	    public final android.database.sqlite.SQLiteDatabase getWritableDatabase()
	    {
	        if (brk.a(this.a).a(3600000)) {
	            try {
	                android.database.sqlite.SQLiteException v0_3 = super.getWritableDatabase();
	            } catch (android.database.sqlite.SQLiteException v0) {
	                brk.a(this.a).a();
	                this.a.f("Opening the database failed, dropping the table and recreating it");
	                this.a.l().getDatabasePath(brk.b(this.a)).delete();
	                try {
	                    v0_3 = super.getWritableDatabase();
	                    brk.a(this.a).a = 0;
	                } catch (android.database.sqlite.SQLiteException v0_10) {
	                    this.a.e("Failed to open freshly created database", v0_10);
	                    throw v0_10;
	                }
	            }
	            return v0_3;
	        } else {
	            throw new android.database.sqlite.SQLiteException("Database open failed");
	        }
	    }
	
	
	    public final void onCreate(android.database.sqlite.SQLiteDatabase p6)
	    {
	        String v0 = p6.getPath();
	        if (a.d() >= 9) {
	            java.io.File v1_2 = new java.io.File(v0);
	            v1_2.setReadable(0, 0);
	            v1_2.setWritable(0, 0);
	            v1_2.setReadable(1, 1);
	            v1_2.setWritable(1, 1);
	        }
	        return;
	    }
	
	
	    public final void onOpen(android.database.sqlite.SQLiteDatabase p9)
	    {
	        String v0_0 = 1;
	        if (android.os.Build$VERSION.SDK_INT < 15) {
	            int v2_2 = p9.rawQuery("PRAGMA journal_mode=memory", 0);
	            try {
	                v2_2.moveToFirst();
	                v2_2.close();
	            } catch (String v0_1) {
	                v2_2.close();
	                throw v0_1;
	            }
	        }
	        if (this.a(p9, "hits2")) {
	            java.util.Set v3_2 = brl.b(p9, "hits2");
	            String[] v4 = new String[4];
	            v4[0] = "hit_id";
	            v4[1] = "hit_string";
	            v4[2] = "hit_time";
	            v4[3] = "hit_url";
	            int v2_10 = 0;
	            while (v2_10 < 4) {
	                String v5_2 = v4[v2_10];
	                if (v3_2.remove(v5_2)) {
	                    v2_10++;
	                } else {
	                    throw new android.database.sqlite.SQLiteException(new StringBuilder("Database hits2 is missing required column: ").append(v5_2).toString());
	                }
	            }
	            if (v3_2.remove("hit_app_id")) {
	                v0_0 = 0;
	            }
	            if (v3_2.isEmpty()) {
	                if (v0_0 != null) {
	                    p9.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
	                }
	            } else {
	                throw new android.database.sqlite.SQLiteException("Database hits2 has extra columns");
	            }
	        } else {
	            p9.execSQL(brk.h());
	        }
	        if (this.a(p9, "properties")) {
	            this.a(p9);
	        } else {
	            p9.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
	        }
	        return;
	    }
	
	
	    public final void onUpgrade(android.database.sqlite.SQLiteDatabase p1, int p2, int p3)
	    {
	        return;
	    }
	
