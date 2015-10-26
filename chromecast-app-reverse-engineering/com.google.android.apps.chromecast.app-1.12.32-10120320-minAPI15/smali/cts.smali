.class final Lcts;
.super Ljava/lang/Object;

# interfaces
.implements Lcwb;


# instance fields
.field private synthetic a:Lcto;


# direct methods
.method constructor <init>(Lcto;)V
    .locals 0

    iput-object p1, p0, Lcts;->a:Lcto;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 0
    iget-object v1, p0, Lcts;->a:Lcto;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcts;->a:Lcto;

    invoke-virtual {v0}, Lcto;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcts;->a:Lcto;

    .line 1000
    iget-object v0, v0, Lcto;->m:Lctn;

    .line 0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcts;->a:Lcto;

    iget-object v2, p0, Lcts;->a:Lcto;

    .line 2000
    iget-object v2, v2, Lcto;->m:Lctn;

    .line 0
    invoke-virtual {v0, v2}, Lcto;->a(Lbwm;)V

    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcts;->a:Lcto;

    const-wide/32 v2, 0x36ee80

    .line 3000
    invoke-virtual {v0, v2, v3}, Lcto;->a(J)V

    .line 0
    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcts;->a:Lcto;

    iget-object v2, p0, Lcts;->a:Lcto;

    sget-object v3, Lcom/google/android/gms/common/api/Status;->c:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v2, v3}, Lcto;->b(Lcom/google/android/gms/common/api/Status;)Lctn;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcto;->a(Lbwm;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 0
    check-cast p1, Lcjd;

    .line 4000
    iget-object v1, p0, Lcts;->a:Lcto;

    monitor-enter v1

    :try_start_0
    iget-object v0, p1, Lcjd;->b:Lciz;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcts;->a:Lcto;

    .line 5000
    iget-object v0, v0, Lcto;->o:Lcjd;

    .line 4000
    iget-object v0, v0, Lcjd;->b:Lciz;

    if-nez v0, :cond_0

    const-string v0, "Current resource is null; network resource is also null"

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcts;->a:Lcto;

    const-wide/32 v2, 0x36ee80

    .line 6000
    invoke-virtual {v0, v2, v3}, Lcto;->a(J)V

    .line 4000
    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcts;->a:Lcto;

    .line 7000
    iget-object v0, v0, Lcto;->o:Lcjd;

    .line 4000
    iget-object v0, v0, Lcjd;->b:Lciz;

    iput-object v0, p1, Lcjd;->b:Lciz;

    :cond_1
    iget-object v0, p0, Lcts;->a:Lcto;

    iget-object v2, p0, Lcts;->a:Lcto;

    .line 8000
    iget-object v2, v2, Lcto;->a:Lcac;

    .line 4000
    invoke-interface {v2}, Lcac;->a()J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-static {v0, p1, v2, v3, v4}, Lcto;->a(Lcto;Lcjd;JZ)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "setting refresh time to current time: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcts;->a:Lcto;

    .line 9000
    iget-wide v2, v2, Lcto;->p:J

    .line 4000
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcts;->a:Lcto;

    .line 10000
    invoke-virtual {v0}, Lcto;->e()Z

    move-result v0

    .line 4000
    if-nez v0, :cond_2

    iget-object v0, p0, Lcts;->a:Lcto;

    .line 11000
    invoke-virtual {v0, p1}, Lcto;->a(Lcjd;)V

    .line 4000
    :cond_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
