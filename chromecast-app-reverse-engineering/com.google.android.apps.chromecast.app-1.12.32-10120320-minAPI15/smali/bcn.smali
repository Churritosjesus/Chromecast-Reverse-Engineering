.class public final Lbcn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lalt;
.implements Lbcm;


# static fields
.field public static final a:Ljava/util/Comparator;


# instance fields
.field public b:Ljava/util/concurrent/ScheduledFuture;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Set;

.field public final e:Ljava/util/Set;

.field private f:Ljava/util/concurrent/ScheduledExecutorService;

.field private final g:I

.field private final h:Lblp;

.field private final i:Latf;

.field private j:Ljava/lang/String;

.field private final k:Ljava/util/Map;

.field private final l:Ljava/util/Set;

.field private final m:Laea;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 63
    new-instance v0, Lbco;

    invoke-direct {v0}, Lbco;-><init>()V

    sput-object v0, Lbcn;->a:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Latf;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lbcn;->f:Ljava/util/concurrent/ScheduledExecutorService;

    .line 85
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-static {v0}, Lblf;->g(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lbcn;->g:I

    .line 87
    new-instance v0, Lblp;

    const-string v1, "OffersManager"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbcn;->h:Lblp;

    .line 105
    new-instance v0, Lbcp;

    invoke-direct {v0, p0}, Lbcp;-><init>(Lbcn;)V

    iput-object v0, p0, Lbcn;->m:Laea;

    .line 133
    iput-object p1, p0, Lbcn;->i:Latf;

    .line 134
    iput-object p2, p0, Lbcn;->j:Ljava/lang/String;

    .line 135
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbcn;->k:Ljava/util/Map;

    .line 136
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lbcn;->l:Ljava/util/Set;

    .line 137
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lbcn;->e:Ljava/util/Set;

    .line 138
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lbcn;->c:Ljava/util/Set;

    .line 141
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "hiddenOffers"

    const-string v2, ""

    .line 142
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 143
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lbcn;->d:Ljava/util/Set;

    .line 144
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 145
    iget-object v1, p0, Lbcn;->d:Ljava/util/Set;

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 148
    :cond_0
    if-eqz p3, :cond_1

    const-string v0, "getAppsOffers"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    const-string v0, "getAppsOffers"

    .line 150
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 151
    iget-object v1, p0, Lbcn;->c:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 157
    :goto_0
    return-void

    .line 155
    :cond_1
    invoke-direct {p0}, Lbcn;->b()V

    goto :goto_0
.end method

.method static synthetic a(Lbcn;)Lblp;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lbcn;->h:Lblp;

    return-object v0
.end method

.method static synthetic b(Lbcn;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lbcn;->c:Ljava/util/Set;

    return-object v0
.end method

.method private declared-synchronized b()V
    .locals 4

    .prologue
    .line 252
    monitor-enter p0

    :try_start_0
    new-instance v0, Ldbl;

    invoke-direct {v0}, Ldbl;-><init>()V

    .line 254
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lbcn;->l:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    .line 255
    iget-object v1, p0, Lbcn;->l:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    iput-object v1, v0, Ldbl;->b:[Ljava/lang/String;

    .line 256
    iget-object v1, p0, Lbcn;->l:Ljava/util/Set;

    iget-object v2, v0, Ldbl;->b:[Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 257
    iget-object v1, p0, Lbcn;->l:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 259
    new-instance v1, Lbcr;

    invoke-direct {v1, p0}, Lbcr;-><init>(Lbcn;)V

    .line 267
    iget-object v2, p0, Lbcn;->i:Latf;

    new-instance v3, Lbcs;

    invoke-direct {v3, p0, v0, v1}, Lbcs;-><init>(Lbcn;Ldbl;Ladz;)V

    invoke-virtual {v2, v3, v1}, Latf;->a(Latr;Ladz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    monitor-exit p0

    return-void

    .line 252
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic c(Lbcn;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lbcn;->k:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic d(Lbcn;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lbcn;->d:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic e(Lbcn;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lbcn;->b()V

    return-void
.end method

.method static synthetic f(Lbcn;)Laea;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lbcn;->m:Laea;

    return-object v0
.end method

.method static synthetic g(Lbcn;)Latf;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lbcn;->i:Latf;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 195
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lbcn;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    iget-object v0, p0, Lbcn;->c:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 197
    sget-object v0, Lbcn;->a:Ljava/util/Comparator;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 198
    iget-object v0, p0, Lbcn;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbct;

    .line 199
    invoke-interface {v0, v1}, Lbct;->a(Ljava/util/List;)V

    goto :goto_0

    .line 201
    :cond_0
    return-void
.end method

.method public final declared-synchronized a(Laow;)V
    .locals 5

    .prologue
    .line 225
    monitor-enter p0

    .line 1622
    :try_start_0
    iget-object v0, p1, Laow;->q:Ljava/lang/String;

    .line 226
    iget-object v1, p0, Lbcn;->k:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-eqz v1, :cond_0

    .line 244
    :goto_0
    monitor-exit p0

    return-void

    .line 230
    :cond_0
    :try_start_1
    iget-object v1, p0, Lbcn;->k:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    iget-object v1, p0, Lbcn;->l:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 233
    iget-object v0, p0, Lbcn;->b:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    .line 235
    iget-object v0, p0, Lbcn;->b:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 237
    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lbcn;->l:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 238
    iget-object v0, p0, Lbcn;->f:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lbcq;

    invoke-direct {v1, p0}, Lbcq;-><init>(Lbcn;)V

    iget v2, p0, Lbcn;->g:I

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lbcn;->b:Ljava/util/concurrent/ScheduledFuture;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 225
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lbcd;)V
    .locals 6

    .prologue
    .line 293
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    .line 2139
    new-instance v1, Lbcu;

    iget-object v2, p1, Lbcd;->a:Ldbk;

    iget-object v2, v2, Ldbk;->c:Ljava/lang/String;

    iget-object v3, p1, Lbcd;->a:Ldbk;

    iget-object v3, v3, Ldbk;->a:Ljava/lang/String;

    new-instance v4, Lbcf;

    invoke-direct {v4, p1}, Lbcf;-><init>(Lbcd;)V

    new-instance v5, Lbcg;

    invoke-direct {v5, p1, v0}, Lbcg;-><init>(Lbcd;Landroid/content/Context;)V

    invoke-direct {v1, v2, v3, v4, v5}, Lbcu;-><init>(Ljava/lang/String;Ljava/lang/String;Laea;Ladz;)V

    .line 294
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 2287
    iget-object v3, v1, Lads;->b:Ljava/lang/String;

    .line 294
    aput-object v3, v0, v2

    .line 295
    iget-object v0, p0, Lbcn;->i:Latf;

    invoke-virtual {v0, v1}, Latf;->a(Lads;)V

    .line 296
    return-void
.end method

.method public final a(Lbcd;I)V
    .locals 2

    .prologue
    .line 283
    iget-object v0, p0, Lbcn;->d:Ljava/util/Set;

    invoke-virtual {p1}, Lbcd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 284
    iget-object v0, p0, Lbcn;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    iget-object v0, p0, Lbcn;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbct;

    .line 286
    invoke-interface {v0, p1, p2}, Lbct;->a(Lbcd;I)V

    goto :goto_0

    .line 289
    :cond_0
    return-void
.end method

.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 210
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lbcn;->j:Ljava/lang/String;

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 211
    iput-object p1, p0, Lbcn;->j:Ljava/lang/String;

    .line 213
    iget-object v0, p0, Lbcn;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 214
    iget-object v0, p0, Lbcn;->l:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 215
    iget-object v0, p0, Lbcn;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 216
    invoke-virtual {p0}, Lbcn;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    :cond_0
    monitor-exit p0

    return-void

    .line 210
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
