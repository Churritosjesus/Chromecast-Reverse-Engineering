.class final Lbrn;
.super Lbra;


# instance fields
.field private a:Z

.field private final b:Lbrk;

.field private final c:Lbqn;

.field private final e:Lbqm;

.field private final f:Lbrf;

.field private g:J

.field private final h:Lbsb;

.field private final i:Lbsb;

.field private final j:Lbqr;

.field private k:J

.field private l:Z


# direct methods
.method protected constructor <init>(Lbrb;Lbrd;)V
    .locals 2

    .prologue
    .line 0
    invoke-direct {p0, p1}, Lbra;-><init>(Lbrb;)V

    invoke-static {p2}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lbrn;->g:J

    .line 1000
    new-instance v0, Lbqm;

    invoke-direct {v0, p1}, Lbqm;-><init>(Lbrb;)V

    .line 0
    iput-object v0, p0, Lbrn;->e:Lbqm;

    .line 2000
    new-instance v0, Lbrk;

    invoke-direct {v0, p1}, Lbrk;-><init>(Lbrb;)V

    .line 0
    iput-object v0, p0, Lbrn;->b:Lbrk;

    .line 3000
    new-instance v0, Lbqn;

    invoke-direct {v0, p1}, Lbqn;-><init>(Lbrb;)V

    .line 0
    iput-object v0, p0, Lbrn;->c:Lbqn;

    invoke-static {p1}, Lbrd;->d(Lbrb;)Lbrf;

    move-result-object v0

    iput-object v0, p0, Lbrn;->f:Lbrf;

    new-instance v0, Lbqr;

    invoke-virtual {p0}, Lbrn;->k()Lcac;

    move-result-object v1

    invoke-direct {v0, v1}, Lbqr;-><init>(Lcac;)V

    iput-object v0, p0, Lbrn;->j:Lbqr;

    new-instance v0, Lbro;

    invoke-direct {v0, p0, p1}, Lbro;-><init>(Lbrn;Lbrb;)V

    iput-object v0, p0, Lbrn;->h:Lbsb;

    new-instance v0, Lbrp;

    invoke-direct {v0, p0, p1}, Lbrp;-><init>(Lbrn;Lbrb;)V

    iput-object v0, p0, Lbrn;->i:Lbsb;

    return-void
.end method

