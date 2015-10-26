.class public final Lbli;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field static final b:Ljava/lang/String;

.field public static final d:[Ljava/lang/String;

.field private static final f:[Ljava/lang/String;


# instance fields
.field a:Ljava/util/Map;

.field public c:Lblp;

.field private e:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 30
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbli;->b:Ljava/lang/String;

    .line 122
    new-array v0, v6, [Ljava/lang/String;

    const-string v1, "Default"

    aput-object v1, v0, v2

    const-string v1, "Production"

    aput-object v1, v0, v3

    const-string v1, "Dogfood"

    aput-object v1, v0, v4

    const-string v1, "Alpha"

    aput-object v1, v0, v5

    sput-object v0, Lbli;->d:[Ljava/lang/String;

    .line 128
    new-array v0, v6, [Ljava/lang/String;

    const-string v1, ""

    aput-object v1, v0, v2

    const-string v1, "prod"

    aput-object v1, v0, v3

    const-string v1, "dogfood"

    aput-object v1, v0, v4

    const-string v1, "alpha"

    aput-object v1, v0, v5

    sput-object v0, Lbli;->f:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lblp;

    const-string v1, "GtmContainerManager"

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lbli;->c:Lblp;

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbli;->e:Ljava/util/Map;

    .line 2070
    :try_start_0
    sget v0, La;->hk:I

    .line 1164
    invoke-static {}, Lblf;->b()Z

    .line 43
    invoke-virtual {p0, p1, v0}, Lbli;->a(Landroid/content/Context;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :goto_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbli;->a:Ljava/util/Map;

    .line 49
    iget-object v0, p0, Lbli;->a:Ljava/util/Map;

    const-string v1, "en"

    sget v2, La;->hf:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lbli;->a:Ljava/util/Map;

    const-string v1, "es"

    sget v2, La;->hg:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p0, Lbli;->a:Ljava/util/Map;

    const-string v1, "es-MX"

    sget v2, La;->hh:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    return-void

    .line 45
    :catch_0
    move-exception v0

    iget-object v0, p0, Lbli;->c:Lblp;

    const-string v1, "Failed to load default container maps"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public static a()I
    .locals 1

    .prologue
    .line 70
    sget v0, La;->hk:I

    .line 76
    return v0
.end method

.method public static a(Ljava/lang/String;I)I
    .locals 1

    .prologue
    .line 174
    const-string v0, "prod"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 175
    sget p1, La;->hk:I

    .line 181
    :cond_0
    :goto_0
    return p1

    .line 176
    :cond_1
    const-string v0, "dogfood"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 177
    sget p1, La;->hj:I

    goto :goto_0

    .line 178
    :cond_2
    const-string v0, "alpha"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    sget p1, La;->hi:I

    goto :goto_0
.end method

.method public static a(Z)Ljava/lang/String;
    .locals 3

    .prologue
    .line 185
    if-eqz p0, :cond_0

    .line 186
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 187
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 188
    const-string v1, "ACM_LEVEL"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 189
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 194
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lbli;->d:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    goto :goto_0
.end method

.method public static c()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 137
    sget-object v0, Lbli;->d:[Ljava/lang/String;

    return-object v0
.end method

.method public static d()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 141
    sget-object v0, Lbli;->f:[Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;I)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v0

    new-array v0, v0, [B

    .line 58
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    .line 59
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>([B)V

    const-string v0, "\n"

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 60
    array-length v4, v3

    move v0, v1

    :goto_0
    if-ge v0, v4, :cond_0

    aget-object v5, v3, v0

    .line 61
    const-string v6, ","

    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 62
    iget-object v6, p0, Lbli;->e:Ljava/util/Map;

    aget-object v7, v5, v1

    const/4 v8, 0x1

    aget-object v5, v5, v8

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 65
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    .prologue
    .line 81
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 2086
    iget-object v1, p0, Lbli;->e:Ljava/util/Map;

    invoke-static {v0}, Lblj;->c(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2087
    iget-object v1, p0, Lbli;->e:Ljava/util/Map;

    invoke-static {v0}, Lblj;->c(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2092
    :goto_0
    return-object v0

    .line 2088
    :cond_0
    iget-object v1, p0, Lbli;->e:Ljava/util/Map;

    invoke-static {v0}, Lblj;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2089
    iget-object v1, p0, Lbli;->e:Ljava/util/Map;

    invoke-static {v0}, Lblj;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    .line 2091
    :cond_1
    iget-object v0, p0, Lbli;->e:Ljava/util/Map;

    sget-object v1, Lbli;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2092
    iget-object v0, p0, Lbli;->e:Ljava/util/Map;

    sget-object v1, Lbli;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    .line 2094
    :cond_2
    const/4 v0, 0x0

    .line 81
    goto :goto_0
.end method
