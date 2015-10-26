	private static final java.lang.String a
	private final java.util.concurrent.Executor b
	private final android.content.Context c
	private czk d
	private cac e
	private  f
	
	    static czg()
	    {
	        Object[] v1_1 = new Object[5];
	        v1_1[0] = "datalayer";
	        v1_1[1] = "ID";
	        v1_1[2] = "key";
	        v1_1[3] = "value";
	        v1_1[4] = "expires";
	        czg.a = String.format("CREATE TABLE IF NOT EXISTS %s ( \'%s\' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \'%s\' STRING NOT NULL, \'%s\' BLOB NOT NULL, \'%s\' INTEGER NOT NULL);", v1_1);
	        return;
	    }
	
	
	    public czg(android.content.Context p7)
	    {
	        this(p7, cad.c(), "google_tagmanager.db", 2000, java.util.concurrent.Executors.newSingleThreadExecutor());
	        return;
	    }
	
	
	    private czg(android.content.Context p3, cac p4, String p5, int p6, java.util.concurrent.Executor p7)
	    {
	        this.c = p3;
	        this.e = p4;
	        this.f = 2000;
	        this.b = p7;
	        this.d = new czk(this, this.c, p5);
	        return;
	    }
	
	
	    private static Object a(byte[] p5)
	    {
	        Throwable v0_0 = 0;
	        java.io.ByteArrayInputStream v2_1 = new java.io.ByteArrayInputStream(p5);
	        try {
	            java.io.IOException v1_1 = new java.io.ObjectInputStream(v2_1);
	            try {
	                v0_0 = v1_1.readObject();
	                try {
	                    v1_1.close();
	                    v2_1.close();
	                } catch (java.io.IOException v1) {
	                }
	                return v0_0;
	            } catch (ClassNotFoundException v3) {
	                if (v1_1 != null) {
	                    try {
	                        v1_1.close();
	                    } catch (java.io.IOException v1) {
	                        return v0_0;
	                    }
	                }
	                v2_1.close();
	                return v0_0;
	            } catch (ClassNotFoundException v3) {
	                if (v1_1 != null) {
	                    try {
	                        v1_1.close();
	                    } catch (java.io.IOException v1) {
	                        return v0_0;
	                    }
	                }
	                v2_1.close();
	                return v0_0;
	            } catch (Throwable v0_1) {
	                try {
	                    if (v1_1 == null) {
	                        v2_1.close();
	                    } else {
	                        v1_1.close();
	                    }
	                } catch (java.io.IOException v1) {
	                }
	                throw v0_1;
	            }
	        } catch (java.io.IOException v1_2) {
	            v1_1 = 0;
	            v0_1 = v1_2;
	        } catch (java.io.IOException v1) {
	            v1_1 = 0;
	        } catch (java.io.IOException v1) {
	            v1_1 = 0;
	        }
	    }
	
	
	    static synthetic String a()
	    {
	        return czg.a;
	    }
	
	
	    private java.util.List a(int p14)
	    {
	        java.util.ArrayList v0_11;
	        java.util.ArrayList v9_1 = new java.util.ArrayList();
	        if (p14 > 0) {
	            java.util.ArrayList v0_1 = this.b("Error opening database for peekEntryIds.");
	            if (v0_1 != null) {
	                try {
	                    long v2_1 = new String[1];
	                    v2_1[0] = "ID";
	                    String v8_1 = new Object[1];
	                    v8_1[0] = "ID";
	                    int v1_1 = v0_1.query("datalayer", v2_1, 0, 0, 0, 0, String.format("%s ASC", v8_1), Integer.toString(p14));
	                    try {
	                        if (v1_1.moveToFirst()) {
	                            do {
	                                v9_1.add(String.valueOf(v1_1.getLong(0)));
	                            } while(v1_1.moveToNext());
	                        }
	                    } catch (java.util.ArrayList v0_2) {
	                        cuh.b(new StringBuilder("Error in peekEntries fetching entryIds: ").append(v0_2.getMessage()).toString());
	                        if (v1_1 == 0) {
	                            v0_11 = v9_1;
	                            return v0_11;
	                        } else {
	                            v1_1.close();
	                        }
	                    }
	                    if (v1_1 == 0) {
	                    } else {
	                        v1_1.close();
	                    }
	                } catch (java.util.ArrayList v0_2) {
	                    v1_1 = 0;
	                } catch (java.util.ArrayList v0_3) {
	                    if (v1_1 != 0) {
	                        v1_1.close();
	                    }
	                    throw v0_3;
	                } catch (java.util.ArrayList v0_3) {
	                    v1_1 = 0;
	                }
	            } else {
	                v0_11 = v9_1;
	            }
	        } else {
	            cuh.b("Invalid maxEntries specified. Skipping.");
	            v0_11 = v9_1;
	        }
	        return v0_11;
	    }
	
	
	    static synthetic java.util.List a(czg p1)
	    {
	        return p1.b();
	    }
	
	
	    private void a(long p8)
	    {
	        String v0_1 = this.b("Error opening database for deleteOlderThan.");
	        if (v0_1 != null) {
	            try {
	                String[] v3_1 = new String[1];
	                v3_1[0] = Long.toString(p8);
	                cuh.e(new StringBuilder("Deleted ").append(v0_1.delete("datalayer", "expires <= ?", v3_1)).append(" expired items").toString());
	            } catch (String v0) {
	                cuh.b("Error deleting old entries.");
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void a(czg p7, String p8)
	    {
	        String v0_1 = p7.b("Error opening database for clearKeysWithPrefix.");
	        if (v0_1 != null) {
	            try {
	                String[] v3_1 = new String[2];
	                v3_1[0] = p8;
	                v3_1[1] = new StringBuilder().append(p8).append(".%").toString();
	                cuh.e(new StringBuilder("Cleared ").append(v0_1.delete("datalayer", "key = ? OR key LIKE ?", v3_1)).append(" items").toString());
	                void v7_1 = p7.e();
	            } catch (String v0_6) {
	                cuh.b(new StringBuilder("Error deleting entries with key prefix: ").append(p8).append(" (").append(v0_6).append(").").toString());
	                v7_1 = v7_1.e();
	            } catch (String v0_10) {
	                v7_1.e();
	                throw v0_10;
	            }
	        }
	        return;
	    }
	
	
	    static synthetic void a(czg p0, java.util.List p1, long p2)
	    {
	        p0.b(p1, p2);
	        return;
	    }
	
	
	    private void a(String[] p8)
	    {
	        if ((p8 != null) && (p8.length != 0)) {
	            String v0_2 = this.b("Error opening database for deleteEntries.");
	            if (v0_2 != null) {
	                String v2_1 = new Object[2];
	                v2_1[0] = "ID";
	                v2_1[1] = android.text.TextUtils.join(",", java.util.Collections.nCopies(p8.length, "?"));
	                try {
	                    v0_2.delete("datalayer", String.format("%s in (%s)", v2_1), p8);
	                } catch (String v0) {
	                    cuh.b(new StringBuilder("Error deleting entries ").append(java.util.Arrays.toString(p8)).toString());
	                }
	            }
	        }
	        return;
	    }
	
	
	    private static byte[] a(Object p5)
	    {
	        Throwable v0_0 = 0;
	        java.io.ByteArrayOutputStream v2_1 = new java.io.ByteArrayOutputStream();
	        try {
	            java.io.IOException v1_1 = new java.io.ObjectOutputStream(v2_1);
	        } catch (java.io.IOException v1) {
	            v1_1 = 0;
	            if (v1_1 != null) {
	                try {
	                    v1_1.close();
	                } catch (java.io.IOException v1) {
	                    return v0_0;
	                }
	            }
	            v2_1.close();
	            return v0_0;
	        } catch (java.io.IOException v1_2) {
	            v1_1 = 0;
	            Throwable v0_1 = v1_2;
	            try {
	                if (v1_1 == null) {
	                    v2_1.close();
	                } else {
	                    v1_1.close();
	                }
	            } catch (java.io.IOException v1) {
	            }
	            throw v0_1;
	        }
	        try {
	            v1_1.writeObject(p5);
	            v0_0 = v2_1.toByteArray();
	            try {
	                v1_1.close();
	                v2_1.close();
	            } catch (java.io.IOException v1) {
	            }
	            return v0_0;
	        } catch (Throwable v0_1) {
	        } catch (java.io.IOException v3) {
	        }
	    }
	
	
	    static synthetic android.content.Context b(czg p1)
	    {
	        return p1.c;
	    }
	
	
	    private android.database.sqlite.SQLiteDatabase b(String p2)
	    {
	        try {
	            int v0_1 = this.d.getWritableDatabase();
	        } catch (int v0) {
	            cuh.b(p2);
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    private java.util.List b()
	    {
	        try {
	            this.a(this.e.a());
	            Object v0_2 = this.c();
	            java.util.ArrayList v1_1 = new java.util.ArrayList();
	            java.util.Iterator v2 = v0_2.iterator();
	        } catch (Object v0_4) {
	            this.e();
	            throw v0_4;
	        }
	        while (v2.hasNext()) {
	            Object v0_6 = ((czl) v2.next());
	            v1_1.add(new ctz(v0_6.a, czg.a(v0_6.b)));
	        }
	        this.e();
	        return v1_1;
	    }
	
	
	    private declared_synchronized void b(java.util.List p7, long p8)
	    {
	        try {
	            long v2 = this.e.a();
	            this.a(v2);
	            Throwable v0_2 = (p7.size() + (this.d() - this.f));
	        } catch (Throwable v0_8) {
	            throw v0_8;
	        } catch (Throwable v0_7) {
	            this.e();
	            throw v0_7;
	        }
	        if (v0_2 > null) {
	            Throwable v0_3 = this.a(v0_2);
	            cuh.c(new StringBuilder("DataLayer store full, deleting ").append(v0_3.size()).append(" entries to make room.").toString());
	            String[] v1_8 = new String[0];
	            this.a(((String[]) v0_3.toArray(v1_8)));
	        }
	        this.c(p7, (v2 + p8));
	        this.e();
	        return;
	    }
	
	
	    private java.util.List c()
	    {
	        java.util.ArrayList v0_4;
	        java.util.ArrayList v0_1 = this.b("Error opening database for loadSerialized.");
	        java.util.ArrayList v9_1 = new java.util.ArrayList();
	        if (v0_1 != null) {
	            String v2_0 = new String[2];
	            v2_0[0] = "key";
	            v2_0[1] = "value";
	            android.database.Cursor v1_4 = v0_1.query("datalayer", v2_0, 0, 0, 0, 0, "ID", 0);
	            try {
	                while (v1_4.moveToNext()) {
	                    v9_1.add(new czl(v1_4.getString(0), v1_4.getBlob(1)));
	                }
	            } catch (java.util.ArrayList v0_3) {
	                v1_4.close();
	                throw v0_3;
	            }
	            v1_4.close();
	            v0_4 = v9_1;
	        } else {
	            v0_4 = v9_1;
	        }
	        return v0_4;
	    }
	
	
	    private void c(java.util.List p7, long p8)
	    {
	        android.database.sqlite.SQLiteDatabase v1 = this.b("Error opening database for writeEntryToDatabase.");
	        if (v1 != null) {
	            java.util.Iterator v2 = p7.iterator();
	            while (v2.hasNext()) {
	                String v0_3 = ((czl) v2.next());
	                android.content.ContentValues v3_1 = new android.content.ContentValues();
	                v3_1.put("expires", Long.valueOf(p8));
	                v3_1.put("key", v0_3.a);
	                v3_1.put("value", v0_3.b);
	                v1.insert("datalayer", 0, v3_1);
	            }
	        }
	        return;
	    }
	
	
	    private int d()
	    {
	        int v0_0 = 0;
	        String v2_1 = this.b("Error opening database for getNumStoredEntries.");
	        if (v2_1 != null) {
	            try {
	                android.database.Cursor v1 = v2_1.rawQuery("SELECT COUNT(*) from datalayer", 0);
	            } catch (int v0_1) {
	                if (v1 != null) {
	                    v1.close();
	                }
	                throw v0_1;
	            } catch (String v2) {
	                cuh.b("Error getting numStoredEntries");
	                if (v1 != null) {
	                    v1.close();
	                }
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
	
	
	    private void e()
	    {
	        try {
	            this.d.close();
	        } catch (android.database.sqlite.SQLiteException v0) {
	        }
	        return;
	    }
	
	
	    public final void a(cuc p3)
	    {
	        this.b.execute(new czi(this, p3));
	        return;
	    }
	
	
	    public final void a(String p3)
	    {
	        this.b.execute(new czj(this, p3));
	        return;
	    }
	
	
	    public final void a(java.util.List p7, long p8)
	    {
	        java.util.ArrayList v1_1 = new java.util.ArrayList();
	        czh v2_0 = p7.iterator();
	        while (v2_0.hasNext()) {
	            java.util.concurrent.Executor v0_3 = ((ctz) v2_0.next());
	            v1_1.add(new czl(v0_3.a, czg.a(v0_3.b)));
	        }
	        this.b.execute(new czh(this, v1_1, p8));
	        return;
	    }
	
