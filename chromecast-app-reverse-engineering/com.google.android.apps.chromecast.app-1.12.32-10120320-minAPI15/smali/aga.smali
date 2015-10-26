.class public Laga;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:Ljava/lang/String;

.field private static h:Ljava/util/regex/Pattern;

.field private static volatile m:Ljava/lang/String;


# instance fields
.field b:Lafb;

.field public c:Lorg/json/JSONObject;

.field public d:Landroid/os/Bundle;

.field e:Lagf;

.field public f:Ljava/lang/Object;

.field public g:Z

.field private i:Lagq;

.field private j:Ljava/lang/String;

.field private k:Z

.field private l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 80
    const-class v0, Laga;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Laga;->a:Ljava/lang/String;

    .line 127
    const-string v0, "^/?v\\d+\\.\\d+/(.*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Laga;->h:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 147
    move-object v0, p0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    invoke-direct/range {v0 .. v5}, Laga;-><init>(Lafb;Ljava/lang/String;Landroid/os/Bundle;Lagq;Lagf;)V

    .line 148
    return-void
.end method

.method public constructor <init>(Lafb;Ljava/lang/String;Landroid/os/Bundle;Lagq;Lagf;)V
    .locals 7

    .prologue
    .line 211
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Laga;-><init>(Lafb;Ljava/lang/String;Landroid/os/Bundle;Lagq;Lagf;Ljava/lang/String;)V

    .line 212
    return-void
.end method

