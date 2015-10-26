.class Lvf;
.super Lve;
.source "PG"

# interfaces
.implements Lui;
.implements Lum;


# static fields
.field private static final o:Ljava/util/ArrayList;

.field private static final p:Ljava/util/ArrayList;


# instance fields
.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public k:I

.field public l:Z

.field public m:Z

.field public final n:Ljava/util/ArrayList;

.field private final q:Lvo;

.field private r:Ljava/lang/Object;

.field private s:Ljava/lang/Object;

.field private t:Ljava/util/ArrayList;

.field private u:Lul;

.field private v:Luk;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 208
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 209
    const-string v1, "android.media.intent.category.LIVE_AUDIO"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 211
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 212
    sput-object v1, Lvf;->o:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 218
    const-string v1, "android.media.intent.category.LIVE_VIDEO"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 220
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 221
    sput-object v1, Lvf;->p:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lvo;)V
    .locals 3

    .prologue
    .line 249
    invoke-direct {p0, p1}, Lve;-><init>(Landroid/content/Context;)V

    .line 238
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lvf;->n:Ljava/util/ArrayList;

    .line 242
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lvf;->t:Ljava/util/ArrayList;

    .line 250
    iput-object p2, p0, Lvf;->q:Lvo;

    .line 2042
    const-string v0, "media_router"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 251
    iput-object v0, p0, Lvf;->i:Ljava/lang/Object;

    .line 252
    invoke-virtual {p0}, Lvf;->c()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lvf;->j:Ljava/lang/Object;

    .line 3111
    new-instance v0, Lun;

    invoke-direct {v0, p0}, Lun;-><init>(Lum;)V

    .line 253
    iput-object v0, p0, Lvf;->r:Ljava/lang/Object;

    .line 255
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 256
    iget-object v0, p0, Lvf;->i:Ljava/lang/Object;

    sget v2, La;->cr:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 4088
    check-cast v0, Landroid/media/MediaRouter;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaRouter;->createRouteCategory(Ljava/lang/CharSequence;Z)Landroid/media/MediaRouter$RouteCategory;

    move-result-object v0

    .line 256
    iput-object v0, p0, Lvf;->s:Ljava/lang/Object;

    .line 259
    invoke-direct {p0}, Lvf;->e()V

    .line 260
    return-void
.end method

