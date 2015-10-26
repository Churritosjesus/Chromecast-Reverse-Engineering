.class public final Lblj;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:Ljava/nio/charset/Charset;

.field private static final b:Lblp;

.field private static final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 37
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lblj;->a:Ljava/nio/charset/Charset;

    .line 39
    new-instance v0, Lblp;

    const-string v1, "LocalizationUtil"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    sput-object v0, Lblj;->b:Lblp;

    .line 46
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "ARAB"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "CYRL"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "GURU"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "HANS"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "HANT"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "LATN"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "TFNG"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "VAII"

    aput-object v2, v0, v1

    sput-object v0, Lblj;->c:[Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/util/List;)Lblm;
    .locals 5

    .prologue
    .line 351
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    .line 352
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblm;

    .line 2265
    iget-object v3, v0, Lblm;->a:Ljava/lang/String;

    .line 353
    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 357
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/util/List;Ljava/lang/String;)Lblm;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 336
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 344
    :goto_0
    return-object v0

    .line 339
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblm;

    .line 1265
    iget-object v3, v0, Lblm;->a:Ljava/lang/String;

    .line 340
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 344
    goto :goto_0
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Lblj;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/Locale;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    invoke-static {p0}, Lblj;->c(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 77
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, ", %s;q=0.8"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    :cond_0
    const-string v1, ", en;q=0.5"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lm;Lbln;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 135
    .line 1192
    invoke-static {p0}, Lble;->a(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1193
    invoke-static {p0}, Lble;->b(Landroid/content/Context;)I

    move-result v2

    if-eq v2, v1, :cond_0

    .line 1195
    sget-object v1, Lblj;->b:Lblp;

    const-string v2, "Google Apps Access to location disabled."

    new-array v3, v0, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    :goto_0
    if-nez v0, :cond_1

    .line 136
    invoke-interface {p1, v4}, Lbln;->a(Ljava/lang/String;)V

    .line 185
    :goto_1
    return-void

    :cond_0
    move v0, v1

    .line 1198
    goto :goto_0

    .line 139
    :cond_1
    invoke-static {}, Landroid/location/Geocoder;->isPresent()Z

    move-result v0

    if-nez v0, :cond_2

    .line 141
    invoke-interface {p1, v4}, Lbln;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 144
    :cond_2
    new-instance v0, Lbwf;

    .line 145
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    invoke-direct {v0, v1}, Lbwf;-><init>(Landroid/content/Context;)V

    new-instance v1, Lblk;

    invoke-direct {v1, p1}, Lblk;-><init>(Lbln;)V

    .line 146
    invoke-virtual {v0, v1}, Lbwf;->a(Lbwh;)Lbwf;

    move-result-object v0

    sget-object v1, Lcni;->a:Lbvz;

    .line 154
    invoke-virtual {v0, v1}, Lbwf;->a(Lbvz;)Lbwf;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Lbwf;->b()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    .line 156
    new-instance v1, Lbll;

    invoke-direct {v1, v0, p1, p0}, Lbll;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lbln;Lm;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwg;)V

    .line 184
    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b()V

    goto :goto_1
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 91
    invoke-static {v0}, Lblj;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 101
    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    const-string v0, "en"

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Lblj;->c(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/util/Locale;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 114
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%s-%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 117
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static d(Ljava/util/Locale;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 305
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    .line 307
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-eq v2, v3, :cond_1

    .line 327
    :cond_0
    :goto_0
    return-object v0

    .line 312
    :cond_1
    sget-object v3, Lblj;->c:[Ljava/lang/String;

    array-length v4, v3

    move v2, v1

    :goto_1
    if-ge v2, v4, :cond_2

    aget-object v5, v3, v2

    .line 313
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 314
    const/4 v1, 0x1

    .line 318
    :cond_2
    if-eqz v1, :cond_0

    .line 323
    invoke-virtual {p0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "_"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 324
    array-length v2, v1

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    .line 327
    const/4 v0, 0x2

    aget-object v0, v1, v0

    goto :goto_0

    .line 312
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method public static d()Z
    .locals 2

    .prologue
    .line 125
    sget-object v0, Ljava/util/Locale;->GERMAN:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static e()Ljava/util/List;
    .locals 8

    .prologue
    .line 278
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 281
    invoke-static {}, Ljava/util/Locale;->getAvailableLocales()[Ljava/util/Locale;

    move-result-object v2

    .line 282
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 283
    invoke-virtual {v4}, Ljava/util/Locale;->getDisplayCountry()Ljava/lang/String;

    move-result-object v5

    .line 284
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 287
    invoke-static {v4}, Lblj;->d(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 288
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 289
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_0

    .line 290
    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 291
    new-instance v6, Lblm;

    invoke-direct {v6, v4, v5}, Lblm;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 294
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method static synthetic f()Lblp;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lblj;->b:Lblp;

    return-object v0
.end method
