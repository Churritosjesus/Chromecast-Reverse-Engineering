	public static final java.lang.String a
	
	    static csi()
	    {
	        new csj();
	        new crq();
	        new android.os.Handler(android.os.Looper.getMainLooper());
	        java.util.regex.Pattern.compile("\\,");
	        java.util.regex.Pattern.compile("[\u2028\u2029 \u00a0\u1680\u180e\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200a\u202f\u205f\u3000\t\u000b\u000c\u001c\u001d\u001e\u001f\n\r]+");
	        java.util.regex.Pattern.compile(java.util.regex.Pattern.quote("\u0001"));
	        java.util.regex.Pattern.compile(java.util.regex.Pattern.quote("\u0002"));
	        csi.a = "\u0001";
	        new java.security.SecureRandom();
	        new csk();
	        new csl();
	        new csm();
	        new csn();
	        new cso();
	        new csp();
	        return;
	    }
	
	
	    public static String a(android.os.Bundle p2)
	    {
	        return csi.a(p2, "", new StringBuilder()).toString();
	    }
	
	
	    private static StringBuilder a(Object p5, String p6, StringBuilder p7)
	    {
	        if (p5 != null) {
	            Object v2_1 = new StringBuilder().append(p6).append("  ").toString();
	            p7.append("(").append(p5.getClass().getSimpleName()).append(") ");
	            if (!(p5 instanceof android.os.Bundle)) {
	                if (!(p5 instanceof com.google.android.gms.common.data.DataHolder)) {
	                    if (!(p5 instanceof java.util.ArrayList)) {
	                        if (!(p5 instanceof byte[])) {
	                            if (!(p5 instanceof char[])) {
	                                if (!p5.getClass().isArray()) {
	                                    if (!(p5 instanceof String)) {
	                                        p7.append(p5).append("\n");
	                                    } else {
	                                        p7.append("\"").append(p5).append("\"\n");
	                                    }
	                                } else {
	                                    if (reflect.Array.getLength(p5) != 0) {
	                                        p7.append("[ ");
	                                        p7.append(reflect.Array.get(p5, 0));
	                                        String v0_22 = 1;
	                                        while (v0_22 < reflect.Array.getLength(p5)) {
	                                            p7.append(", ").append(reflect.Array.get(p5, v0_22));
	                                            v0_22++;
	                                        }
	                                        p7.append(" ]\n");
	                                    } else {
	                                        p7.append("[ ]\n");
	                                    }
	                                }
	                            } else {
	                                p7.append("\"").append(new String(((char[]) p5))).append("\"\n");
	                            }
	                        } else {
	                            String v0_30 = ((byte[]) p5).length;
	                            p7.append(" [").append(v0_30).append("] ");
	                            String v0_32 = new byte[Math.min(v0_30, 56)];
	                            System.arraycopy(p5, 0, v0_32, 0, v0_32.length);
	                            p7.append(android.util.Base64.encodeToString(v0_32, 0));
	                        }
	                    } else {
	                        if (!((java.util.ArrayList) p5).isEmpty()) {
	                            p7.append("[\n");
	                            String v0_36 = 0;
	                            while (v0_36 < ((java.util.ArrayList) p5).size()) {
	                                p7.append(v2_1).append(v0_36).append(" : ");
	                                csi.a(((java.util.ArrayList) p5).get(v0_36), v2_1, p7);
	                                v0_36++;
	                            }
	                            p7.append(p6).append("]\n");
	                        } else {
	                            p7.append("[ ]\n");
	                        }
	                    }
	                } else {
	                    p7.append(" [");
	                    if (!((com.google.android.gms.common.data.DataHolder) p5).b()) {
	                        p7.append(((com.google.android.gms.common.data.DataHolder) p5).h);
	                    } else {
	                        p7.append("CLOSED");
	                    }
	                    p7.append("] ").append(p5).append("\n");
	                }
	            } else {
	                if (!((android.os.Bundle) p5).isEmpty()) {
	                    p7.append("{\n");
	                    StringBuilder v1_17 = ((android.os.Bundle) p5).keySet().iterator();
	                    while (v1_17.hasNext()) {
	                        String v0_52 = ((String) v1_17.next());
	                        p7.append(v2_1).append(v0_52).append(" : ");
	                        csi.a(((android.os.Bundle) p5).get(v0_52), v2_1, p7);
	                    }
	                    p7.append(p6).append("}\n");
	                } else {
	                    p7.append("{ }\n");
	                }
	            }
	        } else {
	            p7.append("[null]\n");
	        }
	        return p7;
	    }
	