.method private a(Lvh;)V
    .locals 3

    .prologue
    .line 571
    new-instance v0, Lto;

    iget-object v1, p1, Lvh;->b:Ljava/lang/String;

    iget-object v2, p1, Lvh;->a:Ljava/lang/Object;

    invoke-direct {p0, v2}, Lvf;->j(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lto;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    invoke-virtual {p0, p1, v0}, Lvf;->a(Lvh;Lto;)V

    .line 574
    invoke-virtual {v0}, Lto;->a()Ltn;

    move-result-object v0

    iput-object v0, p1, Lvh;->c:Ltn;

    .line 575
    return-void
.end method

.method private b(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 544
    iget-object v0, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 545
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 546
    iget-object v0, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh;

    iget-object v0, v0, Lvh;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 550
    :goto_1
    return v0

    .line 545
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 550
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method private e(Luh;)I
    .locals 3

    .prologue
    .line 554
    iget-object v0, p0, Lvf;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 555
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 556
    iget-object v0, p0, Lvf;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi;

    iget-object v0, v0, Lvi;->a:Luh;

    if-ne v0, p1, :cond_0

    move v0, v1

    .line 560
    :goto_1
    return v0

    .line 555
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 560
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method private e()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 309
    .line 310
    iget-object v0, p0, Lvf;->i:Ljava/lang/Object;

    .line 5047
    check-cast v0, Landroid/media/MediaRouter;

    .line 5048
    invoke-virtual {v0}, Landroid/media/MediaRouter;->getRouteCount()I

    move-result v3

    .line 5049
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    move v2, v1

    .line 5050
    :goto_0
    if-ge v2, v3, :cond_0

    .line 5051
    invoke-virtual {v0, v2}, Landroid/media/MediaRouter;->getRouteAt(I)Landroid/media/MediaRouter$RouteInfo;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5050
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 310
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v0, v1

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 311
    invoke-direct {p0, v1}, Lvf;->f(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 312
    goto :goto_1

    .line 313
    :cond_1
    if-eqz v0, :cond_2

    .line 314
    invoke-virtual {p0}, Lvf;->a()V

    .line 316
    :cond_2
    return-void
.end method

.method private f(Ljava/lang/Object;)Z
    .locals 9

    .prologue
    const/4 v2, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 319
    invoke-static {p1}, Lvf;->i(Ljava/lang/Object;)Lvi;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual {p0, p1}, Lvf;->g(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_4

    .line 5334
    invoke-virtual {p0}, Lvf;->d()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    move v0, v4

    .line 5335
    :goto_0
    if-eqz v0, :cond_1

    const-string v0, "DEFAULT_ROUTE"

    .line 5337
    :goto_1
    invoke-direct {p0, v0}, Lvf;->b(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_2

    .line 322
    :goto_2
    new-instance v1, Lvh;

    invoke-direct {v1, p1, v0}, Lvh;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 323
    invoke-direct {p0, v1}, Lvf;->a(Lvh;)V

    .line 324
    iget-object v0, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v4

    .line 327
    :goto_3
    return v0

    :cond_0
    move v0, v5

    .line 5334
    goto :goto_0

    .line 5335
    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "ROUTE_%08x"

    new-array v3, v4, [Ljava/lang/Object;

    invoke-direct {p0, p1}, Lvf;->j(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v5

    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move v1, v2

    .line 5341
    :goto_4
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "%s_%d"

    new-array v7, v2, [Ljava/lang/Object;

    aput-object v0, v7, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v4

    invoke-static {v3, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 5342
    invoke-direct {p0, v3}, Lvf;->b(Ljava/lang/String;)I

    move-result v6

    if-gez v6, :cond_3

    move-object v0, v3

    .line 5343
    goto :goto_2

    .line 5340
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_4
    move v0, v5

    .line 327
    goto :goto_3
.end method

.method private static i(Ljava/lang/Object;)Lvi;
    .locals 2

    .prologue
    .line 564
    .line 9156
    check-cast p0, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {p0}, Landroid/media/MediaRouter$RouteInfo;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 565
    instance-of v1, v0, Lvi;

    if-eqz v1, :cond_0

    check-cast v0, Lvi;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private j(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 582
    .line 10099
    iget-object v0, p0, Ltq;->a:Landroid/content/Context;

    .line 10116
    check-cast p1, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {p1, v0}, Landroid/media/MediaRouter$RouteInfo;->getName(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 583
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ltu;
    .locals 2

    .prologue
    .line 264
    invoke-direct {p0, p1}, Lvf;->b(Ljava/lang/String;)I

    move-result v0

    .line 265
    if-ltz v0, :cond_0

    .line 266
    iget-object v1, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh;

    .line 267
    new-instance v1, Lvg;

    iget-object v0, v0, Lvh;->a:Ljava/lang/Object;

    invoke-direct {v1, p0, v0}, Lvg;-><init>(Lvf;Ljava/lang/Object;)V

    move-object v0, v1

    .line 269
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final a()V
    .locals 4

    .prologue
    .line 523
    new-instance v2, Ltw;

    invoke-direct {v2}, Ltw;-><init>()V

    .line 525
    iget-object v0, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 526
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    .line 527
    iget-object v0, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh;

    iget-object v0, v0, Lvh;->c:Ltn;

    invoke-virtual {v2, v0}, Ltw;->a(Ltn;)Ltw;

    .line 526
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 530
    :cond_0
    invoke-virtual {v2}, Ltw;->a()Ltv;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvf;->a(Ltv;)V

    .line 531
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 391
    iget-object v0, p0, Lvf;->i:Ljava/lang/Object;

    const v1, 0x800003

    invoke-static {v0, v1}, La;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    if-eq p1, v0, :cond_1

    .line 414
    :cond_0
    :goto_0
    return-void

    .line 398
    :cond_1
    invoke-static {p1}, Lvf;->i(Ljava/lang/Object;)Lvi;

    move-result-object v0

    .line 399
    if-eqz v0, :cond_2

    .line 400
    iget-object v0, v0, Lvi;->a:Luh;

    invoke-virtual {v0}, Luh;->c()V

    goto :goto_0

    .line 404
    :cond_2
    invoke-virtual {p0, p1}, Lvf;->g(Ljava/lang/Object;)I

    move-result v0

    .line 405
    if-ltz v0, :cond_0

    .line 406
    iget-object v1, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh;

    .line 407
    iget-object v1, p0, Lvf;->q:Lvo;

    iget-object v0, v0, Lvh;->b:Ljava/lang/String;

    invoke-interface {v1, v0}, Lvo;->a(Ljava/lang/String;)Luh;

    move-result-object v0

    .line 409
    if-eqz v0, :cond_0

    .line 410
    invoke-virtual {v0}, Luh;->c()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Object;I)V
    .locals 1

    .prologue
    .line 434
    invoke-static {p1}, Lvf;->i(Ljava/lang/Object;)Lvi;

    move-result-object v0

    .line 435
    if-eqz v0, :cond_0

    .line 436
    iget-object v0, v0, Lvi;->a:Luh;

    invoke-virtual {v0, p2}, Luh;->a(I)V

    .line 438
    :cond_0
    return-void
.end method

.method public final a(Luh;)V
    .locals 3

    .prologue
    .line 450
    invoke-virtual {p1}, Luh;->d()Ltq;

    move-result-object v0

    if-eq v0, p0, :cond_1

    .line 451
    iget-object v0, p0, Lvf;->i:Ljava/lang/Object;

    iget-object v1, p0, Lvf;->s:Ljava/lang/Object;

    .line 7092
    check-cast v0, Landroid/media/MediaRouter;

    check-cast v1, Landroid/media/MediaRouter$RouteCategory;

    invoke-virtual {v0, v1}, Landroid/media/MediaRouter;->createUserRoute(Landroid/media/MediaRouter$RouteCategory;)Landroid/media/MediaRouter$UserRouteInfo;

    move-result-object v1

    .line 453
    new-instance v0, Lvi;

    invoke-direct {v0, p1, v1}, Lvi;-><init>(Luh;Ljava/lang/Object;)V

    .line 454
    invoke-static {v1, v0}, La;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 455
    iget-object v2, p0, Lvf;->r:Ljava/lang/Object;

    invoke-static {v1, v2}, La;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 456
    invoke-virtual {p0, v0}, Lvf;->a(Lvi;)V

    .line 457
    iget-object v2, p0, Lvf;->t:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    iget-object v0, p0, Lvf;->i:Ljava/lang/Object;

    .line 7097
    check-cast v0, Landroid/media/MediaRouter;

    check-cast v1, Landroid/media/MediaRouter$UserRouteInfo;

    invoke-virtual {v0, v1}, Landroid/media/MediaRouter;->addUserRoute(Landroid/media/MediaRouter$UserRouteInfo;)V

    .line 473
    :cond_0
    :goto_0
    return-void

    .line 463
    :cond_1
    iget-object v0, p0, Lvf;->i:Ljava/lang/Object;

    const v1, 0x800003

    invoke-static {v0, v1}, La;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    .line 465
    invoke-virtual {p0, v0}, Lvf;->g(Ljava/lang/Object;)I

    move-result v0

    .line 466
    if-ltz v0, :cond_0

    .line 467
    iget-object v1, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh;

    .line 468
    iget-object v0, v0, Lvh;->b:Ljava/lang/String;

    .line 7340
    iget-object v1, p1, Luh;->a:Ljava/lang/String;

    .line 468
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 469
    invoke-virtual {p1}, Luh;->c()V

    goto :goto_0
.end method

.method protected a(Lvh;Lto;)V
    .locals 2

    .prologue
    .line 588
    iget-object v0, p1, Lvh;->a:Ljava/lang/Object;

    .line 10124
    check-cast v0, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {v0}, Landroid/media/MediaRouter$RouteInfo;->getSupportedTypes()I

    move-result v0

    .line 590
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 591
    sget-object v1, Lvf;->o:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Lto;->a(Ljava/util/Collection;)Lto;

    .line 593
    :cond_0
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 594
    sget-object v0, Lvf;->p:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Lto;->a(Ljava/util/Collection;)Lto;

    .line 597
    :cond_1
    iget-object v0, p1, Lvh;->a:Ljava/lang/Object;

    .line 10136
    check-cast v0, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {v0}, Landroid/media/MediaRouter$RouteInfo;->getPlaybackType()I

    move-result v0

    .line 597
    invoke-virtual {p2, v0}, Lto;->a(I)Lto;

    .line 599
    iget-object v0, p1, Lvh;->a:Ljava/lang/Object;

    .line 10140
    check-cast v0, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {v0}, Landroid/media/MediaRouter$RouteInfo;->getPlaybackStream()I

    move-result v0

    .line 599
    invoke-virtual {p2, v0}, Lto;->b(I)Lto;

    .line 601
    iget-object v0, p1, Lvh;->a:Ljava/lang/Object;

    .line 10144
    check-cast v0, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {v0}, Landroid/media/MediaRouter$RouteInfo;->getVolume()I

    move-result v0

    .line 601
    invoke-virtual {p2, v0}, Lto;->c(I)Lto;

    .line 603
    iget-object v0, p1, Lvh;->a:Ljava/lang/Object;

    .line 10148
    check-cast v0, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {v0}, Landroid/media/MediaRouter$RouteInfo;->getVolumeMax()I

    move-result v0

    .line 603
    invoke-virtual {p2, v0}, Lto;->d(I)Lto;

    .line 605
    iget-object v0, p1, Lvh;->a:Ljava/lang/Object;

    .line 10152
    check-cast v0, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {v0}, Landroid/media/MediaRouter$RouteInfo;->getVolumeHandling()I

    move-result v0

    .line 605
    invoke-virtual {p2, v0}, Lto;->e(I)Lto;

    .line 607
    return-void
.end method

.method protected a(Lvi;)V
    .locals 2

    .prologue
    .line 610
    iget-object v0, p1, Lvi;->b:Ljava/lang/Object;

    iget-object v1, p1, Lvi;->a:Luh;

    .line 10874
    iget-object v1, v1, Luh;->c:Ljava/lang/String;

    .line 11196
    check-cast v0, Landroid/media/MediaRouter$UserRouteInfo;

    invoke-virtual {v0, v1}, Landroid/media/MediaRouter$UserRouteInfo;->setName(Ljava/lang/CharSequence;)V

    .line 612
    iget-object v0, p1, Lvi;->b:Ljava/lang/Object;

    iget-object v1, p1, Lvi;->a:Luh;

    .line 12103
    iget v1, v1, Luh;->h:I

    .line 12208
    check-cast v0, Landroid/media/MediaRouter$UserRouteInfo;

    invoke-virtual {v0, v1}, Landroid/media/MediaRouter$UserRouteInfo;->setPlaybackType(I)V

    .line 614
    iget-object v0, p1, Lvi;->b:Ljava/lang/Object;

    iget-object v1, p1, Lvi;->a:Luh;

    .line 13112
    iget v1, v1, Luh;->i:I

    .line 13212
    check-cast v0, Landroid/media/MediaRouter$UserRouteInfo;

    invoke-virtual {v0, v1}, Landroid/media/MediaRouter$UserRouteInfo;->setPlaybackStream(I)V

    .line 616
    iget-object v0, p1, Lvi;->b:Ljava/lang/Object;

    iget-object v1, p1, Lvi;->a:Luh;

    .line 14133
    iget v1, v1, Luh;->k:I

    .line 14216
    check-cast v0, Landroid/media/MediaRouter$UserRouteInfo;

    invoke-virtual {v0, v1}, Landroid/media/MediaRouter$UserRouteInfo;->setVolume(I)V

    .line 618
    iget-object v0, p1, Lvi;->b:Ljava/lang/Object;

    iget-object v1, p1, Lvi;->a:Luh;

    .line 15143
    iget v1, v1, Luh;->l:I

    .line 15220
    check-cast v0, Landroid/media/MediaRouter$UserRouteInfo;

    invoke-virtual {v0, v1}, Landroid/media/MediaRouter$UserRouteInfo;->setVolumeMax(I)V

    .line 620
    iget-object v0, p1, Lvi;->b:Ljava/lang/Object;

    iget-object v1, p1, Lvi;->a:Luh;

    .line 16123
    iget v1, v1, Luh;->j:I

    .line 16224
    check-cast v0, Landroid/media/MediaRouter$UserRouteInfo;

    invoke-virtual {v0, v1}, Landroid/media/MediaRouter$UserRouteInfo;->setVolumeHandling(I)V

    .line 622
    return-void
.end method

.method protected b()V
    .locals 3

    .prologue
    .line 625
    iget-boolean v0, p0, Lvf;->m:Z

    if-eqz v0, :cond_0

    .line 626
    const/4 v0, 0x0

    iput-boolean v0, p0, Lvf;->m:Z

    .line 627
    iget-object v0, p0, Lvf;->i:Ljava/lang/Object;

    iget-object v1, p0, Lvf;->j:Ljava/lang/Object;

    invoke-static {v0, v1}, La;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 630
    :cond_0
    iget v0, p0, Lvf;->k:I

    if-eqz v0, :cond_1

    .line 631
    const/4 v0, 0x1

    iput-boolean v0, p0, Lvf;->m:Z

    .line 632
    iget-object v0, p0, Lvf;->i:Ljava/lang/Object;

    iget v2, p0, Lvf;->k:I

    iget-object v1, p0, Lvf;->j:Ljava/lang/Object;

    .line 17077
    check-cast v0, Landroid/media/MediaRouter;

    check-cast v1, Landroid/media/MediaRouter$Callback;

    invoke-virtual {v0, v2, v1}, Landroid/media/MediaRouter;->addCallback(ILandroid/media/MediaRouter$Callback;)V

    .line 634
    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 303
    invoke-direct {p0, p1}, Lvf;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 304
    invoke-virtual {p0}, Lvf;->a()V

    .line 306
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;I)V
    .locals 1

    .prologue
    .line 442
    invoke-static {p1}, Lvf;->i(Ljava/lang/Object;)Lvi;

    move-result-object v0

    .line 443
    if-eqz v0, :cond_0

    .line 444
    iget-object v0, v0, Lvi;->a:Luh;

    invoke-virtual {v0, p2}, Luh;->b(I)V

    .line 446
    :cond_0
    return-void
.end method

.method public final b(Ltp;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 274
    .line 276
    if-eqz p1, :cond_5

    .line 277
    invoke-virtual {p1}, Ltp;->a()Ltx;

    move-result-object v1

    .line 278
    invoke-virtual {v1}, Ltx;->a()Ljava/util/List;

    move-result-object v3

    .line 279
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    move v2, v0

    move v1, v0

    .line 280
    :goto_0
    if-ge v2, v4, :cond_2

    .line 281
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 282
    const-string v5, "android.media.intent.category.LIVE_AUDIO"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 283
    or-int/lit8 v0, v1, 0x1

    .line 280
    :goto_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 284
    :cond_0
    const-string v5, "android.media.intent.category.LIVE_VIDEO"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 285
    or-int/lit8 v0, v1, 0x2

    goto :goto_1

    .line 287
    :cond_1
    const/high16 v0, 0x800000

    or-int/2addr v0, v1

    goto :goto_1

    .line 290
    :cond_2
    invoke-virtual {p1}, Ltp;->b()Z

    move-result v0

    .line 293
    :goto_2
    iget v2, p0, Lvf;->k:I

    if-ne v2, v1, :cond_3

    iget-boolean v2, p0, Lvf;->l:Z

    if-eq v2, v0, :cond_4

    .line 294
    :cond_3
    iput v1, p0, Lvf;->k:I

    .line 295
    iput-boolean v0, p0, Lvf;->l:Z

    .line 296
    invoke-virtual {p0}, Lvf;->b()V

    .line 297
    invoke-direct {p0}, Lvf;->e()V

    .line 299
    :cond_4
    return-void

    :cond_5
    move v1, v0

    goto :goto_2
.end method

.method public final b(Luh;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 477
    invoke-virtual {p1}, Luh;->d()Ltq;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 478
    invoke-direct {p0, p1}, Lvf;->e(Luh;)I

    move-result v0

    .line 479
    if-ltz v0, :cond_0

    .line 480
    iget-object v1, p0, Lvf;->t:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi;

    .line 481
    iget-object v1, v0, Lvi;->b:Ljava/lang/Object;

    invoke-static {v1, v2}, La;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 482
    iget-object v1, v0, Lvi;->b:Ljava/lang/Object;

    invoke-static {v1, v2}, La;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 483
    iget-object v1, p0, Lvf;->i:Ljava/lang/Object;

    iget-object v2, v0, Lvi;->b:Ljava/lang/Object;

    move-object v0, v1

    .line 8102
    check-cast v0, Landroid/media/MediaRouter;

    move-object v1, v2

    check-cast v1, Landroid/media/MediaRouter$UserRouteInfo;

    invoke-virtual {v0, v1}, Landroid/media/MediaRouter;->removeUserRoute(Landroid/media/MediaRouter$UserRouteInfo;)V

    .line 486
    :cond_0
    return-void
.end method

.method protected c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 637
    .line 17107
    new-instance v0, Luj;

    invoke-direct {v0, p0}, Luj;-><init>(Lui;)V

    .line 637
    return-object v0
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 350
    invoke-static {p1}, Lvf;->i(Ljava/lang/Object;)Lvi;

    move-result-object v0

    if-nez v0, :cond_0

    .line 351
    invoke-virtual {p0, p1}, Lvf;->g(Ljava/lang/Object;)I

    move-result v0

    .line 352
    if-ltz v0, :cond_0

    .line 353
    iget-object v1, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 354
    invoke-virtual {p0}, Lvf;->a()V

    .line 357
    :cond_0
    return-void
.end method

.method public final c(Luh;)V
    .locals 2

    .prologue
    .line 490
    invoke-virtual {p1}, Luh;->d()Ltq;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 491
    invoke-direct {p0, p1}, Lvf;->e(Luh;)I

    move-result v0

    .line 492
    if-ltz v0, :cond_0

    .line 493
    iget-object v1, p0, Lvf;->t:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi;

    .line 494
    invoke-virtual {p0, v0}, Lvf;->a(Lvi;)V

    .line 497
    :cond_0
    return-void
.end method

.method protected d()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 653
    iget-object v0, p0, Lvf;->v:Luk;

    if-nez v0, :cond_0

    .line 654
    new-instance v0, Luk;

    invoke-direct {v0}, Luk;-><init>()V

    iput-object v0, p0, Lvf;->v:Luk;

    .line 656
    :cond_0
    iget-object v0, p0, Lvf;->v:Luk;

    iget-object v1, p0, Lvf;->i:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Luk;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 361
    invoke-static {p1}, Lvf;->i(Ljava/lang/Object;)Lvi;

    move-result-object v0

    if-nez v0, :cond_0

    .line 362
    invoke-virtual {p0, p1}, Lvf;->g(Ljava/lang/Object;)I

    move-result v0

    .line 363
    if-ltz v0, :cond_0

    .line 364
    iget-object v1, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh;

    .line 365
    invoke-direct {p0, v0}, Lvf;->a(Lvh;)V

    .line 366
    invoke-virtual {p0}, Lvf;->a()V

    .line 369
    :cond_0
    return-void
.end method

.method public final d(Luh;)V
    .locals 2

    .prologue
    .line 501
    invoke-virtual {p1}, Luh;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 520
    :cond_0
    :goto_0
    return-void

    .line 507
    :cond_1
    invoke-virtual {p1}, Luh;->d()Ltq;

    move-result-object v0

    if-eq v0, p0, :cond_2

    .line 508
    invoke-direct {p0, p1}, Lvf;->e(Luh;)I

    move-result v0

    .line 509
    if-ltz v0, :cond_0

    .line 510
    iget-object v1, p0, Lvf;->t:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi;

    .line 511
    iget-object v0, v0, Lvi;->b:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lvf;->h(Ljava/lang/Object;)V

    goto :goto_0

    .line 8340
    :cond_2
    iget-object v0, p1, Luh;->a:Ljava/lang/String;

    .line 514
    invoke-direct {p0, v0}, Lvf;->b(Ljava/lang/String;)I

    move-result v0

    .line 515
    if-ltz v0, :cond_0

    .line 516
    iget-object v1, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh;

    .line 517
    iget-object v0, v0, Lvh;->a:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lvf;->h(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 373
    invoke-static {p1}, Lvf;->i(Ljava/lang/Object;)Lvi;

    move-result-object v0

    if-nez v0, :cond_0

    .line 374
    invoke-virtual {p0, p1}, Lvf;->g(Ljava/lang/Object;)I

    move-result v0

    .line 375
    if-ltz v0, :cond_0

    .line 376
    iget-object v1, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh;

    .line 6144
    check-cast p1, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {p1}, Landroid/media/MediaRouter$RouteInfo;->getVolume()I

    move-result v1

    .line 378
    iget-object v2, v0, Lvh;->c:Ltn;

    invoke-virtual {v2}, Ltn;->l()I

    move-result v2

    if-eq v1, v2, :cond_0

    .line 379
    new-instance v2, Lto;

    iget-object v3, v0, Lvh;->c:Ltn;

    invoke-direct {v2, v3}, Lto;-><init>(Ltn;)V

    invoke-virtual {v2, v1}, Lto;->c(I)Lto;

    move-result-object v1

    invoke-virtual {v1}, Lto;->a()Ltn;

    move-result-object v1

    iput-object v1, v0, Lvh;->c:Ltn;

    .line 383
    invoke-virtual {p0}, Lvf;->a()V

    .line 387
    :cond_0
    return-void
.end method

.method protected final g(Ljava/lang/Object;)I
    .locals 3

    .prologue
    .line 534
    iget-object v0, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 535
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 536
    iget-object v0, p0, Lvf;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh;

    iget-object v0, v0, Lvh;->a:Ljava/lang/Object;

    if-ne v0, p1, :cond_0

    move v0, v1

    .line 540
    :goto_1
    return v0

    .line 535
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 540
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method protected h(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const v5, 0x800003

    .line 645
    iget-object v0, p0, Lvf;->u:Lul;

    if-nez v0, :cond_0

    .line 646
    new-instance v0, Lul;

    invoke-direct {v0}, Lul;-><init>()V

    iput-object v0, p0, Lvf;->u:Lul;

    .line 648
    :cond_0
    iget-object v1, p0, Lvf;->u:Lul;

    iget-object v0, p0, Lvf;->i:Ljava/lang/Object;

    .line 17294
    check-cast v0, Landroid/media/MediaRouter;

    .line 17295
    check-cast p1, Landroid/media/MediaRouter$RouteInfo;

    .line 17298
    invoke-virtual {p1}, Landroid/media/MediaRouter$RouteInfo;->getSupportedTypes()I

    move-result v2

    .line 17299
    const/high16 v3, 0x800000

    and-int/2addr v2, v3

    if-nez v2, :cond_1

    .line 17305
    iget-object v2, v1, Lul;->a:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_2

    .line 17307
    :try_start_0
    iget-object v1, v1, Lul;->a:Ljava/lang/reflect/Method;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const v4, 0x800003

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 17308
    :goto_0
    return-void

    .line 17309
    :catch_0
    move-exception v1

    .line 17310
    const-string v2, "MediaRouterJellybean"

    const-string v3, "Cannot programmatically select non-user route.  Media routing may not work."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 17324
    :cond_1
    :goto_1
    invoke-virtual {v0, v5, p1}, Landroid/media/MediaRouter;->selectRoute(ILandroid/media/MediaRouter$RouteInfo;)V

    goto :goto_0

    .line 17312
    :catch_1
    move-exception v1

    .line 17313
    const-string v2, "MediaRouterJellybean"

    const-string v3, "Cannot programmatically select non-user route.  Media routing may not work."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 17317
    :cond_2
    const-string v1, "MediaRouterJellybean"

    const-string v2, "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method