.method private a(Lbre;Lcpf;)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    .line 0
    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lbpd;

    .line 51017
    iget-object v0, p0, Lbqz;->d:Lbrb;

    .line 0
    invoke-direct {v1, v0}, Lbpd;-><init>(Lbrb;)V

    .line 51018
    iget-object v2, p1, Lbre;->c:Ljava/lang/String;

    .line 51019
    invoke-static {v2}, La;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 51020
    invoke-static {v2}, Lbpi;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 51021
    iget-object v0, v1, Lcow;->h:Lcou;

    .line 51022
    iget-object v0, v0, Lcou;->i:Ljava/util/List;

    .line 51020
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcpd;

    invoke-interface {v0}, Lcpd;->a()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/ListIterator;->remove()V

    goto :goto_0

    .line 51023
    :cond_1
    iget-object v0, v1, Lcow;->h:Lcou;

    .line 51024
    iget-object v0, v0, Lcou;->i:Ljava/util/List;

    .line 51019
    new-instance v3, Lbpi;

    iget-object v4, v1, Lbpd;->a:Lbrb;

    invoke-direct {v3, v4, v2}, Lbpi;-><init>(Lbrb;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51025
    iget-boolean v0, p1, Lbre;->d:Z

    .line 51026
    iput-boolean v0, v1, Lbpd;->b:Z

    .line 0
    invoke-virtual {v1}, Lbpd;->a()Lcou;

    move-result-object v5

    const-class v0, Lbpy;

    invoke-virtual {v5, v0}, Lcou;->b(Ljava/lang/Class;)Lcov;

    move-result-object v0

    check-cast v0, Lbpy;

    const-string v1, "data"

    .line 51027
    iput-object v1, v0, Lbpy;->a:Ljava/lang/String;

    .line 51028
    iput-boolean v8, v0, Lbpy;->g:Z

    .line 0
    invoke-virtual {v5, p2}, Lcou;->a(Lcov;)V

    const-class v1, Lbpx;

    invoke-virtual {v5, v1}, Lcou;->b(Ljava/lang/Class;)Lcov;

    move-result-object v1

    check-cast v1, Lbpx;

    const-class v2, Lcpe;

    invoke-virtual {v5, v2}, Lcou;->b(Ljava/lang/Class;)Lcov;

    move-result-object v2

    check-cast v2, Lcpe;

    .line 51029
    iget-object v3, p1, Lbre;->f:Ljava/util/Map;

    .line 0
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v7, "an"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 51030
    iput-object v3, v2, Lcpe;->a:Ljava/lang/String;

    goto :goto_1

    .line 0
    :cond_2
    const-string v7, "av"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 51031
    iput-object v3, v2, Lcpe;->b:Ljava/lang/String;

    goto :goto_1

    .line 0
    :cond_3
    const-string v7, "aid"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 51032
    iput-object v3, v2, Lcpe;->c:Ljava/lang/String;

    goto :goto_1

    .line 0
    :cond_4
    const-string v7, "aiid"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 51033
    iput-object v3, v2, Lcpe;->d:Ljava/lang/String;

    goto :goto_1

    .line 0
    :cond_5
    const-string v7, "uid"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 51034
    iput-object v3, v0, Lbpy;->c:Ljava/lang/String;

    goto :goto_1

    .line 51036
    :cond_6
    invoke-static {v4}, La;->f(Ljava/lang/String;)Ljava/lang/String;

    if-eqz v4, :cond_7

    const-string v7, "&"

    invoke-virtual {v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v4, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    :cond_7
    const-string v7, "Name can not be empty or \"&\""

    invoke-static {v4, v7}, La;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 51035
    iget-object v7, v1, Lbpx;->a:Ljava/util/Map;

    invoke-interface {v7, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 0
    :cond_8
    const-string v0, "Sending installation campaign to"

    .line 51037
    iget-object v1, p1, Lbre;->c:Ljava/lang/String;

    .line 0
    invoke-virtual {p0, v0, v1, p2}, Lbrn;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v0

    invoke-virtual {v0}, Lbqp;->b()J

    move-result-wide v0

    .line 51038
    iput-wide v0, v5, Lcou;->e:J

    .line 51039
    invoke-virtual {v5}, Lcou;->b()Lcox;

    move-result-object v0

    .line 51041
    iget-boolean v1, v5, Lcou;->g:Z

    .line 51040
    if-eqz v1, :cond_9

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Measurement prototype can\'t be submitted"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51042
    :cond_9
    iget-boolean v1, v5, Lcou;->c:Z

    .line 51040
    if-eqz v1, :cond_a

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Measurement can only be submitted once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    invoke-virtual {v5}, Lcou;->a()Lcou;

    move-result-object v1

    .line 51043
    iget-object v2, v1, Lcou;->b:Lcac;

    invoke-interface {v2}, Lcac;->b()J

    move-result-wide v2

    iput-wide v2, v1, Lcou;->f:J

    iget-wide v2, v1, Lcou;->e:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_b

    iget-wide v2, v1, Lcou;->e:J

    iput-wide v2, v1, Lcou;->d:J

    :goto_2
    iput-boolean v8, v1, Lcou;->c:Z

    .line 51040
    iget-object v2, v0, Lcox;->b:Lcoz;

    new-instance v3, Lcoy;

    invoke-direct {v3, v0, v1}, Lcoy;-><init>(Lcox;Lcou;)V

    invoke-virtual {v2, v3}, Lcoz;->execute(Ljava/lang/Runnable;)V

    .line 0
    return-void

    .line 51043
    :cond_b
    iget-object v2, v1, Lcou;->b:Lcac;

    invoke-interface {v2}, Lcac;->a()J

    move-result-wide v2

    iput-wide v2, v1, Lcou;->d:J

    goto :goto_2
.end method

.method static synthetic a(Lbrn;)V
    .locals 4

    .prologue
    .line 0
    .line 51045
    :try_start_0
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->f()I

    invoke-virtual {p0}, Lbrn;->g()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lbrn;->i:Lbsb;

    const-wide/32 v2, 0x5265c00

    invoke-virtual {v0, v2, v3}, Lbsb;->a(J)V

    .line 0
    return-void

    .line 51045
    :catch_0
    move-exception v0

    const-string v1, "Failed to delete stale hits"

    invoke-virtual {p0, v1, v0}, Lbrn;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private g(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Lbrn;->l()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private h()V
    .locals 4

    .prologue
    .line 0
    iget-boolean v0, p0, Lbrn;->l:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lbrz;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbrn;->f:Lbrf;

    invoke-virtual {v0}, Lbrf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 19000
    sget-object v0, Lbqd;->C:Lbqe;

    invoke-virtual {v0}, Lbqe;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 0
    iget-object v2, p0, Lbrn;->j:Lbqr;

    invoke-virtual {v2, v0, v1}, Lbqr;->a(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbrn;->j:Lbqr;

    invoke-virtual {v0}, Lbqr;->a()V

    const-string v0, "Connecting to service"

    invoke-virtual {p0, v0}, Lbrn;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lbrn;->f:Lbrf;

    invoke-virtual {v0}, Lbrf;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Connected to service"

    invoke-virtual {p0, v0}, Lbrn;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lbrn;->j:Lbqr;

    .line 20000
    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lbqr;->a:J

    .line 0
    invoke-virtual {p0}, Lbrn;->e()V

    goto :goto_0
.end method

.method private i()Z
    .locals 12

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 0
    invoke-static {}, Lcox;->b()V

    invoke-virtual {p0}, Lbrn;->r()V

    const-string v0, "Dispatching a batch of local hits"

    invoke-virtual {p0, v0}, Lbrn;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lbrn;->f:Lbrf;

    invoke-virtual {v0}, Lbrf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 41000
    sget-boolean v0, Lbyk;->a:Z

    .line 0
    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    iget-object v3, p0, Lbrn;->c:Lbqn;

    invoke-virtual {v3}, Lbqn;->b()Z

    move-result v3

    if-nez v3, :cond_1

    :goto_1
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    const-string v0, "No network or service available. Will retry later"

    invoke-virtual {p0, v0}, Lbrn;->b(Ljava/lang/String;)V

    :goto_2
    return v2

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1

    :cond_2
    invoke-static {}, Lbrz;->f()I

    move-result v0

    invoke-static {}, Lbrz;->g()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-long v6, v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v4, 0x0

    :goto_3
    :try_start_0
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->b()V

    invoke-interface {v3}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0, v6, v7}, Lbrk;->a(J)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Store is empty, nothing to dispatch"

    invoke-virtual {p0, v0}, Lbrn;->b(Ljava/lang/String;)V

    invoke-direct {p0}, Lbrn;->v()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->c()V

    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->d()V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V

    goto :goto_2

    :cond_3
    :try_start_3
    const-string v0, "Hits loaded from store. count"

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lbrn;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbsi;

    .line 42000
    iget-wide v10, v0, Lbsi;->c:J

    .line 0
    cmp-long v0, v10, v4

    if-nez v0, :cond_4

    const-string v0, "Database contains successfully uploaded hit"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0, v0, v1, v3}, Lbrn;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->c()V

    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->d()V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1

    goto/16 :goto_2

    :catch_1
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V

    goto/16 :goto_2

    :catch_2
    move-exception v0

    :try_start_6
    const-string v1, "Failed to read hits from persisted store"

    invoke-virtual {p0, v1, v0}, Lbrn;->d(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->c()V

    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->d()V
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_3

    goto/16 :goto_2

    :catch_3
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V

    goto/16 :goto_2

    :cond_5
    :try_start_8
    iget-object v0, p0, Lbrn;->f:Lbrf;

    invoke-virtual {v0}, Lbrf;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 43000
    sget-boolean v0, Lbyk;->a:Z

    .line 0
    if-nez v0, :cond_6

    const-string v0, "Service connected, sending hits to the service"

    invoke-virtual {p0, v0}, Lbrn;->b(Ljava/lang/String;)V

    :goto_4
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbsi;

    iget-object v1, p0, Lbrn;->f:Lbrf;

    invoke-virtual {v1, v0}, Lbrf;->a(Lbsi;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 44000
    iget-wide v10, v0, Lbsi;->c:J

    .line 0
    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    invoke-interface {v8, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const-string v1, "Hit sent do device AnalyticsService for delivery"

    invoke-virtual {p0, v1, v0}, Lbrn;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    iget-object v1, p0, Lbrn;->b:Lbrk;

    .line 45000
    iget-wide v10, v0, Lbsi;->c:J

    .line 0
    invoke-virtual {v1, v10, v11}, Lbrk;->b(J)V

    .line 46000
    iget-wide v0, v0, Lbsi;->c:J

    .line 0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_4

    :catch_4
    move-exception v0

    :try_start_a
    const-string v1, "Failed to remove hit that was send for delivery"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->c()V

    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->d()V
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_5

    goto/16 :goto_2

    :catch_5
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V

    goto/16 :goto_2

    :cond_6
    move-wide v0, v4

    :try_start_c
    iget-object v4, p0, Lbrn;->c:Lbqn;

    invoke-virtual {v4}, Lbqn;->b()Z

    move-result v4

    if-eqz v4, :cond_8

    iget-object v4, p0, Lbrn;->c:Lbqn;

    invoke-virtual {v4, v8}, Lbqn;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-wide v4, v0

    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    goto :goto_5

    :cond_7
    invoke-interface {v8, v9}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :try_start_d
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0, v9}, Lbrk;->a(Ljava/util/List;)V

    invoke-interface {v3, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    move-wide v0, v4

    :cond_8
    :try_start_e
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    move-result v4

    if-eqz v4, :cond_9

    :try_start_f
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->c()V

    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->d()V
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_6

    goto/16 :goto_2

    :catch_6
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V

    goto/16 :goto_2

    :catch_7
    move-exception v0

    :try_start_10
    const-string v1, "Failed to remove successfully uploaded hits"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    :try_start_11
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->c()V

    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->d()V
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_8

    goto/16 :goto_2

    :catch_8
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V

    goto/16 :goto_2

    :cond_9
    :try_start_12
    iget-object v4, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v4}, Lbrk;->c()V

    iget-object v4, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v4}, Lbrk;->d()V
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_9

    move-wide v4, v0

    goto/16 :goto_3

    :catch_9
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    :try_start_13
    iget-object v1, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v1}, Lbrk;->c()V

    iget-object v1, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v1}, Lbrk;->d()V
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_a

    throw v0

    :catch_a
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V

    goto/16 :goto_2
.end method

.method private t()J
    .locals 2

    invoke-static {}, Lcox;->b()V

    invoke-virtual {p0}, Lbrn;->r()V

    :try_start_0
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->g()J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    :goto_0
    return-wide v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get min/max hit times from local store"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method private u()V
    .locals 6

    .prologue
    .line 0
    invoke-virtual {p0}, Lbrn;->n()Lbse;

    move-result-object v1

    .line 51006
    iget-boolean v0, v1, Lbse;->a:Z

    .line 0
    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    .line 51007
    :cond_1
    iget-boolean v0, v1, Lbse;->b:Z

    .line 0
    if-nez v0, :cond_0

    invoke-direct {p0}, Lbrn;->t()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbrn;->k()Lcac;

    move-result-object v0

    invoke-interface {v0}, Lcac;->a()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    .line 51008
    sget-object v0, Lbqd;->h:Lbqe;

    invoke-virtual {v0}, Lbqe;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 0
    cmp-long v0, v2, v4

    if-gtz v0, :cond_0

    invoke-static {}, Lbrz;->e()J

    move-result-wide v2

    const-string v0, "Dispatch alarm scheduled (ms)"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lbrn;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lbse;->b()V

    goto :goto_0
.end method

.method private v()V
    .locals 2

    .prologue
    .line 0
    .line 51009
    iget-object v0, p0, Lbrn;->h:Lbsb;

    invoke-virtual {v0}, Lbsb;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "All hits dispatched or no network/service. Going to power save mode"

    invoke-virtual {p0, v0}, Lbrn;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lbrn;->h:Lbsb;

    invoke-virtual {v0}, Lbsb;->c()V

    .line 51010
    invoke-virtual {p0}, Lbrn;->n()Lbse;

    move-result-object v0

    .line 51011
    iget-boolean v1, v0, Lbse;->b:Z

    .line 51010
    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lbse;->c()V

    .line 0
    :cond_1
    return-void
.end method

.method private w()J
    .locals 4

    .prologue
    .line 0
    iget-wide v0, p0, Lbrn;->g:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lbrn;->g:J

    :cond_0
    :goto_0
    return-wide v0

    .line 51012
    :cond_1
    sget-object v0, Lbqd;->e:Lbqe;

    invoke-virtual {v0}, Lbqe;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 51013
    iget-object v2, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v2}, Lbrb;->e()Lbqt;

    move-result-object v2

    .line 0
    invoke-virtual {v2}, Lbqt;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 51014
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->e()Lbqt;

    move-result-object v0

    .line 0
    invoke-virtual {v0}, Lbqt;->g()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    goto :goto_0
.end method

.method private x()V
    .locals 1

    .prologue
    .line 0
    invoke-virtual {p0}, Lbrn;->r()V

    .line 51044
    invoke-static {}, Lbrb;->i()V

    .line 0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbrn;->l:Z

    iget-object v0, p0, Lbrn;->f:Lbrf;

    invoke-virtual {v0}, Lbrf;->d()V

    invoke-virtual {p0}, Lbrn;->g()V

    return-void
.end method


# virtual methods
.method public final a(Lbre;Z)J
    .locals 5

    .prologue
    .line 0
    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lbrn;->r()V

    .line 21000
    invoke-static {}, Lbrb;->i()V

    .line 0
    :try_start_0
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->b()V

    iget-object v0, p0, Lbrn;->b:Lbrk;

    .line 22000
    iget-wide v2, p1, Lbre;->a:J

    .line 23000
    iget-object v1, p1, Lbre;->b:Ljava/lang/String;

    .line 0
    invoke-virtual {v0, v2, v3, v1}, Lbrk;->a(JLjava/lang/String;)V

    iget-object v0, p0, Lbrn;->b:Lbrk;

    .line 24000
    iget-wide v2, p1, Lbre;->a:J

    .line 25000
    iget-object v1, p1, Lbre;->b:Ljava/lang/String;

    .line 26000
    iget-object v4, p1, Lbre;->c:Ljava/lang/String;

    .line 0
    invoke-virtual {v0, v2, v3, v1, v4}, Lbrk;->a(JLjava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    .line 27000
    iput-wide v2, p1, Lbre;->e:J

    .line 0
    iget-object v2, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v2, p1}, Lbrk;->a(Lbre;)V

    iget-object v2, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v2}, Lbrk;->c()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v2}, Lbrk;->d()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    return-wide v0

    :catch_0
    move-exception v2

    const-string v3, "Failed to end transaction"

    invoke-virtual {p0, v3, v2}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v0

    :try_start_2
    const-string v1, "Failed to update Analytics property"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->d()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2

    :goto_1
    const-wide/16 v0, -0x1

    goto :goto_0

    :catch_2
    move-exception v0

    const-string v1, "Failed to end transaction"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_4
    iget-object v1, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v1}, Lbrk;->d()V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_3

    :goto_2
    throw v0

    :catch_3
    move-exception v1

    const-string v2, "Failed to end transaction"

    invoke-virtual {p0, v2, v1}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2
