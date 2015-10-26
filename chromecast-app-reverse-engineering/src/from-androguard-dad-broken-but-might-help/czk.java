	private synthetic czg a
	
	    czk(czg p3, android.content.Context p4, String p5)
	    {
	        this.a = p3;
	        this(p4, p5, 0, 1);
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
	        } catch (int v0) {
	            int v0_5 = 0;
	            try {
	                cuh.b(new StringBuilder("Error querying for table ").append(p10).toString());
	            } catch (Throwable v1_6) {
	                v9 = v0_5;
	                int v0_6 = v1_6;
	                if (v9 != null) {
	                    v9.close();
	                }
	                throw v0_6;
	            }
	            if (v0_5 != 0) {
	                v0_5.close();
	            }
	            int v0_7 = 0;
	            return v0_7;
	        } catch (int v0_6) {
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
	        try {
	            android.database.sqlite.SQLiteDatabase v0 = super.getWritableDatabase();
	        } catch (java.io.File v1) {
	            czg.b(this.a).getDatabasePath("google_tagmanager.db").delete();
	        }
	        if (v0 == null) {
	            v0 = super.getWritableDatabase();
	        }
	        return v0;
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
	        if (czk.a("datalayer", p6)) {
	            String v1_2 = p6.rawQuery("SELECT * FROM datalayer WHERE 0", 0);
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
	            if ((v2_2.remove("key")) && ((v2_2.remove("value")) && ((v2_2.remove("ID")) && (v2_2.remove("expires"))))) {
	                if (!v2_2.isEmpty()) {
	                    throw new android.database.sqlite.SQLiteException("Database has extra columns");
	                }
	            } else {
	                throw new android.database.sqlite.SQLiteException("Database column missing");
	            }
	        } else {
	            p6.execSQL(czg.a());
	        }
	        return;
	    }
	
	
	    public final void onUpgrade(android.database.sqlite.SQLiteDatabase p1, int p2, int p3)
	    {
	        return;
	    }
	
