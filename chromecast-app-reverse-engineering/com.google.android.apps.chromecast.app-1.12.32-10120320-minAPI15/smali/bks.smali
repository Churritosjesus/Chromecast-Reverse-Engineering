.class public final Lbks;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final a:Ljava/util/regex/Pattern;

.field private static final b:Lbkv;

.field private static final c:Lbkv;

.field private static final d:Lbkv;

.field private static final e:Lbku;

.field private static final f:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 32
    const-string v0, "[swh]\\d+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lbks;->a:Ljava/util/regex/Pattern;

    .line 35
    const-string v0, "-"

    invoke-static {v0}, Lbkv;->a(Ljava/lang/String;)Lbkv;

    move-result-object v0

    invoke-virtual {v0}, Lbkv;->a()Lbkv;

    move-result-object v0

    sput-object v0, Lbks;->b:Lbkv;

    .line 37
    const-string v0, "="

    invoke-static {v0}, Lbkv;->a(Ljava/lang/String;)Lbkv;

    move-result-object v0

    invoke-virtual {v0}, Lbkv;->a()Lbkv;

    move-result-object v0

    sput-object v0, Lbks;->c:Lbkv;

    .line 39
    const-string v0, "/"

    invoke-static {v0}, Lbkv;->a(Ljava/lang/String;)Lbkv;

    move-result-object v0

    invoke-virtual {v0}, Lbkv;->a()Lbkv;

    move-result-object v0

    sput-object v0, Lbks;->d:Lbkv;

    .line 41
    const-string v0, "/"

    .line 2453
    new-instance v1, Lbku;

    invoke-direct {v1, v0}, Lbku;-><init>(Ljava/lang/String;)V

    .line 41
    sput-object v1, Lbks;->e:Lbku;

    .line 43
    const-string v0, "^((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z])?\\.((ggpht)|(googleusercontent)|(google)))|(ci[3-6]\\.((ggpht)|(googleusercontent)|(google)))|((cp|gp)[3-6]\\.((ggpht)|(googleusercontent)|(google)))|([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com/image)|(www\\.google\\.com\\/visualsearch\\/lh))\\/"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lbks;->f:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static a(IILjava/lang/String;)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v2, 0x1

    const/4 v8, 0x4

    const/4 v1, 0x0

    .line 247
    if-nez p2, :cond_1

    .line 248
    const/4 p2, 0x0

    .line 267
    :cond_0
    :goto_0
    return-object p2

    .line 249
    :cond_1
    invoke-static {p2}, Lbks;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    invoke-static {p2}, Lbks;->b(Ljava/lang/String;)Landroid/graphics/Point;

    move-result-object v0

    .line 254
    new-instance v4, Landroid/graphics/Point;

    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    .line 256
    if-nez p1, :cond_7

    .line 257
    iput p0, v4, Landroid/graphics/Point;->x:I

    .line 1276
    iget v3, v0, Landroid/graphics/Point;->x:I

    if-lez v3, :cond_6

    iget v3, v0, Landroid/graphics/Point;->y:I

    if-lez v3, :cond_6

    .line 1277
    iget v3, v0, Landroid/graphics/Point;->y:I

    mul-int/2addr v3, p0

    iget v0, v0, Landroid/graphics/Point;->x:I

    div-int v0, v3, v0

    .line 258
    :goto_1
    iput v0, v4, Landroid/graphics/Point;->y:I

    .line 267
    :goto_2
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 1301
    sget-object v0, Lbks;->d:Lbkv;

    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lbkv;->a(Ljava/lang/CharSequence;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Lbks;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v5

    .line 1305
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    .line 1306
    invoke-static {v5}, Lbks;->a(Ljava/util/List;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 1307
    add-int/lit8 v0, v0, -0x1

    .line 1311
    :cond_2
    if-lt v0, v8, :cond_c

    const/4 v5, 0x6

    if-gt v0, v5, :cond_c

    .line 1338
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    .line 1339
    sget-object v0, Lbks;->d:Lbkv;

    invoke-virtual {v0, v5}, Lbkv;->a(Ljava/lang/CharSequence;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Lbks;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    .line 1342
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_f

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v7, "image"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1343
    invoke-interface {v6, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1347
    :goto_3
    const-string v0, "/"

    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1349
    const-string v0, ""

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1352
    :cond_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v8, :cond_a

    .line 1355
    const-string v0, ""

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1362
    :cond_4
    :goto_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1363
    invoke-static {v4, v5}, Lbks;->a(Landroid/graphics/Point;Ljava/lang/StringBuilder;)V

    .line 1364
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v5}, Lbks;->a(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 1365
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v8, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1368
    if-eqz v2, :cond_5

    .line 1369
    const-string v0, "image"

    invoke-interface {v6, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 1372
    :cond_5
    invoke-virtual {v3}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "/"

    sget-object v0, Lbks;->e:Lbku;

    .line 1482
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3, v6}, Lbku;->a(Ljava/lang/StringBuilder;Ljava/lang/Iterable;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1372
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    .line 267
    :goto_6
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto/16 :goto_0

    :cond_6
    move v0, v1

    .line 1279
    goto/16 :goto_1

    .line 259
    :cond_7
    if-nez p0, :cond_9

    .line 1288
    iget v3, v0, Landroid/graphics/Point;->x:I

    if-lez v3, :cond_8

    iget v3, v0, Landroid/graphics/Point;->y:I

    if-lez v3, :cond_8

    .line 1289
    iget v3, v0, Landroid/graphics/Point;->x:I

    mul-int/2addr v3, p1

    iget v0, v0, Landroid/graphics/Point;->y:I

    div-int v0, v3, v0

    .line 260
    :goto_7
    iput v0, v4, Landroid/graphics/Point;->x:I

    .line 261
    iput p1, v4, Landroid/graphics/Point;->y:I

    goto/16 :goto_2

    :cond_8
    move v0, v1

    .line 1291
    goto :goto_7

    .line 263
    :cond_9
    iput p0, v4, Landroid/graphics/Point;->x:I

    .line 264
    iput p1, v4, Landroid/graphics/Point;->y:I

    goto/16 :goto_2

    .line 1356
    :cond_a
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v5, 0x5

    if-ne v0, v5, :cond_4

    .line 1359
    const-string v0, ""

    invoke-interface {v6, v8, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto/16 :goto_4

    .line 1372
    :cond_b
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_5

    .line 1314
    :cond_c
    if-ne v0, v2, :cond_e

    .line 2383
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 2384
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2385
    const-string v5, "="

    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 2386
    if-ltz v5, :cond_d

    .line 2387
    invoke-virtual {v0, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 2388
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 2389
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "="

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2390
    invoke-static {v4, v2}, Lbks;->a(Landroid/graphics/Point;Ljava/lang/StringBuilder;)V

    .line 2391
    invoke-static {v0, v2}, Lbks;->a(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 2396
    :goto_8
    invoke-virtual {v3}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    goto :goto_6

    .line 2393
    :cond_d
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2394
    invoke-static {v4, v2}, Lbks;->a(Landroid/graphics/Point;Ljava/lang/StringBuilder;)V

    goto :goto_8

    :cond_e
    move-object v0, v3

    .line 1318
    goto/16 :goto_6

    :cond_f
    move v2, v1

    goto/16 :goto_3
.end method

.method private static a(Ljava/lang/Iterable;)Ljava/util/ArrayList;
    .locals 3

    .prologue
    .line 430
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    .line 431
    check-cast p0, Ljava/util/Collection;

    .line 432
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 439
    :cond_0
    return-object v0

    .line 434
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 435
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 436
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 437
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private static a(Landroid/graphics/Point;Ljava/lang/StringBuilder;)V
    .locals 2

    .prologue
    .line 410
    iget v0, p0, Landroid/graphics/Point;->x:I

    if-lez v0, :cond_0

    .line 411
    const-string v0, "w"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/graphics/Point;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 413
    :cond_0
    iget v0, p0, Landroid/graphics/Point;->y:I

    if-lez v0, :cond_2

    .line 414
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 415
    const-string v0, "-"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    :cond_1
    const-string v0, "h"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/graphics/Point;->y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 419
    :cond_2
    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 3

    .prologue
    .line 400
    sget-object v0, Lbks;->b:Lbkv;

    invoke-virtual {v0, p0}, Lbkv;->a(Ljava/lang/CharSequence;)Ljava/lang/Iterable;

    move-result-object v0

    .line 401
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 402
    sget-object v2, Lbks;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-nez v2, :cond_0

    .line 403
    const-string v2, "-"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 406
    :cond_1
    return-void
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 90
    if-nez p0, :cond_0

    .line 91
    const/4 v0, 0x0

    .line 94
    :goto_0
    return v0

    .line 93
    :cond_0
    sget-object v0, Lbks;->f:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    goto :goto_0
.end method

.method private static a(Ljava/util/List;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 324
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v1, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "image"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 325
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "public"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 326
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "proxy"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 327
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, "private"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    move v0, v2

    goto :goto_0
.end method

.method private static b(Ljava/lang/String;)Landroid/graphics/Point;
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v1, 0x0

    const/4 v3, 0x1

    .line 138
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 139
    if-eqz p0, :cond_0

    invoke-static {p0}, Lbks;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v2

    .line 161
    :goto_0
    return-object v0

    .line 142
    :cond_1
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 1171
    sget-object v0, Lbks;->d:Lbkv;

    invoke-virtual {v4}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lbkv;->a(Ljava/lang/CharSequence;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Lbks;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v5

    .line 1175
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    .line 1176
    invoke-static {v5}, Lbks;->a(Ljava/util/List;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 1177
    add-int/lit8 v0, v0, -0x1

    .line 1181
    :cond_2
    if-lt v0, v7, :cond_7

    const/4 v5, 0x6

    if-gt v0, v5, :cond_7

    .line 1200
    invoke-virtual {v4}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v4

    .line 1201
    sget-object v0, Lbks;->d:Lbkv;

    invoke-virtual {v0, v4}, Lbkv;->a(Ljava/lang/CharSequence;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Lbks;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v5

    .line 1203
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v6, "image"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1204
    invoke-interface {v5, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1207
    :cond_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    .line 1208
    const-string v6, "/"

    invoke-virtual {v4, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    .line 1209
    if-nez v4, :cond_4

    const/4 v4, 0x5

    if-ne v0, v4, :cond_4

    move v4, v3

    .line 1211
    :goto_1
    if-ne v0, v7, :cond_5

    move v0, v3

    .line 1214
    :goto_2
    if-nez v4, :cond_6

    .line 1218
    if-nez v0, :cond_6

    .line 1219
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 143
    :goto_3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_a

    move-object v0, v2

    .line 144
    goto :goto_0

    :cond_4
    move v4, v1

    .line 1209
    goto :goto_1

    :cond_5
    move v0, v1

    .line 1211
    goto :goto_2

    .line 1222
    :cond_6
    const-string v0, ""

    goto :goto_3

    .line 1184
    :cond_7
    if-ne v0, v3, :cond_9

    .line 1232
    sget-object v0, Lbks;->c:Lbkv;

    invoke-virtual {v4}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lbkv;->a(Ljava/lang/CharSequence;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Lbks;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    .line 1233
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v3, :cond_8

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_3

    :cond_8
    const-string v0, ""

    goto :goto_3

    .line 1188
    :cond_9
    const-string v0, ""

    goto :goto_3

    .line 147
    :cond_a
    const-string v3, "-"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    move v0, v1

    .line 148
    :goto_4
    array-length v1, v3

    if-ge v0, v1, :cond_d

    .line 149
    aget-object v1, v3, v0

    .line 151
    :try_start_0
    const-string v4, "w"

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 152
    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v2, Landroid/graphics/Point;->x:I

    .line 148
    :cond_b
    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 153
    :cond_c
    const-string v4, "h"

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 154
    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v2, Landroid/graphics/Point;->y:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v1

    goto :goto_5

    :cond_d
    move-object v0, v2

    .line 161
    goto/16 :goto_0
.end method
