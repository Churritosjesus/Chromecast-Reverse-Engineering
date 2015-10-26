.class final Lbcp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Lbcn;


# direct methods
.method constructor <init>(Lbcn;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lbcp;->a:Lbcn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 105
    check-cast p1, Ldbm;

    .line 1108
    iget-object v1, p0, Lbcp;->a:Lbcn;

    invoke-static {v1}, Lbcn;->a(Lbcn;)Lblp;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    .line 1110
    iget-object v1, p0, Lbcp;->a:Lbcn;

    invoke-static {v1}, Lbcn;->b(Lbcn;)Ljava/util/Set;

    move-result-object v3

    monitor-enter v3

    .line 1111
    :try_start_0
    iget-object v4, p1, Ldbm;->a:[Ldbk;

    array-length v5, v4

    move v2, v0

    move v1, v0

    :goto_0
    if-ge v2, v5, :cond_1

    aget-object v6, v4, v2

    .line 1112
    const/4 v0, 0x0

    .line 1113
    iget-object v7, p0, Lbcp;->a:Lbcn;

    invoke-static {v7}, Lbcn;->c(Lbcn;)Ljava/util/Map;

    move-result-object v7

    iget-object v8, v6, Ldbk;->c:Ljava/lang/String;

    invoke-interface {v7, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 1114
    iget-object v0, p0, Lbcp;->a:Lbcn;

    invoke-static {v0}, Lbcn;->c(Lbcn;)Ljava/util/Map;

    move-result-object v0

    iget-object v7, v6, Ldbk;->c:Ljava/lang/String;

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laow;

    .line 1116
    :cond_0
    new-instance v7, Lbcd;

    invoke-direct {v7, v6, v0}, Lbcd;-><init>(Ldbk;Laow;)V

    .line 1117
    iget-object v0, p0, Lbcp;->a:Lbcn;

    invoke-static {v0}, Lbcn;->d(Lbcn;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v7}, Lbcd;->a()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1118
    iget-object v0, p0, Lbcp;->a:Lbcn;

    invoke-static {v0}, Lbcn;->b(Lbcn;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v1

    .line 1111
    :goto_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 1121
    :cond_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1122
    if-eqz v1, :cond_2

    .line 1123
    iget-object v0, p0, Lbcp;->a:Lbcn;

    invoke-virtual {v0}, Lbcn;->a()V

    .line 105
    :cond_2
    return-void

    .line 1121
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_3
    move v0, v1

    goto :goto_1
.end method
