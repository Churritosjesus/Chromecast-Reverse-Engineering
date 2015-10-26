	public static final android.net.Uri a
	private static android.net.Uri b
	private static java.util.regex.Pattern c
	private static java.util.regex.Pattern d
	private static java.util.HashMap e
	private static java.lang.Object f
	private static Ljava.lang.String g
	private static android.content.Context h
	
	    static czp()
	    {
	        czp.a = android.net.Uri.parse("content://com.google.android.gsf.gservices");
	        czp.b = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
	        czp.c = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
	        czp.d = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
	        int v0_9 = new String[0];
	        czp.g = v0_9;
	        czp.h = 0;
	        return;
	    }
	
	
	    public czp()
	    {
	        return;
	    }
	
	
	    public static int a(android.content.ContentResolver p1, String p2, int p3)
	    {
	        NumberFormatException v0_1 = czp.a(p1, p2, 0);
	        if (v0_1 != null) {
	            try {
	                p3 = Integer.parseInt(v0_1);
	            } catch (NumberFormatException v0) {
	            }
	        }
	        return p3;
	    }
	
	
	    public static long a(android.content.ContentResolver p2, String p3, long p4)
	    {
	        NumberFormatException v0_1 = czp.a(p2, p3, 0);
	        if (v0_1 != null) {
	            try {
	                p4 = Long.parseLong(v0_1);
	            } catch (NumberFormatException v0) {
	            }
	        }
	        return p4;
	    }
	
	
	    static synthetic Object a(Object p0)
	    {
	        czp.f = p0;
	        return p0;
	    }
	
	
	    public static String a(android.content.ContentResolver p8, String p9, String p10)
	    {
	        czp.a(p8);
	        if (!czp.e.containsKey(p9)) {
	            android.database.Cursor v1_0 = czp.g;
	            Throwable v0_2 = 0;
	            while (v0_2 < v1_0.length) {
	                if (!p9.startsWith(v1_0[v0_2])) {
	                    v0_2++;
	                }
	            }
	            String[] v4_1 = new String[1];
	            v4_1[0] = p9;
	            android.database.Cursor v1_2 = p8.query(czp.a, 0, 0, v4_1, 0);
	            try {
	                if ((v1_2 != null) && (v1_2.moveToFirst())) {
	                    Throwable v0_6 = v1_2.getString(1);
	                    if (czp.f == czp.f) {
	                        czp.e.put(p9, v0_6);
	                    }
	                    if (v0_6 != null) {
	                        p10 = v0_6;
	                    }
	                    if (v1_2 != null) {
	                        v1_2.close();
	                    }
	                } else {
	                    czp.e.put(p9, 0);
	                    if (v1_2 != null) {
	                        v1_2.close();
	                    }
	                }
	            } catch (Throwable v0_8) {
	                if (v1_2 != null) {
	                    v1_2.close();
	                }
	                throw v0_8;
	            }
	        } else {
	            Throwable v0_12 = ((String) czp.e.get(p9));
	            if (v0_12 != null) {
	                p10 = v0_12;
	            }
	        }
	        return p10;
	    }
	
	
	    static synthetic java.util.HashMap a()
	    {
	        return czp.e;
	    }
	
	
	    private static void a(android.content.ContentResolver p2)
	    {
	        if (czp.e == null) {
	            czp.e = new java.util.HashMap();
	            czp.f = new Object();
	            new czq("Gservices", p2).start();
	        }
	        return;
	    }
	
	
	    public static varargs void a(android.content.ContentResolver p5, String[] p6)
	    {
	        Object v0_0 = czp.b(p5, p6);
	        try {
	            czp.a(p5);
	            czp.g = p6;
	            java.util.Iterator v2 = v0_0.entrySet().iterator();
	        } catch (Object v0_6) {
	            throw v0_6;
	        }
	        while (v2.hasNext()) {
	            Object v0_4 = ((java.util.Map$Entry) v2.next());
	            czp.e.put(v0_4.getKey(), v0_4.getValue());
	        }
	        return;
	    }
	
	
	    public static boolean a(android.content.ContentResolver p4, String p5, boolean p6)
	    {
	        String v0_1 = czp.a(p4, p5, 0);
	        if ((v0_1 != null) && (!v0_1.equals(""))) {
	            if (!czp.c.matcher(v0_1).matches()) {
	                if (!czp.d.matcher(v0_1).matches()) {
	                    android.util.Log.w("Gservices", new StringBuilder("attempt to read gservices key ").append(p5).append(" (value \"").append(v0_1).append("\") as boolean").toString());
	                } else {
	                    p6 = 0;
	                }
	            } else {
	                p6 = 1;
	            }
	        }
	        return p6;
	    }
	
	
	    private static varargs java.util.Map b(android.content.ContentResolver p6, String[] p7)
	    {
	        android.database.Cursor v1_1 = p6.query(czp.b, 0, 0, p7, 0);
	        Throwable v0_2 = new java.util.TreeMap();
	        if (v1_1 != null) {
	            try {
	                while (v1_1.moveToNext()) {
	                    v0_2.put(v1_1.getString(0), v1_1.getString(1));
	                }
	            } catch (Throwable v0_3) {
	                v1_1.close();
	                throw v0_3;
	            }
	            v1_1.close();
	        }
	        return v0_2;
	    }
	
	
	    static synthetic String[] b()
	    {
	        return czp.g;
	    }
	
