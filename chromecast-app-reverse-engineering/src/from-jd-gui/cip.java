public enum cip
{
  private final String be;
  
  static
  {
    S = new cip("ARBITRARY_JAVASCRIPT", 5, "_jsm");
    f = new cip("CONSTANT", 6, "_c");
    T = new cip("COOKIE", 7, "_k");
    g = new cip("CUSTOM_VAR", 8, "_v");
    h = new cip("CONTAINER_VERSION", 9, "_ctv");
    U = new cip("DEBUG_MODE", 10, "_dbg");
    i = new cip("DEVICE_NAME", 11, "_dn");
    V = new cip("DEVICE_TYPE", 12, "_dt");
    W = new cip("DOM_ELEMENT", 13, "_d");
    X = new cip("ELEMENT_TEXT", 14, "_et");
    Y = new cip("ELEMENT_URL", 15, "_eu");
    j = new cip("EVENT", 16, "_e");
    k = new cip("FUNCTION_CALL", 17, "_func");
    Z = new cip("JS_GLOBAL", 18, "_j");
    l = new cip("LANGUAGE", 19, "_l");
    m = new cip("OS_VERSION", 20, "_ov");
    n = new cip("PLATFORM", 21, "_p");
    o = new cip("RANDOM", 22, "_r");
    aa = new cip("REFERRER", 23, "_f");
    p = new cip("RESOLUTION", 24, "_rs");
    q = new cip("RUNTIME_VERSION", 25, "_rv");
    r = new cip("SDK_VERSION", 26, "_sv");
    ab = new cip("SIMPLE_MAP", 27, "_smm");
    s = new cip("TIME", 28, "_t");
    ac = new cip("URL", 29, "_u");
    t = new cip("ADWORDS_CLICK_REFERRER", 30, "_awcr");
    u = new cip("DEVICE_ID", 31, "_did");
    v = new cip("ENCODE", 32, "_enc");
    w = new cip("GTM_VERSION", 33, "_gtmv");
    x = new cip("HASH", 34, "_hsh");
    y = new cip("INSTALL_REFERRER", 35, "_ir");
    z = new cip("JOINER", 36, "_jn");
    A = new cip("MOBILE_ADWORDS_UNIQUE_ID", 37, "_awid");
    B = new cip("REGEX_GROUP", 38, "_reg");
    C = new cip("DATA_LAYER_WRITE", 39, "_dlw");
    D = new cip("LOWERCASE_STRING", 40, "_ls");
    E = new cip("UPPERCASE_STRING", 41, "_us");
    ad = new cip("EXPERIMENT_ENABLED", 42, "_ee");
    ae = new cip("IN_EXPERIMENT", 43, "_ie");
    af = new cip("EXPERIMENT_VARIATION_INDEX", 44, "_evi");
    ag = new cip("AUDIENCE_LISTS", 45, "_aud");
    ah = new cip("CSS_SELECTOR", 46, "_sel");
    ai = new cip("GA_CLIENT_ID", 47, "_gacid");
    aj = new cip("PRODUCT_SETTING_PROPERTY", 48, "_prodset");
    ak = new cip("GA_OPT_OUT_CLIENT", 49, "_gaoo_c");
    al = new cip("GA_OPT_OUT_SERVER", 50, "_gaoo_s");
    F = new cip("REGEX", 51, "_re");
    G = new cip("STARTS_WITH", 52, "_sw");
    H = new cip("ENDS_WITH", 53, "_ew");
    I = new cip("CONTAINS", 54, "_cn");
    J = new cip("EQUALS", 55, "_eq");
    K = new cip("LESS_THAN", 56, "_lt");
    L = new cip("LESS_EQUALS", 57, "_le");
    M = new cip("GREATER_THAN", 58, "_gt");
    N = new cip("GREATER_EQUALS", 59, "_ge");
    am = new cip("CSS_SELECTOR_PREDICATE", 60, "_css");
    O = new cip("ARBITRARY_PIXEL", 61, "_img");
    an = new cip("ARBITRARY_HTML", 62, "_html");
    ao = new cip("GOOGLE_TAG_MANAGER", 63, "_gtm");
    ap = new cip("GOOGLE_ANALYTICS", 64, "_ga");
    aq = new cip("ADWORDS_CONVERSION", 65, "_awct");
    ar = new cip("SMART_PIXEL", 66, "_sp");
    as = new cip("FLOODLIGHT_COUNTER", 67, "_flc");
    at = new cip("FLOODLIGHT_SALES", 68, "_fls");
    au = new cip("BIZO_INSIGHT", 69, "_bzi");
    av = new cip("QUANTCAST_MEASUREMENT", 70, "_qcm");
    aw = new cip("TARGUS_ADVISOR", 71, "_ta");
    ax = new cip("MEDIAPLEX_ROI", 72, "_mpr");
    ay = new cip("COMSCORE_MEASUREMENT", 73, "_csm");
    az = new cip("TURN_CONVERSION", 74, "_tc");
    aA = new cip("TURN_DATA_COLLECTION", 75, "_tdc");
    aB = new cip("MEDIA6DEGREES_UNIVERSAL_PIXEL", 76, "_m6d");
    P = new cip("UNIVERSAL_ANALYTICS", 77, "_ua");
    aC = new cip("MEDIAPLEX_MCT", 78, "_mpm");
    aD = new cip("VISUAL_DNA_CONVERSION", 79, "_vdc");
    aE = new cip("GOOGLE_AFFILIATE_NETWORK", 80, "_gan");
    aF = new cip("MARIN_SOFTWARE", 81, "_ms");
    aG = new cip("ADROLL_SMART_PIXEL", 82, "_asp");
    aH = new cip("CONFIGURATION_VALUE", 83, "_cv");
    aI = new cip("CRITEO", 84, "_crt");
    aJ = new cip("TRUSTED_STORES", 85, "_ts");
    aK = new cip("CLICK_TALE_STANDARD", 86, "_cts");
    aL = new cip("LINK_CLICK_LISTENER", 87, "_lcl");
    aM = new cip("FORM_SUBMIT_LISTENER", 88, "_fsl");
    Q = new cip("TIMER_LISTENER", 89, "_tl");
    aN = new cip("CLICK_LISTENER", 90, "_cl");
    aO = new cip("JS_ERROR_LISTENER", 91, "_jel");
    aP = new cip("HISTORY_LISTENER", 92, "_hl");
    aQ = new cip("AJAX_SUBMIT_LISTENER", 93, "_ajl");
    aR = new cip("YOU_TUBE_LISTENER", 94, "_ytl");
    aS = new cip("ELEMENT_ATTRIBUTE", 95, "_ea");
    aT = new cip("ELEMENT_CONTENT", 96, "_ec");
    aU = new cip("ELEMENT_MOVE", 97, "_em");
    aV = new cip("ELEMENT_SCRIPT", 98, "_esc");
    aW = new cip("ELEMENT_STYLE", 99, "_est");
    aX = new cip("ELEMENT_TEXT_TAG", 100, "_etx");
    aY = new cip("ORDERED_LIST", 101, "_ol");
    aZ = new cip("UNIVERSAL_ANALYTICS_EXPERIMENT", 102, "_uae");
    ba = new cip("GOOGLE_ANALYTICS_GLOBAL", 103, "_gag");
    bb = new cip("ADOMETRY", 104, "_adm");
    bc = new cip("ADWORDS_APP_USAGE_TRACKING", 105, "_awut");
    bd = new cip("PAGE_REDIRECT", 106, "_pr");
  }
  
  private cip(String paramString1)
  {
    this.be = paramString1;
  }
  
  public final String toString()
  {
    return this.be;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */