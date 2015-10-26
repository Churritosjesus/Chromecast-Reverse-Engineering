.class final Lasm;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Z

.field private synthetic b:I

.field private synthetic c:Ljava/lang/String;

.field private synthetic d:Lash;


# direct methods
.method constructor <init>(Lash;ZILjava/lang/String;)V
    .locals 0

    .prologue
    .line 445
    iput-object p1, p0, Lasm;->d:Lash;

    iput-boolean p2, p0, Lasm;->a:Z

    iput p3, p0, Lasm;->b:I

    iput-object p4, p0, Lasm;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 8

    .prologue
    .line 445
    check-cast p1, Ldbz;

    .line 1448
    if-eqz p1, :cond_3

    iget-object v0, p1, Ldbz;->a:[Ldbq;

    if-eqz v0, :cond_3

    .line 1449
    iget-object v0, p0, Lasm;->d:Lash;

    invoke-static {v0}, Lash;->f(Lash;)Latc;

    move-result-object v2

    monitor-enter v2

    .line 1450
    :try_start_0
    iget-boolean v0, p0, Lasm;->a:Z

    if-eqz v0, :cond_0

    .line 1455
    iget-object v0, p0, Lasm;->d:Lash;

    invoke-static {v0}, Lash;->f(Lash;)Latc;

    move-result-object v0

    iget v1, p0, Lasm;->b:I

    iget-object v3, p0, Lasm;->c:Ljava/lang/String;

    .line 2085
    new-instance v4, Latd;

    invoke-direct {v4, v1, v3}, Latd;-><init>(ILjava/lang/String;)V

    .line 2086
    iget-object v0, v0, Latc;->a:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1458
    :cond_0
    iget-object v0, p0, Lasm;->d:Lash;

    invoke-static {v0}, Lash;->f(Lash;)Latc;

    move-result-object v1

    iget v0, p0, Lasm;->b:I

    iget-object v3, p0, Lasm;->c:Ljava/lang/String;

    iget-object v4, p1, Ldbz;->a:[Ldbq;

    iget-object v5, p1, Ldbz;->b:Ljava/lang/String;

    .line 3069
    new-instance v6, Latd;

    invoke-direct {v6, v0, v3}, Latd;-><init>(ILjava/lang/String;)V

    .line 3070
    iget-object v0, v1, Latc;->a:Ljava/util/Map;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Late;

    .line 3071
    if-eqz v0, :cond_1

    .line 4053
    iput-object v5, v0, Late;->b:Ljava/lang/String;

    move-object v1, v0

    .line 3079
    :goto_0
    array-length v3, v4

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v3, :cond_2

    aget-object v5, v4, v0

    .line 5053
    iget-object v6, v1, Late;->a:Ljava/util/List;

    .line 3080
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3079
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 3074
    :cond_1
    new-instance v0, Late;

    new-instance v3, Ljava/util/ArrayList;

    array-length v7, v4

    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {v0, v3, v5}, Late;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 3076
    iget-object v1, v1, Latc;->a:Ljava/util/Map;

    invoke-interface {v1, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    goto :goto_0

    .line 1460
    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1461
    iget-object v0, p0, Lasm;->d:Lash;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lash;->b(I)V

    .line 445
    :cond_3
    return-void

    .line 1460
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
