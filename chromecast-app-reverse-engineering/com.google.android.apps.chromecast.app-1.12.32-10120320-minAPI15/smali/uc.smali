.class public final Luc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lvc;
.implements Lvo;


# instance fields
.field final a:Landroid/content/Context;

.field final b:Ljava/util/ArrayList;

.field final c:Ljava/util/ArrayList;

.field final d:Ljava/util/ArrayList;

.field final e:Lve;

.field f:Luz;

.field g:Luh;

.field h:Ltu;

.field private final i:Ljava/util/ArrayList;

.field private final j:Lvd;

.field private final k:Luf;

.field private final l:Lue;

.field private final m:Z

.field private n:Luh;

.field private o:Ltp;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 1642
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1605
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Luc;->b:Ljava/util/ArrayList;

    .line 1607
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Luc;->c:Ljava/util/ArrayList;

    .line 1608
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Luc;->d:Ljava/util/ArrayList;

    .line 1610
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Luc;->i:Ljava/util/ArrayList;

    .line 1612
    new-instance v0, Lvd;

    invoke-direct {v0}, Lvd;-><init>()V

    iput-object v0, p0, Luc;->j:Lvd;

    .line 1614
    new-instance v0, Luf;

    .line 3271
    invoke-direct {v0, p0}, Luf;-><init>(Luc;)V

    .line 1614
    iput-object v0, p0, Luc;->k:Luf;

    .line 1615
    new-instance v0, Lue;

    .line 3376
    invoke-direct {v0, p0}, Lue;-><init>(Luc;)V

    .line 1615
    iput-object v0, p0, Luc;->l:Lue;

    .line 1628
    new-instance v0, Lud;

    invoke-direct {v0, p0}, Lud;-><init>(Luc;)V

    .line 1643
    iput-object p1, p0, Luc;->a:Landroid/content/Context;

    .line 1644
    invoke-static {p1}, Lbz;->a(Landroid/content/Context;)Lbz;

    .line 1645
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-static {v0}, La;->a(Landroid/app/ActivityManager;)Z

    move-result v0

    iput-boolean v0, p0, Luc;->m:Z

    .line 1652
    invoke-static {p1, p0}, Lve;->a(Landroid/content/Context;Lvo;)Lve;

    move-result-object v0

    iput-object v0, p0, Luc;->e:Lve;

    .line 1653
    iget-object v0, p0, Luc;->e:Lve;

    invoke-virtual {p0, v0}, Luc;->a(Ltq;)V

    .line 1654
    return-void
.end method