.end method

.method protected final a()V
    .locals 1

    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->s()V

    iget-object v0, p0, Lbrn;->c:Lbqn;

    invoke-virtual {v0}, Lbqn;->s()V

    iget-object v0, p0, Lbrn;->f:Lbrf;

    invoke-virtual {v0}, Lbrf;->s()V

    return-void
.end method

.method protected final a(Lbre;)V
    .locals 4

    .prologue
    .line 0
    .line 16000
    invoke-static {}, Lbrb;->i()V

    .line 0
    const-string v0, "Sending first hit to property"

    .line 17000
    iget-object v1, p1, Lbre;->c:Ljava/lang/String;

    .line 0
    invoke-virtual {p0, v0, v1}, Lbrn;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v0

    invoke-virtual {v0}, Lbqp;->c()Lbqr;

    move-result-object v0

    invoke-static {}, Lbrz;->l()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lbqr;->a(J)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v0

    invoke-virtual {v0}, Lbqp;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 18000
    iget-object v1, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v1}, Lbrb;->a()Lbql;

    move-result-object v1

    .line 0
    invoke-static {v1, v0}, Lbqs;->a(Lbql;Ljava/lang/String;)Lcpf;

    move-result-object v0

    const-string v1, "Found relevant installation campaign"

    invoke-virtual {p0, v1, v0}, Lbrn;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, Lbrn;->a(Lbre;Lcpf;)V

    goto :goto_0
