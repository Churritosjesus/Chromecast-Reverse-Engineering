	private  a
	private  b
	private synthetic cwl c
	
	    cwn(cwl p3, android.content.Context p4, String p5)
	    {
	        this.c = p3;
	        this(p4, p5, 0, 1);
	        this.b = 0;
	        return;
	    }
	
	
	    private static boolean a(String p10, android.database.sqlite.SQLiteDatabase p11)
	    {
	        String v9 = 0;
	        try {
	            String v2_0 = new String[1];
	            v2_0[0] = "name";
	            String[] v4 = new String[1];
	            v4[0] = p10;
	            Throwable v1_1 = p11.query("SQLITE_MASTER", v2_0, "name=?", v4, 0, 0, 0);
	        } catch (int v0_6) {
	            if (v9 != null) {
	                v9.close();
	            }
	            throw v0_6;
	        } catch (int v0) {
	            int v0_5 = 0;
	            try {
	                cuh.b(new StringBuilder("Error querying for table ").append(p10).toString());
	            } catch (Throwable v1_6) {
	                v9 = v0_5;
	                v0_6 = v1_6;
	            }
	            if (v0_5 != 0) {
	                v0_5.close();
	            }
	            int v0_7 = 0;
	            return v0_7;
	        }
	        try {
	            v0_7 = v1_1.moveToFirst();
	        } catch (int v0) {
	            v0_5 = v1_1;
	        } catch (int v0_6) {
	            v9 = v1_1;
	        }
	        if (v1_1 == null) {
	            return v0_7;
	        } else {
	            v1_1.close();
	            return v0_7;
	        }
	    }
	
	
	    public final android.database.sqlite.SQLiteDatabase getWritableDatabase()
	    {
	        if ((!this.a) || ((this.b + 3600000) <= cwl.a(this.c).a())) {
	            this.a = 1;
	            this.b = cwl.a(this.c).a();
	            try {
	                android.database.sqlite.SQLiteDatabase v0_4 = super.getWritableDatabase();
	            } catch (int v1) {
	                cwl.c(this.c).getDatabasePath(cwl.b(this.c)).delete();
	            }
	            if (v0_4 == null) {
	                v0_4 = super.getWritableDatabase();
	            }
	            this.a = 0;
	            return v0_4;
	        } else {
	            throw new android.database.sqlite.SQLiteException("Database creation failed");
	        }
	    }
	
	
	    public final void onCreate(android.database.sqlite.SQLiteDatabase p2)
	    {
	        b.a(p2.getPath());
	        return;
	    }
	
	
	    public final void onOpen(android.database.sqlite.SQLiteDatabase p6)
	    {
	        if (android.os.Build$VERSION.SDK_INT < 15) {
	            android.database.sqlite.SQLiteException v0_2 = p6.rawQuery("PRAGMA journal_mode=memory", 0);
	            try {
	                v0_2.moveToFirst();
	                v0_2.close();
	            } catch (String v1_1) {
	                v0_2.close();
	                throw v1_1;
	            }
	        }
	        if (cwn.a("gtm_hits", p6)) {
	            String v1_2 = p6.rawQuery("SELECT * FROM gtm_hits WHERE 0", 0);
	            java.util.HashSet v2_2 = new java.util.HashSet();
	            try {
	                String[] v3 = v1_2.getColumnNames();
	                android.database.sqlite.SQLiteException v0_6 = 0;
	            } catch (android.database.sqlite.SQLiteException v0_7) {
	                v1_2.close();
	                throw v0_7;
	            }
	            while (v0_6 < v3.length) {
	                v2_2.add(v3[v0_6]);
	                v0_6++;
	            }
	            v1_2.close();
	            if ((v2_2.remove("hit_id")) && ((v2_2.remove("hit_url")) && ((v2_2.remove("hit_time")) && (v2_2.remove("hit_first_send_time"))))) {
	                if (!v2_2.isEmpty()) {
	                    throw new android.database.sqlite.SQLiteException("Database has extra columns");
	                }
	            } else {
	                throw new android.database.sqlite.SQLiteException("Database column missing");
	            }
	        } else {
	            p6.execSQL(cwl.b());
	        }
	        return;
	    }
	
	
	    public final void onUpgrade(android.database.sqlite.SQLiteDatabase p1, int p2, int p3)
	    {
	        return;
	    }
	
