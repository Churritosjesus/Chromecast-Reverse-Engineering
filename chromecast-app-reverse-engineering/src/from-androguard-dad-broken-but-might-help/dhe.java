	private static final java.util.TimeZone a
	private static final java.lang.ThreadLocal b
	private static final Ljava.lang.String c
	private static final Ljava.text.DateFormat d
	
	    static dhe()
	    {
	        dhe.a = java.util.TimeZone.getTimeZone("GMT");
	        dhe.b = new dhf();
	        java.text.DateFormat[] v0_5 = new String[15];
	        v0_5[0] = "EEE, dd MMM yyyy HH:mm:ss zzz";
	        v0_5[1] = "EEEE, dd-MMM-yy HH:mm:ss zzz";
	        v0_5[2] = "EEE MMM d HH:mm:ss yyyy";
	        v0_5[3] = "EEE, dd-MMM-yyyy HH:mm:ss z";
	        v0_5[4] = "EEE, dd-MMM-yyyy HH-mm-ss z";
	        v0_5[5] = "EEE, dd MMM yy HH:mm:ss z";
	        v0_5[6] = "EEE dd-MMM-yyyy HH:mm:ss z";
	        v0_5[7] = "EEE dd MMM yyyy HH:mm:ss z";
	        v0_5[8] = "EEE dd-MMM-yyyy HH-mm-ss z";
	        v0_5[9] = "EEE dd-MMM-yy HH:mm:ss z";
	        v0_5[10] = "EEE dd MMM yy HH:mm:ss z";
	        v0_5[11] = "EEE,dd-MMM-yy HH:mm:ss z";
	        v0_5[12] = "EEE,dd-MMM-yyyy HH:mm:ss z";
	        v0_5[13] = "EEE, dd-MM-yyyy HH:mm:ss z";
	        v0_5[14] = "EEE MMM d yyyy HH:mm:ss z";
	        dhe.c = v0_5;
	        java.text.DateFormat[] v0_7 = new java.text.DateFormat[v0_5.length];
	        dhe.d = v0_7;
	        return;
	    }
	
	
	    public static String a(java.util.Date p1)
	    {
	        return ((java.text.DateFormat) dhe.b.get()).format(p1);
	    }
	
	
	    public static java.util.Date a(String p8)
	    {
	        int v0_4;
	        int v2 = 0;
	        if (p8.length() != 0) {
	            java.text.ParsePosition v3_1 = new java.text.ParsePosition(0);
	            v0_4 = ((java.text.DateFormat) dhe.b.get()).parse(p8, v3_1);
	            if (v3_1.getIndex() != p8.length()) {
	                try {
	                } catch (int v0_10) {
	                    throw v0_10;
	                }
	                while (v2 < dhe.c.length) {
	                    int v0_7 = dhe.d[v2];
	                    if (v0_7 == 0) {
	                        v0_7 = new java.text.SimpleDateFormat(dhe.c[v2], java.util.Locale.US);
	                        v0_7.setTimeZone(dhe.a);
	                        dhe.d[v2] = v0_7;
	                    }
	                    v3_1.setIndex(0);
	                    v0_4 = v0_7.parse(p8, v3_1);
	                    if (v3_1.getIndex() == 0) {
	                        v2++;
	                    } else {
	                    }
	                }
	                v0_4 = 0;
	            }
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
	
	    static synthetic java.util.TimeZone a()
	    {
	        return dhe.a;
	    }
	