.method private a(Z)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x0

    .line 2057
    iget-object v0, p0, Luc;->n:Luh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Luc;->n:Luh;

    invoke-static {v0}, Luc;->a(Luh;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2058
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Clearing the default route because it is no longer selectable: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Luc;->n:Luh;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2060
    iput-object v5, p0, Luc;->n:Luh;

    .line 2062
    :cond_0
    iget-object v0, p0, Luc;->n:Luh;

    if-nez v0, :cond_2

    iget-object v0, p0, Luc;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2063
    iget-object v0, p0, Luc;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 13119
    invoke-virtual {v0}, Luh;->d()Ltq;

    move-result-object v1

    iget-object v4, p0, Luc;->e:Lve;

    if-ne v1, v4, :cond_5

    .line 13765
    iget-object v1, v0, Luh;->a:Ljava/lang/String;

    .line 13119
    const-string v4, "DEFAULT_ROUTE"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    .line 2064
    :goto_0
    if-eqz v1, :cond_1

    invoke-static {v0}, Luc;->a(Luh;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2065
    iput-object v0, p0, Luc;->n:Luh;

    .line 2066
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Found default route: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Luc;->n:Luh;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2073
    :cond_2
    iget-object v0, p0, Luc;->g:Luh;

    if-eqz v0, :cond_3

    iget-object v0, p0, Luc;->g:Luh;

    invoke-static {v0}, Luc;->a(Luh;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2074
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unselecting the current route because it is no longer selectable: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Luc;->g:Luh;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2076
    invoke-direct {p0, v5, v2}, Luc;->b(Luh;I)V

    .line 2079
    :cond_3
    iget-object v0, p0, Luc;->g:Luh;

    if-nez v0, :cond_6

    .line 2083
    invoke-direct {p0}, Luc;->d()Luh;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Luc;->b(Luh;I)V

    .line 2089
    :cond_4
    :goto_1
    return-void

    :cond_5
    move v1, v2

    .line 13119
    goto :goto_0

    .line 2085
    :cond_6
    if-eqz p1, :cond_4

    .line 2087
    invoke-direct {p0}, Luc;->e()V

    goto :goto_1
.end method

.method private static a(Luh;)Z
    .locals 1

    .prologue
    .line 2115
    .line 14765
    iget-object v0, p0, Luh;->o:Ltn;

    .line 2115
    if-eqz v0, :cond_0

    .line 15765
    iget-boolean v0, p0, Luh;->e:Z

    .line 2115
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 2046
    iget-object v0, p0, Luc;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 2047
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 2048
    iget-object v0, p0, Luc;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 12765
    iget-object v0, v0, Luh;->b:Ljava/lang/String;

    .line 2048
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 2052
    :goto_1
    return v0

    .line 2047
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2052
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method private b(Luh;I)V
    .locals 3

    .prologue
    .line 2125
    iget-object v0, p0, Luc;->g:Luh;

    if-eq v0, p1, :cond_5

    .line 2126
    iget-object v0, p0, Luc;->g:Luh;

    if-eqz v0, :cond_1

    .line 2127
    invoke-static {}, Ltz;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2128
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Route unselected: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Luc;->g:Luh;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " reason: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2131
    :cond_0
    iget-object v0, p0, Luc;->l:Lue;

    const/16 v1, 0x107

    iget-object v2, p0, Luc;->g:Luh;

    invoke-virtual {v0, v1, v2}, Lue;->a(ILjava/lang/Object;)V

    .line 2132
    iget-object v0, p0, Luc;->h:Ltu;

    if-eqz v0, :cond_1

    .line 2133
    iget-object v0, p0, Luc;->h:Ltu;

    invoke-virtual {v0, p2}, Ltu;->a(I)V

    .line 2134
    iget-object v0, p0, Luc;->h:Ltu;

    invoke-virtual {v0}, Ltu;->a()V

    .line 2135
    const/4 v0, 0x0

    iput-object v0, p0, Luc;->h:Ltu;

    .line 2139
    :cond_1
    iput-object p1, p0, Luc;->g:Luh;

    .line 2141
    iget-object v0, p0, Luc;->g:Luh;

    if-eqz v0, :cond_4

    .line 2142
    invoke-virtual {p1}, Luh;->d()Ltq;

    move-result-object v0

    .line 16765
    iget-object v1, p1, Luh;->a:Ljava/lang/String;

    .line 2142
    invoke-virtual {v0, v1}, Ltq;->a(Ljava/lang/String;)Ltu;

    move-result-object v0

    iput-object v0, p0, Luc;->h:Ltu;

    .line 2144
    iget-object v0, p0, Luc;->h:Ltu;

    if-eqz v0, :cond_2

    .line 2145
    iget-object v0, p0, Luc;->h:Ltu;

    invoke-virtual {v0}, Ltu;->b()V

    .line 2147
    :cond_2
    invoke-static {}, Ltz;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2148
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Route selected: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Luc;->g:Luh;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2150
    :cond_3
    iget-object v0, p0, Luc;->l:Lue;

    const/16 v1, 0x106

    iget-object v2, p0, Luc;->g:Luh;

    invoke-virtual {v0, v1, v2}, Lue;->a(ILjava/lang/Object;)V

    .line 2153
    :cond_4
    invoke-direct {p0}, Luc;->e()V

    .line 2155
    :cond_5
    return-void
.end method

.method private d()Luh;
    .locals 4

    .prologue
    .line 2096
    iget-object v0, p0, Luc;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 2097
    iget-object v1, p0, Luc;->n:Luh;

    if-eq v0, v1, :cond_0

    .line 14107
    invoke-virtual {v0}, Luh;->d()Ltq;

    move-result-object v1

    iget-object v3, p0, Luc;->e:Lve;

    if-ne v1, v3, :cond_1

    const-string v1, "android.media.intent.category.LIVE_AUDIO"

    invoke-virtual {v0, v1}, Luh;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "android.media.intent.category.LIVE_VIDEO"

    invoke-virtual {v0, v1}, Luh;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 2097
    :goto_0
    if-eqz v1, :cond_0

    invoke-static {v0}, Luc;->a(Luh;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2103
    :goto_1
    return-object v0

    .line 14107
    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 2103
    :cond_2
    iget-object v0, p0, Luc;->n:Luh;

    goto :goto_1
.end method

.method private e()V
    .locals 3

    .prologue
    .line 2238
    iget-object v0, p0, Luc;->g:Luh;

    if-eqz v0, :cond_0

    .line 2239
    iget-object v0, p0, Luc;->j:Lvd;

    iget-object v1, p0, Luc;->g:Luh;

    .line 18133
    iget v1, v1, Luh;->k:I

    .line 2239
    iput v1, v0, Lvd;->a:I

    .line 2240
    iget-object v0, p0, Luc;->j:Lvd;

    iget-object v1, p0, Luc;->g:Luh;

    .line 18143
    iget v1, v1, Luh;->l:I

    .line 2240
    iput v1, v0, Lvd;->b:I

    .line 2241
    iget-object v0, p0, Luc;->j:Lvd;

    iget-object v1, p0, Luc;->g:Luh;

    .line 19123
    iget v1, v1, Luh;->j:I

    .line 2241
    iput v1, v0, Lvd;->c:I

    .line 2242
    iget-object v0, p0, Luc;->j:Lvd;

    iget-object v1, p0, Luc;->g:Luh;

    .line 20112
    iget v1, v1, Luh;->i:I

    .line 2242
    iput v1, v0, Lvd;->d:I

    .line 2245
    iget-object v0, p0, Luc;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 2246
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 2247
    iget-object v2, p0, Luc;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2246
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2269
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ltz;
    .locals 3

    .prologue
    .line 1666
    iget-object v0, p0, Luc;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-ltz v1, :cond_1

    .line 1667
    iget-object v0, p0, Luc;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltz;

    .line 1668
    if-nez v0, :cond_0

    .line 1669
    iget-object v0, p0, Luc;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move v0, v1

    goto :goto_0

    .line 1670
    :cond_0
    iget-object v2, v0, Ltz;->b:Landroid/content/Context;

    if-ne v2, p1, :cond_2

    .line 1676
    :goto_1
    return-object v0

    .line 1674
    :cond_1
    new-instance v0, Ltz;

    invoke-direct {v0, p1}, Ltz;-><init>(Landroid/content/Context;)V

    .line 1675
    iget-object v1, p0, Luc;->b:Ljava/util/ArrayList;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public final a()Luh;
    .locals 2

    .prologue
    .line 1732
    iget-object v0, p0, Luc;->n:Luh;

    if-nez v0, :cond_0

    .line 1736
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "There is no default route.  The media router has not yet been fully initialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1739
    :cond_0
    iget-object v0, p0, Luc;->n:Luh;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Luh;
    .locals 2

    .prologue
    .line 2159
    iget-object v0, p0, Luc;->e:Lve;

    invoke-virtual {p0, v0}, Luc;->c(Ltq;)I

    move-result v0

    .line 2160
    if-ltz v0, :cond_0

    .line 2161
    iget-object v1, p0, Luc;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug;

    .line 2162
    invoke-virtual {v0, p1}, Lug;->a(Ljava/lang/String;)I

    move-result v1

    .line 2163
    if-ltz v1, :cond_0

    .line 17355
    iget-object v0, v0, Lug;->b:Ljava/util/ArrayList;

    .line 2164
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 2167
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Ltq;)V
    .locals 3

    .prologue
    .line 1863
    invoke-virtual {p0, p1}, Luc;->c(Ltq;)I

    move-result v0

    .line 1864
    if-gez v0, :cond_1

    .line 1866
    new-instance v0, Lug;

    invoke-direct {v0, p1}, Lug;-><init>(Ltq;)V

    .line 1867
    iget-object v1, p0, Luc;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1868
    invoke-static {}, Ltz;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1869
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Provider added: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1871
    :cond_0
    iget-object v1, p0, Luc;->l:Lue;

    const/16 v2, 0x201

    invoke-virtual {v1, v2, v0}, Lue;->a(ILjava/lang/Object;)V

    .line 5207
    iget-object v1, p1, Ltq;->g:Ltv;

    .line 1873
    invoke-virtual {p0, v0, v1}, Luc;->a(Lug;Ltv;)V

    .line 1875
    iget-object v0, p0, Luc;->k:Luf;

    invoke-virtual {p1, v0}, Ltq;->a(Ltr;)V

    .line 1877
    iget-object v0, p0, Luc;->o:Ltp;

    invoke-virtual {p1, v0}, Ltq;->a(Ltp;)V

    .line 1879
    :cond_1
    return-void
.end method

.method a(Lug;Ltv;)V
    .locals 16

    .prologue
    .line 1923
    .line 5415
    move-object/from16 v0, p1

    iget-object v2, v0, Lug;->c:Ltv;

    move-object/from16 v0, p2

    if-eq v2, v0, :cond_1

    .line 5416
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    iput-object v0, v1, Lug;->c:Ltv;

    .line 5417
    const/4 v2, 0x1

    .line 1923
    :goto_0
    if-eqz v2, :cond_12

    .line 1926
    const/4 v7, 0x0

    .line 1927
    const/4 v6, 0x0

    .line 1928
    if-eqz p2, :cond_d

    .line 1929
    invoke-virtual/range {p2 .. p2}, Ltv;->b()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 1930
    invoke-virtual/range {p2 .. p2}, Ltv;->a()Ljava/util/List;

    move-result-object v9

    .line 1932
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    .line 1933
    const/4 v2, 0x0

    move v8, v2

    :goto_1
    if-ge v8, v10, :cond_d

    .line 1934
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltn;

    .line 1935
    invoke-virtual {v2}, Ltn;->a()Ljava/lang/String;

    move-result-object v11

    .line 1936
    move-object/from16 v0, p1

    invoke-virtual {v0, v11}, Lug;->a(Ljava/lang/String;)I

    move-result v5

    .line 1937
    if-gez v5, :cond_4

    .line 6032
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lug;->b()Landroid/content/ComponentName;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 6034
    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Luc;->b(Ljava/lang/String;)I

    move-result v3

    if-gez v3, :cond_2

    move-object v3, v4

    .line 1940
    :goto_2
    new-instance v4, Luh;

    move-object/from16 v0, p1

    invoke-direct {v4, v0, v11, v3}, Luh;-><init>(Lug;Ljava/lang/String;Ljava/lang/String;)V

    .line 6355
    move-object/from16 v0, p1

    iget-object v5, v0, Lug;->b:Ljava/util/ArrayList;

    .line 1941
    add-int/lit8 v3, v7, 0x1

    invoke-virtual {v5, v7, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1942
    move-object/from16 v0, p0

    iget-object v5, v0, Luc;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1944
    invoke-virtual {v4, v2}, Luh;->a(Ltn;)I

    .line 1946
    invoke-static {}, Ltz;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1947
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "Route added: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1949
    :cond_0
    move-object/from16 v0, p0

    iget-object v2, v0, Luc;->l:Lue;

    const/16 v5, 0x101

    invoke-virtual {v2, v5, v4}, Lue;->a(ILjava/lang/Object;)V

    move v2, v6

    .line 1933
    :goto_3
    add-int/lit8 v4, v8, 0x1

    move v8, v4

    move v6, v2

    move v7, v3

    goto :goto_1

    .line 5419
    :cond_1
    const/4 v2, 0x0

    goto/16 :goto_0

    .line 6037
    :cond_2
    const/4 v3, 0x2

    .line 6038
    :goto_4
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v12, "%s_%d"

    const/4 v13, 0x2

    new-array v13, v13, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v4, v13, v14

    const/4 v14, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v13, v14

    invoke-static {v5, v12, v13}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 6039
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Luc;->b(Ljava/lang/String;)I

    move-result v12

    if-gez v12, :cond_3

    move-object v3, v5

    .line 6040
    goto :goto_2

    .line 6037
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 1950
    :cond_4
    if-ge v5, v7, :cond_5

    .line 1951
    const-string v3, "MediaRouter"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Ignoring route descriptor with duplicate id: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v2, v6

    move v3, v7

    goto :goto_3

    .line 7355
    :cond_5
    move-object/from16 v0, p1

    iget-object v3, v0, Lug;->b:Ljava/util/ArrayList;

    .line 1955
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luh;

    .line 8355
    move-object/from16 v0, p1

    iget-object v11, v0, Lug;->b:Ljava/util/ArrayList;

    .line 1956
    add-int/lit8 v4, v7, 0x1

    invoke-static {v11, v5, v7}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 1959
    invoke-virtual {v3, v2}, Luh;->a(Ltn;)I

    move-result v2

    .line 1961
    if-eqz v2, :cond_13

    .line 1962
    and-int/lit8 v5, v2, 0x1

    if-eqz v5, :cond_7

    .line 1963
    invoke-static {}, Ltz;->g()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 1964
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "Route changed: "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1966
    :cond_6
    move-object/from16 v0, p0

    iget-object v5, v0, Luc;->l:Lue;

    const/16 v7, 0x103

    invoke-virtual {v5, v7, v3}, Lue;->a(ILjava/lang/Object;)V

    .line 1969
    :cond_7
    and-int/lit8 v5, v2, 0x2

    if-eqz v5, :cond_9

    .line 1970
    invoke-static {}, Ltz;->g()Z

    move-result v5

    if-eqz v5, :cond_8

    .line 1971
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "Route volume changed: "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1973
    :cond_8
    move-object/from16 v0, p0

    iget-object v5, v0, Luc;->l:Lue;

    const/16 v7, 0x104

    invoke-virtual {v5, v7, v3}, Lue;->a(ILjava/lang/Object;)V

    .line 1976
    :cond_9
    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_b

    .line 1977
    invoke-static {}, Ltz;->g()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 1978
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "Route presentation display changed: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1981
    :cond_a
    move-object/from16 v0, p0

    iget-object v2, v0, Luc;->l:Lue;

    const/16 v5, 0x105

    invoke-virtual {v2, v5, v3}, Lue;->a(ILjava/lang/Object;)V

    .line 1984
    :cond_b
    move-object/from16 v0, p0

    iget-object v2, v0, Luc;->g:Luh;

    if-ne v3, v2, :cond_13

    .line 1985
    const/4 v2, 0x1

    move v3, v4

    goto/16 :goto_3

    .line 1991
    :cond_c
    const-string v2, "MediaRouter"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Ignoring invalid provider descriptor: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p2

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 9355
    :cond_d
    move-object/from16 v0, p1

    iget-object v2, v0, Lug;->b:Ljava/util/ArrayList;

    .line 1996
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    move v3, v2

    :goto_5
    if-lt v3, v7, :cond_e

    .line 10355
    move-object/from16 v0, p1

    iget-object v2, v0, Lug;->b:Ljava/util/ArrayList;

    .line 1998
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luh;

    .line 1999
    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Luh;->a(Ltn;)I

    .line 2001
    move-object/from16 v0, p0

    iget-object v4, v0, Luc;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1996
    add-int/lit8 v2, v3, -0x1

    move v3, v2

    goto :goto_5

    .line 2005
    :cond_e
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Luc;->a(Z)V

    .line 11355
    move-object/from16 v0, p1

    iget-object v2, v0, Lug;->b:Ljava/util/ArrayList;

    .line 2012
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    move v3, v2

    :goto_6
    if-lt v3, v7, :cond_10

    .line 12355
    move-object/from16 v0, p1

    iget-object v2, v0, Lug;->b:Ljava/util/ArrayList;

    .line 2013
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luh;

    .line 2014
    invoke-static {}, Ltz;->g()Z

    move-result v4

    if-eqz v4, :cond_f

    .line 2015
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Route removed: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2017
    :cond_f
    move-object/from16 v0, p0

    iget-object v4, v0, Luc;->l:Lue;

    const/16 v5, 0x102

    invoke-virtual {v4, v5, v2}, Lue;->a(ILjava/lang/Object;)V

    .line 2012
    add-int/lit8 v2, v3, -0x1

    move v3, v2

    goto :goto_6

    .line 2021
    :cond_10
    invoke-static {}, Ltz;->g()Z

    move-result v2

    if-eqz v2, :cond_11

    .line 2022
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Provider changed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2024
    :cond_11
    move-object/from16 v0, p0

    iget-object v2, v0, Luc;->l:Lue;

    const/16 v3, 0x203

    move-object/from16 v0, p1

    invoke-virtual {v2, v3, v0}, Lue;->a(ILjava/lang/Object;)V

    .line 2026
    :cond_12
    return-void

    :cond_13
    move v2, v6

    move v3, v4

    goto/16 :goto_3
.end method

.method public final a(Luh;I)V
    .locals 3

    .prologue
    .line 1758
    iget-object v0, p0, Luc;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1759
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ignoring attempt to select removed route: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1768
    :goto_0
    return-void

    .line 3765
    :cond_0
    iget-boolean v0, p1, Luh;->e:Z

    .line 1762
    if-nez v0, :cond_1

    .line 1763
    const-string v0, "MediaRouter"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Ignoring attempt to select disabled route: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1767
    :cond_1
    invoke-direct {p0, p1, p2}, Luc;->b(Luh;I)V

    goto :goto_0
.end method

.method public final a(Ltx;I)Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1771
    invoke-virtual {p1}, Ltx;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 1794
    :goto_0
    return v0

    .line 1776
    :cond_0
    and-int/lit8 v0, p2, 0x2

    if-nez v0, :cond_1

    iget-boolean v0, p0, Luc;->m:Z

    if-eqz v0, :cond_1

    move v0, v2

    .line 1777
    goto :goto_0

    .line 1781
    :cond_1
    iget-object v0, p0, Luc;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v3, v1

    .line 1782
    :goto_1
    if-ge v3, v4, :cond_4

    .line 1783
    iget-object v0, p0, Luc;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 1784
    and-int/lit8 v5, p2, 0x1

    if-eqz v5, :cond_2

    invoke-virtual {v0}, Luh;->b()Z

    move-result v5

    if-nez v5, :cond_3

    .line 1788
    :cond_2
    invoke-virtual {v0, p1}, Luh;->a(Ltx;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    .line 1789
    goto :goto_0

    .line 1782
    :cond_3
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    :cond_4
    move v0, v1

    .line 1794
    goto :goto_0
.end method

.method public final b()Luh;
    .locals 2

    .prologue
    .line 1743
    iget-object v0, p0, Luc;->g:Luh;

    if-nez v0, :cond_0

    .line 1747
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "There is no currently selected route.  The media router has not yet been fully initialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1750
    :cond_0
    iget-object v0, p0, Luc;->g:Luh;

    return-object v0
.end method

.method public final b(Ltq;)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 1883
    invoke-virtual {p0, p1}, Luc;->c(Ltq;)I

    move-result v1

    .line 1884
    if-ltz v1, :cond_1

    .line 1886
    invoke-virtual {p1, v2}, Ltq;->a(Ltr;)V

    .line 1888
    invoke-virtual {p1, v2}, Ltq;->a(Ltp;)V

    .line 1890
    iget-object v0, p0, Luc;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug;

    .line 1891
    invoke-virtual {p0, v0, v2}, Luc;->a(Lug;Ltv;)V

    .line 1893
    invoke-static {}, Ltz;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1894
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Provider removed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1896
    :cond_0
    iget-object v2, p0, Luc;->l:Lue;

    const/16 v3, 0x202

    invoke-virtual {v2, v3, v0}, Lue;->a(ILjava/lang/Object;)V

    .line 1897
    iget-object v0, p0, Luc;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1899
    :cond_1
    return-void
.end method

.method c(Ltq;)I
    .locals 3

    .prologue
    .line 1912
    iget-object v0, p0, Luc;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 1913
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 1914
    iget-object v0, p0, Luc;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug;

    .line 5355
    iget-object v0, v0, Lug;->a:Ltq;

    .line 1914
    if-ne v0, p1, :cond_0

    move v0, v1

    .line 1918
    :goto_1
    return v0

    .line 1913
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1918
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public final c()V
    .locals 11

    .prologue
    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 1799
    .line 1801
    new-instance v8, Lty;

    invoke-direct {v8}, Lty;-><init>()V

    .line 1802
    iget-object v0, p0, Luc;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v5

    move v4, v5

    :goto_0
    add-int/lit8 v7, v0, -0x1

    if-ltz v7, :cond_5

    .line 1803
    iget-object v0, p0, Luc;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltz;

    .line 1804
    if-nez v0, :cond_0

    .line 1805
    iget-object v0, p0, Luc;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move v0, v7

    goto :goto_0

    .line 1807
    :cond_0
    iget-object v1, v0, Ltz;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v9

    move v6, v5

    .line 1808
    :goto_1
    if-ge v6, v9, :cond_4

    .line 1809
    iget-object v1, v0, Ltz;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lub;

    .line 1810
    iget-object v10, v1, Lub;->c:Ltx;

    invoke-virtual {v8, v10}, Lty;->a(Ltx;)Lty;

    .line 1811
    iget v10, v1, Lub;->d:I

    and-int/lit8 v10, v10, 0x1

    if-eqz v10, :cond_1

    move v2, v3

    move v4, v3

    .line 1815
    :cond_1
    iget v10, v1, Lub;->d:I

    and-int/lit8 v10, v10, 0x4

    if-eqz v10, :cond_2

    .line 1816
    iget-boolean v10, p0, Luc;->m:Z

    if-nez v10, :cond_2

    move v4, v3

    .line 1820
    :cond_2
    iget v1, v1, Lub;->d:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_3

    move v4, v3

    .line 1808
    :cond_3
    add-int/lit8 v1, v6, 0x1

    move v6, v1

    goto :goto_1

    :cond_4
    move v0, v7

    .line 1825
    goto :goto_0

    .line 1826
    :cond_5
    if-eqz v4, :cond_7

    invoke-virtual {v8}, Lty;->a()Ltx;

    move-result-object v0

    .line 1829
    :goto_2
    iget-object v1, p0, Luc;->o:Ltp;

    if-eqz v1, :cond_8

    iget-object v1, p0, Luc;->o:Ltp;

    invoke-virtual {v1}, Ltp;->a()Ltx;

    move-result-object v1

    invoke-virtual {v1, v0}, Ltx;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Luc;->o:Ltp;

    invoke-virtual {v1}, Ltp;->b()Z

    move-result v1

    if-ne v1, v2, :cond_8

    .line 1859
    :cond_6
    return-void

    .line 1826
    :cond_7
    sget-object v0, Ltx;->c:Ltx;

    goto :goto_2

    .line 1834
    :cond_8
    invoke-virtual {v0}, Ltx;->c()Z

    move-result v1

    if-eqz v1, :cond_a

    if-nez v2, :cond_a

    .line 1836
    iget-object v0, p0, Luc;->o:Ltp;

    if-eqz v0, :cond_6

    .line 1839
    const/4 v0, 0x0

    iput-object v0, p0, Luc;->o:Ltp;

    .line 1844
    :goto_3
    invoke-static {}, Ltz;->g()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1845
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Updated discovery request: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Luc;->o:Ltp;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1855
    :cond_9
    iget-object v0, p0, Luc;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v1, v5

    .line 1856
    :goto_4
    if-ge v1, v2, :cond_6

    .line 1857
    iget-object v0, p0, Luc;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lug;

    .line 4355
    iget-object v0, v0, Lug;->a:Ltq;

    .line 1857
    iget-object v3, p0, Luc;->o:Ltp;

    invoke-virtual {v0, v3}, Ltq;->a(Ltp;)V

    .line 1856
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    .line 1842
    :cond_a
    new-instance v1, Ltp;

    invoke-direct {v1, v0, v2}, Ltp;-><init>(Ltx;Z)V

    iput-object v1, p0, Luc;->o:Ltp;

    goto :goto_3
.end method