.end method

.method public final a(Lbsf;)V
    .locals 2

    iget-wide v0, p0, Lbrn;->k:J

    invoke-virtual {p0, p1, v0, v1}, Lbrn;->a(Lbsf;J)V

    return-void
.end method

.method public final a(Lbsf;J)V
    .locals 6

    .prologue
    .line 0
    invoke-static {}, Lcox;->b()V

    invoke-virtual {p0}, Lbrn;->r()V

    const-wide/16 v0, -0x1

    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v2

    invoke-virtual {v2}, Lbqp;->d()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Lbrn;->k()Lcac;

    move-result-object v0

    invoke-interface {v0}, Lcac;->a()J

    move-result-wide v0

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    :cond_0
    const-string v2, "Dispatching local hits. Elapsed time since last dispatch (ms)"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lbrn;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47000
    sget-boolean v0, Lbyk;->a:Z

    .line 0
    if-nez v0, :cond_1

    invoke-direct {p0}, Lbrn;->h()V

    :cond_1
    :try_start_0
    invoke-direct {p0}, Lbrn;->i()Z

    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v0

    invoke-virtual {v0}, Lbqp;->e()V

    invoke-virtual {p0}, Lbrn;->g()V

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lbsf;->a()V

    :cond_2
    iget-wide v0, p0, Lbrn;->k:J

    cmp-long v0, v0, p2

    if-eqz v0, :cond_3

    iget-object v0, p0, Lbrn;->e:Lbqm;

    .line 48000
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xa

    if-le v1, v2, :cond_3

    invoke-virtual {v0}, Lbqm;->c()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.analytics.RADIO_POWERED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    sget-object v2, Lbqm;->a:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 0
    :cond_3
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Local dispatch failed"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v0

    invoke-virtual {v0}, Lbqp;->e()V

    invoke-virtual {p0}, Lbrn;->g()V

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lbsf;->a()V

    goto :goto_0
