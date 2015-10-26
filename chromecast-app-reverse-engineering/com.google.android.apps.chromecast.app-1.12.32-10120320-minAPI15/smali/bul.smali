.class final Lbul;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbue;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lbuh;Lbue;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lbul;->a:Lbue;

    iput-object p3, p0, Lbul;->b:Ljava/lang/String;

    iput-object p4, p0, Lbul;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lbul;->a:Lbue;

    invoke-static {v0}, Lbue;->e(Lbue;)Ljava/util/Map;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lbul;->a:Lbue;

    invoke-static {v0}, Lbue;->e(Lbue;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lbul;->b:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbtd;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lbul;->a:Lbue;

    invoke-static {v1}, Lbue;->f(Lbue;)Lcom/google/android/gms/cast/CastDevice;

    iget-object v1, p0, Lbul;->b:Ljava/lang/String;

    iget-object v2, p0, Lbul;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lbtd;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    invoke-static {}, Lbue;->g()Lbuu;

    move-result-object v0

    const-string v1, "Discarded message for unknown namespace \'%s\'"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lbul;->b:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lbuu;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