.method private constructor <init>(Lafb;Ljava/lang/String;Landroid/os/Bundle;Lagq;Lagf;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    const/4 v0, 0x1

    iput-boolean v0, p0, Laga;->k:Z

    .line 141
    const/4 v0, 0x0

    iput-boolean v0, p0, Laga;->g:Z

    .line 240
    iput-object p1, p0, Laga;->b:Lafb;

    .line 241
    iput-object p2, p0, Laga;->j:Ljava/lang/String;

    .line 242
    const/4 v0, 0x0

    iput-object v0, p0, Laga;->l:Ljava/lang/String;

    .line 244
    invoke-virtual {p0, p5}, Laga;->a(Lagf;)V

    .line 2715
    if-eqz p4, :cond_1

    :goto_0
    iput-object p4, p0, Laga;->i:Lagq;

    .line 247
    if-eqz p3, :cond_2

    .line 248
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Laga;->d:Landroid/os/Bundle;

    .line 253
    :goto_1
    iget-object v0, p0, Laga;->l:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 254
    invoke-static {}, Lajh;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Laga;->l:Ljava/lang/String;

    .line 256
    :cond_0
    return-void

    .line 2715
    :cond_1
    sget-object p4, Lagq;->a:Lagq;

    goto :goto_0

    .line 250
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Laga;->d:Landroid/os/Bundle;

    goto :goto_1
.end method

.method public static a(Lafb;Ljava/lang/String;Lagf;)Laga;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 368
    new-instance v0, Laga;

    move-object v2, p1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    invoke-direct/range {v0 .. v5}, Laga;-><init>(Lafb;Ljava/lang/String;Landroid/os/Bundle;Lagq;Lagf;)V

    return-object v0
.end method

.method public static a(Lafb;Ljava/lang/String;Lorg/json/JSONObject;Lagf;)Laga;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 321
    new-instance v0, Laga;

    sget-object v4, Lagq;->b:Lagq;

    move-object v2, p1

    move-object v3, v1

    move-object v5, v1

    invoke-direct/range {v0 .. v5}, Laga;-><init>(Lafb;Ljava/lang/String;Landroid/os/Bundle;Lagq;Lagf;)V

    .line 3676
    iput-object v1, v0, Laga;->c:Lorg/json/JSONObject;

    .line 328
    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 1426
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    .line 1428
    iget-object v0, p0, Laga;->d:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 1429
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1430
    iget-object v1, p0, Laga;->d:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 1432
    if-nez v1, :cond_1

    .line 1433
    const-string v1, ""

    .line 1436
    :cond_1
    invoke-static {v1}, Laga;->d(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1437
    invoke-static {v1}, Laga;->e(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1449
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0

    .line 1439
    :cond_2
    iget-object v0, p0, Laga;->i:Lagq;

    sget-object v4, Lagq;->a:Lagq;

    if-ne v0, v4, :cond_0

    .line 1440
    new-instance v0, Ljava/lang/IllegalArgumentException;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "Unsupported parameter type for GET request: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 1444
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    .line 1441
    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1452
    :cond_3
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lagm;)Ljava/util/List;
    .locals 4

    .prologue
    .line 1135
    const-string v0, "requests"

    invoke-static {p0, v0}, Lajp;->a(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1139
    :try_start_0
    invoke-static {p0}, Laga;->c(Lagm;)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1149
    invoke-static {v0, p0}, Laga;->a(Ljava/net/HttpURLConnection;Lagm;)Ljava/util/List;

    move-result-object v0

    .line 1150
    :goto_0
    return-object v0

    .line 1140
    :catch_0
    move-exception v0

    .line 11164
    iget-object v1, p0, Lagm;->b:Ljava/util/List;

    .line 1142
    const/4 v2, 0x0

    new-instance v3, Lafq;

    invoke-direct {v3, v0}, Lafq;-><init>(Ljava/lang/Throwable;)V

    .line 1141
    invoke-static {v1, v2, v3}, Lagp;->a(Ljava/util/List;Ljava/net/HttpURLConnection;Lafq;)Ljava/util/List;

    move-result-object v0

    .line 1145
    invoke-static {p0, v0}, Laga;->a(Lagm;Ljava/util/List;)V

    goto :goto_0
.end method

.method public static a(Ljava/net/HttpURLConnection;Lagm;)Ljava/util/List;
    .locals 10

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1247
    invoke-static {p0, p1}, Lagp;->a(Ljava/net/HttpURLConnection;Lagm;)Ljava/util/List;

    move-result-object v2

    .line 1249
    invoke-static {p0}, Laji;->a(Ljava/net/URLConnection;)V

    .line 1251
    invoke-virtual {p1}, Lagm;->size()I

    move-result v3

    .line 1252
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-eq v3, v4, :cond_0

    .line 1253
    new-instance v4, Lafq;

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "Received %d responses while expecting %d"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    .line 1256
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v7, v1

    .line 1257
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v7, v0

    .line 1254
    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lafq;-><init>(Ljava/lang/String;)V

    throw v4

    .line 1260
    :cond_0
    invoke-static {p1, v2}, Laga;->a(Lagm;Ljava/util/List;)V

    .line 1263
    invoke-static {}, Laff;->a()Laff;

    move-result-object v3

    .line 12154
    iget-object v4, v3, Laff;->b:Lafb;

    if-eqz v4, :cond_2

    .line 12157
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 12159
    iget-object v5, v3, Laff;->b:Lafb;

    .line 12217
    iget-object v5, v5, Lafb;->e:Lafl;

    .line 13069
    iget-boolean v5, v5, Lafl;->d:Z

    .line 12159
    if-eqz v5, :cond_2

    .line 12160
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v5, v3, Laff;->c:Ljava/util/Date;

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    sub-long/2addr v6, v8

    const-wide/32 v8, 0x36ee80

    cmp-long v5, v6, v8

    if-lez v5, :cond_2

    .line 12161
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v6, v3, Laff;->b:Lafb;

    .line 13227
    iget-object v6, v6, Lafb;->f:Ljava/util/Date;

    .line 12161
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/32 v6, 0x5265c00

    cmp-long v4, v4, v6

    if-lez v4, :cond_2

    .line 12147
    :goto_0
    if-eqz v0, :cond_1

    .line 14198
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 14199
    invoke-virtual {v3}, Laff;->b()V

    .line 1265
    :cond_1
    :goto_1
    return-object v2

    :cond_2
    move v0, v1

    .line 12161
    goto :goto_0

    .line 14201
    :cond_3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 14202
    new-instance v1, Lafg;

    invoke-direct {v1, v3}, Lafg;-><init>(Laff;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1
.end method

.method private static a(Lagk;Ljava/util/Collection;Ljava/util/Map;)V
    .locals 3

    .prologue
    .line 1870
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 1871
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laga;

    .line 1872
    invoke-direct {v0, v1, p2}, Laga;->a(Lorg/json/JSONArray;Ljava/util/Map;)V

    goto :goto_0

    .line 1875
    :cond_0
    const-string v0, "batch"

    invoke-virtual {p0, v0, v1, p1}, Lagk;->a(Ljava/lang/String;Lorg/json/JSONArray;Ljava/util/Collection;)V

    .line 1876
    return-void
.end method

.method private static a(Lagm;Laiw;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    .locals 7

    .prologue
    .line 1681
    new-instance v1, Lagk;

    invoke-direct {v1, p4, p1, p5}, Lagk;-><init>(Ljava/io/OutputStream;Laiw;Z)V

    .line 1683
    const/4 v0, 0x1

    if-ne p2, v0, :cond_5

    .line 1684
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lagm;->a(I)Laga;

    move-result-object v2

    .line 1686
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1687
    iget-object v0, v2, Laga;->d:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1688
    iget-object v5, v2, Laga;->d:Landroid/os/Bundle;

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 1689
    invoke-static {v5}, Laga;->c(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 1690
    new-instance v6, Lage;

    invoke-direct {v6, v2, v5}, Lage;-><init>(Laga;Ljava/lang/Object;)V

    invoke-interface {v3, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1694
    :cond_1
    if-eqz p1, :cond_2

    .line 1695
    const-string v0, "  Parameters:\n"

    invoke-virtual {p1, v0}, Laiw;->b(Ljava/lang/String;)V

    .line 1697
    :cond_2
    iget-object v0, v2, Laga;->d:Landroid/os/Bundle;

    invoke-static {v0, v1, v2}, Laga;->a(Landroid/os/Bundle;Lagk;Laga;)V

    .line 1699
    if-eqz p1, :cond_3

    .line 1700
    const-string v0, "  Attachments:\n"

    invoke-virtual {p1, v0}, Laiw;->b(Ljava/lang/String;)V

    .line 1702
    :cond_3
    invoke-static {v3, v1}, Laga;->a(Ljava/util/Map;Lagk;)V

    .line 1704
    iget-object v0, v2, Laga;->c:Lorg/json/JSONObject;

    if-eqz v0, :cond_4

    .line 1705
    iget-object v0, v2, Laga;->c:Lorg/json/JSONObject;

    invoke-virtual {p3}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Laga;->a(Lorg/json/JSONObject;Ljava/lang/String;Lagg;)V

    .line 1726
    :cond_4
    :goto_1
    return-void

    .line 1708
    :cond_5
    invoke-static {p0}, Laga;->f(Lagm;)Ljava/lang/String;

    move-result-object v0

    .line 1709
    invoke-static {v0}, Laji;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 1710
    new-instance v0, Lafq;

    const-string v1, "App ID was not specified at the request or Settings."

    invoke-direct {v0, v1}, Lafq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1714
    :cond_6
    const-string v2, "batch_app_id"

    invoke-virtual {v1, v2, v0}, Lagk;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1718
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1719
    invoke-static {v1, p0, v0}, Laga;->a(Lagk;Ljava/util/Collection;Ljava/util/Map;)V

    .line 1721
    if-eqz p1, :cond_7

    .line 1722
    const-string v2, "  Attachments:\n"

    invoke-virtual {p1, v2}, Laiw;->b(Ljava/lang/String;)V

    .line 1724
    :cond_7
    invoke-static {v0, v1}, Laga;->a(Ljava/util/Map;Lagk;)V

    goto :goto_1
.end method

.method private static a(Lagm;Ljava/util/List;)V
    .locals 6

    .prologue
    .line 1343
    invoke-virtual {p0}, Lagm;->size()I

    move-result v1

    .line 1347
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1348
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 1349
    invoke-virtual {p0, v0}, Lagm;->a(I)Laga;

    move-result-object v3

    .line 1350
    iget-object v4, v3, Laga;->e:Lagf;

    if-eqz v4, :cond_0

    .line 1351
    new-instance v4, Landroid/util/Pair;

    iget-object v3, v3, Laga;->e:Lagf;

    .line 1352
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1351
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1348
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1356
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1357
    new-instance v0, Lagc;

    invoke-direct {v0, v2, p0}, Lagc;-><init>(Ljava/util/ArrayList;Lagm;)V

    .line 15156
    iget-object v1, p0, Lagm;->a:Landroid/os/Handler;

    .line 1371
    if-nez v1, :cond_3

    .line 1373
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1379
    :cond_2
    :goto_1
    return-void

    .line 1376
    :cond_3
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1
.end method

.method private static a(Landroid/os/Bundle;Lagk;Laga;)V
    .locals 4

    .prologue
    .line 1841
    invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 1843
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1844
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 1845
    invoke-static {v2}, Laga;->d(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1846
    invoke-virtual {p1, v0, v2, p2}, Lagk;->a(Ljava/lang/String;Ljava/lang/Object;Laga;)V

    goto :goto_0

    .line 1849
    :cond_1
    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/Object;Lagg;Z)V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v1, 0x0

    .line 1774
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 1776
    const-class v2, Lorg/json/JSONObject;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1777
    check-cast p1, Lorg/json/JSONObject;

    .line 1778
    if-eqz p3, :cond_0

    .line 1781
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 1782
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1783
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1784
    const-string v3, "%s[%s]"

    new-array v4, v8, [Ljava/lang/Object;

    aput-object p0, v4, v1

    aput-object v0, v4, v7

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 1787
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 1785
    invoke-static {v3, v0, p2, p3}, Laga;->a(Ljava/lang/String;Ljava/lang/Object;Lagg;Z)V

    goto :goto_0

    .line 1794
    :cond_0
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1795
    const-string v0, "id"

    .line 1797
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1795
    invoke-static {p0, v0, p2, p3}, Laga;->a(Ljava/lang/String;Ljava/lang/Object;Lagg;Z)V

    .line 1834
    :cond_1
    :goto_1
    return-void

    .line 1800
    :cond_2
    const-string v0, "url"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1801
    const-string v0, "url"

    .line 1803
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1801
    invoke-static {p0, v0, p2, p3}, Laga;->a(Ljava/lang/String;Ljava/lang/Object;Lagg;Z)V

    goto :goto_1

    .line 1806
    :cond_3
    const-string v0, "fbsdk:create_object"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1807
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p2, p3}, Laga;->a(Ljava/lang/String;Ljava/lang/Object;Lagg;Z)V

    goto :goto_1

    .line 1810
    :cond_4
    const-class v2, Lorg/json/JSONArray;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1811
    check-cast p1, Lorg/json/JSONArray;

    .line 1812
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    move v0, v1

    .line 1813
    :goto_2
    if-ge v0, v2, :cond_1

    .line 1814
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v4, "%s[%d]"

    new-array v5, v8, [Ljava/lang/Object;

    aput-object p0, v5, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 1815
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4, p2, p3}, Laga;->a(Ljava/lang/String;Ljava/lang/Object;Lagg;Z)V

    .line 1813
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1817
    :cond_5
    const-class v1, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_6

    const-class v1, Ljava/lang/Number;

    .line 1818
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_6

    const-class v1, Ljava/lang/Boolean;

    .line 1819
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 1820
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Lagg;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 1821
    :cond_7
    const-class v1, Ljava/util/Date;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1822
    check-cast p1, Ljava/util/Date;

    .line 1829
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1832
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p0, v0}, Lagg;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1
.end method

.method private static a(Ljava/util/Map;Lagk;)V
    .locals 4

    .prologue
    .line 1855
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 1857
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1858
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lage;

    .line 19506
    iget-object v3, v1, Lage;->b:Ljava/lang/Object;

    .line 1859
    invoke-static {v3}, Laga;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 20506
    iget-object v3, v1, Lage;->b:Ljava/lang/Object;

    .line 21502
    iget-object v1, v1, Lage;->a:Laga;

    .line 1860
    invoke-virtual {p1, v0, v3, v1}, Lagk;->a(Ljava/lang/String;Ljava/lang/Object;Laga;)V

    goto :goto_0

    .line 1863
    :cond_1
    return-void
.end method

.method private a(Lorg/json/JSONArray;Ljava/util/Map;)V
    .locals 10

    .prologue
    .line 1514
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 1526
    invoke-direct {p0}, Laga;->c()Ljava/lang/String;

    move-result-object v2

    .line 1527
    const-string v0, "relative_url"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1528
    const-string v0, "method"

    iget-object v3, p0, Laga;->i:Lagq;

    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1529
    iget-object v0, p0, Laga;->b:Lafb;

    if-eqz v0, :cond_0

    .line 1530
    iget-object v0, p0, Laga;->b:Lafb;

    .line 16172
    iget-object v0, v0, Lafb;->d:Ljava/lang/String;

    .line 1531
    invoke-static {v0}, Laiw;->a(Ljava/lang/String;)V

    .line 1535
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1536
    iget-object v0, p0, Laga;->d:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 1537
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1538
    iget-object v5, p0, Laga;->d:Landroid/os/Bundle;

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 1539
    invoke-static {v0}, Laga;->c(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 1541
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v6, "%s%d"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    const-string v9, "file"

    aput-object v9, v7, v8

    const/4 v8, 0x1

    .line 1545
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v8

    .line 1541
    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1546
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1547
    new-instance v6, Lage;

    invoke-direct {v6, p0, v0}, Lage;-><init>(Laga;Ljava/lang/Object;)V

    invoke-interface {p2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1551
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1552
    const-string v0, ","

    invoke-static {v0, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 1553
    const-string v3, "attached_files"

    invoke-virtual {v1, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1556
    :cond_3
    iget-object v0, p0, Laga;->c:Lorg/json/JSONObject;

    if-eqz v0, :cond_4

    .line 1558
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1559
    iget-object v3, p0, Laga;->c:Lorg/json/JSONObject;

    new-instance v4, Lagd;

    invoke-direct {v4, p0, v0}, Lagd;-><init>(Laga;Ljava/util/ArrayList;)V

    invoke-static {v3, v2, v4}, Laga;->a(Lorg/json/JSONObject;Ljava/lang/String;Lagg;)V

    .line 1569
    const-string v2, "&"

    invoke-static {v2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 1570
    const-string v2, "body"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1573
    :cond_4
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1574
    return-void
.end method

.method private static a(Lorg/json/JSONObject;Ljava/lang/String;Lagg;)V
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1751
    .line 18729
    sget-object v0, Laga;->h:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 18730
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 18732
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 18734
    :goto_0
    const-string v3, "me/"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "/me/"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    move v0, v1

    .line 1752
    :goto_1
    if-eqz v0, :cond_6

    .line 1753
    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 1754
    const-string v3, "?"

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 1755
    const/4 v4, 0x3

    if-le v0, v4, :cond_3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    if-ge v0, v3, :cond_3

    :cond_1
    move v0, v1

    :goto_2
    move v3, v0

    .line 1759
    :goto_3
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v5

    .line 1760
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1761
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1762
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 1763
    if-eqz v3, :cond_4

    const-string v4, "image"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v1

    .line 1764
    :goto_5
    invoke-static {v0, v6, p2, v4}, Laga;->a(Ljava/lang/String;Ljava/lang/Object;Lagg;Z)V

    goto :goto_4

    :cond_2
    move v0, v2

    .line 18737
    goto :goto_1

    :cond_3
    move v0, v2

    .line 1755
    goto :goto_2

    :cond_4
    move v4, v2

    .line 1763
    goto :goto_5

    .line 1766
    :cond_5
    return-void

    :cond_6
    move v3, v2

    goto :goto_3

    :cond_7
    move-object v0, p1

    goto :goto_0
.end method

.method static synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 73
    invoke-static {p0}, Laga;->d(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static b(Lagm;)Lagl;
    .locals 1

    .prologue
    .line 1203
    const-string v0, "requests"

    invoke-static {p0, v0}, Lajp;->a(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1205
    new-instance v0, Lagl;

    invoke-direct {v0, p0}, Lagl;-><init>(Lagm;)V

    .line 1206
    invoke-virtual {v0}, Lagl;->a()Lagl;

    .line 1207
    return-object v0
.end method

.method static synthetic b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 73
    invoke-static {p0}, Laga;->e(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 5

    .prologue
    .line 1398
    iget-object v0, p0, Laga;->b:Lafb;

    if-eqz v0, :cond_2

    .line 1399
    iget-object v0, p0, Laga;->d:Landroid/os/Bundle;

    const-string v1, "access_token"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1400
    iget-object v0, p0, Laga;->b:Lafb;

    .line 15172
    iget-object v0, v0, Lafb;->d:Ljava/lang/String;

    .line 1401
    invoke-static {v0}, Laiw;->a(Ljava/lang/String;)V

    .line 1402
    iget-object v1, p0, Laga;->d:Landroid/os/Bundle;

    const-string v2, "access_token"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1415
    :cond_0
    :goto_0
    iget-object v0, p0, Laga;->d:Landroid/os/Bundle;

    const-string v1, "sdk"

    const-string v2, "android"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1416
    iget-object v0, p0, Laga;->d:Landroid/os/Bundle;

    const-string v1, "format"

    const-string v2, "json"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1418
    sget-object v0, Lags;->h:Lags;

    invoke-static {v0}, Lafv;->a(Lags;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1419
    iget-object v0, p0, Laga;->d:Landroid/os/Bundle;

    const-string v1, "debug"

    const-string v2, "info"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1423
    :cond_1
    :goto_1
    return-void

    .line 1404
    :cond_2
    iget-boolean v0, p0, Laga;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Laga;->d:Landroid/os/Bundle;

    const-string v1, "access_token"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1405
    invoke-static {}, Lafv;->h()Ljava/lang/String;

    move-result-object v0

    .line 1406
    invoke-static {}, Lafv;->i()Ljava/lang/String;

    move-result-object v1

    .line 1407
    invoke-static {v0}, Laji;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Laji;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1408
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "|"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1409
    iget-object v1, p0, Laga;->d:Landroid/os/Bundle;

    const-string v2, "access_token"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1420
    :cond_3
    sget-object v0, Lags;->g:Lags;

    invoke-static {v0}, Lafv;->a(Lags;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1421
    iget-object v0, p0, Laga;->d:Landroid/os/Bundle;

    const-string v1, "debug"

    const-string v2, "warning"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method private c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1460
    invoke-direct {p0}, Laga;->d()Ljava/lang/String;

    move-result-object v0

    .line 1461
    invoke-direct {p0}, Laga;->b()V

    .line 1462
    invoke-direct {p0, v0}, Laga;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Lagm;)Ljava/net/HttpURLConnection;
    .locals 16

    .prologue
    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v8, 0x0

    .line 1035
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lagm;->size()I

    move-result v2

    if-ne v2, v3, :cond_2

    .line 1037
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lagm;->a(I)Laga;

    move-result-object v5

    .line 1040
    new-instance v2, Ljava/net/URL;

    .line 4703
    iget-object v4, v5, Laga;->i:Lagq;

    .line 4471
    sget-object v7, Lagq;->b:Lagq;

    if-ne v4, v7, :cond_1

    iget-object v4, v5, Laga;->j:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v4, v5, Laga;->j:Ljava/lang/String;

    const-string v7, "/videos"

    .line 4473
    invoke-virtual {v4, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 4474
    invoke-static {}, Lajh;->c()Ljava/lang/String;

    move-result-object v4

    .line 4478
    :goto_0
    const-string v7, "%s/%s"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v4, v9, v10

    const/4 v4, 0x1

    invoke-direct {v5}, Laga;->d()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v4

    invoke-static {v7, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 4480
    invoke-direct {v5}, Laga;->b()V

    .line 4481
    invoke-direct {v5, v4}, Laga;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1040
    invoke-direct {v2, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5387
    :goto_1
    :try_start_1
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v14, v0

    .line 5389
    const-string v2, "User-Agent"

    .line 5885
    sget-object v4, Laga;->m:Ljava/lang/String;

    if-nez v4, :cond_0

    .line 5886
    const-string v4, "%s.%s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    const-string v9, "FBAndroidSDK"

    aput-object v9, v5, v7

    const/4 v7, 0x1

    const-string v9, "4.4.1"

    aput-object v9, v5, v7

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sput-object v4, Laga;->m:Ljava/lang/String;

    .line 6037
    sget-object v4, La;->dd:Ljava/lang/String;

    .line 5890
    invoke-static {v4}, Laji;->a(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 5891
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v7, "%s/%s"

    const/4 v9, 0x2

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    sget-object v11, Laga;->m:Ljava/lang/String;

    aput-object v11, v9, v10

    const/4 v10, 0x1

    aput-object v4, v9, v10

    invoke-static {v5, v7, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sput-object v4, Laga;->m:Ljava/lang/String;

    .line 5899
    :cond_0
    sget-object v4, Laga;->m:Ljava/lang/String;

    .line 5389
    invoke-virtual {v14, v2, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 5390
    const-string v2, "Accept-Language"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v2, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 5392
    const/4 v2, 0x0

    invoke-virtual {v14, v2}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 6619
    new-instance v15, Laiw;

    sget-object v2, Lags;->a:Lags;

    const-string v4, "Request"

    invoke-direct {v15, v2, v4}, Laiw;-><init>(Lags;Ljava/lang/String;)V

    .line 6621
    invoke-virtual/range {p0 .. p0}, Lagm;->size()I

    move-result v4

    .line 6622
    invoke-static/range {p0 .. p0}, Laga;->e(Lagm;)Z

    move-result v7

    .line 6624
    if-ne v4, v3, :cond_3

    .line 6625
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lagm;->a(I)Laga;

    move-result-object v2

    iget-object v2, v2, Laga;->i:Lagq;

    .line 6626
    :goto_2
    invoke-virtual {v2}, Lagq;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 7595
    if-eqz v7, :cond_4

    .line 7596
    const-string v5, "Content-Type"

    const-string v9, "application/x-www-form-urlencoded"

    invoke-virtual {v14, v5, v9}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 7597
    const-string v5, "Content-Encoding"

    const-string v9, "gzip"

    invoke-virtual {v14, v5, v9}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 6629
    :goto_3
    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v5

    .line 6630
    const-string v9, "Request:\n"

    invoke-virtual {v15, v9}, Laiw;->b(Ljava/lang/String;)V

    .line 6631
    const-string v9, "Id"

    .line 8152
    move-object/from16 v0, p0

    iget-object v10, v0, Lagm;->c:Ljava/lang/String;

    .line 6631
    invoke-virtual {v15, v9, v10}, Laiw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6632
    const-string v9, "URL"

    invoke-virtual {v15, v9, v5}, Laiw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6633
    const-string v9, "Method"

    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v15, v9, v10}, Laiw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6634
    const-string v9, "User-Agent"

    const-string v10, "User-Agent"

    invoke-virtual {v14, v10}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v15, v9, v10}, Laiw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6635
    const-string v9, "Content-Type"

    const-string v10, "Content-Type"

    invoke-virtual {v14, v10}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v15, v9, v10}, Laiw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9081
    const/4 v9, 0x0

    .line 6637
    invoke-virtual {v14, v9}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 10081
    const/4 v9, 0x0

    .line 6638
    invoke-virtual {v14, v9}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 6642
    sget-object v9, Lagq;->b:Lagq;

    if-ne v2, v9, :cond_5

    move v2, v3

    .line 6643
    :goto_4
    if-nez v2, :cond_6

    .line 6644
    invoke-virtual {v15}, Laiw;->a()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    .line 1061
    :goto_5
    return-object v14

    .line 4476
    :cond_1
    :try_start_2
    invoke-static {}, Lajh;->b()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_0

    .line 1044
    :cond_2
    new-instance v2, Ljava/net/URL;

    invoke-static {}, Lajh;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_1

    .line 1046
    :catch_0
    move-exception v2

    .line 1047
    new-instance v3, Lafq;

    const-string v4, "could not construct URL for request"

    invoke-direct {v3, v4, v2}, Lafq;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 6625
    :cond_3
    :try_start_3
    sget-object v2, Lagq;->b:Lagq;

    goto :goto_2

    .line 7599
    :cond_4
    const-string v5, "Content-Type"

    .line 7879
    const-string v9, "multipart/form-data; boundary=%s"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    const-string v12, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"

    aput-object v12, v10, v11

    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 7599
    invoke-virtual {v14, v5, v9}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_3

    .line 1055
    :catch_1
    move-exception v2

    .line 1056
    new-instance v3, Lafq;

    const-string v4, "could not construct request body"

    invoke-direct {v3, v4, v2}, Lafq;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :cond_5
    move v2, v8

    .line 6642
    goto :goto_4

    .line 6648
    :cond_6
    const/4 v2, 0x1

    :try_start_4
    invoke-virtual {v14, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2

    .line 6652
    :try_start_5
    new-instance v9, Ljava/io/BufferedOutputStream;

    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v9, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 6653
    if-eqz v7, :cond_7

    .line 6654
    :try_start_6
    new-instance v2, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v2, v9}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v9, v2

    .line 6657
    :cond_7
    invoke-static/range {p0 .. p0}, Laga;->d(Lagm;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 6659
    new-instance v6, Lagy;

    .line 10156
    move-object/from16 v0, p0

    iget-object v2, v0, Lagm;->a:Landroid/os/Handler;

    .line 6659
    invoke-direct {v6, v2}, Lagy;-><init>(Landroid/os/Handler;)V

    .line 6660
    const/4 v3, 0x0

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v7}, Laga;->a(Lagm;Laiw;ILjava/net/URL;Ljava/io/OutputStream;Z)V

    .line 11048
    iget v2, v6, Lagy;->b:I

    .line 11052
    iget-object v11, v6, Lagy;->a:Ljava/util/Map;

    .line 6665
    new-instance v8, Lagz;

    int-to-long v12, v2

    move-object/from16 v10, p0

    invoke-direct/range {v8 .. v13}, Lagz;-><init>(Ljava/io/OutputStream;Lagm;Ljava/util/Map;J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object v6, v8

    :goto_6
    move-object/from16 v2, p0

    move-object v3, v15

    .line 6668
    :try_start_7
    invoke-static/range {v2 .. v7}, Laga;->a(Lagm;Laiw;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 6671
    :try_start_8
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V

    .line 6675
    invoke-virtual {v15}, Laiw;->a()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_2

    goto :goto_5

    .line 1057
    :catch_2
    move-exception v2

    .line 1058
    new-instance v3, Lafq;

    const-string v4, "could not construct request body"

    invoke-direct {v3, v4, v2}, Lafq;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 6670
    :catchall_0
    move-exception v2

    move-object v9, v6

    :goto_7
    if-eqz v9, :cond_8

    .line 6671
    :try_start_9
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V

    :cond_8
    throw v2
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_2

    .line 6670
    :catchall_1
    move-exception v2

    goto :goto_7

    :catchall_2
    move-exception v2

    move-object v9, v6

    goto :goto_7

    :cond_9
    move-object v6, v9

    goto :goto_6
.end method

.method private static c(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 1923
    instance-of v0, p0, Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    instance-of v0, p0, [B

    if-nez v0, :cond_0

    instance-of v0, p0, Landroid/net/Uri;

    if-nez v0, :cond_0

    instance-of v0, p0, Landroid/os/ParcelFileDescriptor;

    if-nez v0, :cond_0

    instance-of v0, p0, Lagi;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d()Ljava/lang/String;
    .locals 4

    .prologue
    .line 1485
    sget-object v0, Laga;->h:Ljava/util/regex/Pattern;

    iget-object v1, p0, Laga;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 1486
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1487
    iget-object v0, p0, Laga;->j:Ljava/lang/String;

    .line 1489
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "%s/%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Laga;->l:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Laga;->j:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static d(Lagm;)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 1577
    .line 17168
    iget-object v0, p0, Lagm;->d:Ljava/util/List;

    .line 1577
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lagn;

    .line 1578
    instance-of v0, v0, Lago;

    if-eqz v0, :cond_0

    move v0, v1

    .line 1589
    :goto_0
    return v0

    .line 1583
    :cond_1
    invoke-virtual {p0}, Lagm;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laga;

    .line 17882
    iget-object v0, v0, Laga;->e:Lagf;

    .line 1584
    instance-of v0, v0, Lagh;

    if-eqz v0, :cond_2

    move v0, v1

    .line 1585
    goto :goto_0

    .line 1589
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static d(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 1931
    instance-of v0, p0, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Number;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/util/Date;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static e(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1936
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1937
    check-cast p0, Ljava/lang/String;

    .line 1943
    :goto_0
    return-object p0

    .line 1938
    :cond_0
    instance-of v0, p0, Ljava/lang/Boolean;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_2

    .line 1939
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 1940
    :cond_2
    instance-of v0, p0, Ljava/util/Date;

    if-eqz v0, :cond_3

    .line 1941
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1943
    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 1945
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported parameter type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static e(Lagm;)Z
    .locals 5

    .prologue
    .line 1604
    invoke-virtual {p0}, Lagm;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laga;

    .line 1605
    iget-object v1, v0, Laga;->d:Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1606
    iget-object v4, v0, Laga;->d:Landroid/os/Bundle;

    invoke-virtual {v4, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 1607
    invoke-static {v1}, Laga;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1608
    const/4 v0, 0x0

    .line 1612
    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static f(Lagm;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 1903
    invoke-static {v1}, Laji;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v1

    .line 1919
    :goto_0
    return-object v0

    .line 1907
    :cond_0
    invoke-virtual {p0}, Lagm;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laga;

    .line 1908
    iget-object v0, v0, Laga;->b:Lafb;

    .line 1909
    if-eqz v0, :cond_1

    .line 23236
    iget-object v0, v0, Lafb;->g:Ljava/lang/String;

    .line 1911
    if-eqz v0, :cond_1

    goto :goto_0

    .line 1916
    :cond_2
    invoke-static {v1}, Laji;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    move-object v0, v1

    .line 1917
    goto :goto_0

    .line 1919
    :cond_3
    invoke-static {}, Lafv;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lagp;
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 971
    .line 4075
    new-array v0, v3, [Laga;

    aput-object p0, v0, v2

    .line 4098
    const-string v1, "requests"

    invoke-static {v0, v1}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4100
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 4116
    new-instance v1, Lagm;

    invoke-direct {v1, v0}, Lagm;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Laga;->a(Lagm;)Ljava/util/List;

    move-result-object v0

    .line 4077
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eq v1, v3, :cond_1

    .line 4078
    :cond_0
    new-instance v0, Lafq;

    const-string v1, "invalid state: expected a single response"

    invoke-direct {v0, v1}, Lafq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4081
    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lagp;

    .line 971
    return-object v0
.end method

.method public final a(Lagf;)V
    .locals 1

    .prologue
    .line 892
    sget-object v0, Lags;->h:Lags;

    invoke-static {v0}, Lafv;->a(Lags;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lags;->g:Lags;

    .line 893
    invoke-static {v0}, Lafv;->a(Lags;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 894
    :cond_0
    new-instance v0, Lagb;

    invoke-direct {v0, p0, p1}, Lagb;-><init>(Laga;Lagf;)V

    .line 931
    iput-object v0, p0, Laga;->e:Lagf;

    .line 936
    :goto_0
    return-void

    .line 933
    :cond_1
    iput-object p1, p0, Laga;->e:Lagf;

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1326
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{Request: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1327
    const-string v1, " accessToken: "

    .line 1328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Laga;->b:Lafb;

    if-nez v0, :cond_0

    .line 1329
    const-string v0, "null"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", graphPath: "

    .line 1330
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Laga;->j:Ljava/lang/String;

    .line 1331
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", graphObject: "

    .line 1332
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Laga;->c:Lorg/json/JSONObject;

    .line 1333
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", httpMethod: "

    .line 1334
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Laga;->i:Lagq;

    .line 1335
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", parameters: "

    .line 1336
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Laga;->d:Landroid/os/Bundle;

    .line 1337
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    .line 1338
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1339
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1329
    :cond_0
    iget-object v0, p0, Laga;->b:Lafb;

    goto :goto_0
.end method