.end method

.method public final a(Lbsi;)V
    .locals 10

    .prologue
    .line 0
    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcox;->b()V

    invoke-virtual {p0}, Lbrn;->r()V

    iget-boolean v0, p0, Lbrn;->l:Z

    if-eqz v0, :cond_1

    const-string v0, "Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions"

    invoke-virtual {p0, v0}, Lbrn;->c(Ljava/lang/String;)V

    .line 29000
    :goto_0
    const-string v0, "_m"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lbsi;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 28000
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 0
    :cond_0
    :goto_1
    invoke-direct {p0}, Lbrn;->h()V

    iget-object v0, p0, Lbrn;->f:Lbrf;

    invoke-virtual {v0, p1}, Lbrf;->a(Lbsi;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Hit sent to the device AnalyticsService for delivery"

    invoke-virtual {p0, v0}, Lbrn;->c(Ljava/lang/String;)V

    :goto_2
    return-void

    :cond_1
    const-string v0, "Delivering hit"

    invoke-virtual {p0, v0, p1}, Lbrn;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 28000
    :cond_2
    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v0

    .line 30000
    iget-object v0, v0, Lbqp;->b:Lbqq;

    .line 28000
    invoke-virtual {v0}, Lbqq;->a()Landroid/util/Pair;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/util/HashMap;

    .line 31000
    iget-object v1, p1, Lbsi;->a:Ljava/util/Map;

    .line 28000
    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const-string v1, "_m"

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32000
    new-instance v0, Lbsi;

    .line 33000
    iget-wide v3, p1, Lbsi;->d:J

    .line 34000
    iget-boolean v5, p1, Lbsi;->f:Z

    .line 35000
    iget-wide v6, p1, Lbsi;->c:J

    .line 36000
    iget v8, p1, Lbsi;->e:I

    .line 37000
    iget-object v9, p1, Lbsi;->b:Ljava/util/List;

    move-object v1, p0

    .line 32000
    invoke-direct/range {v0 .. v9}, Lbsi;-><init>(Lbqz;Ljava/util/Map;JZJILjava/util/List;)V

    move-object p1, v0

    goto :goto_1

    .line 38000
    :cond_3
    sget-boolean v0, Lbyk;->a:Z

    .line 0
    if-eqz v0, :cond_4

    .line 39000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->a()Lbql;

    move-result-object v0

    .line 0
    const-string v1, "Service unavailable on package side"

    invoke-virtual {v0, p1, v1}, Lbql;->a(Lbsi;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    :try_start_0
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0, p1}, Lbrk;->a(Lbsi;)V

    invoke-virtual {p0}, Lbrn;->g()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "Delivery failed to save hit to a database"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 40000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->a()Lbql;

    move-result-object v0

    .line 0
    const-string v1, "deliver: failed to insert hit to database"

    invoke-virtual {v0, p1, v1}, Lbql;->a(Lbsi;Ljava/lang/String;)V

    goto :goto_2
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 0
    invoke-static {p1}, La;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 51015
    invoke-static {}, Lbrb;->i()V

    .line 0
    invoke-virtual {p0}, Lbrn;->j()V

    .line 51016
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->a()Lbql;

    move-result-object v0

    .line 0
    invoke-static {v0, p1}, Lbqs;->a(Lbql;Ljava/lang/String;)Lcpf;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v0, "Parsing failed. Ignoring invalid campaign data"

    invoke-virtual {p0, v0, p1}, Lbrn;->d(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v0

    invoke-virtual {v0}, Lbqp;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v0, "Ignoring duplicate install campaign"

    invoke-virtual {p0, v0}, Lbrn;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v1, "Ignoring multiple install campaigns. original, new"

    invoke-virtual {p0, v1, v0, p1}, Lbrn;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbqp;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v0

    invoke-virtual {v0}, Lbqp;->c()Lbqr;

    move-result-object v0

    invoke-static {}, Lbrz;->l()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lbqr;->a(J)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "Campaign received too late, ignoring"

    invoke-virtual {p0, v0, v1}, Lbrn;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    const-string v0, "Received installation campaign"

    invoke-virtual {p0, v0, v1}, Lbrn;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lbrn;->b:Lbrk;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lbrk;->c(J)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbre;

    invoke-direct {p0, v0, v1}, Lbrn;->a(Lbre;Lcpf;)V

    goto :goto_1
.end method

.method final b()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 0
    invoke-virtual {p0}, Lbrn;->r()V

    iget-boolean v0, p0, Lbrn;->a:Z

    if-nez v0, :cond_2

    move v0, v1

    :goto_0
    const-string v2, "Analytics backend already started"

    invoke-static {v0, v2}, La;->a(ZLjava/lang/Object;)V

    iput-boolean v1, p0, Lbrn;->a:Z

    .line 4000
    sget-boolean v0, Lbyk;->a:Z

    .line 0
    if-nez v0, :cond_1

    .line 6000
    iget-object v0, p0, Lbqz;->d:Lbrb;

    .line 7000
    iget-object v0, v0, Lbrb;->a:Landroid/content/Context;

    .line 5000
    invoke-static {v0}, Lbpe;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions."

    invoke-virtual {p0, v1}, Lbrn;->e(Ljava/lang/String;)V

    :cond_0
    :goto_1
    invoke-static {v0}, Lbpj;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v0, "CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions."

    invoke-virtual {p0, v0}, Lbrn;->e(Ljava/lang/String;)V

    .line 8000
    :cond_1
    :goto_2
    iget-object v0, p0, Lbqz;->d:Lbrb;

    invoke-virtual {v0}, Lbrb;->b()Lcox;

    move-result-object v0

    .line 0
    new-instance v1, Lbrq;

    invoke-direct {v1, p0}, Lbrq;-><init>(Lbrn;)V

    invoke-virtual {v0, v1}, Lcox;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 5000
    :cond_3
    invoke-static {v0}, Lbpf;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions."

    invoke-virtual {p0, v1}, Lbrn;->f(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lbpk;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions."

    invoke-virtual {p0, v0}, Lbrn;->e(Ljava/lang/String;)V

    goto :goto_2
.end method

.method protected final c()V
    .locals 1

    .prologue
    .line 0
    invoke-virtual {p0}, Lbrn;->r()V

    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v0

    invoke-virtual {v0}, Lbqp;->b()J

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-direct {p0, v0}, Lbrn;->g(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions"

    invoke-virtual {p0, v0}, Lbrn;->f(Ljava/lang/String;)V

    invoke-direct {p0}, Lbrn;->x()V

    :cond_0
    const-string v0, "android.permission.INTERNET"

    invoke-direct {p0, v0}, Lbrn;->g(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions"

    invoke-virtual {p0, v0}, Lbrn;->f(Ljava/lang/String;)V

    invoke-direct {p0}, Lbrn;->x()V

    :cond_1
    invoke-virtual {p0}, Lbrn;->l()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lbpf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "AnalyticsService registered in the app manifest and enabled"

    invoke-virtual {p0, v0}, Lbrn;->b(Ljava/lang/String;)V

    :goto_0
    iget-boolean v0, p0, Lbrn;->l:Z

    if-nez v0, :cond_2

    .line 10000
    sget-boolean v0, Lbyk;->a:Z

    .line 0
    if-nez v0, :cond_2

    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->e()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lbrn;->h()V

    :cond_2
    invoke-virtual {p0}, Lbrn;->g()V

    return-void

    .line 9000
    :cond_3
    sget-boolean v0, Lbyk;->a:Z

    .line 0
    if-eqz v0, :cond_4

    const-string v0, "Device AnalyticsService not registered! Hits will not be delivered reliably."

    invoke-virtual {p0, v0}, Lbrn;->f(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    const-string v0, "AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions."

    invoke-virtual {p0, v0}, Lbrn;->e(Ljava/lang/String;)V

    goto :goto_0
.end method

.method final d()V
    .locals 2

    .prologue
    .line 0
    .line 11000
    invoke-static {}, Lbrb;->i()V

    .line 0
    invoke-virtual {p0}, Lbrn;->k()Lcac;

    move-result-object v0

    invoke-interface {v0}, Lcac;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lbrn;->k:J

    return-void
.end method

.method protected final e()V
    .locals 6

    .prologue
    .line 0
    .line 12000
    invoke-static {}, Lbrb;->i()V

    .line 13000
    sget-boolean v0, Lbyk;->a:Z

    .line 0
    if-nez v0, :cond_1

    .line 14000
    invoke-static {}, Lcox;->b()V

    invoke-virtual {p0}, Lbrn;->r()V

    invoke-virtual {p0}, Lbrn;->j()V

    invoke-static {}, Lbrz;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Service client disabled. Can\'t dispatch local hits to device AnalyticsService"

    invoke-virtual {p0, v0}, Lbrn;->e(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lbrn;->f:Lbrf;

    invoke-virtual {v0}, Lbrf;->b()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Service not connected"

    invoke-virtual {p0, v0}, Lbrn;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->e()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Dispatching local hits to device AnalyticsService"

    invoke-virtual {p0, v0}, Lbrn;->b(Ljava/lang/String;)V

    :cond_3
    :try_start_0
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-static {}, Lbrz;->f()I

    move-result v1

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lbrk;->a(J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lbrn;->g()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to read hits from store"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V

    goto :goto_0

    :cond_4
    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :try_start_1
    iget-object v2, p0, Lbrn;->b:Lbrk;

    .line 15000
    iget-wide v4, v0, Lbsi;->c:J

    .line 14000
    invoke-virtual {v2, v4, v5}, Lbrk;->b(J)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_5
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbsi;

    iget-object v2, p0, Lbrn;->f:Lbrf;

    invoke-virtual {v2, v0}, Lbrf;->a(Lbsi;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, Lbrn;->g()V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "Failed to remove hit that was send for delivery"

    invoke-virtual {p0, v1, v0}, Lbrn;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lbrn;->v()V

    goto :goto_0
.end method

.method public final f()V
    .locals 1

    invoke-static {}, Lcox;->b()V

    invoke-virtual {p0}, Lbrn;->r()V

    const-string v0, "Service disconnected"

    invoke-virtual {p0, v0}, Lbrn;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final g()V
    .locals 10

    .prologue
    const/4 v1, 0x1

    const-wide/16 v4, 0x0

    .line 0
    invoke-static {}, Lbrb;->i()V

    invoke-virtual {p0}, Lbrn;->r()V

    .line 49000
    iget-boolean v0, p0, Lbrn;->l:Z

    if-nez v0, :cond_2

    .line 50000
    sget-boolean v0, Lbyk;->a:Z

    .line 49000
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbrn;->m()Lbrz;

    move-result-object v0

    invoke-virtual {v0}, Lbrz;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    invoke-direct {p0}, Lbrn;->w()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    move v0, v1

    .line 0
    :goto_0
    if-nez v0, :cond_3

    iget-object v0, p0, Lbrn;->e:Lbqm;

    invoke-virtual {v0}, Lbqm;->b()V

    invoke-direct {p0}, Lbrn;->v()V

    :cond_1
    :goto_1
    return-void

    .line 49000
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 0
    :cond_3
    iget-object v0, p0, Lbrn;->b:Lbrk;

    invoke-virtual {v0}, Lbrk;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lbrn;->e:Lbqm;

    invoke-virtual {v0}, Lbqm;->b()V

    invoke-direct {p0}, Lbrn;->v()V

    goto :goto_1

    :cond_4
    sget-object v0, Lbqd;->z:Lbqe;

    invoke-virtual {v0}, Lbqe;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lbrn;->e:Lbqm;

    invoke-virtual {v0}, Lbqm;->a()V

    iget-object v0, p0, Lbrn;->e:Lbqm;

    .line 51000
    iget-boolean v1, v0, Lbqm;->c:Z

    if-nez v1, :cond_5

    iget-object v1, v0, Lbqm;->b:Lbrb;

    invoke-virtual {v1}, Lbrb;->a()Lbql;

    move-result-object v1

    const-string v2, "Connectivity unknown. Receiver not registered"

    invoke-virtual {v1, v2}, Lbql;->e(Ljava/lang/String;)V

    :cond_5
    iget-boolean v0, v0, Lbqm;->d:Z

    .line 0
    :goto_2
    if-eqz v0, :cond_c

    .line 51001
    invoke-direct {p0}, Lbrn;->u()V

    invoke-direct {p0}, Lbrn;->w()J

    move-result-wide v2

    invoke-virtual {p0}, Lbrn;->o()Lbqp;

    move-result-object v0

    invoke-virtual {v0}, Lbqp;->d()J

    move-result-wide v0

    cmp-long v6, v0, v4

    if-eqz v6, :cond_8

    invoke-virtual {p0}, Lbrn;->k()Lcac;

    move-result-object v6

    invoke-interface {v6}, Lcac;->a()J

    move-result-wide v6

    sub-long v0, v6, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    sub-long v0, v2, v0

    cmp-long v6, v0, v4

    if-lez v6, :cond_7

    :goto_3
    const-string v2, "Dispatch scheduled (ms)"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lbrn;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, p0, Lbrn;->h:Lbsb;

    invoke-virtual {v2}, Lbsb;->b()Z

    move-result v2

    if-eqz v2, :cond_b

    const-wide/16 v6, 0x1

    iget-object v2, p0, Lbrn;->h:Lbsb;

    .line 51002
    iget-wide v8, v2, Lbsb;->c:J

    cmp-long v3, v8, v4

    if-nez v3, :cond_9

    move-wide v2, v4

    .line 51001
    :goto_4
    add-long/2addr v0, v2

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-object v2, p0, Lbrn;->h:Lbsb;

    .line 51004
    invoke-virtual {v2}, Lbsb;->b()Z

    move-result v3

    if-eqz v3, :cond_1

    cmp-long v3, v0, v4

    if-gez v3, :cond_a

    invoke-virtual {v2}, Lbsb;->c()V

    goto/16 :goto_1

    :cond_6
    move v0, v1

    .line 0
    goto :goto_2

    .line 51001
    :cond_7
    invoke-static {}, Lbrz;->d()J

    move-result-wide v0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    goto :goto_3

    :cond_8
    invoke-static {}, Lbrz;->d()J

    move-result-wide v0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    goto :goto_3

    .line 51002
    :cond_9
    iget-object v3, v2, Lbsb;->a:Lbrb;

    .line 51003
    iget-object v3, v3, Lbrb;->c:Lcac;

    .line 51002
    invoke-interface {v3}, Lcac;->a()J

    move-result-wide v8

    iget-wide v2, v2, Lbsb;->c:J

    sub-long v2, v8, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    goto :goto_4

    .line 51004
    :cond_a
    iget-object v3, v2, Lbsb;->a:Lbrb;

    .line 51005
    iget-object v3, v3, Lbrb;->c:Lcac;

    .line 51004
    invoke-interface {v3}, Lcac;->a()J

    move-result-wide v6

    iget-wide v8, v2, Lbsb;->c:J

    sub-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    move-result-wide v6

    sub-long/2addr v0, v6

    cmp-long v3, v0, v4

    if-gez v3, :cond_d

    :goto_5
    invoke-virtual {v2}, Lbsb;->d()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, v2, Lbsb;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Lbsb;->d()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, v2, Lbsb;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v2, Lbsb;->a:Lbrb;

    invoke-virtual {v0}, Lbrb;->a()Lbql;

    move-result-object v0

    const-string v1, "Failed to adjust delayed post. time"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbql;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 51001
    :cond_b
    iget-object v2, p0, Lbrn;->h:Lbsb;

    invoke-virtual {v2, v0, v1}, Lbsb;->a(J)V

    goto/16 :goto_1

    .line 0
    :cond_c
    invoke-direct {p0}, Lbrn;->v()V

    invoke-direct {p0}, Lbrn;->u()V

    goto/16 :goto_1

    :cond_d
    move-wide v4, v0

    goto :goto_5
.end method
